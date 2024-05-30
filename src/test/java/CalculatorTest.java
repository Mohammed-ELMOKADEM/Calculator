import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init(){
        this.calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    void subtract() {
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    void multiplication() {
        assertEquals(6, calculator.multiplication(2,3));
    }
}