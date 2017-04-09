##Elected Testing Parameters

Prior to considering the previous scenarios that may affect the quality of data acquired from testing, the proceeding strategies will be adopted in order to provide alternative avenues to explore when test data is acquired. Each test case scenario will be running whilst taking the following parameters into consideration:

- *Time of the day will not be a parameter*: Because the application does not possess real-world users, testing at specified times such as peak-times will be inconsequential to the data acquired because there is no user-data to base these times off. Considerations based around business hours in the country where the application is hosted will also not be factored into the tests because of the multi-tenant environment that the Azure servers accommodate in which each one of the other tenants on the server can be from any country in the world thus, nullifying an argument that the server may experience higher-loads of traffic during business hours. That data is not available to the testing team, therefore will not be considered as an input.

- *Having inadequate RAM on a machine to generate a sufficiently high number of user threads*: Every precaution, such as, running tests in non-GUI mode, will be taken to ensure that the tests are running in the leanest conditions possible that require the fewest amount of system resources possible. In the event of a script executing to completion because of inadequate RAM resources an explanation will be provided in the Analysis section of this paper.

- *Exceeding the CPU Time quota*: This threshold will be treated in the context that it is the *actual* applications load threshold before consistent errors rates. Therefore, analysis can be conducted on which operations are most CPU-intensive and as a result of these expensive operations, insights can be provided as to what types of operation brings the website to failure.

