package pagesTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMessageTest {

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

        // ERROR MESSAGE
        WebElement error =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(

                                By.xpath(
                                        "//*[contains(text(),'Invalid')]"
                                )
                        )
                );

        // PRINT ERROR
        System.out.println(
                "Error Message: "
                + error.getText()
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