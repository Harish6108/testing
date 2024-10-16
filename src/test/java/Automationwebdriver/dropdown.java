package Automationwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://materializecss.com/radio-buttons.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='radio']//p[2]//label[1]//input[1]")).click();
		driver.close();
		
	}
	

}