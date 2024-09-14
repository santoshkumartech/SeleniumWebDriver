package synchronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri_Sachin_Scenario {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parent_window = driver.getWindowHandle();
		System.out.println(parent_window);
		Set<String> child_window = driver.getWindowHandles();
		for (String window : child_window) {
			driver.switchTo().window(window);
			if(driver.getTitle().equalsIgnoreCase("Cognizant"))
			{
				driver.close();
			}
		}
	//	driver.findElement(By.xpath("//a[@title='Advanced Search']")).click();
		Actions action = new Actions(driver);
		WebElement job = driver.findElement(By.xpath("(//div[@class='mTxt'])[1]"));
		action.moveToElement(job).build().perform();
		WebElement Advance_search = driver.findElement(By.xpath("//a[@title='Advanced Search']"));
		action.moveToElement(Advance_search).click().build().perform();
		
	}
}
