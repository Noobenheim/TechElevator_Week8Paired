<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h2 class="centered">Solar System Geek Gift Shop</h2>

<div class="giftShopPage">
<c:forEach items="${products}" var="product">
<div class="giftShopProduct">

<div class="giftShopImage">
<a href="<c:url value="/store/productDetail?id=${product.id}"/>"><img src="<c:url value="/img/${product.imageName}"/>"/></a>
</div>


<div class="giftShopName">
${product.name}
</div>

<div class="giftShopPrice">
${product.price}
</div>

</div>
</c:forEach>
</div>


</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />