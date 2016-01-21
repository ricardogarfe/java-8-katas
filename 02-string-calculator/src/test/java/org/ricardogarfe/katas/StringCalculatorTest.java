package org.ricardogarfe.katas;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple StringCalculator.
 */
public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    /**
     * 1) Create a simple String calculator with a method int Add(string numbers)
     * 1. The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”
     * 2. Start with the simplest test case of an empty string and move to 1 and two numbers
     * 3. Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
     * 4. Remember to refactor after each passing test
     *
     * @throws Exception
     */
    @Test
    public void testSimpleStringCalculator() throws Exception {

        String stringNumbers = "";
        Assert.assertTrue("Add method fail to calculate sum.",
                0 == stringCalculator.simpleStringCalculator(stringNumbers));

        stringNumbers = "1";
        Assert.assertTrue("Add method fail to calculate sum.",
                1 == stringCalculator.simpleStringCalculator(stringNumbers));

        stringNumbers = "1,2";
        Assert.assertTrue("Add method fail to calculate sum.",
                3 == stringCalculator.simpleStringCalculator(stringNumbers));
    }

    /**
     * 2) Allow the Add method to handle an unknown amount of numbers
     */
    @Test
    public void testHandleUnknownAmountOfNumbers() throws Exception {

        String stringNumbers = "1,2,3,4,5,6";
        Assert.assertTrue("Add method fail to calculate sum.",
                21 == stringCalculator.simpleStringCalculator(stringNumbers));
    }
}
