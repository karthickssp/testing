package Basic_Browser_Cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NormalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		//driver.findElement(By.className("gLFyf")).sendKeys("spidey"+Keys.SPACE+"images"+Keys.ENTER);
		WebElement button =driver.findElement(By.className("gLFyf"));
		//driver.findElement(By.className("t-block t-rounded-4 t-outline-none t-border-none t-m-auto t-relative t-font-medium t-transition-[all_0.2s_ease-in-out] t-w-full t-bg-primary t-text-white t-h-40"));
		System.out.println(button.getCssValue("background-colour"));
		System.out.println(button.getSize().getWidth());
		System.out.println(button.getSize().getHeight());
		
		
	}

}
