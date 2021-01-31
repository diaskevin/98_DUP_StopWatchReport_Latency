// Mukesh https://www.youtube.com/channel/UCcTII5pbZYkU4fgFtb4uesg
// Downloaded Phamtomjs EXE & JAR in location "C:\Users\Kevin.dias\Equinox\PHAMTONJS"
// got the driver set up- looks ok, but junit errors now???

package g_HeadLess_depreciated_PhantomJS;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSDemo
{
	
	public void verifyTitle()
	{
	File src = new File("C:\\Users\\Kevin.dias\\Equinox\\PHAMTONJS\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
	WebDriver driver = new PhantomJSDriver();
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());	
	}
	
}