
import spe.calculator.Calci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalciTest {
    //  squareRoot Tests
    @Test
    void testSquareRootValid() {
        assertEquals(5.0, Calci.squareRoot(25), 0.0001);
    }

    @Test
    void testSquareRootNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calci.squareRoot(-10);
        });
    }

    //  factorial Tests
    @Test
    void testFactorialValid() {
        // Expected factorial: 5! = 120
        assertEquals(120, Calci.factorial(5));
        assertEquals(1.0,Calci.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calci.factorial(-1);
        });
    }

    @Test
    void testFactorialTooLarge() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calci.factorial(25);
        });
    }

    //  naturalLog Tests
    @Test
    void testNaturalLogValid() {
        assertEquals(Math.log(10), Calci.naturalLog(10), 0.0001);
    }

    @Test
    void testNaturalLogZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calci.naturalLog(0);
        });
    }

    @Test
    void testNaturalLogNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calci.naturalLog(-5);
        });
    }

    // Power Tests
    @Test
    void testPowerValid() {
        assertEquals(32.0, Calci.power(2, 5), 0.0001);
    }

    @Test
    void testPowerZeroExponent() {
        assertEquals(1.0, Calci.power(10, 0), 0.0001);
    }
}