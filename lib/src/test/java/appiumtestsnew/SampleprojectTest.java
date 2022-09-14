package appiumtestsnew;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cultsport.pages.HomePage;
import com.cultsport.pages.LoginPage;

import io.appium.java_client.MobileElement;

public class SampleprojectTest extends BaseTest {

	@Test
	public void testmethod() {
		new LoginPage(driver).skipTour().performLogin("cultsporttest@gmail.com", "Vikash@123");
	}

	@Test
	public void signupTest() {
		new LoginPage(driver).skipTour().clickOnSignup().performSignup("Vikash", "Pandey", "9036700703",
				"Vik.pan89@gmail.com", "Vikash@123");
	}

	@Test
	public void signinWithOtpTest() {
		new LoginPage(driver).skipTour().performLoginkWithOTP("7406469137");
	}

	@Test
	public void createprofilePage() {
		new LoginPage(driver).skipTour().clickOnSignup()
				.performSignup("Vikash", "Pandey", "9113495031", "Cultsportautomation@gmail.com", "Vikash@123")
				.createProfile("01071992", "male", "05", "08", "67", "Bengaluru");
	}

	@Test
	public void validateHomePageFeatures() {
		HomePage homePage = new LoginPage(driver).skipTour().performLogin("cultsporttest@gmail.com", "Vikash@123");

		String curerntUrl = homePage.clickBuyEquipment().getUrlFromChromeBrowser();
		Assert.assertEquals(curerntUrl, "cultsport.com");
		homePage.clickDeviceBackButton();

		MobileElement element = homePage.clickExploreCultSportPlay().isCultAppPresenetOnPlayStore();
		Assert.assertTrue(element != null);
		homePage.clickDeviceBackButton();

		homePage.clickScenicButton();
		element = homePage.isLiveSessionPresentonPage();
		Assert.assertTrue(element != null);
		homePage.clickHomeButton();

		homePage.clickBookPersonalTrainer();
		element = homePage.isOnlineServicesPresentonPage();
		Assert.assertTrue(element != null);
		homePage.clickDeviceBackButton();

		homePage.clickDietButton();
		element = homePage.isLogoIconPresentonPage();
		Assert.assertTrue(element != null);
		homePage.clickHomeButton();
		
		homePage.clickConsultationButton().clickcontinuebookingButton();
		element = homePage.isDoctorDonsultationPresentonPage();
		Assert.assertTrue(element != null);
		homePage.clickDeviceBackButton();

	
		element =homePage.clickHomeButton().isTrynowButtonPresentonBanner();
		if(element != null) {
			homePage.clickTrynowButton();
			element = homePage.isLiveSessionPresentonPage();
			Assert.assertTrue(element != null);	
		}
		
		element =homePage.clickHomeButton().isGetstartedButtonPresentonBanner();
		if(element != null) {
			homePage.clickGetstartedButton();
			element = homePage.isLiveSessionPresentonPage();
			Assert.assertTrue(element != null);	
		}
		
		element =homePage.clickHomeButton().isExperiencenowButtonPresentonBanner();
		if(element != null) {
			homePage.clickGetstartedButton();
			element = homePage.isCultAppPresenetOnPlayStore();
			Assert.assertTrue(element != null);	
		}
		         
		homePage.clickHomeButton().clickViewallButton().clickBookButton().clickUpcomingButton().clickVirtualButton()
				.clickTreadmillButton().clickSpinbikeButton().clickCrosstrainerButton().clickStrengthButton()
				.clickHiitButton().clickYogaButton().clickHomeworkoutButton().clickDietconsultationButton()
				.clickTalktodoctorButton().clickGoalButton().clickPromobuyButton().clickOutdoorButton()
				.clickWorkoutButton().clickDietbottomButton().clickFitnessButton();

	}

}
