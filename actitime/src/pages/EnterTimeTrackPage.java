package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterTimeTrackPage {
	@FindBy(xpath="//div[contains(text(),'Settings')])[1]")
	private WebElement settings;
	@FindBy(xpath="//a[text()='Licenses']")
	private WebElement license;
	@FindBy(xpath="(//nobr[contains(text(),'Product Edition:')])/../../td[2]")
	private WebElement prodE;
	@FindBy(xpath="(//nobr[contains(text(),'Issue Date:')])/../../td[2]")
	private WebElement idate;
	public void setting() {
		settings.click();
	}
	public void licenses() {
		license.click();
	}
	public void pEdition() {
		System.out.println(prodE.getText());
	}
	public void issueD() {
		System.out.println(idate.getText());
	}

	

}
