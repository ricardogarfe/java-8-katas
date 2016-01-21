package org.ricardogarfe.katas;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringCalculator {

    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNotEmpty = isEmpty.negate();

    public Integer simpleStringCalculator(String stringNumbers) {

        List<String> strings = retrieveStringArray(stringNumbers);

        return strings.stream().filter(isNotEmpty).map(Integer::valueOf).reduce(
                0,
                (a, b) -> a + b);
    }

    public List<String> retrieveStringArray(String stringNumbers) {
        return Arrays.asList(stringNumbers.split(","));
    }
}
