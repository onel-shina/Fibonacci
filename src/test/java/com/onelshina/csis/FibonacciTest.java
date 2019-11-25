package com.onelshina.csis;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void calcFib() {
        /*/
        Expected (known) fibonacci numbers for n-th term based on https://oeis.org/A000045/b000045.txt
         */
        final String EXPECTED_0 = "0";
        final String EXPECTED_1 = "1";
        final String EXPECTED_2 = "1";
        final String EXPECTED_3 = "2";
        final String EXPECTED_100 = "354224848179261915075";
        final String EXPECTED_500 = "139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125";
        final String EXPECTED_2000 = "4224696333392304878706725602341482782579852840250681098010280137314308584370130707224123599639141511088446087538909603607640194711643596029271983312598737326253555802606991585915229492453904998722256795316982874482472992263901833716778060607011615497886719879858311468870876264597369086722884023654422295243347964480139515349562972087652656069529806499841977448720155612802665404554171717881930324025204312082516817125";

        assertEquals(EXPECTED_0, Fibonacci.calcFib(0)[0]);
        assertEquals(EXPECTED_1, Fibonacci.calcFib(1)[0]);
        assertEquals(EXPECTED_2, Fibonacci.calcFib(2)[0]);
        assertEquals(EXPECTED_3, Fibonacci.calcFib(3)[0]);
        assertEquals(EXPECTED_100, Fibonacci.calcFib(100)[0]);
        assertEquals(EXPECTED_500, Fibonacci.calcFib(500)[0]);
        assertEquals(EXPECTED_2000, Fibonacci.calcFib(2000)[0]);


        /* We expect that it would take 200 recursive calls to calculate the fibonacci number for 200
        * Which is the number of subtraction required to reduce n = 200 to the base case which is n = 0
        */
        assertEquals("200", Fibonacci.calcFib(200)[1]);

    }
}
