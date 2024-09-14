package test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextOfOs {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.xpath("//table[4][@border='solid']/tbody/tr"));
		for (WebElement webElement : ele) 
		{
			System.out.println(webElement.getText());
		}
		List<WebElement> ele2 = driver.findElements(By.xpath("//table[4][@border='solid']/tbody/td"));
		for (WebElement webElement : ele2) 
		{
			System.out.println(webElement.getText());
		}
		driver.close();
		
	}

}
