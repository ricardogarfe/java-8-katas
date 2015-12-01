package org.ricardogarfe.katas;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Created by ricardo on 1/12/15.
 */
public class FizzBuzz {

    private static int FIZZ_VALUE = 3;
    private static int BUZZ_VALUE = 3;
    private static int ZERO_VALUE = 0;

    Predicate<Integer> fizzFilter = (value) -> (value.intValue() % FIZZ_VALUE == ZERO_VALUE);
    Predicate<Integer> buzzFilter = (value) -> (value.intValue() % BUZZ_VALUE == ZERO_VALUE);

    public void printCountDown(int maxCount) {
        List<Integer> counterList = retrieveArrayFromMaxValue(maxCount);
        counterList.stream().filter(fizzFilter).forEach((value) -> System.out.println(value));

    }

    public List<Integer> retrieveArrayFromMaxValue(int maxCount) {

        List<Integer> counterList = new ArrayList<>();

        IntStream.range(1,maxCount+1).forEach(val -> counterList.add(val));

        return counterList;

    }
}
