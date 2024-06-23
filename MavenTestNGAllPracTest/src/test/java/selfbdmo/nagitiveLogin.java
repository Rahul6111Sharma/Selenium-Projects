package selfbdmo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import dev.failsafe.internal.util.Assert;

public class nagitiveLogin {

	String appurl = "https://www.facebook.com/";
	String validEmail = "rahulsharma20306@gmail.com";
	String validPass = "lsspl#123";
	String invalidEmail = "xyz";
	String invalidPass = "123";

	@Test
	public void loginwithinvalidDetails() {
		System.setProperty("webdriver.chrome.driver", "/Users/This PC/Downloads/chromedriver-win64/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(invalidEmail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(invalidPass);
		driver.findElement(By.name("login")).click();
		String actualres = driver.getCurrentUrl();
		String expectedres = "https://www.facebook.com/?sk=welcome";
		Assert.isTrue(actualres.equals(expectedres),
				"Wrong credentials try with correct credentials\n Correct URL after successfull login will be"
						+ expectedres);

	}
	
	@Test
	public void LoginInvalidOther() {
		System.setProperty("webdriver.chrome.driver", "/Users/This PC/Downloads/chromedriver-win64/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(invalidEmail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(invalidPass);
		driver.findElement(By.name("login")).click();
	
		WebElement wrongcred = driver.findElement(By.xpath("//div[contains(text(),'Wrong credentials')]"));
		System.out.println("Wrong found");
		String expectedMessaage = "Wrong credentials";
		String actualMessage = wrongcred.getText();
		System.out.println("Text also found");
		Assert.isTrue(actualMessage.contains(expectedMessaage), "Fail Message Wrong EMail and Pass");
}
}
