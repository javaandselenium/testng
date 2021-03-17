package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String parent = driver.getWindowHandle();
		
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> child = driver.getWindowHandles();
		
		Thread.sleep(5000);
		child.remove(parent);
		Thread.sleep(5000);
		for(String b:child) {
			driver.switchTo().window(b);
			//driver.get("https://www.amazon.com/");
		}
		
		driver.navigate().to("https://www.amazon.com/");
		//driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		driver.switchTo().window(parent);
	}

}
