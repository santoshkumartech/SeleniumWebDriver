package test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DwsSelectBooksAndDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sort  = new Select(sort_by);
		sort.selectByValue("http://demowebshop.tricentis.com/books?orderby=11");
		Thread.sleep(1000);
		
		WebElement per_page = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select display  = new Select(per_page);
		Thread.sleep(1000);
		display.selectByIndex(2);
		
	}

}
