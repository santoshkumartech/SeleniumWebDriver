package test2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadiiButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		driver.manage().window().maximize();
		List<WebElement> radio_button = driver.findElements(By.xpath("//input[@name='download']"));
		for (WebElement webElement : radio_button) 
		{
			Thread.sleep(1000);
			webElement.click();
		}
		driver.close();
	}

}
