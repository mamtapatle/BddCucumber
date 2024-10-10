package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class PageFactoryLoginStepDefinition {
	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory hp;
	
	
	@Given("i am on the login page")
	public void i_am_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	    
	}

	@When("i enter username and password")
	public void i_enter_username_and_password() {
		login=new LoginPageFactory(driver);
		login.enterUsername("visual_user");
		login.enterPassword("secret_sauce");
	    
	}
	@When("i enter {string} and {string}")
	public void i_enter_and(String username, String password) {
		login=new LoginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		login=new LoginPageFactory(driver);
		login.clickLogin();
	}

	@Then("i should be able to see home page")
	public void i_should_be_able_to_see_home_page() {
		hp=new HomePageFactory(driver);
		hp.logoIsDisplayed();
	    
	}
	@When("click on add to cart button")
	public void click_on_add_to_cart_button() {
		hp=new HomePageFactory(driver);
		hp.addToCartMEthod();
	}

	@Then("Item should be added to the cart")
	public void item_should_be_added_to_the_cart() {
		hp=new HomePageFactory(driver);
		hp.BadgeIsDisplayed();
	}

	@And("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}

	



}
