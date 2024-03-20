package com.anrry;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sum;
        double multiply;
        double divide;
        double subtract;

        // SUM
        // test scenario 1:
        sum = calculator.sum(3, 7);
        System.out.println(sum);

        // test scenario 2:
        sum = calculator.sum(3, 0);
        System.out.println(sum);

        // test scenario 3:
        sum = calculator.sum(0, 0);
        System.out.println(sum);

        // test scenario 4:
        sum = calculator.sum(3, -1);
        System.out.println(sum);

        // SUBTRACT
        // test scenario 1:
        subtract = calculator.subtract(3, 7);
        System.out.println(subtract);

        // test scenario 2:
        subtract = calculator.subtract(3, 0);
        System.out.println(subtract);

        // test scenario 3:
        subtract = calculator.subtract(0, 0);
        System.out.println(subtract);

        // test scenario 4:
        subtract = calculator.subtract(3, -1);
        System.out.println(subtract);

        // MULTIPLY
        // test scenario 1:
        multiply = calculator.multiply(3, 7);
        System.out.println(multiply);

        // test scenario 2:
        multiply = calculator.multiply(3, 0);
        System.out.println(multiply);

        // test scenario 3:
        multiply = calculator.multiply(0, 0);
        System.out.println(multiply);

        // test scenario 4:
        multiply = calculator.multiply(3, -1);
        System.out.println(multiply);

        // DIVIDE
        // test scenario 1:
        divide = calculator.divide(3, 7);
        System.out.println(divide);

        // test scenario 2:
        divide = calculator.divide(3, 0);
        System.out.println(divide);

        // test scenario 3:
        divide = calculator.divide(0, 0);
        System.out.println(divide);

        // test scenario 4:
        divide = calculator.divide(3, -1);
        System.out.println(divide);
    }
}
