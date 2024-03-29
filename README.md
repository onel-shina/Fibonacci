# Using Tail Recursion to find N-th Fibonacci number:
### let's assume we wanted to find fibonacci number for n = 10

| N        | First Number           | Second Number  |
| ------------- |:-------------:| -----:|
|10      | 0 | 1 |
|9      | 1 | 1 |
|8      | 1 | 2 |
|7      | 2 | 3 |
|6      | 3 | 5 |
|5      | 5 | 8 |
|4      | 8 | 13 |
|3      | 13 | 21 |
|2      | 21 | 34 |
|1      | 34 | 55 |
|0      | **55** | 89 |

##### If we decided to do this process by hand, we would create a table like this, we would put the "n" term we want to find the Fibonacci number for at the top of our table. Next to it, we would start the "first number" at 0, and the "second number" at 1.
##### We will deduct "n" by one, we will make the "first number" equal to the "second number" of the term before, and we will make the "second number" equal to the sum of "first number & second number of term before".

##### Now try to look at the table and notice the pattern yourself
##### For example if we look at n = 4, "first number" of n = 4 is equal to the "second number" of n = 5
##### While the "second number" of n = 4 is equal to "first number + second number" of n = 5
##### We will keep deducting 1 from "n" until "n" becomes 0, while calculating "first number" and "second number". When "n" is equal to 0, the "first number" will represent the Fibonacci number for the "n" we started at.


