package org.example;

import java.util.function.Predicate;

/**Implement the suitable functional interface and override
 * its method that should take an Engine and determine whether it is of EngineType.ELECTRIC.
 The method should return true or false.
 */

public class CheckElectricEngine implements Predicate<Engine> {
    @Override
    public boolean test(Engine engine) {
        return engine.getEngineType().equals(Engine.EngineType.ELECTRIC);
    }
}