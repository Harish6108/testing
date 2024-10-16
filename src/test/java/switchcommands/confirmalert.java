package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class confirmalert {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demoqa.com/alerts");
  WebElement confirmButton= driver.findElement(By.id("confirmButton"));
  confirmButton.click();
    Thread.sleep(3000);
    driver.close();
   
  
  
	}

}
