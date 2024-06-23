package selfbdmo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class ExpectionHandalEx {
	private WebDriver driver;

	@BeforeMethod
	private void setup()
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/This PC/Downloads/chromedriver-win64/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/Users/This PC/Downloads/chromedriver-win64t/chromedriver.exe");
	}
	
	@Test
	public void handal()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.findElement(By.xpath("//button[@id='add_btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='row2']/input")).sendKeys("Hello");
		driver.findElement(By.xpath("//div[@id='row2']/button[@id='save_btn' and @name='Save']")).click();
	}
	
	@Test
	public void clearTheText()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
		driver.findElement(By.xpath("//button[@id='add_btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='row2']/input")).sendKeys("Remove Me");
		driver.findElement(By.xpath("//div[@id='row2']/button[@id='remove_btn' and @name='Remove']")).click();
	}
}