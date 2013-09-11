<%-- 
    Document   : rectangleAreaCalc
    Created on : Sep 9, 2013, 9:02:40 PM
    Author     : Chumples
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Rectangle Area Calculator</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form id="form" name="form" method="POST" action="CalculatorController.do">
            <h2 style="text-align:center;">
                Rectangle Area Calculator
            </h2>
            <p style="font-family:arial">
                <strong>Please Enter the length and width of the rectangle</strong>
                <br>
                <br>
                Length:&nbsp&nbsp&nbsp <input type="text" value="" name="length">
                <br>
                <br>
                Width: &nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" value="" name="width">
            </p>
            <input name="btnCalc" type="submit" value="Calculate"/>
        </form>
        <br>
        <br>
        <br>
        <a href="calculatorSelect.jsp">Back
    </body>
</html>
