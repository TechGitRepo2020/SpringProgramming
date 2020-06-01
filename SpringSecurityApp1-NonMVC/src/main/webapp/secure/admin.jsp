 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<h1 style="color: green; text-align: center;">Admin page(admin.jsp)</h1>
<h2>current username is      <%= request.getUserPrincipal().getName() %>          </h2>

<br>
<a href="faculty.jsp">GO FACULTY</a><br>
<a href="../index.jsp">HOME</a><br>
<a href="../logout">LOGOUT</a>


