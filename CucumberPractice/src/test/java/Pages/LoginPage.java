package Pages;

import org.openqa.selenium.*;


public class LoginPage {
	
	WebDriver driver;

	By txt_username = By.id("name");
	
	By txt_password = By.id("password");
	
	By btn_login = By.id("login");
	
	By btn_logout = By.id("logout");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not Login page, The Current Url is " + driver.getCurrentUrl());
		}
	}
	
	
public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
		
	}
public void chklogoutisdisplayed() {
	driver.findElement(btn_logout).isDisplayed();
}

public void enterpassword(String password) {
	driver.findElement(txt_password).sendKeys(password);

}

public void clicklogin() {
	
	driver.findElement(btn_login).click();
	
}

//public void Validloginuser(String username,String password) {
//	driver.findElement(txt_username).sendKeys(username);
//	driver.findElement(txt_password).sendKeys(password);
//	driver.findElement(btn_login).click();
//}
}

