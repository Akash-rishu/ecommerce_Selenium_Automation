package pagesTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterTest {

    public static void main(String[] args)
            throws Exception {

        WebDriver driver =
                new ChromeDriver();

        driver.get(
                "http://localhost:3000/register"
        );

        driver.manage()
                .window()
                .maximize();

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(10)
                );

        // =========================
        // NAME
        // =========================
        WebElement name =

                wait.until(

                        ExpectedConditions
                                .visibilityOfElementLocated(

                                        By.name(
                                                "name"
                                        )
                                )
                );

        name.sendKeys(
                "Akash Kumar"
        );

        // =========================
        // EMAIL
        // =========================
        WebElement email =

                driver.findElement(

                        By.name(
                                "email"
                        )
                );

        email.sendKeys(
                "akash123@gmail.com"
        );

        // =========================
        // PASSWORD
        // =========================
        WebElement password =

                driver.findElement(

                        By.name(
                                "password"
                        )
                );

        password.sendKeys(
                "123456"
        );

        // =========================
        // PHONE
        // =========================
        WebElement phone =

                driver.findElement(

                        By.name(
                                "phoneNumber"
                        )
                );

        phone.sendKeys(
                "9876543210"
        );

        // =========================
        // REGISTER BUTTON
        // =========================
        WebElement registerBtn =

                driver.findElement(

                        By.xpath(
                                "//button[contains(text(),'Register')]"
                        )
                );

        registerBtn.click();

        // =========================
        // WAIT AFTER REGISTER
        // =========================
        Thread.sleep(3000);

        // =========================
        // VERIFY
        // =========================
        String currentUrl =
                driver.getCurrentUrl();

        System.out.println(
                "CURRENT URL: "
                + currentUrl
        );

        if (

                currentUrl.contains(
                        "login"
                )

                ||

                currentUrl.contains(
                        "home"
                )

        ) {

            System.out.println(
                    "Register Test Passed"
            );

        } else {

            System.out.println(
                    "Register Test Failed"
            );
        }

        Thread.sleep(3000);

        driver.quit();
    }
}
