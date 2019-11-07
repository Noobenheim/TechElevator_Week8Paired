<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h2>Solar System Geek Gift Shop</h2>

<div>

<div>
<img src="<c:url value="/img/${product.imageName}"/>"/>
</div>


<div>
${product.name}
</div>

<div>
${product.price}
</div>

<div>
${product.description}
</div>


<div>
<Form method="POST" action="addToCart">
<span id="quantity">
Quantity to Buy
</span>
<span id="quantity_input">
<input type="number" name="quantity" min="1" value="1"/>
</span>

<span>
<input type="submit" value="Add to Cart"/>
</span>

<!-- Passes id without user knowing -->
<input type="hidden" name="id" value="${product.id}"/>
</Form>

</div>

</div>




</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />]