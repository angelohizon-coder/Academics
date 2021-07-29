import javax.servlet.*;

public class UserContextListener implements ServletContextListener
{
    // Creates the Servlet Context Listener
    public void contextInitialized(ServletContextEvent event) 
    {
        // Uses the servlet context class which then will pass its parameter to the User class
        // The user class will process the information and pass it on to the LoginServlet
        ServletContext sc = event.getServletContext();
        String username = sc.getInitParameter("username");
        User u = new User(username);
        sc.setAttribute("user", u);
    }
    
    public void contextDestroyed(ServletContextEvent event) 
    {
        // nothing to do here
    }
}
