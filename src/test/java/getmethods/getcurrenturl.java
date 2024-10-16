package getmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getcurrenturl {
public static void main (String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	String url=driver.getCurrentUrl();
	System.out.println("this is a url="+url);
	driver.quit();
	
}
}

