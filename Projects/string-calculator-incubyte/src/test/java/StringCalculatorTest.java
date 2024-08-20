import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void shouldReturnZeroForEmptyString(){
        int result = calculator.add("");
        assertEquals(0,result);
    }

    @Test
    public void shouldReturnTheNumberForSingleInput(){
        int result = calculator.add("1");
        assertEquals(1,result);
    }

    @Test
    public void shouldReturnSumWhenMultipleCommaSeperatedNumbersAreInput(){
        int result = calculator.add("1,2,3");
        assertEquals(6,result);
    }
}