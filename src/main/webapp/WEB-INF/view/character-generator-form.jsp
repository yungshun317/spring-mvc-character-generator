<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Character Generator - Input Form</title>
    <style>
        .error { color: red }
    </style>
</head>
<body>
    <!--
    <form action="processForm" method="GET">
        <input type="text" name="name" placeholder="Character Name" />
        <input type="submit">
    </form>
    -->
    <i>Fill out the form. Asterisk (*) means required.</i>
    <br><br>

    <form:form action="processForm" modelAttribute="character">
       First Name: <form:input path="firstName" />
       <br><br>
       Last Name (*): <form:input path="lastName" />
       <form:errors path="lastName" cssClass="error" />
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
       Positive Personality:
       Smart <form:checkbox path="positivePersonality" value="Smart" />
       Inspiring <form:checkbox path="positivePersonality" value="Inspiring" />
       Brave <form:checkbox path="positivePersonality" value="Brave" />
       Loveable <form:checkbox path="positivePersonality" value="Loveable" />
       Energetic <form:checkbox path="positivePersonality" value="Energetic" />
       <br><br>
       <input type="submit" value="Submit" />
    </form:form>
</body>
</html>