package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSelectSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("puma fer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='8']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
