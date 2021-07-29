<%-- 
    Document   : error
    Created on : Sep 26, 2020, 7:35:33 PM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MP4_Hizon</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style-error.css">
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
            
            <div class="error_message">
                <div class="error">
                    <h1>
                        <!-- Takes a string value from LoginServlet and display it here -->
                        Incorrect</br>
                        <%String output = (String)request.getAttribute("credentials"); %>
                        <%= output%>        
                        <!-- 
                            There are three possible scenarios which includes incorrect username and password, incorrect
                                password, and incorrect username
                        -->
                    </h1>
                    <a href="login.jsp">
                        <!-- Connects the error.jsp to login.jsp -->
                        <input class="btn" type="button" name="" value="Return">
                    </a>
                </div>                
            </div>
            
            <div class="error_footer">
                <!-- takes the value from the parameter name of footer and display it to JSP -->
                <h4><footer><% out.print(getServletContext().getInitParameter("FOOTER")); %></footer></h4>
            </div>
        </div>
    </body>
</html>
