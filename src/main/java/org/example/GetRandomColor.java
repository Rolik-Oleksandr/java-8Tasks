package org.example;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Implement the suitable functional interface and override its
 * method that should return the random color from the given COLORS array.
 */


public class GetRandomColor implements Supplier<String>{
  private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
          "black", "white"};
  private static final Random random = new Random();

  @Override
  public String get() {
    return COLORS[random.nextInt(COLORS.length)];
  }
}
