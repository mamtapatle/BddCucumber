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
//
//public class LoginStepDefinition {
//	static WebDriver driver;
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
//		driver.findElement(By.id("user-name")).sendKeys("mamta");
//		driver.findElement(By.id("password")).sendKeys("Patle");
//	    
//	}
//	@When("i enter {string} and {string}")
//	public void i_enter_and(String username, String password) {
//		driver.findElement(By.id("user-name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() {
//	    driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("i should be able to see home page")
//	public void i_should_be_able_to_see_home_page() {
//		String Actual = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
//		String Expected="Swag Labs";
//		Assert.assertEquals(Actual, Expected);
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
