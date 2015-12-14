package org.ricardogarfe.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    private static final int FIZZ_VALUE = 3;
    private static final int BUZZ_VALUE = 5;
    private static final int ZERO_VALUE = 0;
    private static final int DEFAULT_MAX_VALUE = 100;

    private List<Integer> counterList;

    Predicate<Integer> fizzFilter = value -> value % FIZZ_VALUE == ZERO_VALUE;
    Predicate<Integer> buzzFilter = value -> value % BUZZ_VALUE == ZERO_VALUE;


    Consumer<Object> printResultConsumer = System.out::println;

    public FizzBuzz() {
        initializeArrayFromMaxValue(DEFAULT_MAX_VALUE);
    }

    public void transformValues() {
        List<String> fizzBuzzResult = counterList.stream().map(this::retrieveFizzBuzz).collect(Collectors.toList());
        fizzBuzzResult.forEach(printResultConsumer);
    }

    /**
     * Non functional result
     *
     * @param value
     * @return
     */
    public String retrieveFizzBuzz(int value) {

        String result = "";

        if (fizzFilter.test(value)) {
            result += "Fizz";
        }
        if (buzzFilter.test(value)) {
            result += "Buzz";
        }
        return result.length() > 0 ? result : Integer.toString(value);
    }

    public void initializeArrayFromMaxValue(int maxCount) {

        counterList = new ArrayList<>();
        IntStream.range(1, maxCount + 1).forEach(counterList::add);
    }
}
