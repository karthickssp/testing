package Basic_Browser_Cmd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {
	
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\CODES\\ECLIPSE\\TESTING\\selinium\\driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(By.className("gLFYf")).sendKeys("ssp");
		WebElement re = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		driver.quit();
		
		
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMinutes(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		driver.findElement(By.name("agree")).click();
		
	}

}
