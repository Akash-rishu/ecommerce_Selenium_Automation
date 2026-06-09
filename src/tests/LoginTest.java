package tests;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	public static void main(String[] args) {
		LoginTest test = new LoginTest();
		test.setup();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("ak418206@gmail.com", "@Akash1234");
		
		try {

            Thread.sleep(5000);

        } catch (Exception e) {

            e.printStackTrace();
        }
		
		System.out.println("POM LOGIN TEST PASSED");
		
		try {

            Thread.sleep(5000);

        } catch (Exception e) {

            e.printStackTrace();
        }
		
		test.closeBrowser();
	}

}
