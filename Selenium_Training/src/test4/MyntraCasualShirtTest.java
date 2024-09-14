package test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraCasualShirtTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions action = new Actions(driver);
		action.moveToElement(men).build().perform();
		WebElement casual_shirt = driver.findElement(By.xpath("//a[(text()='Casual Shirts']"));
		action.moveToElement(casual_shirt).build().perform();
	}
}
