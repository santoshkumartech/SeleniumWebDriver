package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintResultAfterSearching {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("computer");
		String text =ele.getText();
		String value= ele.getAttribute("value");
		System.out.println(text);
		System.out.println(value);
		ele.clear();
		ele.sendKeys("mobile");
		WebElement search_button = driver.findElement(By.xpath("//input[@type='submit']"));
		if(search_button.isEnabled())
		{
			search_button.click();
		}
		String result = driver.findElement(By.xpath("//strong[@class='result']")).getText();
		System.out.println(result);
		driver.close();
	}

}
