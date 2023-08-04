import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void TestGooggle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String abc =driver.getTitle();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Assert.assertEquals(abc,"Google");
		driver.quit();
		
	}
}
