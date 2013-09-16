/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Class4.challenge1.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chumples
 */
@WebServlet(name = "CircleCalcController", urlPatterns = {"/CircleCalcController.do"})
public class CircleCalcController extends HttpServlet
{
    private static final String RESULT_PAGE = "result.jsp";
    private static String answer = "";
    private static String msg = "";

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method. Not currently used.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    } // </editor-fold>

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
 
        String param = request.getParameter("radius");
        
        if(param != null || param.length() != 0)
        {
             processCircle(request, response);
        } 

        // set attributes for result page to retrive
        request.setAttribute("msg", msg);
        request.setAttribute("answer", answer);
        
        // This object lets you forward both the request and response
        // objects to a destination page
        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response); 
    }    

    public void processCircle(HttpServletRequest request, HttpServletResponse response)
    {
        // parameters are name attributes in view pages
        // Here we're retrieving form content from form.html
        String radius = request.getParameter("radius");

        msg = "The area of the circle ";
        answer = getCalculateCircleArea(radius);
    }
    
    // Circle
    public String getCalculateCircleArea(String radius)
    {
        String strAnswer = "";
        double dRadius = Double.valueOf(radius);

        try
        {
            double answer = Math.pow(dRadius, 2) * Math.PI;
            answer = Math.round(answer * 100.0) / 100.0;
            strAnswer = "" + answer;
        }
        catch (NumberFormatException nfe)
        {
            strAnswer = "There was an error";
        }
        
        return strAnswer;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Main Controller";
    }// </editor-fold>
}
