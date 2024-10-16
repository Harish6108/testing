package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class timeralert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(3000);
		WebElement timerbutton=driver.findElement(By.id("timerAlertButton"));
		timerbutton.click();
		Alert timeralert=driver.switchTo().alert();
		timeralert.accept();
		driver.close();
		
	}

}
