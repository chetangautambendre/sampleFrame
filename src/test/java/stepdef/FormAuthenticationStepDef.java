package stepdef;

import cucumber.api.java.en.*;
import pageobjects.FormAuthenticationPage;

public class FormAuthenticationStepDef   {
	
	FormAuthenticationPage fap = new FormAuthenticationPage();
	

	@Given("^enter \"([^\"]*)\" as username$")
	public void enter_as_username(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fap.passUserName(arg1);
	}

	@Given("^enter \"([^\"]*)\" as password$")
	public void enter_as_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fap.passPassword(arg1);
	}

	@Given("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fap.clickLoginButton();
	}

	@Given("^click on logout button$")
	public void click_on_logout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fap.clickLogoutButton();
	}


	
	

}
