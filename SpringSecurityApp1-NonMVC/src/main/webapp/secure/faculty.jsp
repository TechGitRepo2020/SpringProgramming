<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<h1 style="color: green; text-align: center;">Faculty page(faculty.jsp)</h1>

<h2>     current username is<%=  request.getUserPrincipal().getName()%>       </h2>

<br>
<a href="admin.jsp">GO ADMIN</a><br>
<a href="../index.jsp">HOME</a><br>
<a href="../logout">LOGOUT</a>


