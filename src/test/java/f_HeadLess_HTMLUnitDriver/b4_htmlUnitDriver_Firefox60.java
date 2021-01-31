package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class b4_htmlUnitDriver_Firefox60 {
	
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_60);
		
		driver.get("http://seleniumhq.org/");
		
		System.out.println("Title is : "+driver.getTitle());
		
		driver.quit();
	
	}
}