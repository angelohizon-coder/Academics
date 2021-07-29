/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angelo
 */
public class LoginServlet extends HttpServlet {

    String username;
    String password;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        // Receives the information from the DD and assign into strings to be compared
        username = config.getInitParameter("username");  // admin
        password = config.getInitParameter("password");  // 123456
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            // Receives the information from the JSP
            String un = request.getParameter("un");
            String pw = request.getParameter("pw");
            
            // Compares the username and password from DD and JSP
            if(username.equals(un) && password.equals(pw))
            {
                // If username and password are correct
                response.sendRedirect("home.jsp");
            }
            
            else if(!username.equals(un) && !password.equals(pw))
            {
                // If username AND password are incorrect
                request.setAttribute("credentials", "Username and Password");
                request.getRequestDispatcher("error.jsp").forward(request, response); 
            }
            
            else if(!username.equals(un))
            {
                // if USERNAME is INCORRECT
                request.setAttribute("credentials", "Username");
                request.getRequestDispatcher("error.jsp").forward(request, response); 
            }
            
            else
            {
                // if PASSWORD is INCORRECT
                request.setAttribute("credentials", "Password");
                request.getRequestDispatcher("error.jsp").forward(request, response); 
            }
        } 
        finally 
        {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
