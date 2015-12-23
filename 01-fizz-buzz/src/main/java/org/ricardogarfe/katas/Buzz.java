package org.ricardogarfe.katas;

import java.util.function.Predicate;

public class Buzz implements Rule {

    private static final int BUZZ_VALUE = 5;
    private static final int ZERO_VALUE = 0;
    private static final String BUZZ = "Buzz";

    private static String DEFAULT_RESULT = "";

    Predicate<Integer> buzzFilter = value -> value % BUZZ_VALUE == ZERO_VALUE;

    @Override
    public String check(Integer value) {
        return this.buzzFilter.test(value) ? BUZZ : DEFAULT_RESULT ;
    }
}
