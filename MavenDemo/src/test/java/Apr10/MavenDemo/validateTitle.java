package Apr10.MavenDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class validateTitle {
	
	WebDriver driver;
	String url = "http://demo.guru99.com/test/guru99home/";
	String expectedTitle = "Demo Guru99 Page";
	
	@Test
	public void validatetitle() {
		String actualTitle = driver.getTitle();
		
		System.out.println("Executing test case");
		boolean result = expectedTitle.equals(actualTitle);
		Assert.assertTrue(result);
	}

	@BeforeMethod
	public void initTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\DriverServer\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
	}

	@AfterMethod
	public void cleanUp() {
		driver.close();
	}

}
