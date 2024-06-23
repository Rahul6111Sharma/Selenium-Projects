package selfbdmo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserAndCompareURL {

	@Test
	public void verifyPageTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String currentURL = driver.getTitle();
		String actualURL = "Google";
		Assert.assertEquals(actualURL, currentURL);
		//driver.quit();
	}
}
