/*
 * Universidad Catolica Boliviana (San Pablo)
 */
package com.mycompany.fizzbuzz;

/**
 * {@link FizzBuzz} calculator
 *
 * @author Diego Orlando Mejia Salzar
 */
public class FizzBuzz {

   /**
    * Method checks number value.
    * @param number to evaluate.
    * @return a string depenting on the {@link FizzBuzzDictionary}
    */
    public static String calculate(final Integer number) {
        String result = "";
        result = FizzBuzzDictionary.getDictionary().
                entrySet().stream().
                filter((entry) -> (number % entry.getKey() == 0))
                .map((entry) -> entry.getValue()).reduce(result, String::concat);
        if (result.equals("")) {
            return number.toString();
        }
        return result;
    }
}
