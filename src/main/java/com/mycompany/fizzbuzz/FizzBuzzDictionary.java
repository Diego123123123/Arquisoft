/**
 * Universidad Catolica Boliviana "San Pablo".
 */

package com.mycompany.fizzbuzz;

import java.util.HashMap;

/**
 * FizzBuzz Dictionary that contains the rules for evaluating a FizzBuzz game.
 *
 * @author Diego Orlando Mejia Salazar
 */
public final class FizzBuzzDictionary {

    /**
     * Number three.
     */
    private static final Integer THREE = 3;

    /**
     * Number five.
     */
    private static final Integer FIVE = 5;

    /**
     * Constructor method of {@link FizzBuzzDictionary}.
     */
    private FizzBuzzDictionary() {
    }

    /**
     * {@link HashMap} that contains rules for evaluating numbers.
     */
    private static final HashMap<Integer, String> FIZZBUZZDICTIONARY = new HashMap<>() {
        {
            put(THREE, "Fizz");
            put(FIVE, "Buzz");
        }
    };

    /**
     * Method that returns a {@link HashMap}.
     *
     * @return a {@link HashMap}.
     */
    public static HashMap<Integer, String> getDictionary() {
        return FIZZBUZZDICTIONARY;
    }

}
