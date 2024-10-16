package screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  
	  //fullpage ss
    TakesScreenshot sr=(TakesScreenshot)driver;
    File src=sr.getScreenshotAs(OutputType.FILE);
    File trg=new File(System.getProperty("user.dir")+"\\Seleniumss\\fullpage.png");
    src.renameTo(trg);

    
    
	}

}
