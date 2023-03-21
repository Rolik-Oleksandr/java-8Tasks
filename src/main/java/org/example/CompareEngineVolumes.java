package org.example;

import java.util.function.BinaryOperator;

/**
 * Implement the suitable functional interface and override its
 * method that should take two Integer values that represent powers of the two engines,
 * and return the difference between them as Integer as well.
 * IMPORTANT! The functional interface, that should be used here, must be parametrized only by one generic.
 */

public class CompareEngineVolumes implements BinaryOperator<Integer> {

  @Override
  public Integer apply(Integer firstPower, Integer secondPower) {
    return firstPower - secondPower;
  }
}