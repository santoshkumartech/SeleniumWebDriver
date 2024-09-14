package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XmlAbsolutTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",  "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/wp.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("santosh");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("msk");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("New-York");
		driver.close();
	}
}
