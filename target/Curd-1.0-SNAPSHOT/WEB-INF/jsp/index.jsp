<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="<c:url value="/resources/theme1/js/newjavascript.js" />"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                console.log("ready!");
                getuserlist();
            });
        </script>
        <title>Welcome to Spring Web MVC project</title>
    </head>



    <body>

        <table id="userlist">
        </table>>
        
        <a href="/Curd/register">Register</a>
    </body>


</html>
