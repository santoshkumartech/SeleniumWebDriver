package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Guru_Handle_The_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement customer_id = driver.findElement(By.xpath("//input[@name='cusid']"));
		Actions action = new Actions(driver);
		String id = "123456";
		action.sendKeys(customer_id,id ).build().perform();
		WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
		action.moveToElement(submit).click().build().perform();
		Thread.sleep(1000);
		Alert ale = driver.switchTo().alert();
		ale.accept();
		Thread.sleep(1000);
		Alert ale2 = driver.switchTo().alert();
		ale2.accept();
		Thread.sleep(3000);
		driver.close();
		
	}
}
