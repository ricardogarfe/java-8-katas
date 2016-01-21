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
}
