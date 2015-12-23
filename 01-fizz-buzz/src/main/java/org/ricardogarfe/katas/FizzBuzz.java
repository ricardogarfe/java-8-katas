package org.ricardogarfe.katas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    private static final int DEFAULT_MAX_VALUE = 100;

    private List<Integer> counterList;
    private ActiveRules activeRules;

    Consumer<String> printResult = System.out::println;

    public FizzBuzz() {
        initializeArrayFromMaxValue(DEFAULT_MAX_VALUE);
        activeRules = new ActiveRules();
    }

    public void transformValues() {
        counterList.stream().map(this::retrieveFizzBuzz).collect(Collectors.toList()).forEach(printResult);
    }

    public String retrieveFizzBuzz(Integer value) {
        return activeRules.applyRules(value);
    }

    public void initializeArrayFromMaxValue(int maxCount) {
        counterList = new ArrayList<>();
        IntStream.range(1, maxCount + 1).forEach(counterList::add);
    }
}
