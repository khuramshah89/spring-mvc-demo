<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>

<form:form action="${pageContext.request.contextPath}/logout">
    <button style="float: right" type="submit" >Logout</button>
</form:form>
<h2>
Spring MVC page - home page
</h2>
<hr>

<security:authorize access="isAuthenticated()">
    authenticated as <security:authentication property="principal.username" />
</security:authorize>
<p>
    user: <security:authentication property="principal.username"/> <br><br>
    Role: <security:authentication property="principal.authorities"/>
</p>
<hr>
<hr>

<a href="showForm">show From</a> 
<h1>Rest full service links</h1>
<a href="${pageContext.request.contextPath }/api/students">list of students</a>
<a href="crop">upload image</a>

<hr>
<hr>
 <security:authorize access="hasRole('Manger')">
<a href="${pageContext.request.contextPath}/leaders">LeaderShip meeting</a> (Only for Managers)
 </security:authorize>

<security:authorize access="hasRole('Admin')">
<a href="${pageContext.request.contextPath}/systems">System meeting</a> (Only for Admin)
</security:authorize>



</body>
</html>