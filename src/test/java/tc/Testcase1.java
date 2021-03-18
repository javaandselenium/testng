package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 extends BaseClass{
	
	@Test
	public void login() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("hjgfhgjh");
		driver.findElement(By.id("did_submit")).click();
		String title = driver.getTitle();
		
		//Assert.assertEquals(title,"34554ttrrtyert");
		SoftAssert s=new SoftAssert();
		s.assertEquals(title,"gjhgjhghg");
				
		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		s.assertAll();

	}
	


}
