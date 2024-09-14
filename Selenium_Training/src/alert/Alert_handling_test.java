package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_handling_test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		for (int i = 2; i < 7; i++)
		{
			WebElement RC = driver.findElement(By.xpath("//span[contains(@class,'context')]"));
			Actions action = new Actions(driver);
			action.contextClick(RC).build().perform();
			Thread.sleep(1000);
			WebElement edit = driver.findElement(By.xpath("(//span[contains(text(),edit)])["+i+"]"));
			action.moveToElement(edit).click().build().perform();
			Thread.sleep(1000);
			Alert ale = driver.switchTo().alert();
			ale.accept();
		}
	}
}
