package webDriverHomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class rozetkaTestCases {
    WebDriver driver;
    WebDriverWait wait;
    By personalOffice = By.cssSelector("[class='header-user-link sprite-side whitelink xhr']");
    By registerLink = By.cssSelector("[class='novisited auth-f-signup-link']");
    By signUpButton = By.cssSelector("[class='btn-link btn-link-green btn-link-sign']");
    By nameField = By.cssSelector("[name='title']");
    By mailField = By.cssSelector("[name='login']");

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @Test
    public void negativeTestForRegistration() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement personalOfficeLink = driver.findElement(personalOffice);
        wait.until(ExpectedConditions.elementToBeClickable(personalOfficeLink));
        personalOfficeLink.click();

        WebElement registerLinkFromPopUp = driver.findElement(registerLink);
        wait.until(ExpectedConditions.elementToBeClickable(registerLink));
        registerLinkFromPopUp.click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebElement signUpButtonRegister = driver.findElement(signUpButton);
        signUpButtonRegister.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(1000);

        String actualResultBorderFieldsColor = driver.findElement(nameField).getCssValue("border-color");
        String expectedResultBorderColor = "rgb(255, 120, 120)";

        Assert.assertEquals(actualResultBorderFieldsColor,expectedResultBorderColor);
    }

    @Test
    public void negativeTestForRegistrationOneFieldIsNotEmpty() throws InterruptedException {
        driver.get("https://my.rozetka.com.ua/signup/");
        WebElement nameField1 = driver.findElement(nameField);
        WebElement mailField1 = driver.findElement(mailField);
        WebElement signUpButtonRegister = driver.findElement(signUpButton);

        nameField1.sendKeys("Lubko");
        signUpButtonRegister.click();
        Thread.sleep(5000);

        String actualColorForEmptyField = mailField1.getCssValue("border-color");
        String actualColorForNotEmptyField = nameField1.getCssValue("border-color");
        String expectedResultForEmptyField = "rgb(255, 120, 120)";
        String expectedResultForNotEmptyField = "rgb(210, 210, 210)";

        Assert.assertEquals(actualColorForNotEmptyField,expectedResultForNotEmptyField);
        Assert.assertEquals(actualColorForEmptyField,expectedResultForEmptyField);
    }

    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
}

