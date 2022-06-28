package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(id="name")
	@CacheLookup
	WebElement txt_username;

	@FindBy(id="password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(id="login")
	@CacheLookup
	WebElement btn_login;
	
	

	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnlogin() {
		btn_login.click();
	}
	
//	public void close() {
//		driver.close();
//	}

}
