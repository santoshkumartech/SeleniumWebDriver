package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Ndtv_AutoCar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe.html");
		driver.manage().window().maximize();
		//switch to by name attribute
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
