<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Khuram Shah
  Date: 1/26/2019
  Time: 11:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Custom login page</title>
    <style>
        .failed{
            color: red;
        }
    </style>
</head>
<body>
<h3>My custom login page</h3>


<hr>
<!-- Display user name and role -->



<hr>
<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="post">
    <c:if test="${param.error!=null}">
        <i class="failed">Sorry ! Authentication failed......</i>
        <i>Plaese Enter correct userName and Password</i>
    </c:if>
<p>
    User Name: <input type="text" name="username"/>
    Password: <input type="password" name="password"/>
</p>
    <input type="submit" value="Login"/>
</form:form>
</body>
</html>
