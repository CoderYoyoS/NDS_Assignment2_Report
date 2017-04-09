##Test Case 2 Analysis

This test case demonstrated that response time for authentication was considerably higher than test case 1. As has been outlined in the results section, the CPU time quota was not exceeded, however, a consistent error-rate of 5% persisted after several runs of loading 200 users onto the system. As has been outlined in the results section, when performing the POST operation to submit the username and password, judging by the response time graph, this operation was clearly a lot more expensive than the 'Visit Login Page' operation. This was to be expected as whatever authentication code needed to be executed within the application to verify the user's credentials evidently took more time to finish than merely visiting the page. 


