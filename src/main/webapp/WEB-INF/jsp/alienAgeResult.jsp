<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="calculatorResult" class="centeredPanel">
<img src="img/${planet.image}"/>
<h2>If you are ${param.inputAge} years old on planet Earth, then you are <fmt:formatNumber type="number" maxFractionDigits="2" value="${planetAge}" /> ${planet.name} years old.</h2>


</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />