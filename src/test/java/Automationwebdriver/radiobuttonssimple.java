package Automationwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobuttonssimple {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://testautomationcentral.com/demo/radiobuttons.html");
		driver.findElement(By.xpath("//div[@class='mb-6']//label[2]//input[1]")).click();
		driver.quit();
	}

}
