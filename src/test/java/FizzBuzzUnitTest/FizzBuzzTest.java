package FizzBuzzUnitTest;

/*
 * Universidad Catolica Boliviana (San Pablo).
 */

import com.mycompany.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * {@link FizzBuzzTest} for testing {@link FizzBuzz}
 *
 * @author Diego Orland Mejia Salazar
 */
@RunWith(JUnit4.class)
public class FizzBuzzTest {

    /**
     * Numer one.
     */
    public final Integer ONE = 1;

    /**
     * Numer two.
     */
    public final Integer TWO = 2;

    /**
     * Numer three.
     */
    public final Integer THREE = 3;

    /**
     * Number five.
     */
    public final Integer FIVE = 5;
    
    /**
     * Number fifteenth.
     */
    public final Integer FIFTEENTH = 15;

    /**
     * Test method that checks if a number that does not fullfil the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumberOne() {
        String expected = FizzBuzz.calculate(ONE);
        Assertions.assertEquals("1", expected);
    }

    /**
     * Test method that checks if a number(2) that does not fullfil the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumber2() {
        String expected = FizzBuzz.calculate(TWO);
        Assertions.assertEquals("2", expected);
    }

    /**
     * Test method that checks if a number(3) fullfil the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumber3() {
        String expected = FizzBuzz.calculate(THREE);
        Assertions.assertEquals("Fizz", expected);
    }

    /**
     * Test method that checks if a number(5) fullfil the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumber5() {
        String expected = FizzBuzz.calculate(FIVE);
        Assertions.assertEquals("Buzz", expected);
    }
    
    /**
     * Test method that checks if a number(15) fullfil the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumber15() {
        String expected = FizzBuzz.calculate(FIFTEENTH);
        Assertions.assertEquals("FizzBuzz", expected);
    }
}
