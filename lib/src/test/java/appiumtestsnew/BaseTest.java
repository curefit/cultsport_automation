package appiumtestsnew;

//import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;

public class BaseTest {
	
	public AppiumDriver driver;
	
	

	@BeforeTest
public void createdriver () throws Exception {
	
	try {
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "vivo 1917");
	cap.setCapability("udid", "be4f4279");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformversion", "11");
	
	cap.setCapability("appPackage", "com.app.fitplus");
	cap.setCapability("appActivity", "com.app.fitplus.ui.splash.SplashActivity");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AppiumDriver(url, cap);
	
	System.out.println("Application Started...");
	

		
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	
}
}
