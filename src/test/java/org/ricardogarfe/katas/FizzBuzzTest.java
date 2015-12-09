package org.ricardogarfe.katas;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    static FizzBuzz fizzBuzz;

    private final static String ONE_RESULT = "1";
    private final static String FIZZ_RESULT = "Fizz";
    private final static String BUZZ_RESULT = "Buzz";
    private final static String FIZZ_BUZZ_RESULT = "FizzBuzz";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testRetrieveFizzBuzz() {

        String fizzBuzzResult = "";

        fizzBuzzResult = fizzBuzz.retrieveFizzBuzz(1);
        assertEquals("Result is not 1",ONE_RESULT, fizzBuzzResult);

        fizzBuzzResult = fizzBuzz.retrieveFizzBuzz(3);
        assertEquals("Result is not Fizz",FIZZ_RESULT, fizzBuzzResult);

        fizzBuzzResult = fizzBuzz.retrieveFizzBuzz(5);
        assertEquals("Result is not Buzz",BUZZ_RESULT, fizzBuzzResult);

        fizzBuzzResult = fizzBuzz.retrieveFizzBuzz(15);
        assertEquals("Result is not FizzBuzz", FIZZ_BUZZ_RESULT, fizzBuzzResult);
    }

}

