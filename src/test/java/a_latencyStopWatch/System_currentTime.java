package a_latencyStopWatch;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class System_currentTime {

	@Test
	public void testGooglePage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vm\\Desktop\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(chromeOptions);
		 
			long start = System.currentTimeMillis();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		 	long end = System.currentTimeMillis();
	    
		 	System.out.println("Time: " + (end - start) + " ms");
		
		driver.quit();
	}	
}
