package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils implements IoConstant {
 public static void verifyTitle(WebDriver driver,String etitle) {
	WebDriverWait wait=new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.titleContains(etitle));
	String aTitle=driver.getTitle();
	if (etitle.equals(aTitle)) {
		System.out.println("Page is displayed");
	}
	else
	{
		System.out.println("Required page is not diaplyed");
	}
}
}
