package com.pageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	// Constructor

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 60);
		PageFactory.initElements(this.driver, this);
	}

}
