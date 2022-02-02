package TestDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {

	WebDriver driver = null;

    @BeforeTest
	public void BeforeSetUp() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	@Test
	public void testGooglePage() throws InterruptedException {
		
		driver.get("https://www.google.com");
		String expectedText="Google";
		String actualText=driver.getTitle();
		assertEquals(actualText, expectedText);
	}

	@AfterTest
	public void AfterMethod() {		
		driver.close();
		driver.quit();
	}
}


