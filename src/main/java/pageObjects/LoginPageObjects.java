package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

	WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txt_username=By.id("user-name");
	By txt_password=By.id("password");
	By loginBtn=By.id("login-button");
	By logo=By.xpath("//div[@class='app_logo']");
	
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void pressLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}
	
	public void userLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void logoIsDisplayed()
	{
		driver.findElement(logo).isDisplayed();
	}
}
