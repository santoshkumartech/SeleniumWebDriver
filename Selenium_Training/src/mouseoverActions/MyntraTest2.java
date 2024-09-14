package mouseoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Actions action = new Actions(driver);
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("shirts").keyUp(Keys.SHIFT).build().perform();
		//action.keyDown(Keys.F5).click().keyUp(Keys.F5).build().perform();
		action.sendKeys(Keys.F5).build().perform();
	//  Thread.sleep(1000);
		//driver.close();
		

	}

}
