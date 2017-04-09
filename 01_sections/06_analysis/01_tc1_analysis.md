##Test Case 1 Analysis

In hindsight of running all tests, use case 1 seems to be the least computationally expensive test scenario. This can be expected because it is the use case with the least amount of samplers. This particular scenario can execute, with no error, up until approximately 660 - 670 threads before there is a frequent rate of '500 - INTERNAL SERVER ERROR' errors. However, this point of failure is introduced by Azures 3 minute CPU time quota and not an exact reflection upon the servers health. 



