package pagesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        // OPEN LOGIN PAGE
        driver.get(
                "http://localhost:3000/"
        );

        // LOGIN
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input")
        ).sendKeys(
                "ak418206@gmail.com"
        );

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input")
        ).sendKeys(
                "@Akash1234"
        );

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/button")
        ).click();

        // WAIT
        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        // CLICK USER MENU
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/div[1]")
        ).click();
        
        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        // CLICK LOGOUT
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/div[2]/div[5]")
        ).click();
        
        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        // VERIFY LOGIN PAGE
        String currentUrl =
                driver.getCurrentUrl();

        System.out.println(
                "Current URL : "
                + currentUrl
        );

        driver.quit();
    }
}
