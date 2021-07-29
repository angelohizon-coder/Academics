public class User 
{
    private String username;
    private String password;

    public User() 
    {
        // nothing to type here
    }
    
    // Gets the username
    public User(String u) 
    {
        username = u;
    }
    
    // Passes the username 
    public String getUsername()
    {
        return username;
    }
    
    // Passes the short message
    public String toString()
    {
        return "it appears you have reached my domain! i welcome you to my webpage, ";
    }
}
