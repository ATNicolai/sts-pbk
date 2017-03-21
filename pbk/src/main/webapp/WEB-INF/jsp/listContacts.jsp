<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Contacts page</h1>

<ul>
<c:forEach items="${contacts}" var="contact">
   <li>${contact}</li>
</c:forEach>
</ul>