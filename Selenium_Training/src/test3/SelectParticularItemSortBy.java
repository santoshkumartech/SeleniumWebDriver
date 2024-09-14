package test3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectParticularItemSortBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement sort_by = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sort = new Select(sort_by);
		List<WebElement> store_sort = sort.getOptions();
		for (int i = 0; i < store_sort.size(); i++)
		{
			if(store_sort.get(i).getText().equalsIgnoreCase("Name: A to Z"))
			{
				System.out.println(i);
			}
		//	System.out.println(store_sort.get(i).getText()+" "+i); //to print all the elements name and there index 
		}
	/*	for (WebElement webElement : store_sort) 
		{
			if(webElement.getText().equals("Name: A to Z"))
			{
				System.out.println();
			}
		}*/
		driver.quit();
	}

}
