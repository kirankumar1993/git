/**
 * 
 */
package demo.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author TI-PF0M0DY5
 *
 */
public class Selniumdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//locators script
		
		WebElement element =  driver.findElement(By.name("q"));
		element.sendKeys("search");
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		List<WebElement> suggestion = driver.findElements(By.className("sbtc"));
		
		for(WebElement suggest:suggestion){
			if(suggest.getText().equalsIgnoreCase("Search Whatsapp"));
			suggest.click();
		}
			driver.close();
		
		}

}
