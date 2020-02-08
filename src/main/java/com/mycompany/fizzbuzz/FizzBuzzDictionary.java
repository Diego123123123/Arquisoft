/*
 * Universidad Catolica Boliviana (San Pablo).
 */

package com.mycompany.fizzbuzz;

import java.util.HashMap;

/**
 * FizzBuzz Dictionary that contains the rules for evaluating a FizzBuzz game.
 * @author Diego Orlando Mejia Salazar
 */
public final class FizzBuzzDictionary {

    /**
     * {@link HashMap} that contains rules for evaluating numbers.
     */
    private static final HashMap<Integer, String> FIZZBUZZDICTIONARY = new HashMap<Integer, String>() {
        {
            put(3, "Fizz");
            put(5, "Buzz");
        }
    };
    
    /**
     * Method that returns a {@link HashMap}
     * @return a {@link HashMap}.
     */
    public static HashMap<Integer, String> getDictionary() {
        return FIZZBUZZDICTIONARY;
    }

}
