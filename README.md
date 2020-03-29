# covidDemo
This is a demo web app for Covid

How does this code work :
You need Java-8, IntellijCommunityAddition.
Open IntelliJ => Import Project from Existing source, select pom.xml file.

How to run : Go to AddConfiguration in right-middle. One window is opened => Click on '+' Sign, select Maven => Select ../covidDemo in Working directory => put spring-boot:run in the command line box.
Now run the project, it's going to run on port 8080 (In case there is a need to change the port number, open src/main/resources/application.properties file. write "server.port=8081" 

What are the endpoints provided : Go to QuestionnaireController
go to http://localhost:8080/questionnaireForm to get the form.

Once the form is submitted, new page is opened.

