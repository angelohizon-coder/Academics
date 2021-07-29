import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.AuthenticationException;
import com.login.NullValueException;
public class LoginServlet extends HttpServlet {

    String username;
    String password;
    
    // Gets the initial parameter from the deployment descriptor
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
        
        String un = request.getParameter("un");
        String pw = request.getParameter("pw");
        
        // If the username and password is correct
        if(un.equals(username) && pw.equals(password))
        {
            // Uses the user class to get the attribute from the servlet context using the listener
            User user = (User) getServletContext().getAttribute("user");
                
            // Sends the short message and the username to the home.jsp or the said said success page
            request.setAttribute("messageOne", user.toString());
            request.setAttribute("messageTwo", user.getUsername());
            request.getRequestDispatcher("registeredUser/home.jsp").forward(request, response); 
        }
        
        // If the username and/or password is empty then it will throw an exception type
        // Which then will be handled by the deployment descriptor that will launch an error page
        // The error page will be the Authentication.jsp
        else if(un.equals("") || pw.equals(""))
        {
            throw new NullValueException();
        }
        
        // If the username and/or password is wrong then it will thrown an exception type
        // Which then will be handled by the deployment descriptor that will launch an error page
        // Null.jsp
        else
        {
            throw new AuthenticationException();
        }
            
        
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
