package pagesTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvalidLoginTest {

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
                                        "//*[@id=\"root\"]/div/div[2]/div/form/div[1]/input"
                                )
                        )
                );

        email.sendKeys(
                "wrong@gmail.com"
        );

        // PASSWORD
        WebElement password =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(

                                By.xpath(
                                        "//*[@id=\"root\"]/div/div[2]/div/form/div[2]/input"
                                )
                        )
                );

        password.sendKeys(
                "wrong123"
        );

        // LOGIN BUTTON
        WebElement loginBtn =
                wait.until(
                        ExpectedConditions.elementToBeClickable(

                                By.xpath(
                                        "//*[@id=\"root\"]/div/div[2]/div/form/button"
                                )
                        )
                );

        // CLICK LOGIN
        loginBtn.click();

        // WAIT 5 SEC
        try {

            Thread.sleep(5000);

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println(
                "Invalid Login Test Executed"
        );

        // CLOSE
        driver.quit();
    }
}