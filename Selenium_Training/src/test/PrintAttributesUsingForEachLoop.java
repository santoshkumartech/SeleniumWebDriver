package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAttributesUsingForEachLoop {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			
			List<WebElement>Elements=driver.findElements(By.xpath("//input"));
			for (WebElement e: Elements) 
			{
				System.out.println(e.getAttribute("type"));
			}
			driver.close();
	}

}
