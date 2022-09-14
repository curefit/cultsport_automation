package com.cultsport.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import com.cultsport.utils.Adapters;
import com.cultsport.utils.AppiumActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class HomePage extends AppiumActions {
	public HomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	By buyequipmentButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'BUY \n"
			+ " Equipment' or . = 'BUY \n"
			+ " Equipment') and @resource-id = 'com.app.fitplus:id/tvBannerName']");
	By urlbarTextfield = By.id("com.android.chrome:id/url_bar");
	By cultsportButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'EXPLORE \n"
			+ " cultsport play' or . = 'EXPLORE \n"
			+ " cultsport play') and @resource-id = 'com.app.fitplus:id/tvBannerName']");
	By playstorePage = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'cultsport play' or . = 'cultsport play')]");
	By scenicButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'SCENIC \n"
			+ " Workouts' or . = 'SCENIC \n"
			+ " Workouts') and @resource-id = 'com.app.fitplus:id/tvBannerName']");
	By livesessionPage = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Live Session' or . = 'Live Session')]");
	By calendarButton = By.id("ivChooseDate");
	By monthButton = By.id("tvMonth");
	By monthdropButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Jan' or . = 'Jan') and @resource-id = 'com.app.fitplus:id/tvBottomSheet']");
	By yearButton = By.id("tvYear");
	By dropdownButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = '2020' or . = '2020') and @resource-id = 'com.app.fitplus:id/tvBottomSheet']");
	By dateButton = By.id("tvDobCalendar");
	By doneButton = By.id("btnDone");
	By homeButton = By.id("ivTabHome");
	By dietButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'GET \n"
			+ " Diet Plan' or . = 'GET \n"
			+ " Diet Plan') and @resource-id = 'com.app.fitplus:id/tvBannerName']");
	By logoIcon = By.xpath("//*[@class = 'android.widget.ImageView' and (@text = '' or . = '')]");
	By personaltrainerButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'BOOK \n"
			+ " Personal Training' or . = 'BOOK \n"
			+ " Personal Training') and @resource-id = 'com.app.fitplus:id/tvBannerName']");
	By onlineservicesPage = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Online Services' or . = 'Online Services') and @resource-id = 'com.app.fitplus:id/tvHeader']");
	By consultationButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'CONSULT \n"
			+ " Doctor' or . = 'CONSULT \n"
			+ " Doctor') and @resource-id = 'com.app.fitplus:id/tvBannerName']");
	By doctorconsultationPage = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Doctor Consultation' or . = 'Doctor Consultation') and @resource-id = 'com.app.fitplus:id/tvHeader']");
	//By cancelpopupButton = By.xpath("//*[@class = 'android.widget.Button' and (@text = 'CANCEL' or . = 'CANCEL') and @resource-id = 'android:id/button2']");
	By continuebookingButton = By.xpath("//*[@class = 'android.widget.Button' and (@text = 'CONTINUE BOOKING' or . = 'CONTINUE BOOKING') and @resource-id = 'android:id/button1']");
	By trynowButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Try Now' or . = 'Try Now') and @resource-id = 'com.app.fitplus:id/tvRedirect']");
	//By skipButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Skip' or . = 'Skip') and @resource-id = 'com.app.fitplus:id/tvSkip']");
	By registerforfreeButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Register for Free' or . = 'Register for Free') and @resource-id = 'com.app.fitplus:id/tvRedirect']");
	By experiencenowButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Experience Now!' or . = 'Experience Now!') and @resource-id = 'com.app.fitplus:id/tvRedirect']");
	By getstartedButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Get Started' or . = 'Get Started') and @resource-id = 'com.app.fitplus:id/tvRedirect']");
	By viewallButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'VIEW ALL' or . = 'VIEW ALL')]");
	By bookButton = By.id("textViewJoin");
	By upcomingButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Upcoming' or . = 'Upcoming')]");
	By virtualButton = By.id("ivFitwarzDynamic");
	By treadmillButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Treadmill' or . = 'Treadmill') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
	By spinbikeButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Spin Bike' or . = 'Spin Bike') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
	By crosstrainerButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Cross Trainer' or . = 'Cross Trainer') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
	
    By strengthButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Strength' or . = 'Strength') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
    By hiitButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'HIIT' or . = 'HIIT') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
    By yogaButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Yoga' or . = 'Yoga') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
    By homeworkoutButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Home Workout' or . = 'Home Workout') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
    By dietconsultationButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Diet Consultation' or . = 'Diet Consultation') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
    By talktodoctorButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Talk To A Doctor' or . = 'Talk To A Doctor') and @resource-id = 'com.app.fitplus:id/textViewServiceName']");
    By goalButton = By.id("tvSetDailyGoal");
    By promobuyButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Buy Now' or . = 'Buy Now') and @resource-id = 'com.app.fitplus:id/tvRedirect']");
    By outdoorButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Outdoor' or . = 'Outdoor') and @resource-id = 'com.app.fitplus:id/tvTabActivity']");
    By workoutButton = By.xpath("//*[@class = 'android.view.View' and (@text = '' or . = '')]");
    By dietbottomButton = By.id("tvTabDiet");
    By fitnessButton = By.xpath("tvTabFitness");
    
    


	public HomePage clickBookPersonalTrainer() {
		swipeOrDragFromOneElementToAnother(scenicButton, buyequipmentButton, "SWIPE");
		click(personaltrainerButton, "");
		return new HomePage (driver);

	}	
	
	public HomePage clickScenicButton() {
		click(scenicButton, "");
		return new HomePage (driver);
		
	}
	
	public HomePage clickDietButton() {
		click(dietButton, "");
		return new HomePage (driver);
		
	}
	
	public HomePage clickConsultationButton() {
		swipeOrDragFromOneElementToAnother(dietButton,cultsportButton, "SWIPE");
		click(consultationButton, "");
		return new HomePage (driver);
	
	}
	public HomePage clickBuyEquipment() {		
		click(buyequipmentButton, "");
		return new HomePage (driver);

	}

	public HomePage clickExploreCultSportPlay() {		
		click(cultsportButton, "");
		return new HomePage (driver);

	}
	public MobileElement isCultAppPresenetOnPlayStore() {		
		return isElementPresent(playstorePage);

	}
	
	public String getUrlFromChromeBrowser() {
		return getText(urlbarTextfield);
	
	}
		public HomePage clickTrynowButton() {
			click(trynowButton, "");
			return new HomePage (driver);

	}
		public HomePage clickRegisterforfreeButton() {
			click(registerforfreeButton, "");
			return new HomePage (driver);
			
		}
		public HomePage clickExperiencenowButton() {
			click(experiencenowButton, "");
			return new HomePage (driver);
		
		}
		
		public HomePage clickGetstartedButton() {
			click(getstartedButton, "");
			return new HomePage (driver);
		}
		
		
		public HomePage clickViewallButton() {
			click(viewallButton, "");
			return new HomePage (driver);
			
		}
		
		public HomePage clickBookButton() {
			click(bookButton, "");
			return new HomePage (driver);
			
		}
		public HomePage clickUpcomingButton() {
			click(upcomingButton, "");
			return new HomePage (driver);
			
		}
		public HomePage clickVirtualButton () {		
			click(virtualButton, "");
			return new HomePage (driver);

		}
		public HomePage clickTreadmillButton () {		
			click(treadmillButton, "");
			return new HomePage (driver);
			
		}
		
		public HomePage clickSpinbikeButton () {		
			click(spinbikeButton, "");
			return new HomePage (driver);
			
		}
		
		public HomePage clickCrosstrainerButton () {		
			click(crosstrainerButton, "");
			return new HomePage (driver);
		}
		
		public HomePage clickStrengthButton () {		
			click(strengthButton, "");
			return new HomePage (driver);
		}	
		
		public HomePage clickHiitButton () {		
			click(hiitButton, "");
			return new HomePage (driver);
		}	
		
		public HomePage clickYogaButton () {		
			click(yogaButton, "");
			return new HomePage (driver);
		}
		
		public HomePage clickHomeworkoutButton () {		
			click(homeworkoutButton, "");
			return new HomePage (driver);
			
		}
		
		public HomePage clickDietconsultationButton () {		
			click(dietconsultationButton, "");
			return new HomePage (driver);
			
		}
		

		public HomePage clickTalktodoctorButton () {		
			click(talktodoctorButton, "");
			return new HomePage (driver);
			
		}
		
		public HomePage clickGoalButton () {		
			click(goalButton, "");
			return new HomePage (driver);
			
		}
		

		public HomePage clickPromobuyButton () {		
			click(promobuyButton, "");
			return new HomePage (driver);
			
		}
		
		public HomePage clickOutdoorButton () {		
			click(outdoorButton, "");
			return new HomePage (driver);
		
		}
		
		public HomePage clickWorkoutButton () {		
			click(workoutButton, "");
			return new HomePage (driver);
		
		}
		
		public HomePage clickDietbottomButton() {		
			click(dietbottomButton, "");
			return new HomePage (driver);
		}
		
		public HomePage clickFitnessButton() {		
			click(fitnessButton, "");
			return new HomePage (driver);
			
		}
		
		public HomePage clickHomeButton() {		
			click(homeButton, "");
			return new HomePage (driver);
			
		}
		//public HomePage CancelpopupButton() {		
			//click(cancelpopupButton, "");
			//return new HomePage (driver);
		
		//}

       public HomePage clickcontinuebookingButton () {		
	       click(continuebookingButton, "");
	       return new HomePage (driver);
		
       }
		public MobileElement isLiveSessionPresentonPage() {		
			return isElementPresent(livesessionPage);
	
		}
		public MobileElement isOnlineServicesPresentonPage() {		
			return isElementPresent(onlineservicesPage);
			
		}
		public MobileElement isLogoIconPresentonPage() {		
			return isElementPresent(logoIcon);
		
		}
		//public HomePage skipButton() {		
			//click(skipButton, "");
			//return new HomePage (driver);
		//}
		
		public MobileElement isDoctorDonsultationPresentonPage() {		
			return isElementPresent(doctorconsultationPage);
			
		}
		
		public MobileElement isBannerPresentonPage(By locator){
			MobileElement element =null ;
		for(int i=0;i<4;i++)
			{element =isElementPresent(locator);
			if (element != null) break;
			else
				swipeOrDragByCordinates(new Point(900, 900),new Point(100,900),1,Adapters.SWIPE);
			}
		
			return element;

		}
		public MobileElement isTrynowButtonPresentonBanner() {		
			return isBannerPresentonPage (trynowButton);
			
		}

		public MobileElement isRegisterforfreeButtonPresentonBanner() {		
			return isBannerPresentonPage (registerforfreeButton);
			
		}

		public MobileElement isExperiencenowButtonPresentonBanner() {		
			return isBannerPresentonPage (experiencenowButton);
			
		}
	
		public MobileElement isGetstartedButtonPresentonBanner() {		
			return isBannerPresentonPage (getstartedButton);
			
		}

	
}
