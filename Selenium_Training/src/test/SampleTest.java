package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest
{
	public static void main(String[] args)
	{
	  System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  //to navigate to url
	  driver.get("https://www.google.co.in");
	  // to maximize the browser
	  driver.manage().window().maximize();
	  //to refresh
	  driver.navigate().refresh();
	  //to close the browser
	  
	}
}
