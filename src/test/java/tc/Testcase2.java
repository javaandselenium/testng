package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 extends BaseClass {
	
	
	@Test
	public void createApage() {
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//div[text()='Get Started']")).click();
		String title = driver.getTitle();
		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	
	

}
