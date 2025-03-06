<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>moviesList</title>
</head>
<body>
<h2>Movies</h2>
    <ul>
      <c:forEach var="film" items="${films}">
        <li>
          <a href="${pageContext.request.contextPath}/film-details?title=${film.title}">${film.title}</a>
        </li>
      </c:forEach>
    </ul>
  <a href="${pageContext.request.contextPath}/index.jsp">Back</a>
</body>
</html>