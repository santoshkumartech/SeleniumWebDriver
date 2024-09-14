package mouseoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntrTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement kids = driver.findElement(By.xpath("//a[@href='/shop/kids']"));
		Actions action = new Actions(driver);
		action.moveToElement(kids).build().perform();
		Thread.sleep(1000);
		WebElement MPG = driver.findElement(By.xpath("//a[@data-reactid='467']"));
		action.moveToElement(MPG).click().build().perform();
		Thread.sleep(4000);
		driver.close();
		
	}
}
