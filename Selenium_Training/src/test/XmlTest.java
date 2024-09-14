package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XmlTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Computers");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[2][@type=\"submit\"]")).click();
		driver.close();
	}

}
