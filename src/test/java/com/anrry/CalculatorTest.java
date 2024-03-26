/*
 * Tests the Calculator class, a simple calculator with basic operations:
 * addition, subtraction, multiplication, and division.
 *
 * @author Anrry Petrin De Araujo
 * 
 * @version 1.0
 * 
 * @since 1.0
 */

package com.anrry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    /*
     * Tests the sum(double, double) method of the Calculator class.
     * Verifies if the addition of two numbers is correct.
     */
    @Test
    @DisplayName("1 + 1 = 2")
    void sumTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sum(1, 1), "1 + 1 should equal 2");
    }

    /*
     * Tests the sum(double, double) method of the Calculator class with various
     * cases.
     * Verifies if the addition of two numbers is correct for different inputs.
     */
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "3, 7, 10",
            "3, 0, 3",
            "0, 0, 0",
            "3, -1, 2"
    })
    void sum(double first, double second, double expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    /*
     * Tests the subtract(double, double) method of the Calculator class.
     * Verifies if the subtraction of two numbers is correct.
     */
    @Test
    @DisplayName("1 - 1 = 0")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(1, 1), "1 - 1 should equal 0");
    }

    /*
     * Tests the subtract(double, double) method of the Calculator class with
     * various cases.
     * Verifies if the subtraction of two numbers is correct for different inputs.
     */
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "3, 7, -4",
            "3, 0, 3",
            "0, 0, 0",
            "3, -1, 4"
    })
    void subtract(double first, double second, double expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.subtract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    /*
     * Tests the divide(double, double) method of the Calculator class.
     * Verifies if the division of two numbers is correct.
     */
    @Test
    @DisplayName("1 / 1 = 1")
    void divideTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(1, 1), "1 / 1 should equal 1");
    }

    /*
     * Tests the divide(double, double) method of the Calculator class with various
     * cases.
     * Verifies if the division of two numbers is correct for different inputs.
     */
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "3, 7, 0.42857142857142855",
            "3, 0, 'Cannot divide by zero'",
            "0, 0, 'Cannot divide by zero'",
            "3, -1, -3"
    })
    void divide(double first, double second, String expectedResult) {
        Calculator calculator = new Calculator();

        if (expectedResult.equals("Cannot divide by zero")) {
            assertThrows(ArithmeticException.class, () -> calculator.divide(first, second),
                    () -> "Expected ArithmeticException when dividing by zero");
        } else {
            double expectedValue = Double.parseDouble(expectedResult);
            assertEquals(expectedValue, calculator.divide(first, second),
                    () -> first + " / " + second + " should equal " + expectedResult);
        }
    }

    /*
     * Tests the multiply(double, double) method of the Calculator class.
     * Verifies if the multiplication of two numbers is correct.
     */
    @Test
    @DisplayName("1 * 1 = 1")
    void multiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.multiply(1, 1), "1 * 1 should equal 1");
    }

    /*
     * Tests the multiply(double, double) method of the Calculator class with
     * various cases.
     * Verifies if the multiplication of two numbers is correct for different
     * inputs.
     */
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "3, 7, 21",
            "3, 0, 0",
            "0, 0, 0",
            "3, -1, -3"
    })
    void multiply(double first, double second, double expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }
}