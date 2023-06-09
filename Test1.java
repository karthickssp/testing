package Basic_Browser_Cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CODES\\ECLIPSE\\TESTING\\selinium\\driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		
		/*WebElement pass = driver.findElement(By.id("input-firstname"));
		pass.sendKeys("ssp@123");*/
		
		driver.findElement(By.id("input-firstname")).sendKeys("Karthick");
		driver.findElement(By.id("input-lastname")).sendKeys("ssp");
		driver.findElement(By.id("input-email")).sendKeys("ssp00@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("ssp@123");
		//driver.findElement(By.xpath(""));
		driver.findElement(By.id("input-newsletter-yes")).click();		
		//driver.findElement(By.id("form-check-input")).click();	
		
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
