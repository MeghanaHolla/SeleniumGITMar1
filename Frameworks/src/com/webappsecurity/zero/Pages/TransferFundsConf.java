package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConf {

	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement successMsgBox;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement username;
	
	@FindBy(id="logout_link")
	private WebElement logout;
	
	public TransferFundsConf(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public String getConfText() {
		String confMsg = successMsgBox.getText();
		return confMsg;
	}
	
	public void applicationLogout() {
		username.click();
		logout.click();
	}
}
