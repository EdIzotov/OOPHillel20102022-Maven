import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void checkSum() {
        int expected = 67;
        int actual = Calculator.sum(33, 34);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkMinus() {
        int expected = 67;
        int actual = Calculator.minus(99, 32);
        Assert.assertEquals(actual, expected);
    }
}
