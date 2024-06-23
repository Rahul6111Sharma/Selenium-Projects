package selfbdmo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshActionApproach {

	//Approach 1
	@Test
	public void RefreshAction() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		driver.quit();
	}
	
	//Approach 2
	@Test
	public void RefreshActionwithCurrentURL() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get(driver.getCurrentUrl());
		driver.quit();
	}
	
	//Approach 3
	@Test
	public void NavigatetoCurrentURL() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.navigate().to(driver.getCurrentUrl());
		driver.quit();
	}
	//Approach 4
	@Test
	public void keypressfFive() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.F5);
		driver.quit();
	}
}
