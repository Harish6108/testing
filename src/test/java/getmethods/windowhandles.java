package getmethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Set<String> windowhandles=driver.getWindowHandles();
		for(String win:windowhandles) {
			System.out.println(win);//for each format
		}
	System.out.println("this is a windowhandles="+ windowhandles);//anotherformat
		driver.quit();


	}

}
