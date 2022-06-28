//package stepdefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginDemosteps {
//
//	WebDriver driver;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside step - browser is open");
//     	System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/CucumberPractice/src/test/resources/Webdriver/chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters(.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) throws InterruptedException  {
//		
//		System.out.println("user logged in with"+ username );
//		
//		driver.findElement(By.id("name")).sendKeys(username);
//		Thread.sleep(5000);
//		driver.findElement(By.id("password")).sendKeys(password);
//		Thread.sleep(5000);
//	}
//	
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.findElement(By.id("login")).click();
//		
//	}
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() throws InterruptedException {
//		//driver.getPageSource().contains("Hello Aishwarya, let's complete the test form:");
//		driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(5000);
//		driver.close();
//		driver.quit();
//	}
//
//}
