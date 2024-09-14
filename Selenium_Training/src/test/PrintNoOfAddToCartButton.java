package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNoOfAddToCartButton {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Books")).click();
		List<WebElement>Element=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		System.out.println("number of add to cart button present are "+ Element.size());
		driver.close();
	}

}
