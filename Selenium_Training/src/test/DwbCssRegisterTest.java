package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwbCssRegisterTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href=\"/register\"]")).click();
		driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("santu");
		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("msk");
	}

}
