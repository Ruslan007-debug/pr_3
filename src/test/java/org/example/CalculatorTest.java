
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() throws InvalidInputException {
        assertEquals(15.0, calculator.add(10, 5));
    }

    @Test
    void testSubtraction() throws InvalidInputException {
        assertEquals(5.0, calculator.subtract(10, 5));
    }

    @Test
    void testMultiplication() throws InvalidInputException {
        assertEquals(50.0, calculator.multiply(10, 5));
    }

    @Test
    void testDivision() throws InvalidInputException {
        assertEquals(2.0, calculator.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0));
    }

    @Test
    void testInvalidInput() {
        assertThrows(InvalidInputException.class,
                () -> calculator.add(Double.NaN, 5));

        assertThrows(InvalidInputException.class,
                () -> calculator.subtract(5, Double.NaN));

        assertThrows(InvalidInputException.class,
                () -> calculator.multiply(
                        Double.POSITIVE_INFINITY, 2));

        assertThrows(InvalidInputException.class,
                () -> calculator.divide(5, Double.NaN));
    }

    @Test
    void testTextInsteadOfNumber() {
        assertThrows(NumberFormatException.class,
                () -> Main.parseNumber("hello"));
    }

    @Test
    void testNegativeNumbers() throws InvalidInputException {
        assertEquals(-2.0, calculator.add(-5, 3));
    }
}
