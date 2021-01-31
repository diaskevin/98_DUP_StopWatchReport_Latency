package d_EdgeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Kevin.dias\\Equinox\\SELENIUM\\SeleniumDrivers\\edgedriver\\MicrosoftWebDriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		
		driver.quit();
	}	
}
