package pageobjects;

import org.openqa.selenium.WebElement;
import selenium.SeleniumClass;

public class FormAuthenticationPage extends SeleniumClass{

	String idUsernameTextBox = "username";
	String idPasswordTextBox = "password";
	String xpathLoginButton = "//form/button/i";
	String xpathLogoutButton = "//a/i";
	
	WebElement element;
	
	public void passUserName(String uname){
		element = super.identifyElement("id", idUsernameTextBox);
		element.sendKeys(uname);
	}
	
	public void passPassword(String pword){
		element = super.identifyElement("id", idPasswordTextBox);
		element.sendKeys(pword);
	}
	
	public void clickLoginButton(){
		element = super.identifyElement("xpath", xpathLoginButton);
		element.click();
	}
	
	public void clickLogoutButton(){
		element = super.identifyElement("xpath", xpathLogoutButton);
		element.click();
	}
	
}
