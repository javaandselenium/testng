package tc;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1 {
	
	@Test(priority = 2,invocationCount = 5)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(priority = 3,enabled=false)
	public void blocks() {
		Reporter.log("block",true);
	}
	
	@Test(priority = 1)
	public void chats() {
		Reporter.log("chats",true);
	}

}
