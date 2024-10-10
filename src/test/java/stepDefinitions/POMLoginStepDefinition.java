//package stepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pageObjects.LoginPageObjects;
//
//public class POMLoginStepDefinition {
//	static WebDriver driver;
//	LoginPageObjects lp;
//	
////	public void setup()
////	{
////		lp=new LoginPageObjects(driver);
////	}
//	
//	
//	@Given("i am on the login page")
//	public void i_am_on_the_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/");
//	    
//	}
//
//	@When("i enter username and password")
//	public void i_enter_username_and_password() {
//		lp=new LoginPageObjects(driver);
//		lp.userLogin("visual_user", "secret_sauce");
//	    
//	}
//	@When("i enter {string} and {string}")
//	public void i_enter_and(String username, String password) {
//		lp=new LoginPageObjects(driver);
//		lp.enterUsername(username);
//		lp.enterPassword(password);
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() {
//		lp=new LoginPageObjects(driver);
//		lp.pressLoginBtn();
//	}
//
//	@Then("i should be able to see home page")
//	public void i_should_be_able_to_see_home_page() {
//		lp=new LoginPageObjects(driver);
//		lp.logoIsDisplayed();
//		
//	    
//	}
//
//	@And("close the browser")
//	public void close_the_browser() {
//	    driver.quit();
//	}
//
//	
//
//
//
//}
