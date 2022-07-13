package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() throws Exception {
		System.out.println("Inside step - browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/git/CucumberBasics/CucumberPractice/src/test/resources/Webdriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step - user is on google search page");
		driver.navigate().to("https://google.com");
		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws Exception {
		System.out.println("Inside step - user enters a text in search box");
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		//System.out.println("switching successful");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		Thread.sleep(5000);
	}

	@And("hits Enter")
	public void hits_enter() throws Exception {
		Thread.sleep(5000);
		System.out.println("Inside step - hits Enter");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		System.out.println("Inside step - user is navigated to search results page");
		driver.getPageSource().contains("About 65,90,00,000 results");
		driver.close();
		driver.quit();
	}
}
