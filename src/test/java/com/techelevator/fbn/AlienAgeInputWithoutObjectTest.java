package com.techelevator.fbn;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlienAgeInputWithoutObjectTest {

	private static WebDriver webDriver;
	
	@BeforeClass
	public static void openWebBrowserForTesting() {
		
		String homeDir = System.getProperty("user.home");
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}
	
	@Before
	public void openHomePage() {
		webDriver.get("http://localhost:8080/36.1-ssg-exercises-pair/");
		WebElement alienAgeLink = webDriver.findElement(By.linkText("Alien Age"));
		alienAgeLink.click();
	}
	
	@AfterClass
	public static void closeWebBrowser() {
		webDriver.quit();
	}
	
	//Tests that everything is on the page
	@Test
	public void displays_all_elements() {
		WebElement heading = webDriver.findElement(By.className("centered"));
		WebElement inputPlanet = webDriver.findElement(By.xpath("/html/body/section/form/div[1]/label"));
		WebElement inputAge = webDriver.findElement(By.xpath("/html/body/section/form/div[2]/label"));
		WebElement calculateButton = webDriver.findElement(By.xpath("/html/body/section/form/div[3]/input"));
		assertEquals("Alien Age Calculator", heading.getText());
		assertEquals("Choose a Planet", inputPlanet.getText());
		assertEquals("Enter Your Earth Age", inputAge.getText());
		assertEquals("submit", calculateButton.getAttribute("type"));
		
	}
	
	//Tests that all planets are in the dropdown
	@Test
	public void all_planets_are_options() {
		WebElement planets = webDriver.findElement(By.name("inputPlanet"));
		String[] planetsArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
		String[] selectOptions = planets.getText().split("\n");
		assertArrayEquals(planetsArray, selectOptions);
		assertFalse(planets.getText().contains("Pluto"));
		
	}
	
	//Tests that 
	@Test
	public void calculate_age_correct() {
		WebElement planets = webDriver.findElement(By.name("inputPlanet"));
		Select termField = new Select(planets);
		termField.selectByVisibleText("Venus");
		
		WebElement inputAge = webDriver.findElement(By.xpath("/html/body/section/form/div[2]/input"));
		inputAge.sendKeys("27");
		
		WebElement calculateButton = webDriver.findElement(By.xpath("/html/body/section/form/div[3]/input"));
		calculateButton.click();
		
		WebElement result = webDriver.findElement(By.xpath("//*[@id=\"calculatorResult\"]/h2"));
		assertEquals("If you are 27 years old on planet Earth, then you are 43.89 Venus years old.", result.getText());

	}
	
}
