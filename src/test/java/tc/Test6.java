package tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test6 {
	public WebDriver driver;
	@Parameters({"browserName"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("hjgfhgjh");
		driver.findElement(By.id("did_submit")).click();
		String title = driver.getTitle();

		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		

	}

}
