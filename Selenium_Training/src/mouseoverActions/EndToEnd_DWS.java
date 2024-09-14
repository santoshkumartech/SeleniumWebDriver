package mouseoverActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd_DWS {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demowebshop.tricentis.com/";
		driver.get(url);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mobiles");
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        driver.findElement(By.xpath("//input[@id='As']")).click();
        WebElement category = driver.findElement(By.xpath("//select[@id='Cid']"));
        Select sel = new Select(category);
        sel.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='Isc']")).click();
        WebElement manufacturer = driver.findElement(By.xpath("//select[@name='Mid']"));
        Select man = new Select(manufacturer);
        man.selectByIndex(1);
      //WebElement price_range = driver.findElement(By.xpath("//input[@class='price-from']"));
        String from = "10000";
        driver.findElement(By.xpath("//input[@class='price-from']")).click();
        driver.findElement(By.xpath("//input[@class='price-from']")).sendKeys(from);
        String to ="50000";
        driver.findElement(By.xpath("//input[@class='price-to']")).click();
        driver.findElement(By.xpath("//input[@class='price-to']")).sendKeys(to);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//strong[@class='result']")).getText());
		driver.close();
	}
}
