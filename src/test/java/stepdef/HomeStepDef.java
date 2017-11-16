package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import pageobjects.HomePage;

public class HomeStepDef {
	
	HomePage hp = new HomePage();
	
	@Given("^launch browser \"([^\"]*)\"$")
	public void launch_browser(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hp.launchBrowser(arg1);
	}

	@Given("^enter url \"([^\"]*)\"$")
	public void enter_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hp.launchApplication(arg1);
	}

	@Given("^verify \"([^\"]*)\" page$")
	public void verify_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hp.verifyPageByURL(arg1);
	}

	@Given("^verify all links$")
	public void verify_all_links() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hp.verifyAllLinks();
	}
	
	@After
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hp.closeBrowser();
	}
	
	@Given("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    hp.clickHomePageLink(arg1);
	}
}
