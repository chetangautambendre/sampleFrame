package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;

import selenium.SeleniumClass;

public class HomePage extends SeleniumClass  {

	String xpathHomeLinks = "//li/a";
	
	List<WebElement> elements;
	WebElement element;
	
	public void verifyAllLinks(){
		
		elements = super.identifyElements("xpath", xpathHomeLinks);		
		int count = elements.size();
		
		assert count ==39 : count + " is not equal to 39";
		
	}
	
	public void clickHomePageLink(String linkAddress){
		element = super.identifyElement("linktext", linkAddress);
		element.click();
		
	}
}
