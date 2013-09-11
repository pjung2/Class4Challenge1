<%-- 
    Document   : circleAreaCalc
    Created on : Sep 9, 2013, 9:11:40 PM
    Author     : Chumples
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Circle Area Calculator</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form id="form" name="form" method="POST" action="CalculatorController.do">
            <h2 style="text-align:center;">
                Circle Area Calculator
            </h2>
            <p style="font-family:arial">
                <strong>Please Enter the radius of the circle</strong>
                <br>
                <br>
                Circle radius:&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" value="" name="radius">
            </p>
            <input name="btnCalc" type="submit" value="Calculate"/>
        </form>
        <br>
        <br>
        <br>
        <a href="calculatorSelect.jsp">Back
    </body>
</html>
