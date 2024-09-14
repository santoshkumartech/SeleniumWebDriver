package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadiiButtonValidate {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement radii_button = driver.findElement(By.id("pollanswers-1"));
		if(radii_button.isEnabled())
		{
			radii_button.click();
		}
		boolean b = radii_button.isSelected();
		System.out.println("radio button is selected "+ b);
		
		WebElement vote_button = driver.findElement(By.xpath("//input[@value='Vote']"));
		if(vote_button.isEnabled())
		{
			vote_button.click();
		}
		boolean b2 =vote_button.isSelected();
		System.out.println("vote button was clicked "+ b2);
		driver.close();
	}

}
