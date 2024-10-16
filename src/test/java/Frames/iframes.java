package Frames;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame("frame1");
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("chintu");
	driver.switchTo().defaultContent();
	
	
	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame("frame2");
	driver.findElement(By.xpath("//input[@name=\'mytext3\'")).sendKeys("chintu");
	driver.switchTo().frame("frame2");
	
 List<WebElement> checkbox1= driver.findElements(By.xpath("//div[@class='\rq8Mwb\']"));
	for(int i=0;i<=checkbox1.size();i++);{
		
	
	}
	}
}