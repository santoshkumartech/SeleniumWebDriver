package test3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DwsSelectingByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sort  = new Select(sort_by);
		List<WebElement> id = sort.getOptions();
		for (int i =0;i<id.size();i++)
		{
			WebElement sort_by2 = driver.findElement(By.id("products-orderby"));
			Select sal = new Select( sort_by2);
			sal.selectByIndex(i);
		}
		
		
	}

}
