package selfbdmo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeModule {
	private WebDriver driver;

	@BeforeMethod
	private void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/This PC/Downloads/chromedriver-win64/chromedriver.exe");
	}

	@Test
	public void nestediFrame() {
		driver = new ChromeDriver();
		driver.get("");

	}

}
