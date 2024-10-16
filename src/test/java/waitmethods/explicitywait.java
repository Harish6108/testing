package waitmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitywait {
public static void main(String[]args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver,Duration .ofSeconds(7));
	driver.navigate().to("https://www.saucedemo.com/v1/");
	
	WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
	username.sendKeys("standard_user");
    WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    password.sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
}
}