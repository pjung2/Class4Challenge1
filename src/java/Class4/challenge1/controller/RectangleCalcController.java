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
@WebServlet(name = "CalculatorController", urlPatterns = {"/RectangleCalcController.do"})
public class RectangleCalcController extends HttpServlet
{
   private static final String RESULT_PAGE = "result.jsp";
   private static String answer = "";
   private static String msg = "";

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method. Not currently used.
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
     * Handles the HTTP <code>POST</code> method.
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
 
        String paramLength = request.getParameter("length");
        String paramWidth = request.getParameter("width");
        
        if(paramLength != null || paramLength.length() != 0 && paramWidth != null || paramWidth.length() != 0)
        {
             processRectangle(request, response);
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

    
    // Rectagle
    public void processRectangle(HttpServletRequest request, HttpServletResponse response)
    {
        // parameters are name attributes in view pages
        // Here we're retrieving form content from form.html
        String length = request.getParameter("length");
        String width = request.getParameter("width");

        msg = "The area of the rectangle ";
        answer = getCalculateRectangleArea(length, width);
    }
    
    //-------------------------------------------------------------------
    
    // Calculates area of rectangle
    public String getCalculateRectangleArea(String length, String width)
    {
        String strAnswer = "";     
        try
        {
        double answer = Double.valueOf(length) * Double.valueOf(width);
        answer = Math.round(answer * 100.0) / 100.0;
        strAnswer = "" + answer;
        }
        catch(NumberFormatException nfe)
        {
            strAnswer = "There was an error";
        }
    return strAnswer;
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Main Controller";
    }// </editor-fold>

}
