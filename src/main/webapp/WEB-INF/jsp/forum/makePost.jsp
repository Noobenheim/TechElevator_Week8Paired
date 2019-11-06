<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">

<h2 class="centered">New Geek Post</h2>

<Form method="POST" action="makePost">
<div>
<label for="username">Username</label>
<input type="text" name="username" id="username" required="required"/>
</div>

<div>
<label for="subject">Subject</label>
<input type="text" name="subject" id="subject" required="required"/>
</div>

<div>
<label for="message">Message</label>
<textarea name="message" id="message" required="required"></textarea>
</div>

<div>
<label></label>
<input type="submit" value="Submit!"/>
</div>
</Form>




</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
