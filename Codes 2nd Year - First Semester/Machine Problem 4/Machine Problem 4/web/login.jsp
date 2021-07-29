<%-- 
    Document   : login
    Created on : Sep 26, 2020, 12:31:19 PM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MP4_Hizon</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style-login.css">
    </head>
    <body>
        <div class="main">
            <div class="logo_bar">
                <div class="logo">
                     <a href="#">
                         <strong>
                             <!-- takes the value from the parameter name of header and display it to JSP -->
                             <header><% out.print(getServletContext().getInitParameter("HEADER")); %></header>
                         </strong>
                     </a>
                </div>
            </div>
            
            <div class="login_bar">
                <div class="login">
                    <h1>Login</h1>
                    <form action="LoginServlet" method="post">
                        <div class="textbox">
                            <!-- textbox that requires the user's input for username -->
                            <input type="text" placeholder="Username" name="un" required>
                        </div>
                        <div class="textbox">
                            <!-- textbox that requires the user's input for password -->
                            <input type="password" placeholder="Password" name="pw" required>
                        </div>
                        <input class="btn" type="submit" name="" value="Log-in">
                    </form>
                </div>                
            </div>
            
            <div class="login_footer">
                <!-- takes the value from the parameter name of footer and display it to JSP -->
                <footer><h4><% out.print(getServletContext().getInitParameter("FOOTER")); %></h4></footer>
            </div>
        </div>
    </body>
</html>
