package org.example;

public class Calculator {

    public double add(double a, double b)
            throws InvalidInputException {

        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            throw new InvalidInputException("Некоректні числа.");
        }

        return a + b;
    }

    public double subtract(double a, double b)
            throws InvalidInputException {

        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            throw new InvalidInputException("Некоректні числа.");
        }

        return a - b;
    }

    public double multiply(double a, double b)
            throws InvalidInputException {

        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            throw new InvalidInputException("Некоректні числа.");
        }

        return a * b;
    }

    public double divide(double a, double b)
            throws InvalidInputException {

        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            throw new InvalidInputException("Некоректні числа.");
        }

        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль!");
        }

        return a / b;
    }
}
