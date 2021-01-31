package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class b3_htmlUnitDriver_Firefox52 {
	
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_52);
		
		driver.get("http://seleniumhq.org/");
		
		System.out.println("Title is : "+driver.getTitle());
		
		driver.quit();
	
	}
}