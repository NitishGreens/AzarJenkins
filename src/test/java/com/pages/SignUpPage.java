package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class SignUpPage extends LibGlobal {
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstname")
	private WebElement txtFirstName;
	@FindBy(name = "lastname")
	private WebElement txtLastName;
	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement btnSignUp;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

	public void signUp(String fName, String lName) {
		setText(getTxtFirstName(), fName);
		setText(getTxtLastName(), lName);
		btnClick(getBtnSignUp());

	}

}
