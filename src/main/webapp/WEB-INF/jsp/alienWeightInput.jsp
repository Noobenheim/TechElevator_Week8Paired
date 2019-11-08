<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h2 class="centered">Alien Weight Calculator</h2>
<Form method="GET" action="alienWeightResult">
<div>
<label for="inputPlanet">Choose a Planet</label>
<select name="inputPlanet">
<c:forEach items="${planets}" var="planet">
<option value="${planet.name}">${planet.name}</option>
</c:forEach>
</select>
</div>

<div>
<label for="inputAge">Enter Your Earth Weight</label>
<input type="number" min="1" name="inputWeight"/>
</div>


<div>
<!-- Put a blank label so that the submit input is pushed over -->
<label></label>
<input type="submit" value="Calculate Weight"/>
</div>
</Form>
</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />