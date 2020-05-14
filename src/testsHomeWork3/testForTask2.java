package testsHomeWork3;

import main.java.lesson1.Task2;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testForTask2 {

    @Parameters("parameterForTask2")
    @Test
    public static void symbolsCountTest(@Optional("someDefaultText") String parameterForTask2){
        int expectedResult = parameterForTask2.length() * 50 +50;
        int actualResult = nameLength(Task2.name10Times(parameterForTask2));
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Parameters("parameterForTask2")
    @Test
    public static void lineTest(@Optional("defaultString") String parameterForTask2){
        int expectedResult = 5;
        int actualresult = countLines(Task2.name10Times(parameterForTask2));
        Assert.assertEquals(actualresult,expectedResult);
    }

    private static int nameLength(String someString){
        int length50Times = someString.length();
        return length50Times;
    }

    private static int countLines(String s) {
        return (s + " ").split("\r?\n").length-1;
    }

}
