package testsHomeWork3;

import main.java.lesson1.Task2;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testForTask2 {

    @Parameters("parameterForTask2")
    @Test
    public static void lesson1Task2(String parameterForTask2){
        String expectedResult = parameterForTask2;
        String actualResult = Task2.name10Times();
        Assert.assertEquals(actualResult,expectedResult);

    }
}
