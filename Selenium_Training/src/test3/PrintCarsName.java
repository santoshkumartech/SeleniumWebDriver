package test3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintCarsName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		driver.manage().window().maximize();
		WebElement car_type = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Select car = new Select(car_type);
		List<WebElement> values = car.getOptions();
		for (WebElement webElement : values)
		{
			System.out.println(webElement.getText());
		}
	}

}
