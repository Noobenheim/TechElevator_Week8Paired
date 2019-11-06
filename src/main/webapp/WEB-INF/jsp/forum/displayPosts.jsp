<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section class="centeredPanel">

<h2>Solar System Geek Forum</h2>
<a class="centered" href="newPost">Post a Message</a>

<div class="posts">
<c:forEach items="${forum_posts}" var="post">
<!-- NOTE TO SELF: use this formatting for LocalDateTime stuff! -->
<fmt:parseDate value="${ post.datePosted }" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime" type="both" />
<div class="post">
<h4>${post.subject}</h4>
<div>by ${post.username} on <fmt:formatDate pattern="M/dd/yyyy 'at' h:mm:ss a" value="${ parsedDateTime }" /></div>
<p class="message">${post.message}</p>
</div>
</c:forEach>
</section>
</div>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />

