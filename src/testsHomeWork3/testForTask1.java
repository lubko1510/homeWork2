package testsHomeWork3;

import main.java.lesson1.Task1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testForTask1 {


    @Test(dataProvider = "minNumber")
    public static void lesson1Task1(int a, int b, int c, int expectedResult){
        int actualResult = Task1.min(a,b,c);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @DataProvider(name = "minNumber")
    public Object[][] setNumbers(){
        return new Object [][]{
                {1,2,3,1},
                {3,6,9,3},
                {0,-2,10,-2}
        };
    };

}
