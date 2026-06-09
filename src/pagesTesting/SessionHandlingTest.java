package pagesTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHandlingTest {

    public static void main(String[] args) {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();

        // LOGIN PAGE
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

        // CHECK TOKEN
        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        String token =
                (String) js.executeScript(
                        "return localStorage.getItem('token');"
                );

        System.out.println(
                "JWT Token : "
                + token
        );

        // LOGOUT
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/div[1]")
        ).click();
        
        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div[5]/div[2]/div[5]")
        ).click();
        
        try {

            Thread.sleep(3000);

        } catch (Exception e) {

        }

        // VERIFY TOKEN REMOVED
        String removedToken =
                (String) js.executeScript(
                        "return localStorage.getItem('token');"
                );

        System.out.println(
                "After Logout Token : "
                + removedToken
        );

        // TRY PROTECTED ROUTE
        driver.get(
                "http://localhost:3000/cart"
        );

        String currentUrl =
                driver.getCurrentUrl();

        System.out.println(
                "Redirect URL : "
                + currentUrl
        );

        driver.quit();
    }
}
