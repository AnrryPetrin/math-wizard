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
    }
}
