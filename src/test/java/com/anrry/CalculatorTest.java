package com.anrry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    @Test
    @DisplayName("1 + 1 = 2")
    void sumTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.sum(1, 1), "1 + 1 should equal 2");
    }

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

    @Test
    @DisplayName("1 - 1 = 0")
    void subtractTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(1, 1), "1 - 1 should equal 0");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
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
}