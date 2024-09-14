package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkShopTestRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.name("FirstName")).sendKeys("santosh");
		driver.findElement(By.name("LastName")).sendKeys("kumar");
		driver.close();

	}

}
