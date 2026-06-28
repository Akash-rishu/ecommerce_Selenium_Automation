package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalCalculationTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        
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
        
        Thread.sleep(3000);


        driver.get("http://localhost:3000/checkout");

        Thread.sleep(3000);

        double subtotal = Double.parseDouble(
                driver.findElement(By.id("subtotal"))
                        .getText()
                        .replace("₹", "")
        );

        double shipping = Double.parseDouble(
                driver.findElement(By.id("shipping"))
                        .getText()
                        .replace("₹", "")
        );

        double total = Double.parseDouble(
                driver.findElement(By.id("total"))
                        .getText()
                        .replace("₹", "")
        );

        if ((subtotal + shipping) == total) {
            System.out.println("T102 PASSED");
        } else {
            System.out.println("T102 FAILED");
        }

        driver.quit();
    }
}