<!-- index.jsp -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ServletContextListener</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
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
                         
            <div class="message">
                <h1>
                    This is a Web App that shows the difference between a ServletContext and a ServletConfig! 
                    <br/>
                    Plus the newly added ServletContextListener!! 
                </h1>
                <br>
                <h2><a href="/ServletContextListener/ServletOne"><span>Servlet One</span></a></h2>
                <h2><a href="/ServletContextListener/ServletTwo"><span>Servlet Two</span></a></h2> 
                <br/>
                <h2><a href="/ServletContextListener/ListenerTester"><span>Listener Tester</span></a></h2> 

                <h3>My Global Message: <% out.print(getServletContext().getInitParameter("myMessage")); %> </h3>
                <h3>My Email Address:  <% out.print(getServletContext().getInitParameter("myEmail")); %> </h3>
            </div>
        </div>
    </body>
</html>
