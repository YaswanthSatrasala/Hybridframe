package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;

	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	By txtpassword = By.id("Password");
	
	@FindBy(xpath ="//button [@class='button-1 login-button']")
	@CacheLookup
	WebElement btnLogin;

	By lnklogout=	By.linkText("Logout");
	
	public void setUsername(String Uname) {
		txtEmail.clear();
		txtEmail.sendKeys(Uname);
	}

	public void setPassword(String Pwd) {
		ldriver.findElement(txtpassword).clear();
		ldriver.findElement(txtpassword).sendKeys(Pwd);
		}
	
	public void login() {
		btnLogin.click();
		
	}
	

	public void logout() {
		ldriver.findElement(lnklogout).click();
		
	}
	
	
}
