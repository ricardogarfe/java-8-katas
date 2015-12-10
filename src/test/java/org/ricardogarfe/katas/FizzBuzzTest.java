package org.ricardogarfe.katas;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

    private final static String ONE_RESULT = "1";
    private final static String FIZZ_RESULT = "Fizz";
    private final static String BUZZ_RESULT = "Buzz";
    private final static String FIZZ_BUZZ_RESULT = "FizzBuzz";
    private static FizzBuzz fizzBuzz;

    @Parameterized.Parameter // first data value (0) is default
    public /* NOT private */ int fizzBuzzInput;
    @Parameterized.Parameter(value = 1)
    public /* NOT private */ String fizzBuzzExpected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {1, ONE_RESULT},
                {3, FIZZ_RESULT},
                {5, BUZZ_RESULT},
                {15, FIZZ_BUZZ_RESULT}
        });
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testRetrieveFizzBuzz() {

        String fizzBuzzResult = fizzBuzz.retrieveFizzBuzz(fizzBuzzInput);
        assertEquals("Result is not correct", fizzBuzzExpected, fizzBuzzResult);
    }

    @Test
    public void testShowCountDown() {

        fizzBuzz.transformValues();
        assertTrue("That's true not false", true);
    }

}

