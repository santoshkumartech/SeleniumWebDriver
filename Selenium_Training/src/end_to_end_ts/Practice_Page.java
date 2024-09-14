package end_to_end_ts;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice_Page {
	
		public static void main(String[] args) throws Throwable 
		{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//working with radio-button
		driver.findElement(By.xpath("//input[@name=\"radioButton\"]")).click();
		
		//working with auto-suggestion
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bo");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@tabindex=\"-1\"])[1]")).click();
	
		//working with drop-down
	    WebElement dropdown= driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select select=new Select(dropdown);
		List<WebElement> list=select.getOptions();
		for (int i = 0; i < list.size(); i++) {
			WebElement dropdown1= driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
			Select select1=new Select(dropdown1);
			select1.selectByIndex(i);
		}
	    Thread.sleep(1000);
	    //working with check-box
	    List<WebElement> checkbox=driver.findElements(By.xpath("//div[@class=\"right-align\"]//label/input"));
	    for ( int i = 0; i < checkbox.size(); i++){
	    	checkbox.get(i).click();
	    }
		//multiple windows
	    String parent_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(1000);
		Set<String> child_window = driver.getWindowHandles();
		System.out.println(child_window);
		for(String window : child_window)
		{
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().contains("QA Click Academy"))
			{
				driver.close();
			}
		}
		driver.switchTo().window(parent_window);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("santu");
		driver.findElement(By.xpath("(//input[@class='btn-style'])[2]")).click();
		Alert ale = driver.switchTo().alert();
		ale.accept();
		
		//working on table
		WebElement table1 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[2]/td[1]"));
		WebElement table2 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[2]/td[2]"));
		WebElement table3 = driver.findElement(By.xpath("(//table)[1]/tbody/tr[2]/td[3]"));
		System.out.println("instructor name :  "+ table1.getText()+" " + "course name :  "+table2.getText()+" "+ "course price :  "+table3.getText());
	
	//	element displayed
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		
		//mouse over action
		WebElement mouse_action = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouse_action).build().perform();
		Thread.sleep(2000);
		WebElement top = driver.findElement(By.xpath("//a[@href='#top']"));
		action.moveToElement(top).click().build().perform();
		
	}

}
