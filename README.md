# Using Tail Recursion to find N-th Fibonacci number:
### let's assume we wanted to find fibonacci number for n = 0

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
|1      | **55** | 89 |

##### If we decided to do this process by hand, we would create a table like this, we would put the "n" term we want to find the Fibonacci number for at the top of our table. Next to it, we would start out "first number" at 0, and our "second number" at 1.
##### We will deduct "n" by one, we will make the "first number" same as the "second number" of the term before, and we will make the "second number" equal to the sum of "first number & second number of term before".

##### Now try to look at the table and notice the pattern yourself
##### For example if we look at n = 4, "first number" is equal to the "second number" of n = 3
##### While the "second number" of n = 4 is equal to the sum of "first number & second number" of n = 3

#### Now that you know how to calculate the Fibonacci number for n = 10!
#### But, what if someone asked you to calculate the Fibonacci number for n = 2000? You can definitely create a table likes this and spend a few days doing it! You might get tired though, or you might make mistakes!

### Fortunately, we can use tail recursion to do that in Java :)
