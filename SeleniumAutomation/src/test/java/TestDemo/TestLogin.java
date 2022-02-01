package TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void BeforeSetUp()
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}

	@Test
	public void testLogin() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("DemoUser");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
	}
	
	@AfterTest
	public void AfterMethod()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Executed successfully");
	}

}
 