package org.ricardogarfe.katas;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple StringCalculator.
 */
public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void testSimpleStringCalculator() throws Exception {

        String[] stringNumbers = {"", "2"};
        Assert.assertTrue("Add method fail to calculate sum.",
                2 == stringCalculator.simpleStringCalculator(stringNumbers));
    }
}
