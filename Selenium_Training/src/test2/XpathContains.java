package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(@class,'cart')][1]")).click();

	}

}