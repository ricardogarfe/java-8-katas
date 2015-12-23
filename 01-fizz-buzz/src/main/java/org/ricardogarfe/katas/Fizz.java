package org.ricardogarfe.katas;

import java.util.function.Predicate;

public class Fizz implements Rule {

    private static final int FIZZ_VALUE = 3;
    private static final int ZERO_VALUE = 0;
    private static final String FIZZ = "Fizz";

    private static String DEFAULT_RESULT = "";

    Predicate<Integer> fizzFilter = value -> value % FIZZ_VALUE == ZERO_VALUE;

    @Override
    public String check(Integer value) {
        return this.fizzFilter.test(value) ? FIZZ : DEFAULT_RESULT ;
    }
}
