package tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc3 extends BaseClass {

@Test
public void validlogi() {
	driver.findElement(By.id("email")).sendKeys("ghgfhgfhghgh");
	driver.findElement(By.id("pass")).sendKeys("hfhgjhfghjfghgggh");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Reporter.log(title, true);
	String url = driver.getCurrentUrl();
	Reporter.log(url,true);
}


}
