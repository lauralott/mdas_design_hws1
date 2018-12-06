package unitTests;

import model.StringCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class StringCalculatorTest {

    private StringCalculator sut;

    @BeforeMethod
    public void SetUp(){
        sut = new StringCalculator();
    }

    @DataProvider
    public static Object[][] numbersStrings(){
        return new Object[][]{
                {"", 0},
                {"1", 1},
                {"1,2", 3},
                {"1,3,6", 10},
                {"2,2,5,1", 10},
                {"1\n2,3", 6},
                {"//;\n1;2", 3},
                {"1,2,-5,-1", 0}
        };
    }

    @Test(dataProvider = "numbersStrings")
    public void add_numbersString_sum(String numbersString, int expected){
        int actual = 0;
        try{
            actual = sut.Add(numbersString);
        } catch(Exception e){
            System.err.print(e.toString());
        }
        Assert.assertEquals(actual,expected);
    }

}
