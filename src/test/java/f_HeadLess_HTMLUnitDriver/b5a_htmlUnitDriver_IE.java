package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class b5a_htmlUnitDriver_IE {
	
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER);
		
		driver.get("http://seleniumhq.org/");
		
		System.out.println("Title is : "+driver.getTitle());
		
		driver.quit();
	
	}
}