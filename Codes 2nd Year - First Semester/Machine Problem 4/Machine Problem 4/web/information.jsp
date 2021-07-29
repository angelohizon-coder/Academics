<%-- 
    Document   : information
    Created on : Sep 27, 2020, 8:24:00 PM
    Author     : Angelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MP4_Hizon</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style-information.css">
    </head>
    <body>
        <div class="main">
             <!-- MENU -->
            <div class="navigation_bar">
	        <div class="logo">
                    <a href="#">
                        <strong>
                            <!-- takes the value from the parameter name of header and display it to JSP -->
                            <header><% out.print(getServletContext().getInitParameter("HEADER")); %></header>
                        </strong>
                    </a>
	        </div>

	        <div class="navigation_bar_items">
                    <ul>
                        <li><a href="home.jsp">Home</a></li>
                        <li><a href="login.jsp">Log Out</a></li>
                    </ul>
	        </div>
            </div>
            <!-- INFO -->
            <div class="info" id="info">
                <div class="info_compartments">
                    
                <!-- LEFT SIDE -->
                    <div class="info_social_media">
                        <div class="test">
                            <!-- TOP ROW -->
                            <div class="row_one">
                                <div class="element">
                                    <!-- FACEBOOK -->
                                    <a href="https://www.facebook.com/xRusian/" target="_blank">
                                        <img src="Images/p16.png">
                                    </a>
                                </div>
                                <div class="element">
                                    <!-- GITHUB -->
                                    <a href="https://github.com/angelohizon-coder" target="_blank">
                                        <img src="Images/p17.png">
                                    </a>
                                </div>
                            </div>
                            <!-- BOTTOM ROW -->
                            <div class="row_two">
                                <div class="element">
                                    <!-- LINKEDIN -->
                                    <a href="https://www.linkedin.com/in/angelo-coder" target="_blank">
                                        <img src="Images/p18.png">
                                    </a>
                                </div>
                                <div class="element">
                                <!-- INSTAGRAM -->
                                    <a href="https://www.instagram.com/allhizon/?hl=en" target="_blank">
                                        <img src="Images/p19.png">
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                
                    <!-- RIGHT SIDE -->
                    <div class="info_information">
                        <!-- Contains the MVC for hobby -->
                        <form action="HobbyServlet" method="GET">
                            <!-- Drop-down list that includes submit buttons to send the value to HobbyServlet -->
                            <div class="dropdown">
                                <p class="dropbtn">List of Hobbies</p>
                                <div class="dropdown-content">
                                    <ul>
                                        <li><input class="btn" type="submit" name="collection" value="Physical Hobby"></li>
                                        <li><input class="btn" type="submit" name="collection" value="Creative Hobby"></li>
                                        <li><input class="btn" type="submit" name="collection" value="Random Hobby"></li>
                                    </ul>
                                </div>
                          </div>
                            
                        </form>
                        <div class="hobby">
                            <p>
                                <strong>
                                <!-- Output received from HobbyServlet that originate from HobbyCollection -->
                                <% 
                                    String output = (String)request.getAttribute("collection") + "";
                                    if(output.equals("null"))
                                        out.println("Instruction: Please select from the drop down list");
                                    else
                                        out.println(output);
                                %>
                                </strong>
                            </p>
                        </div>
                        <div class="anime">
                            <!-- Series of images for the anime section in information.jsp -->
                            <h3 align="center">Favorite Anime</h3>
                            <div class="anime_image">
                                <a href="https://myanimelist.net/anime/918/Gintama" target="_blank">
                                    <img src="Images/p20.jpg" alt="Gintama"><br/>
                                </a>
                                <a href="https://myanimelist.net/anime/5114/Fullmetal_Alchemist__Brotherhood" target="_blank">
                                    <img src="Images/p21.jpg" alt="Full Metal Alchemist Brotherhood"><br/>
                                </a>
                                <a href="https://myanimelist.net/anime/1575/Code_Geass__Hangyaku_no_Lelouch" target="_blank">
                                    <img src="Images/p22.jpg" alt="Code Geass"><br/>
                                </a>
                                <a href="https://myanimelist.net/anime/31646/3-gatsu_no_Lion" target="_blank">
                                    <img src="Images/p23.jpg" alt="March Comes in Like a Lion"><br/>
                                </a>
                            </div>
                            <div class="anime_description">
                                <p>
                                    <!-- Short description to why I added this to information.jsp -->
                                    The anime above includes the following: Gintama, Fullmetal Alchemist
                                    Brotherhood, Code Geass, and March Comes in Like a Lion. You might be wondering,
                                    why did I add this to my portfolio? It is simply because I truly love 
                                    and enjoy my time reading manga and watching anime and that is part of
                                    who I am. If you wish to know more about the image showcased above please visit 
                                    <a href="https://myanimelist.net/"> myanimelist.net</a> where everything you need 
                                    to know will be given in their corresponding pages or simply click the images above.
                                </p>
                            </div>
                        </div>
                    </div> 
                </div>
            <!-- takes the value from the parameter name of footer and display it to JSP -->
            <footer><h4><% out.print(getServletContext().getInitParameter("FOOTER")); %></h4></footer>
            </div>
        </div>
    </body>
</html>
