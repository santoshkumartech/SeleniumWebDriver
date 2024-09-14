package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		driver.manage().window().maximize();
		WebElement car_type = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Thread.sleep(1000);
		Select cars = new Select(car_type);
		cars.selectByVisibleText("Audi");
		Thread.sleep(1000);
		cars.selectByIndex(5);
		Thread.sleep(1000);
		cars.selectByValue("merc");
		driver.close();
		
	}

}
