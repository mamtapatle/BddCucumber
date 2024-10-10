package pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement logo;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement AddToCart;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement cartBadge;
	
	
	public HomePageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logoIsDisplayed()
	{
		logo.isDisplayed();
	}
	public void BadgeIsDisplayed()
	{
		cartBadge.isDisplayed();
	}
	public void addToCartMEthod()
	{
		AddToCart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
