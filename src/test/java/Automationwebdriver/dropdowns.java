package Automationwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://materializecss.com/radio-buttons.html");
		driver.findElement(By.xpath("//span[normalize-space()='Yellow']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Brown']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}