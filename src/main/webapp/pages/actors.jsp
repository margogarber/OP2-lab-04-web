
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- This taglib is used to iterate over a list of actors -->
<html>
<head>
    <title>ActorsList</title>
</head>
<body>
  <h2>Actors</h2>
    <ul>
        <c:forEach var="actor" items="${actors}">
            <li>${actor.name}</li>
        </c:forEach>
    </ul>

  <a href="${pageContext.request.contextPath}/index.jsp">Back</a>

</body>
</html>
