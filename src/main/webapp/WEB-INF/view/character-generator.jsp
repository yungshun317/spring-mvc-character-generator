<%--
  Created by IntelliJ IDEA.
  User: yungshun
  Date: 2022-09-22
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Character Generator</title>
</head>
<body>
Character Generator

<br><br>
<!--
Name: ${param.name}
-->
Name: ${character.firstName} ${character.lastName}
<br><br>
Gender: ${character.gender}
<br><br>
Age: ${character.age}
<br><br>
<!--
Message: ${message}
-->
Country: ${character.country}
<br><br>
Postal Code: ${character.postalCode}
<br><br>
Positive Personality:
<ul>
    <c:forEach var="temp" items="${character.positivePersonality}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>
