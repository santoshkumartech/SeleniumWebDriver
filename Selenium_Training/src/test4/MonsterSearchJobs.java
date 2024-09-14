package test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MonsterSearchJobs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		WebElement job_search = driver.findElement(By.xpath("(//a[@href='https://www.monsterindia.com/search/job-search'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(job_search).build().perform();
		
		WebElement job_by_title = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[1]"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(job_by_title).build().perform();
		
		WebElement java_developer_job = driver.findElement(By.xpath("//a[@href='https://www.monsterindia.com/search/java-developer-jobs']"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(java_developer_job).click().build().perform();
		
		Thread.sleep(3000);
		driver.close();
	}

}
