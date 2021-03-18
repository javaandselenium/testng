package tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("slider"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(ele,100,0).perform();
		Thread.sleep(3000);
		a.dragAndDropBy(ele,-100,0).perform();
		

	}

}
