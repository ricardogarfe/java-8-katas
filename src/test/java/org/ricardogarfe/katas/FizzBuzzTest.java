package org.ricardogarfe.katas;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {

    static FizzBuzz fizzBuzz;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testShowCountDown() {

        fizzBuzz.printCountDown(10);
        assertTrue("That's true not false",true);
    }
}

