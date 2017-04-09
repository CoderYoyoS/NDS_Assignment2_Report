# Conclusion

This study explored load testing and stress testing an application deployed to Microsoft's Azure PaaS. Whilst insights were gained into the industry proven methodologies of carrying out such tests there were undesired results whilst preparing to carry them out. Whilst a lot of time was initially allocated to configuring the JMeter test scripts, the bigger learning exercise was that of learning how to quantify data from the tests properly and becoming accustomed to the Azure platforms limitations and quotas on their 'free' tier. This ultimately resulted in the team not being able to run as much tests as they would like in order to get familiar with the platforms behavior under different loads and operations. As a consequence of this, running tests has to be performed regimentally under strict circumstances which allowed minimal margin for error in the JMeter test scripts. To conclude, the project was a positive learning experience with the team members now aware f how to successfully allocate time and resources should they need to test a web application again.

#Further Work

In the event that the team had the opportunity to build on the work that was carried out in this study, several approaches would be taken differently:

- Establish early on what user interaction level is expected on an application such as this. Then an accurate assumption of load-testing thresholds can be established.

- Configure JMeter scripts early ensuring that consideration is given to deleting entities that have been created during test runs. A lot of time at the beginning of the project was lost due to manual deletion of surveys on the website.

- Stay critically aware of Azures quotas and implement a schedule to run tests so that these quotas stay within there limits(although this may still be an issues because of the 3 minute CPU time quota), perhaps look at a platform that provides a much higher CPU time quota on their free tier.


 