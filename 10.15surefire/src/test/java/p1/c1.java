package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
	    ChromeDriver ob= new ChromeDriver();
	    ob.get("http://www.facebook.com");
	    System.out.println(ob.getTitle());
	    ob.quit();
	}
	

}
