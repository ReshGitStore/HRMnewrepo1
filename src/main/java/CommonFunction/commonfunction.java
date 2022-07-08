package CommonFunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class commonfunction {
	
	
	public static Properties properties = null;
	public static WebDriver driver;
	
	public Properties loadpropertyfile() throws IOException {
		
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	
		
	@BeforeSuite
	public void launchbrowser() throws IOException {
		loadpropertyfile();
		String Browser = properties.getProperty("Browser");
		String Url= properties.getProperty("Url");
		String Driverlocation= properties.getProperty("Driverlocation");
		
		if (Browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",Driverlocation);
			driver=new ChromeDriver();
			
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Driverlocation );
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(Url);
		
		

			
		}
	
	}




