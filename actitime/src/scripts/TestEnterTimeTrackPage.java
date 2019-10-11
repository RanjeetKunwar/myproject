package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.FWUtils;
import pages.LoginPage;

public class TestEnterTimeTrackPage extends FWUtils {
	static  {
		System.setProperty(KEY,VALUE);
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
		LoginPage lp=new LoginPage(driver);
		lp.unt("admin");
		lp.pwt("manager");
		lp.clicklgnbtn();
		Thread.sleep(2000);
		
		
	}

}
