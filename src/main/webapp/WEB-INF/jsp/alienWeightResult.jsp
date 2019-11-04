<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="calculatorResult" class="centeredPanel">
<img src="img/${planet.image}"/>
<h2>If you are ${param.inputWeight} lbs old on planet Earth, you would weigh ${planetWeight} lbs on ${planet.name}.</h2>


</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />