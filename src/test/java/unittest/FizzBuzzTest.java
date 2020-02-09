package unittest;

/*
 * Universidad Catolica Boliviana (San Pablo).
 */

import com.mycompany.fizzbuzz.FizzBuzz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * {@link FizzBuzzTest} for testing if a number is a Fizz or a Buzz.
 *
 * @author Diego Orlando Mejia Salazar
 */
@RunWith(JUnit4.class)
public class FizzBuzzTest {

    /**
     * Number one.
     */
    private static final Integer ONE = 1;

    /**
     * Number two.
     */
    private static final Integer TWO = 2;

    /**
     * Number three.
     */
    private static final Integer THREE = 3;

    /**
     * Number five.
     */
    private static final Integer FIVE = 5;

    /**
     * * Number fifteenth.
     */
    private static final Integer FIFTEENTH = 15;

    /**
     * Test method that checks if a number that does not full fill the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumberOne() {
        String expected = FizzBuzz.calculate(ONE);
        assertEquals("1", expected);
    }

    /**
     * Test method that checks if a number(2)
     * that does not full fill the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumberTwo() {
        String expected = FizzBuzz.calculate(TWO);
        assertEquals("2", expected);
    }

    /**
     * Test method that checks if a number(3) full fill the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumberThree() {
        String expected = FizzBuzz.calculate(THREE);
        assertEquals("Fizz", expected);
    }

    /**
     * Test method that checks if a number(5) full fill the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumberFive() {
        String expected = FizzBuzz.calculate(FIVE);
        assertEquals("Buzz", expected);
    }

    /**
     * Test method that checks if a number(15) full fill the rules in
     * the FizzBuzzDictionary should return the same number.
     */
    @Test
    public void testWithNumberFifteenth() {
        String expected = FizzBuzz.calculate(FIFTEENTH);
        assertEquals("FizzBuzz", expected);
    }
}
