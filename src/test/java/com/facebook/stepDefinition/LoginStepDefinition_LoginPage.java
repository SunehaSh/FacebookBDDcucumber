package com.facebook.stepDefinition;

import com.facebook.pageObject.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition_LoginPage extends LoginPage {

	LoginPage lp = new LoginPage();

	@Given("^I am a user of facebook application$")
	public void i_am_a_user_of_facebook_application() throws Throwable {
		lp.enterURL();
	}

	@When("^I enter valid username$")
	public void i_enter_valid_username() throws Throwable {
		lp.enterUsername();
		;
	}

	@Then("^I enter valid password$")
	public void i_enter_valid_password() throws Throwable {
		lp.enterPassword();
		;
	}
	
	@Then("^I should get logged in successfully$")
    public void i_should_get_logged_in_successfully() throws Throwable {
        lp.clickLoginButton();;
    }
	
	@And("^verfication$")
    public void verfication() throws Throwable {
        lp.verifylogin();;
    }


}
