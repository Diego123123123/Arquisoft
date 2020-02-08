/*
 * Universidad Catolica Boliviana "San Pablo"
 */
package FizzBuzzParameterizedTest;

import com.mycompany.fizzbuzz.FizzBuzz;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

/**
 * Parameterized test for testing {@link FizzBuz}.
 *
 * @author Diego Orlando Mejia Salazar
 */
@RunWith(Parameterized.class)
public class FizzBuzzPTest {

	/**
	 * Method that has data for testing.
	 * @return a collection of data for testing purposes.
	 */
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1, "1"}, {2, "2"}, {3, "Fizz"},
			{4, "4"}, {5, "Buzz"}, {6, "Fizz"},
			{7, "7"}, {8, "8"}, {9, "Fizz"},
			{10, "Buzz" }, {11, "11"}, {12, "Fizz"},
			{13, "13"}, {14, "14"}, {15, "FizzBuzz"},
			{16, "16" }, {17, "17" }, {18, "Fizz"},
			{19, "19"}, {20, "Buzz"}, {21, "Fizz"},
			{22, "22"}, {23, "23"}, {24, "Fizz"},
			{25, "Buzz"}, {26, "26"}, {27, "Fizz"},
			{28, "28"}, {29, "29"}, {30, "FizzBuzz"}}  );
	}

	/**
	 * Input number that is going to be evalated.
	 */
	private final Integer input;

	/**
	 * Expected result.
	 */
	private final String expected;

	/**
	 * Constructor method.
	 * @param input    number to evaluate
	 * @param expected result.
	 */
	public FizzBuzzPTest(final Integer input, final String expected) {
		this.input = input;
		this.expected = expected;
	}

	/**
	 * Method that checks if given an input it is gotten 
	 * the expected result.
	 */
	@Test
	public void test() {
		assertEquals(expected, FizzBuzz.calculate(input));
	}
}
