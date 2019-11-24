package com.onelshina.csis;
import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) {
        long startingTime = System.currentTimeMillis();
        long n = 2000; //Change this number to get the Fibonacci number you want
        String[] result = calcFib(n);
        String fibonacciNumber = result[0];
        String count = result[1];
        long elapsedTime = System.currentTimeMillis() - startingTime;
        System.out.println(String.format("The %d-th Fibonacci Number is %s", n, fibonacciNumber));
        System.out.println(String.format("Was calculated in %d ms", elapsedTime));
        System.out.println(String.format("The calcFibAux(..) method got called %S times.", count));
    }
    
    /**
     * Calls {@link #calcFibAux(BigInteger, BigInteger, BigInteger, BigInteger)} method that returns a
     * BigInteger Array including the Fibonacci number at index 0, Count at index 1.
     *
     * This method also passes values required to start the recursive calls into the {@link #calcFibAux(BigInteger, BigInteger, BigInteger, BigInteger)}
     *
     * @param n {@link long} The number we want to find the Fibonacci Number for
     * @return {@link String[]} index 0: Fibonacci number, index 1: count (how many times recursion method was called)
     */

    protected static String[] calcFib(long n) {
        BigInteger[] fibonacciAndCount = calcFibAux(BigInteger.valueOf(n), BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO);
        String fibNum = String.valueOf(fibonacciAndCount[0]);
        String count = String.valueOf(fibonacciAndCount[1]); //To avoid static book-keeping
        return new String[]{fibNum, count};
    }


    private static BigInteger[] calcFibAux(BigInteger n, BigInteger first, BigInteger second, BigInteger count) {
        if (n.equals(BigInteger.ZERO)) { //Base Case
            return new BigInteger[]{first, count};
        }
        else {
            count = count.add(BigInteger.ONE); //To avoid static book-keeping
            return calcFibAux(n.subtract(BigInteger.ONE), second, first.add(second), count);
        }
    }
}