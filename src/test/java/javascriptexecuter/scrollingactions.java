package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollingactions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement dirver=	driver.findElement(By.xpath("//div[@class='scrollmenu']"));
		System.out.println(js.executeScript("returnwindow.pageYOffset"));
//	  js.executeScript("arguments[0].)

}
}