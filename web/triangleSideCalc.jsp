<%-- 
    Document   : triSideCalc
    Created on : Sep 9, 2013, 9:10:43 PM
    Author     : Chumples
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Triangle Side Calculator</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form id="form" name="form" method="POST" action="TriangleCalcController.do">
            <h2 style="text-align:center;">
                Triangle Side Calculator
            </h2>
            <p style="font-family:arial">
                <strong>Please Enter two triangle side lengths</strong>
                <br>
                <br>
                First side length:&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" value="" name="sideOne">
                <br>
                <br>
                Second side length: <input type="text" value="" name="sideTwo">
            </p>
            <input name="btnCalc" type="submit" value="Calculate"/>
        </form>
        <br>
        <br>
        <br>
        <a href="calculatorSelect.jsp">Back
    </body>
</html>
