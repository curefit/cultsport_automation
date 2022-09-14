package com.cultsport.pages;

import org.openqa.selenium.By;

import com.cultsport.utils.AppiumActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


	
	public class SignupPage extends AppiumActions {
		public SignupPage(AppiumDriver<MobileElement> driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		By fisrtnameTextfield = By.id("etFirstName");
		By lastnameTextfield = By.id("etLastName");
		By mobileTextfield = By.id("etPhoneNumber");
		By emailTextfield = By.id("etEmail");
		By passwordTextfield = By.id("etPassword");
		By confirmTextfield = By.id("etConPassword");
		By continueButton= By.id("btnContinue");
		
		public CreateprofilePage performSignup (String firstName, String lastName, String mobileNumber, String email, String password) {
			enterText(fisrtnameTextfield, firstName, "");
			enterText(lastnameTextfield,lastName , "");
			enterText(mobileTextfield,mobileNumber, "");
			enterText(emailTextfield, email, "");
			enterText(passwordTextfield,password , "");
			enterText(confirmTextfield,password , "");
			click( continueButton, "");
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new CreateprofilePage(driver);
}

	
		
	}
