package ru.job4j.calculator;

/**
 * Calculator
 *
 * @author Aleksey Vdovenko (a.a.vd0venk0@gmail.com)
 */
public class Calculator {
    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    public void div(double first, double second) {
        this.result = first / second;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}