package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutFormValidationTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver =
                new ChromeDriver();

        driver.manage()
                .window()
                .maximize();
        
        driver.get("http://localhost:3000");

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
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get(
                "http://localhost:3000/checkout"
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/div[1]/button")
        ).click();

        // Name
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/input[1]")
        ).sendKeys(
                "Akash Kumar"
        );

        // Address
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/input[5]")
        ).sendKeys(
                "Chandigarh"
        );
        
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/input[4]")
        ).sendKeys(
                "Chandigarh"
        );
        
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/input[3]")
        ).sendKeys(
                "160101"
        );
        
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/textarea[1]")
        ).sendKeys(
                "57"
        );
        
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/textarea[2]")
        ).sendKeys(
                "IT Park"
        );
        
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/textarea[3]")
        ).sendKeys(
                "DLF Mall"
        );

        // Phone
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/input[2]")
        ).sendKeys(
                "9876543210"
        );
        
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/button")
        ).click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Submit Order
        driver.findElement(
                By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/button")
        ).click();

        Thread.sleep(3000);

        System.out.println(
                "T097 Form Validation Executed"
        );

        driver.quit();
    }
}