//package utility;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BaseClass {
//
//	
//	public static WebDriver driver;
//	public static Properties prop;
//	
//	@Before
//	public static void LaunchBrowser()
//	{
//	prop= new Properties();
//	File file= new File(System.getProperty("user.dir")+"\\resources\\config.properties");	
//	try
//	{
//	FileInputStream fis = new FileInputStream(file);
//	prop.load(fis);
//	}
//	catch (Exception e) 
//	{
//	e.printStackTrace();
//	}
//
//	String getBrowser= prop.getProperty("Browser");
//	String getUrl= prop.getProperty("Url");
//
//	if(getBrowser.contains("chrome"))
//	{
//		WebDriverManager.chromedriver().setup();
//	driver= new ChromeDriver();
//	driver.get(getUrl);
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	else
//	{
//	driver= new EdgeDriver();
//	driver.get(getUrl);
//	driver.manage().window().maximize();	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	}
//	
//	
//	@After
//	public void tearDown1() throws Exception
//	{
//		driver.quit();
//	}
//
//}
