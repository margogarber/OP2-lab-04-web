<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Film Details</title>
</head>
<body>
<h2>Movie: ${film.title}</h2>
<h3>Actors:</h3>
<ul>
  <c:forEach var="actor" items="${film.actors}">
    <li>${actor.name}</li>
  </c:forEach>
</ul>
<a href="films">Back to films</a>
</body>
</html>
