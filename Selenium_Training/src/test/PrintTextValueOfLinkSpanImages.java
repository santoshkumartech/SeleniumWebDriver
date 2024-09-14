package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextValueOfLinkSpanImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		List<WebElement>Elements=driver.findElements(By.xpath("//a"));
		for (WebElement e: Elements) 
		{
			System.out.println(e.getText());
		}
		List<WebElement>Elements1=driver.findElements(By.xpath("//span"));
		for (WebElement e: Elements1) 
		{
			System.out.println(e.getAttribute("value"));
		}
		List<WebElement>Elements2=driver.findElements(By.xpath("//img"));
		for (WebElement e: Elements2) 
		{
			System.out.println(e.getAttribute("title"));
		}
		driver.close();
	}

}
