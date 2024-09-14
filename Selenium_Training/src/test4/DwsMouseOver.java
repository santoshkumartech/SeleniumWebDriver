package test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DwsMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement computer = driver.findElement(By.xpath("//a[@href='/computers']"));
		Actions action = new Actions(driver);
		action.moveToElement(computer).build().perform();
		WebElement Desktops = driver.findElement(By.partialLinkText("Desktops"));
		action.moveToElement(Desktops).click().build().perform();
		Thread.sleep(500);
		WebElement Electronic = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		action.moveToElement(Electronic).build().perform();
		WebElement Camera = driver.findElement(By.xpath("//a[@href='/cell-phones']"));
		action.moveToElement(Camera).click().build().perform();
		Thread.sleep(5000);
		driver.close();
	}

}
