package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base.BaseTest;
import utilities.ReadXLSdata;
public class MyFirstTestFW1 extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="bvtdata")
	public static void LoginTest(String username,String password) throws InterruptedException {
		
		System.out.println("click successfull");
		System.out.println("XPath for signin_link: " + loc.getProperty("signin_link"));
	 driver.findElement(By.xpath(loc.getProperty("signin_link"))).click();//locators--properties.
     driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
     driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath(loc.getProperty("pwd_filed"))).sendKeys(password);
     Thread.sleep(4000);
     driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
     Thread.sleep(4000);
		}
     }
				


