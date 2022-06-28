/*
 * package StepsForHooks;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.After; import io.cucumber.java.AfterStep; import
 * io.cucumber.java.Before; import io.cucumber.java.BeforeStep; import
 * io.cucumber.java.en.*;
 * 
 * public class HooksDemoSteps {
 * 
 * WebDriver driver=null;
 * 
 * @Before public void browserSetup() throws InterruptedException {
 * 
 * System.out.println("===I am Inside Browser SetUp===");
 * System.setProperty("webdriver.chrome.driver",
 * "src/test/resources/Webdriver/chromedriver.exe"); driver=new ChromeDriver();
 * driver.manage().window().maximize(); Thread.sleep(5000); }
 * 
 * @BeforeStep private void BeforeSteps() {
 * System.out.println("I am inside BeforeSteps Method"); }
 * 
 * @AfterStep private void AfterSteps() {
 * System.out.println("I am inside AfterSteps Method"); }
 * 
 * @Given("user is on login page") public void user_is_on_login_page() {
 * 
 * System.out.println("===I am inside teardown==="); driver.close();
 * driver.quit(); }
 * 
 * }
 */