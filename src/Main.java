import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    @Test
    public void testResult() {
        assertEquals(90.0, Calculator.calculateDiscount(100, 10), 0.0);
    }

    @Test
    public void testZeroResult() {
        assertEquals(0, Calculator.calculateDiscount(0, 10));
    }

    @Test
    public void testZeroDiscount() {
        assertEquals(100, Calculator.calculateDiscount(100, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testDiscountLessThanZero() {
        Calculator.calculateDiscount(100, -5);
    }

    @Test(expected = ArithmeticException.class)
    public void testDiscountMoreThan100() {
        Calculator.calculateDiscount(100, 110);
    }
}