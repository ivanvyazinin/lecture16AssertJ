package junitdemo.calculator;

import demo.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculator tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Valid add test")
    void testValidAdd() {
        int expected = 100;
        int actual = calculator.add(70, 30);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Test valid fibonacci")
    @CsvFileSource(resources = "/fibonacci.csv")
    void testValidFibonacci(int inputNumber, int expected) {
        assertEquals(expected, calculator.fibonacci(inputNumber));
    }
}
