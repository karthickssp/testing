package Basic_Browser_Cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class exception {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CODES\\ECLIPSE\\TESTING\\selinium\\driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		try
		{
			driver.findElement(By.className("form-checker-input")).click();
			
		}
		catch(NoSuchElementException e)
		{
			System.out.println("iffiheui");
			//throw e;
		}
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
