package test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextOfOs2 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\java Progaram\\src\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/demo.html");
		driver.manage().window().maximize();
		List<WebElement> value = driver.findElements(By.xpath("//table[@name='os']/tbody/tr"));
		List<WebElement> col_val = driver.findElements(By.xpath("//table[@name='os']/tbody/tr[2]/td"));
		for (int i = 2; i <= value.size() ; i++) 
		{
			for (int j = 1; j<= col_val.size(); j++) 
			{
				WebElement ele = driver.findElement(By.xpath("//table[@name='os']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(ele.getText()+"--");
			}
		System.out.println();	
		}
		driver.close();
	}
}
//List<WebElement> ele = driver.findElements(By.xpath("//table[4][@name='os']/tbody/tr/td"));
