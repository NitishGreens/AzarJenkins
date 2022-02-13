package com.stepdefinition;

import com.libglobal.LibGlobal;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LibGlobal {

	@Before
	public void beforeScenario() {
		lauchBrowser();
		loadUrl("https://www.facebook.com/");

	}

	@After
	public void afterScenario(Scenario sc) {
		quitBrowser();
	}

}
