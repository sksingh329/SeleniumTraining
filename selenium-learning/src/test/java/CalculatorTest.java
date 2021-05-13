import org.testng.Assert;
import org.testng.annotations.Test;
import unittests.Calculator;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int val1  = 10, val2 = 20;
        int expectedValue = 0;
        int actualValue = calculator.add(10,20);
        Assert.assertEquals(actualValue,expectedValue);
    }
}
