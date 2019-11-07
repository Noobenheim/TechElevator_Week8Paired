<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h2>Solar System Geek Gift Shop</h2>

<div class="detailPage">

<div class="detailImage">
<img src="<c:url value="/img/${product.imageName}"/>"/>
</div>


<div class="detailName">
${product.name}
</div>

<div class="detailPrice">
${product.price}
</div>

<div class="detailDescription">
${product.description}
</div>


<div class="detailAddToCart">
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