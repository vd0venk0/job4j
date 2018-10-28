package ru.job4j.calculator;

/**
 * Calculator
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Calculator {
    private double result;

    /**
     * Method add - adds the first and second numbers.
     * @param first - first number.
     * @param second - second number.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract - subtracts the second number from the first number.
     * @param first - first number.
     * @param second - second number.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div - divides the first number into the second number.
     * @param first - first number.
     * @param second - second number.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple - multiplies the first number to the second number.
     * @param first - first number.
     * @param second - second number.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult - returns the result of the calculation.
     * @return
     */

    public double getResult() {
        return this.result;
    }
}