<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="calculatorResult" class="centeredPanel">
<img src="img/${planet.image}"/>
<h2>If you are ${param.inputWeight} lbs on planet Earth, you would weigh <fmt:formatNumber type="number" maxFractionDigits="2" value="${planetWeight}" /> lbs on ${planet.name}.</h2>


</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />