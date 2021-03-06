<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h2>Solar System Geek Gift Shop</h2>

<div class="cartPage">
<c:set var="total" value="0"/>

<div class="cartImage">
</div>

<div class="cartName cartHeading">Name</div>
<div class="cartPrice cartHeading">Price</div>
<div class="cartQuantity cartHeading">Qty.</div>
<div class="cartItemTotal cartHeading">Total</div>

<c:forEach items="${cartItems}" var="cartMap">
<c:set var="item" value="${cartMap.key}"/>
<c:set var="quantity" value="${cartMap.value}"/>

<div class="cartImage">
<img src="<c:url value="/img/${item.imageName}"/>"/>
</div>

<div class="cartName">
${item.name}
</div>

<div class="cartPrice">
${item.price}
</div>

<div class="cartQuantity">
${quantity}
</div>

<div class="cartItemTotal">
<c:set var="itemTotal" value="${quantity * (item.price.getCents() + item.price.getDollars() * 100)/100.0}"/>
$${ itemTotal }
</div>

<c:set var="total" value="${ total + itemTotal }"/>
</c:forEach>
</div>

<div class="cartGrandTotal"><span>
Grand Total</span> $${total}
</div>

<div class="cartCheckOut">
<a href="#">Check out</a>
</div>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />