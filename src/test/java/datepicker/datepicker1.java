package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		    String Year="2026";
			String Month="october";	
			String date="16";
		
		driver.findElement(By.xpath("//div[@class='col-sm-3 col-xs-3 col-md-2 ']"));
		while(true) {
        String currentMonth=driver.findElement(By.xpath("//div[@class='col-sm-3 col-xs-3 col-md-2 ']")).getText();
        String currentYear=driver.findElement(By.xpath("//div[@class='col-sm-3 col-xs-3 col-md-2 ']")).getText();
		
		if(currentMonth.equals(Month)&&currentYear.equals(currentYear)) {
            break;
		}
		List<WebElement> alldates=driver.findElements(By.cssSelector(".navbar-brand"));
		
	for(WebElement dt:alldates) {
        
		if(dt.getText().equals(date)) {
			dt.click();
		
	}
		}
		}
		}
	}
	