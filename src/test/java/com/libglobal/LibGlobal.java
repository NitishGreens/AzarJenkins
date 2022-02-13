package com.libglobal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;

	public void lauchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void setText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement e) {
		e.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
