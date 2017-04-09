##CloudSurvey Web Application

Cloud Survey is a web application deployed on Azure platform that will be used for testing. The app consists of a administrator login page, that allows an admin to log into the application.

![Admin Login Page. \label{Admin Login}](04_assets/systemoverview/AdminLogin.JPG)
Upon successful login, the page is updated to display the Admin Survey page. This page is a contains a list of surveys that have been previously created by an admin, if any. When an admin wishes to create a new survey, they must click on the 'New Survey' button which will update the view.

![New Survey Button. \label{New Survey}](04_assets/systemoverview/NewSurvey.JPG)

The view is updated to allow the admin to create a survey. This view consists of a range of areas where an admin can change the survey title, add a description and also allows the creation of questions within the survey. 

![Make a Survey. \label{Make Survey}](04_assets/systemoverview/MakeSurvey.JPG)
When a new question is added to the survey the admin is then allowed to edit the question text, as well as decide which kind of response the question should have. In this case, the three kind of response types are text, boolean (true or false) or scale, that can give a rating between one to five. Additionally, once a question is initially created, a URL to the survey is provided which consists of the app name and the survey name chosen by the administrator.

![Survey with question types and URL. \label{Survey}](04_assets/systemoverview/FullSurvey.png)
When the survey URL is clicked, a new web page is opened containing the questions created by the administrator in a survey format. The following screenshot displays the example survey created using the three example questions and 3 response types.

![Survey Webpage. \label{Survey}](04_assets/systemoverview/surveyPage.JPG)
As seen above, the page allows a user to fill out the form accordingly and submit their answers the application using the 'Submit Survey' button. When the survey has been taken, an admin is then allowed to view the result set from the admin survey's page. This provides graphical representations of the questions that have been answered. In terms of scale responses, the average result is displayed in a bar chart going from one to five and text responses are given in a text area. Furthermore, the boolean response type is shown in a pie chart representation, displaying the percentage of yes or no answers that have been submitted. 

![Statistical Visualization of Answers. \label{Survey}](04_assets/systemoverview/stats.JPG)
