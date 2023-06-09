package Basic_Browser_Cmd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class implement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CODES\\ECLIPSE\\TESTING\\selinium\\driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		//implicit wait command
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String t1= "Purchase a Gif Certificatet";
		String t2 = "";
		
		t2 = driver.getTitle();
		if(t1.equals(t2))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");			
		}
	}

}
