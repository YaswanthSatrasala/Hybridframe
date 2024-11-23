package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class steps {
	public WebDriver driver;
	public LoginPage lp;
	

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		  System.setProperty("webdriver.chrome.driver","D:\\sql\\Orange_HRM\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  lp=new LoginPage(driver);
		  driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	  	}

	@When("User Enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pwd) throws InterruptedException {
	   lp.setUsername(email);
		  Thread.sleep(3000);

	   lp.setPassword(pwd);
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException {
		  Thread.sleep(3000);

	  lp.login();
	  Thread.sleep(3000);
	   System.out.println(driver.getTitle());
	  	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
		}
	    	} 	

	@When("user click on logout")
	public void user_click_on_logout() throws InterruptedException {
		  Thread.sleep(3000);

	   lp.logout();
	   System.out.println(driver.getTitle());
	}

	
	@Then("close browser")
	public void close_browser() {
		driver.quit();
	   
	}
	
	
}
