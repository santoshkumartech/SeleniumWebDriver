package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XmlAbsolutTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/web3.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='Useername']")).sendKeys("santu");
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("msk");
		driver.findElement(By.xpath("//button[text()='login']")).click();
		driver.close();
	}

}
