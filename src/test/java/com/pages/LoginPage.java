package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.LibGlobal;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUserName;

	@FindBy(name = "pass")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement btnCreateNewAccount;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnCreateNewAccount() {
		return btnCreateNewAccount;
	}

	public void login(String username, String password) {
		setText(getTxtUserName(), username);
		setText(getTxtPassword(), password);
		btnClick(getBtnLogin());
	}

	public void creatNewAccount() {
		btnClick(getBtnCreateNewAccount());
	}

}
