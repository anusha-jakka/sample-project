import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class webdriverOper {

	
	public static void main(String[] args) {
		
	WebDriver driver=new FirefoxDriver();
	System.out.println("driver"+driver);
	System.out.println("driverstr"+driver.toString());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	WebElement txtbox=driver.findElement(By.id("lst-ib"));
	System.out.println("txtbox"+txtbox);
	txtbox.sendKeys("Selenium");
	txtbox.sendKeys(Keys.CONTROL,"a");
	txtbox.sendKeys("anusha");
		
	}

}
