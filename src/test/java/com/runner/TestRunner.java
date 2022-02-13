package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.libglobal.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com.stepdefinition", dryRun = false, plugin = {
		"junit:src\\test\\resources\\FacebookReport\\sample.xml", "html:src\\test\\resources\\FacebookReport",
		"json:src\\test\\resources\\FacebookReport\\facebook.json" })
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(
				System.getProperty("user.dir") + "\\src\\test\\resources\\FacebookReport\\facebook.json");
	}

}
