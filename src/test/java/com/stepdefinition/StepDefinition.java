package com.stepdefinition;

import org.junit.Assert;

import com.libglobal.LibGlobal;
import com.pages.LoginPage;
import com.pages.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal {

	@Given("User launch Facebook Web Application")
	public void user_launch_Facebook_Web_Application() {
	}

	@When("User enters valid username {string} and valid password {string} and click on login Button")
	public void user_enters_valid_username_and_valid_password_and_click_on_login_Button(String s1, String s2) {
		LoginPage loginPage = new LoginPage();
		loginPage.login(s1, s2);
	}

	@Then("User verify Home Page is displayed")
	public void user_verify_Home_Page_is_displayed() {
		Assert.assertTrue(false);
		System.out.println("displayed");
	}

	@When("User Click on createNewAccount Button")
	public void user_Click_on_createNewAccount_Button() {
		LoginPage loginPage = new LoginPage();
		loginPage.creatNewAccount();
	}

	@When("User enters {string}and {string} and click on signUp Button")
	public void user_enters_and_and_click_on_signUp_Button(String s1, String s2) {
		SignUpPage signUpPage = new SignUpPage();
		signUpPage.signUp(s1, s2);
	}

	@Then("User verify Error message is displayed")
	public void user_verify_Error_message_is_displayed() {
		System.out.println("error");
	}

}
