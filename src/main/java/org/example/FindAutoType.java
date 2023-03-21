package org.example;

import java.util.function.Function;

/**
 * Implement the suitable functional interface and override its method that should take the Integer value
 * that represents the car weight, and return the certain AutoType depending on this weight.
 * If weight is less than 1500, then return AutoType.CAR, otherwise AutoType.TRUCK.
 */

public class FindAutoType implements Function<Integer, AutoType> {
    private static final Integer THRESHOLD_WEIGHT = 1500;

    @Override
    public AutoType apply(Integer weight) {
        return weight > THRESHOLD_WEIGHT ? AutoType.TRUCK : AutoType.CAR;
    }
}