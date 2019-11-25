package com.onelshina.csis;

import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        long startingTime = System.currentTimeMillis();
        long n = 2000; //Change this number to get the Fibonacci number you want
        String[] result = calcFib(n);
        //Index = 0 : Fibonacci Number
        //Index = 1 : Count (How many times recursive method was called)
        String fibonacciNumber = result[0];
        String count = result[1];
        long elapsedTime = System.currentTimeMillis() - startingTime;
        System.out.println(String.format("The %d-th Fibonacci Number is %s", n, fibonacciNumber));
        System.out.println(String.format("Was calculated in %d ms", elapsedTime));
        System.out.println(String.format("The calcFibAux(..) method got called %S times.", count));
    }

    /**
     * Calls {@link #calcFibAux(long, BigInteger, BigInteger, long)}  method that
     * returns a String Array including the Fibonacci number at index 0, Count at index 1.
     *
     * This method also passes values required to start the recursive calls
     * into {@link #calcFibAux(long, BigInteger, BigInteger, long)}
     *
     * @param n {@link long} The number we want to find the Fibonacci Number for
     * @return {@link String[]} (index = 0: Fibonacci number
     * index = 1: count "how many times recursion method was called")
     */
    protected static String[] calcFib(long n) {
       return calcFibAux(n, BigInteger.ZERO, BigInteger.ONE, 0);
    }

    /**
     * Called by {@link #calcFib(long)}
     * @param n : represents the number that we want to find the Fibonacci Number for
     *          if it's not 0 (base case), the it's reduced by 1 before the recursion call
     *
     * @param first: starts at 0 as passed by {@link #calcFib(long)}
     *             in recursive calls, second is passed as an argument for first.
     * @param second: starts at 0 as passed by {@link #calcFib(long)}
     *             in recursive calls, (second + first) is passed as an argument for second.
     * @param count: starts at 0, it's incremented by 1 before each recursive call to count how
     *             many times the recursion method was called
     *
     * @return {@link String[]} (index = 0: Fibonacci number
     *      * index = 1: count "how many times recursion method was called")
     */
    private static String[] calcFibAux(long n, BigInteger first, BigInteger second, long count) {
        if (n == 0) { //Base Case
            return new String[]{String.valueOf(first), String.valueOf(count)};
        } else {
            return calcFibAux(n - 1, second, first.add(second), count + 1);
        }
    }
}