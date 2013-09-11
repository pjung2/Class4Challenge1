<%-- 
    Document   : calculatorSelect
    Created on : Sep 9, 2013, 9:01:49 PM
    Author     : Chumples
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Convenience Calculators Home</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script language="JavaScript">
            function btnSubmit_onclick()
            {
                var calcChoice = document.form.calculator.value;
                if (document.form.calculator.value === "rectangleAreaCalc.jsp")
                {
                    window.location.href = calcChoice;
                }
                else if (document.form.calculator.value === "circleAreaCalc.jsp")
                {
                    window.location.href = calcChoice;
                }
                else if (document.form.calculator.value === "triangleSideCalc.jsp")
                {
                    window.location.href = calcChoice;
                }
            }
        </script>
    </head>
    <body>
        <h1 align="center">Convenience Calculator Tool</h1>
        <form id="form" name="form">
            <p align="center">Select A Calculator</p>
            <p align="center">Calculator:
                <select id="calculator" name="calculator" size ="1">
                    <option value="rectangleAreaCalc.jsp">Rectangle Area Calculator</option>
                    <option value="circleAreaCalc.jsp">Circle Area Calculator</option>
                    <option value="triangleSideCalc.jsp">Triangle Side Calculator</option>
                </select>
            </p>
            <br>
            <br>
            <br>
            <center>
                <input type="button" onclick="return btnSubmit_onclick();" name="btnSubmit" value="Submit">
            </center>
    </body>
</html>
