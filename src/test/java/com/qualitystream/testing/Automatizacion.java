package com.qualitystream.testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatizacion {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@Test
	public void testprueba() {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("https://www.google.com/");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("https://www.google.com/ - Buscar con Google", driver.getTitle());
	}
	
/*	@Test
	public void localizadores() {
		By locator = By.id("");
		By locator_name = By.name("");
		By locator_class = By.className("");
		By locator_tagname = By.tagName("");
		By locator_linktext = By.linkText("");
		By locator_partialLinkText = By.partialLinkText("");
		By locator_cssSelector = By.cssSelector("");
		By locator_Xpath = By.xpath("");
	}*/
	@After
	public void tearDown() {
		driver.quit();
	}
}
