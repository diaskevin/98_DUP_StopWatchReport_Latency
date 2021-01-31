//HTMLUnitDriver is a class in the Selenium library. This is used to drive a headless browser HTMLUnit. Emulate other browsers with this driver. 
//RagHav lesson Selenium Beginner 13   https://www.youtube.com/watch?v=NlEPMNsqRs8&list=PLhW3qG5bs-L_s9HdC5zNshE5Ti8jABwlU&index=13

package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class b1_HtmlUnitDriver_HtmlUnitDriver {
	
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("http://seleniumhq.org/");
		
		System.out.println("Title is : "+driver.getTitle());
		
		driver.quit();
	
	}
}