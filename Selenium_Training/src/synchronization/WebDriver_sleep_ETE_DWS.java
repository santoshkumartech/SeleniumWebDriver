package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_sleep_ETE_DWS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement register = driver.findElement(By.xpath("//a[@href='/register']"));
		Actions action = new Actions(driver);
		action.moveToElement(register).click().build().perform();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		String fn = "santu";
		String ln ="msk";
		String email = "santumsk11@gmail.com";
		String pwd ="santumsk123";
		String rpwd ="santumsk123";
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		action.moveToElement(FirstName).click().sendKeys(fn).build().perform();
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
		action.moveToElement(Lastname).click().sendKeys(ln).build().perform();
		WebElement Email  = driver.findElement(By.xpath("//input[@name='Email']"));
		action.moveToElement(Email).click().sendKeys(email).build().perform();
		WebElement password  = driver.findElement(By.xpath("//input[@name='Password']"));
		action.moveToElement(password).click().sendKeys(pwd).build().perform();
		WebElement Rpassword  = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		action.moveToElement(Rpassword).click().sendKeys(rpwd).build().perform();
		WebElement Register  = driver.findElement(By.xpath("//input[@id='register-button']"));
		action.moveToElement(Register).click().build().perform();
		
		WebDriverWait wait = new  WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ico-logout']"))).click();
		
		WebDriverWait wait1 = new  WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ico-login']"))).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}

}
