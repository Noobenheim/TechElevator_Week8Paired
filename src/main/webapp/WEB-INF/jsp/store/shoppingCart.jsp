<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h2>Solar System Geek Gift Shop</h2>

<c:set var="total" value="0"/>
<c:forEach items="${cartItems}" var="cartMap">
<c:set var="item" value="${cartMap.key}"/>
<c:set var="quantity" value="${cartMap.value}"/>

<div>
<img src="<c:url value="/img/${item.imageName}"/>"/>
</div>

<div>
${item.name}
</div>

<div>
${item.price}
</div>

<div>
${quantity}
</div>

<div>
<c:set var="itemTotal" value="${quantity * (item.price.getCents() + item.price.getDollars() * 100)/100.0}"/>
$${ itemTotal }
</div>

<c:set var="total" value="${ total + itemTotal }"/>
</c:forEach>

<div>
Grand Total $${total}
</div>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />