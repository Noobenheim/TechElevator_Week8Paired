package com.techelevator.ssg.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;

@Controller
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(path = {"/", "/viewProductList"}, method=RequestMethod.GET)
	public String displayProducts(ModelMap modelHolder) {
		modelHolder.put("products", productDao.getAllProducts());
		return "store/displayProducts";
	}
	
	@RequestMapping(path = "/productDetail", method=RequestMethod.GET)
	public String productDetail(@RequestParam Long id, ModelMap modelHolder) {
		modelHolder.put("product", productDao.getProductById(id));
		return "store/productDetail";
	}
	
	@RequestMapping(path = "/addToCart", method=RequestMethod.POST)
	public String addToCart(@RequestParam Long id, @RequestParam int quantity, HttpSession session) {
		Product p = productDao.getProductById(id);
		Map<Product, Integer> cart = (Map<Product, Integer>) session.getAttribute("cartItems");
		if(cart == null) {
			cart = new HashMap<Product, Integer>();
		}
		
		boolean found = false;
		
		for( Map.Entry<Product,Integer> entry : cart.entrySet() ) {
			if( entry.getKey().getId() == id ) {
				cart.put( entry.getKey(), entry.getValue() + quantity );
				found = true;
			}
		}
		
		if(!found) {
			cart.put(p, quantity);
		}
		
		session.setAttribute("cartItems", cart);
		return "redirect:shoppingCart";
	}
	
	@RequestMapping(path = "/shoppingCart", method=RequestMethod.GET)
	public String shoppingCart() {
		
		return "store/shoppingCart";
	}
	

}
