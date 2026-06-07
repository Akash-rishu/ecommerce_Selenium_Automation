package pagesTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

public class AssertionLoginTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        // MAXIMIZE
        driver.manage()
                .window()
                .maximize();

        // OPEN URL
        driver.get(
                "http://localhost:3000/"
        );

        // WAIT
        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(5)
                );

        // EMAIL
        WebElement email =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(

                                By.xpath(
                                        "/html/body/div/div/div[2]/div/form/input[1]"
                                )
                        )
                );

        email.sendKeys(
                "admin@gmail.com"
        );

        // PASSWORD
        WebElement password =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(

                                By.xpath(
                                        "/html/body/div/div/div[2]/div/form/input[2]"
                                )
                        )
                );

        password.sendKeys(
                "123456"
        );

        // LOGIN BUTTON
        WebElement loginBtn =
                wait.until(
                        ExpectedConditions.elementToBeClickable(

                                By.xpath(
                                        "/html/body/div/div/div[2]/div/form/button"
                                )
                        )
                );

        loginBtn.click();

        // WAIT FOR URL CHANGE
        wait.until(
                ExpectedConditions.urlContains(
                        "/products"
                )
        );

        // ACTUAL URL
        String actualUrl =
                driver.getCurrentUrl();

        // EXPECTED URL
        String expectedUrl =
                "http://localhost:3000/products";

        // ASSERT
        Assert.assertEquals(
                actualUrl,
                expectedUrl
        );

        System.out.println(
                "Assertion Passed"
        );

        // WAIT 5 SEC
        try {

            Thread.sleep(5000);

        } catch (Exception e) {

            e.printStackTrace();
        }

        // CLOSE
        driver.quit();
    }
}