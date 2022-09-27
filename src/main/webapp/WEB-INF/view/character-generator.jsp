<%--
  Created by IntelliJ IDEA.
  User: yungshun
  Date: 2022-09-22
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
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
<!--
Message: ${message}
-->
Country: ${character.country}

</body>
</html>
