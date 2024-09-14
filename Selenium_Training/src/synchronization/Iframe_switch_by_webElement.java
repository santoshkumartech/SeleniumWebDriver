package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_switch_by_webElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//switch to by id 
		//WebElement Allow = driver.findElement(By.xpath("//a[text()='No Thanks']"));
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		//Thread.sleep(1000);	
		driver.findElement(By.xpath("//a[text()='BUSINESS']")).click();
		//Thread.sleep(3000);
	}
}
