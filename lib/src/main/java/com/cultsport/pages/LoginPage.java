package com.cultsport.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import com.cultsport.utils.Adapters;
import com.cultsport.utils.AppiumActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class LoginPage extends AppiumActions {
	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);

	
}
By emailTextfield = By.id("etEmailPhone");
By passwordTextfield = By.id("etPassword");
By signinButton =  By.id("btnSignIn");
By skipButton =    By.id("tvSkip");
By forgotButton =  By.id("tvForgotPassword");
By signinOTPlink = By.id("tvSignInWithOtp");
By mobileTextfield = By.id("edtPhoneNumber");
By sendOtpButton = By.id ("btnSendOtp");
By signuplink =    By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Sign Up' or . = 'Sign Up')]");

public HomePage performLogin (String emailPhone, String password) {
	enterText(emailTextfield, emailPhone, "");
	enterText(passwordTextfield, password, "");
	click( signinButton, "");
	
	return new HomePage(driver);
	

}
public LoginPage skipTour(){
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	swipeOrDragByCordinates(new Point(900, 900),new Point(100,900),1,Adapters.SWIPE);
	click(skipButton, "");
	return new LoginPage(driver);	
}
public LoginPage clickForgotLink(){
	click(forgotButton, "");	
	return new LoginPage(driver);
}
public LoginPage performLoginkWithOTP(String mobileNumber) {
	click(signinOTPlink, "");
	enterText(mobileTextfield, mobileNumber, "");
	click( sendOtpButton, "");
	return new LoginPage(driver);
	
	}
public SignupPage clickOnSignup() {
	click(signuplink, "");
	return new SignupPage(driver);
}                                         
}