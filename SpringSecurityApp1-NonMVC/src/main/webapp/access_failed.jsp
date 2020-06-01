<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    
    <h1 style="color: blue;text-align: center;">SOMETHING WENT WRONG</h1>
    
    <b> <%= request.getUserPrincipal().getName() %>   is not authorized to access this page       </b>
    
    <br>
    <br>
 <a href="../index.jsp">HOME</a>
