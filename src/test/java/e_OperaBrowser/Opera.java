package e_OperaBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver",  "C:\\Users\\Kevin.dias\\Equinox\\SELENIUM\\SeleniumDrivers\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		
		driver.quit();
	}	
}
