package selfbdmo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropAction {

	@Test
	public void DragDrop()
	{
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement fromElement = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement toElemet = driver.findElement(By.xpath("//div[@class='dragged']"));
		Actions act = new Actions(driver);
		act.clickAndHold(fromElement).moveToElement(toElemet).release(toElemet).build().perform();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
	}
}
