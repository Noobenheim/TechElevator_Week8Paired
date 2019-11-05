<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="calculatorResult" class="centeredPanel">
<img src="img/${planet.image}"/>
<h2>
	Traveling by ${travelMethod} you will reach ${ planet.name } in <fmt:formatNumber type="number" maxFractionDigits="2" value="${travelTime}" /> years. You will be <fmt:formatNumber type="number" maxFractionDigits="2" value="${newAge}" /> years old.
<!--<c:if test="${ newAge > 122 }">
		You'll be dead.
	</c:if>-->
</h2>


</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />