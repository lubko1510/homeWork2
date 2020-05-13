package testsHomeWork3;

import main.java.lesson1.Task5;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testForTask5 {

    @Test(dataProvider = "strings")
    public static void lesson1Task5(String reversedString, String expectedResultString) {
        String actualString = Task5.reverse(reversedString);
        Assert.assertEquals(actualString, expectedResultString);
    }

    @DataProvider(name = "strings")
    public Object[][] setStrings() {
        return new Object[][]{
                {"Hello world!!!", "!!!dlrow olleH"},
                {"Lubko", "okbuL"},
                {"I like this shit", "tihs siht ekil I"}
        };
    }
}

