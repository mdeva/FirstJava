<%-- 
    Document   : register
    Created on : 15 May, 2018, 3:57:24 PM
    Author     : deverajan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <script src="<c:url value="/resources/theme1/js/newjavascript.js" />"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <input type="text" id="name" placeholder="name"/>
        <input type="text" id="address" placeholder="address"/>
        
        <button type="submit" onclick="UserAction()" value="Submit" > submit
        </button>
    </body>
</html>
