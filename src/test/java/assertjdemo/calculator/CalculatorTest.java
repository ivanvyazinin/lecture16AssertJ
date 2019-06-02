package assertjdemo.calculator;

import demo.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(calculator.add(70, 30)).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Test valid fibonacci")
    @CsvFileSource(resources = "/fibonacci.csv")
    void testValidFibonacci(int inputNumber, int expected) {
        assertThat(calculator.fibonacci(inputNumber)).isEqualTo(expected);
    }
}
