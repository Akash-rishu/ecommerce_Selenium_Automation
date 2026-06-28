package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderSummaryTest {

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

        String product =
                driver.findElement(By.xpath("product-name"))
                        .getText();

        String price =
                driver.findElement(By.className("product-price"))
                        .getText();

        System.out.println("Product : " + product);
        System.out.println("Price : " + price);

        if (!product.isEmpty() && !price.isEmpty()) {
            System.out.println("T101 PASSED");
        } else {
            System.out.println("T101 FAILED");
        }

        //driver.quit();
    }
}