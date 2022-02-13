package com.libglobal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonFile) {

		// mention report location
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\FacebookReport");

		// set config
		Configuration con = new Configuration(file, "FacebookWebAutomation");

		// add classifications
		con.addClassifications("platformName", "Windows");
		con.addClassifications("platformVersion", "11");
		con.addClassifications("sprintNumber", "43");
		con.addClassifications("buildNumber", "FBW49829");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, con);
		builder.generateReports();

	}

}
