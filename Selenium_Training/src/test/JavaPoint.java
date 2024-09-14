package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPoint {

	public static void main(String[] args)
	{
	  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.javatpoint.com");
	  String title = driver.getTitle();
	  System.out.println(title);
	  driver.manage().window().maximize();
	  driver.quit();
	  
		
	}

}
