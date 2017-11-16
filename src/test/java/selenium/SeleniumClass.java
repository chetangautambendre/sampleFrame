package selenium;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class SeleniumClass {
	
	static WebDriver driver;
	WebElement element;
	
	List<WebElement> elements;
	
	public void launchBrowser(String browserName){
		System.out.println("Launching Browser" + browserName);
		
		String currentPath = System.getProperty("user.dir");
		currentPath = currentPath + "\\src\\test\\java\\utils\\";
		
		if(browserName.contains("firefox")){
			System.setProperty("webdriver.gecko.driver", currentPath + "geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browserName.contains("chrome")){
			System.setProperty("webdriver.chrome.driver", currentPath + "chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.contains("ie")){
			System.setProperty("webdriver.ie.driver", currentPath + "IEDriverServer.exe");
			driver  = new InternetExplorerDriver();
			
		}	
		else{
			System.out.println("Incorrect browser name is passed");
		}
		
	}
	
	public void launchApplication(String url){
		System.out.println("Launching Application" + url);
		driver.get(url);
	}
	
	public void verifyPageByURL(String expectedURL){
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		System.out.println(expectedURL);
		
		assertEquals(actualURL,expectedURL);
				
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
	public List<WebElement> identifyElements(String locatorType,String locator){
		
		if(locatorType.equalsIgnoreCase("id")){
			elements = driver.findElements(By.id(locator));
		}
		else if(locatorType.equalsIgnoreCase("name")){
			elements =driver.findElements(By.name(locator));
		}
		else if(locatorType.equalsIgnoreCase("class")){
			elements = driver.findElements(By.className(locator));
		}
		else if(locatorType.equalsIgnoreCase("tagname")){
			elements = driver.findElements(By.tagName(locator));
		}
		else if(locatorType.equalsIgnoreCase("linktext")){
			elements = driver.findElements(By.linkText(locator));
		}
		else if(locatorType.equalsIgnoreCase("partiallinktext")){
			elements = driver.findElements(By.partialLinkText(locator));
		}
		else if(locatorType.equalsIgnoreCase("xpath")){
			elements = driver.findElements(By.xpath(locator));
		}
		else if(locatorType.equalsIgnoreCase("css")){
			elements =driver.findElements(By.cssSelector(locator));
		}
		else{
			System.out.println("Invalid locator type : " +locatorType );
		}
		return elements;
		
	}
	
	public WebElement identifyElement(String locatorType,String locator){
		
		if(locatorType.equalsIgnoreCase("id")){
			element = driver.findElement(By.id(locator));
		}
		else if(locatorType.equalsIgnoreCase("name")){
			element = driver.findElement(By.name(locator));
		}
		else if(locatorType.equalsIgnoreCase("class")){
			element = driver.findElement(By.className(locator));
		}
		else if(locatorType.equalsIgnoreCase("tagname")){
			element = driver.findElement(By.tagName(locator));
		}
		else if(locatorType.equalsIgnoreCase("linktext")){
			element = driver.findElement(By.linkText(locator));
		}
		else if(locatorType.equalsIgnoreCase("partiallinktext")){
			element = driver.findElement(By.partialLinkText(locator));
		}
		else if(locatorType.equalsIgnoreCase("xpath")){
			element = driver.findElement(By.xpath(locator));
		}
		else if(locatorType.equalsIgnoreCase("css")){
			element = driver.findElement(By.cssSelector(locator));
		}
		else{
			System.out.println("Invalid locator type : " +locatorType );
		}
		return element;
	}
	
}
