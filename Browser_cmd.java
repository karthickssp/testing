package Basic_Browser_Cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_cmd {

public static void main(String args[]) throws InterruptedException {
		
		//need to specify the browser
		System.setProperty("webdriver.chrome.driver", "D:\\CODES\\ECLIPSE\\TESTING\\selinium\\driver\\chromedriver.exe");
		
		//for old chrome versions below 100
		//WebDriver dr = new ChromeDriver();
		
		//chrome browser 111.* version
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-remote-allow-origins=*");
		WebDriver dr = new ChromeDriver(co);
		dr.navigate().to("https://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.className("gLFyf")).sendKeys("nptel");
		//dr.findElement(By.className("gNO89b")).submit();
		dr.findElement(By.xpath("//input[contains(@value,\"Google Search\")]")).submit();
		
		/*
		//user given url
		String url = "https://www.facebook.com/";
		dr.get(url);
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		dr.navigate().back();
		Thread.sleep(2000);
		dr.navigate().refresh();
		
		System.out.println( dr.getTitle());
		//system fecting url by method
		String curl = dr.getCurrentUrl();
		String pgsource = dr.getPageSource();
		//System.out.println(pgsource);
		//System.out.println(dr.getWindowHandle());
		if(curl.equals(url)) {
			System.out.println("Both url are same: "+ curl);
		}
		else
		{
			System.out.println("Both url are different: url="+url+"  curl= "+curl);
		}
		dr.close();*/
		
	}
}
