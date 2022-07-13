/*
 * package stepdefinitions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.After; import io.cucumber.java.Before; import
 * io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pagefactory.Homepage_PF; import pagefactory.LoginPage_PF;
 * 
 * public class LoginDemosteps_PF {
 * 
 * WebDriver driver; LoginPage_PF login; Homepage_PF home;
 * 
 * @Before public void Set_Up(){ System.out.println("I am inside setup method");
 * }
 * 
 * @Given("browser is open") public void browser_is_open() {
 * 
 * System.out.println("==I am inside LoginDemosteps_PF class ");
 * System.setProperty("webdriver.chrome.driver",
 * "C:/Users/DELL/git/CucumberBasics/CucumberPractice/src/test/resources/Webdriver/chromedriver.exe"
 * ); driver=new ChromeDriver(); driver.manage().window().maximize();
 * 
 * }
 * 
 * @And("user is on login page") public void user_is_on_login_page() {
 * driver.navigate().to("https://example.testproject.io/web/"); }
 * 
 * @When("^user enters(.*) and (.*)$") public void
 * user_enters_username_and_password(String username,String password) throws
 * InterruptedException {
 * 
 * System.out.println("user logged in with"+ username );
 * 
 * login=new LoginPage_PF(driver);
 * 
 * login.enterusername(username);
 * 
 * login.enterpassword(password);
 * 
 * 
 * 
 * }
 * 
 * @And("user clicks on login button") public void user_clicks_on_login_button()
 * throws InterruptedException { Thread.sleep(5000); login.clickOnlogin();
 * 
 * 
 * }
 * 
 * @Then("user is navigated to the homepage") public void
 * user_is_navigated_to_the_homepage() throws InterruptedException {
 * 
 * home=new Homepage_PF(driver); home.Chklogoutisdisplayed();
 * System.out.println("logout is displayed for user");
 * 
 * }
 * 
 * @Then("user will logout and return to login page") public void
 * user_will_logout_and_return_to_login_page() { home.Clicllogoutbutton();
 * //driver.close(); //driver.quit(); }
 * 
 * @After public void teardown() { System.out.println("I am inside teardown");
 * driver.close(); driver.quit(); }
 * 
 * 
 * 
 * 
 * }
 */