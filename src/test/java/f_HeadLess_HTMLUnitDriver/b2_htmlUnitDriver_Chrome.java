package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class b2_htmlUnitDriver_Chrome {
	
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		
		driver.get("http://seleniumhq.org/");
		
		System.out.println("Title is : "+driver.getTitle());
		
		driver.quit();
	
	}
}