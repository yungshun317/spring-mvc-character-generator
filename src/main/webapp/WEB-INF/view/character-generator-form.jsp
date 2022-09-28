<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Character Generator - Input Form</title>
</head>
<body>
    <!--
    <form action="processForm" method="GET">
        <input type="text" name="name" placeholder="Character Name" />
        <input type="submit">
    </form>
    -->

   <form:form action="processForm" modelAttribute="character">
       First Name: <form:input path="firstName" />
       <br><br>
       Last Name: <form:input path="lastName" />
       <br><br>
       Gender:
       Male <form:radiobutton path="gender" value="Male" />
       Female <form:radiobutton path="gender" value="Female" />
       <br><br>
       Country:
       <form:select path="country">
           <form:options items="${character.countryOptions}" />
       </form:select>
       <br><br>
       <input type="submit" value="Submit" />
   </form:form>
</body>
</html>