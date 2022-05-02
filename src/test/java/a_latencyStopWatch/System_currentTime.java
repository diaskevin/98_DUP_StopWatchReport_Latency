package a_latencyStopWatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class System_currentTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\02_Kevin\\qa\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
			long start = System.currentTimeMillis();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		 	long end = System.currentTimeMillis();
	    
		 	System.out.println("Time: " + (end - start) + " ms");
		
		driver.quit();
	}	
}
