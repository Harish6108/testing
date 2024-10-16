package webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statictable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://testautomationpractice.blogspot.com/");
	
	// To find the size of the rows in table
	int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			System.out.println("number of rows:"+rows);
			
			// To find the size of the coloumns in table
			int cols= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			System.out.println("number of coloumns:"+cols);
			
			//To read data from table ex 4 row 2 col;
			
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[2]")).getText();
			System.out.println(bookname);
		
			for(int r=2;r<=rows;r++) {
				
				for(int c=1;c<=cols;c++) {
			
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		System.out.println(value+"\t");
				}
	
}
}
}