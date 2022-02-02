package TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginGoogle {

	WebDriver driver = null;

	// @BeforeTest
	public void BeforeSetUp() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	@Test
	public void testGooglePage() throws InterruptedException {
		
		driver.get("https://www.google.com");
	}

	@AfterTest
	public void AfterMethod() {
		driver.close();
		System.out.println("Test Executed successfully");
	}
}


