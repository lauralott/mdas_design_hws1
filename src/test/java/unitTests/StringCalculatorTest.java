package unitTests;

import model.StringCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StringCalculatorTest {

    @Test
    public void add_emptyString_sum(){
        StringCalculator sut = new StringCalculator();
        int actual = sut.Add("");
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void add_oneNumberString_sum(){
        StringCalculator sut = new StringCalculator();
        int actual = sut.Add("1");
        int expected = 1;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void add_twoNumbersString_sum(){
        StringCalculator sut = new StringCalculator();
        int actual = sut.Add("1,2");
        int expected = 3;
        Assert.assertEquals(actual,expected);
    }

}
