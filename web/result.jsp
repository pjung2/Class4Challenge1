<%-- 
    Document   : result
    Created on : Sep 9, 2013, 9:49:14 PM
    Author     : Chumples
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        <p>
            <%
                // get attributes
                String msg = (String)request.getAttribute("msg");
                String answer = (String)request.getAttribute("answer");
                
                // print output
                out.print(msg);
                out.print("answer = " + answer);
            %>
                
        </p>
    </body>
</html>
