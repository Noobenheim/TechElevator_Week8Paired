<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">
<h2 class="centered">Alien Drive Time Calculator</h2>
<Form method="GET" action="alienDriveTimeResult">
<div>
<label for="inputPlanet">Choose a Planet</label>
<select name="inputPlanet">
<c:forEach items="${planets}" var="planet">
<option value="${planet.name}">${planet.name}</option>
</c:forEach>
</select>
</div>


<div>
<label for="inputType">Choose a Method</label>
<select name="inputType">
<option value="walking">Walking</option>
<option value="car">Car</option>
<option value="bullet_train">Bullet Train</option>
<option value="boeing_747">Boeing 747</option>
<option value="concorde">Concorde</option>
</select>
</div>

<div>
<label for="inputAge">Enter Your Earth Age</label>
<input type="number" min="1" name="inputAge"/>
</div>

<div>
<!-- Put a blank label so that the submit input is pushed over -->
<label></label>
<input type="submit" value="Calculate Travel Time"/>
</div>


</Form>
</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />