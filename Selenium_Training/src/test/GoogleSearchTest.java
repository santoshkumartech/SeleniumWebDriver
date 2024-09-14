package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("yash");
	Thread.sleep(1000);
	driver.findElement(By.className("gNO89b")).click();
	
	driver.close();

	}

}
