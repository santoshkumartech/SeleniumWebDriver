package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_alert_DemoGuru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement Double_click = driver.findElement(By.xpath("//button[contains(text(),Double)]"));
		Actions action = new Actions(driver);
		action.doubleClick(Double_click).build().perform();
		Thread.sleep(1000);
		Alert ale = driver.switchTo().alert();
		ale.accept();
		Thread.sleep(4000);
		driver.close();
	}

}
