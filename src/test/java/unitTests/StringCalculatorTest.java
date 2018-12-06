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

}
