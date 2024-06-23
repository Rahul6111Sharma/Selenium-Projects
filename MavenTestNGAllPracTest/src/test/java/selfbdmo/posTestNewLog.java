package selfbdmo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class posTestNewLog {
	String appurl = "https://www.facebook.com/";
	String validEmail = "rahulsharma20306@gmail.com";
	String validPass = "lsspl#123";
	String invalidEmail = "xyz";
	String invalidPass = "123";
	
	
	private WebDriver driver;
	
	@BeforeMethod
	private void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/This PC/Downloads/chromedriver-win64/chromedriver.exe");
	}
		
	@Test
	public void onlyopenapp() {
		driver = new ChromeDriver();
		driver.get(appurl);
	}

	@Test
	public void loginwithinvalidDetails() {
		driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(invalidEmail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(invalidPass);
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void loginwithvalidDetails() {
		driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(validEmail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(validPass);
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void Messengeropen() {
		driver = new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(validEmail);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(validPass);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//div[[@aria-label='Messenger']")).click();
		driver.findElement(By.xpath("//a[.='See all in Messenger']")).click();
}}

