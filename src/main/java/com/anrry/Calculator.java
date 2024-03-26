/*
 * A simple calculator with the four functions:
 * addition, subtraction, multiplication, and division.
 *
 * @author Anrry Petrin De Araujo
 * 
 * @version 1.0
 * 
 * @since 1.0
 */

package com.anrry;

public class Calculator {

    /*
     * Calculates the addition of two numbers.
     * 
     * @param a The first number to be added.
     * 
     * @param b The second number to be added.
     * 
     * @return The sum of a and b.
     */
    public double sum(double a, double b) {
        return a + b;
    }

    /*
     * Calculates the subtraction of two numbers.
     * 
     * @param a The first number to be subtracted.
     * 
     * @param b The second number to be subtracted.
     * 
     * @return The subtract of a and b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /*
     * Calculates the multiplication of two numbers.
     * 
     * @param a The first number to be multiplied.
     * 
     * @param b The second number to be multiplied.
     * 
     * @return The multiply of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /*
     * Calculates the division of two numbers.
     * 
     * @param a The first number to be divided.
     * 
     * @param b The second number to be divided.
     * 
     * @return The divide of a and b.
     * 
     * @throws ArithmeticException if b is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}