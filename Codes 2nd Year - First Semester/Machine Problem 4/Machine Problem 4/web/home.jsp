<%-- 
    Document   : index
    Created on : Sep 26, 2020, 12:00:24 AM
    Author     : Angelo
--%>

<%@ page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <!-- HEAD -->
    <head>
        <title>MP4_Hizon</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style-home.css">
    </head>

    <!-- BODY -->
    <body>
        <div class="main-container" id="home">

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
                            <li><a href="#home">Home</a></li>
                            <li><a href="#about">About</a></li>
                            <li><a href="#project">Projects</a></li>
                            <li><a href="login.jsp">Log Out</a></li>
	        	</ul>
	        </div>
	    </div>
        	
            <!-- BANNER IMAGE -->
            <div class="image">
                <div class="image_content">
                    <h1>
                        Even if you have a dream, and you know what you<br/> 
                        need to make your dream come true<br/>
                        <span>
                            that's not enough
                        </span>
                    </h1>
                    <p>Aikawa Shinnosuke (Gin no Saji)</p>
                </div>
            </div>

            <!-- ABOUT -->
            <div class="about" id="about">
                <h1 class="about_title">About Me</h1>
                <div class="about_compartments">
                    
                    <!-- LEFT SIDE OF ABOUT -->
                    <div class="about_left">
                        <div class="about_picture">
                            <img src="Images/p2.jpg" alt="Picture of Me"><br/>
                        </div>
                        <div>
                            <a href="information.jsp">
                                <input type="button" value="More Info" class="btn">
                            </a>
                        </div>
                    </div>

                    <!-- RIGHT SIDE OF ABOUT -->
                    <div class="about_right">
                        <div class="information">
                            <div>
                                <input type="checkbox" name="accordion" id="personal_information" class="accordion_input" checked>
                                <label for="personal_information" class="accordion_label" id="label_personal_information">Personal Information</label>
                                <div class="accordion_content">
                                    <div class="accordion_content_text">
                                        <p>
                                            Hi! My name is Angelo Louis L. Hizon, your average joe studying in <a href="http://www.ust.edu.ph/" target="_blank">University of Santo Tomas</a> where I am under the Institute of Information and Computing Science. With the program of computer science that focuses on data science where I aspire to become a future data scientist! So that I can analyze the <strong>BIG DATA</strong> and make it understandable for all the people who needs the information. If you wish to know more about me then please proceed to contact section.
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div>
                                <input type="radio" name="accordion" id="expertise" class="accordion_input" checked>
                                <label for="expertise" class="accordion_label" id="label_expertise">Expertise</label>
                                <div class="accordion_content">
                                    <div class="accordion_content_logo">
                                        <img src="Images/HTML.png" alt="HTML"><br/>
                                        <img src="Images/CSS.png" alt="CSS"><br/>
                                        <img src="Images/Java.png" alt="Java"><br/>
                                    </div>
                                </div>
                            </div>
                            <div>
                                <input type="radio" name="accordion" id="achievements" class="accordion_input">
                                <label for="achievements" class="accordion_label">Achievements</label>
                                <div class="accordion_content">
                                    <div class="accordion_content_text">
                                        <ul>
                                            <li>Dean's Lister(1st Year - Second Semester),</li> 
                                            <li>Dean's Lister(1st Year - First Semester),</li>  
                                            <li>Academic Excellence and Conduct Awardee(Grade 12 - Second Semester),</li>  
                                            <li>Academic Excellence and Conduct Awardee(Grade 12 - First Semester),</li> 
                                            <li>Academic Excellence and Conduct Awardee(Grade 11 - Second Semester),</li>  
                                            <li>Academic Excellence and Conduct Awardee(Grade 11 - First Semester),</li>  
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- PROJECT -->
            <div class="project" id="project">
                <h1 class="project_title">Projects</h1>
                <div class="project_picture">
                    <div class="project_notepad">
                        <img src="Images/p3.png" alt="Notepad">
                    </div>
                    <div class="project_binary_tree">
                        <img src="Images/p4.png" alt="Binary Tree">
                    </div>
                    <div class="project_website">
                        <img src="Images/p11.png" alt="Website">
                    </div>
                </div>
                <div class="project_description">
                    <div class="project_notepad_description">
                        <p>
                            <h3>
                                <a href="https://github.com/angelohizon-coder/portfolio/blob/master/programs/List.java" 
                                    target="_blank">
                                    Collections
                                </a>
                            </h3>
                            Generics and Frameworks<br/>
                            Event Handling<br/>
                            Exception Handling<br/>
                        </p>
                    </div>
                    <div class="project_binary_tree_description">
                        <p>
                            <h3>
                                <a href="https://github.com/angelohizon-coder/portfolio/blob/master/programs/BinarySearchTree.java" 
                                    target="_blank">
                                    Binary Tree
                                </a>
                            </h3>
                            Tree Visualization<br/>
                            Traversal<br/>
                            AVL Tree<br/>
                        </p>
                    </div>
                    <div class="project_website_description">
                        <p>
                            <h3>
                                <a href="https://github.com/angelohizon-coder/portfolio/tree/master/programs/1CSD-KaDorm-WebDesign-2T-2019-2020" target="_blank">
                                    Website
                                </a>
                            </h3>
                                Hyper Text Markup Language<br/>
                                Cascading Style Sheet<br/>
                                Responsive Web Design<br/>
                        </p>
                    </div>
                </div>
                <div class="project_footer">
                    <p>The pictures shown above are machine problem and activities done for the following subject respectively: Object Oriented Programming, Data Structures and Algorithm, and Human Computer Interaction. To know more about the stated projects click on the title with the underline and it will link you to a GitHub page that will showcase the source code of each program.</p>
                </div>
                <div class="portfolio_footer">
                    <!-- takes the value from the parameter name of footer and display it to JSP -->
                    <h4><footer><% out.print(getServletContext().getInitParameter("FOOTER")); %></footer></h4>
                </div>
            </div>
        </div>
    </body>
</html>
