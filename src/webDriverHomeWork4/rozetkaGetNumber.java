package webDriverHomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class rozetkaGetNumber {
    public static void main(String[] args){
        System.setProperty("webdriver.chrom.driver", "/Users/lubko/Desktop/homeWork2/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        WebElement number = driver.findElement(By.cssSelector("[class=link-dashed]"));
        String phoneNumber = number.getText().replaceAll("[-() ]","");
        System.out.println(phoneNumber);
        driver.quit();
    }

}
