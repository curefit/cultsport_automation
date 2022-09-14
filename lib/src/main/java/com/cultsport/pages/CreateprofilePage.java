package com.cultsport.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import com.cultsport.utils.Adapters;
import com.cultsport.utils.AppiumActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CreateprofilePage extends AppiumActions {
	public CreateprofilePage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	By profileButton = By.id("ivProfile");
	By cameraButton = By
			.xpath("//*[@class = 'android.widget.TextView' and (@text = 'From Camera' or . = 'From Camera')]");
	By popupButton = By.xpath(
			"//*[@class = 'android.widget.Button' and (@text = 'WHILE USING THE APP' or . = 'WHILE USING THE APP') and @resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']");
	By allowButton = By.xpath(
			"//*[@class = 'android.widget.Button' and (@text = 'ALLOW' or . = 'ALLOW') and @resource-id = 'com.android.permissioncontroller:id/permission_allow_button']");
	By photoButton = By.xpath(
			"//*[@class = 'android.widget.ImageView' and @resource-id = 'com.android.camera:id/shutter_button' and (@text = '' or . = '')]");
	By okButton = By.xpath(
			"//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'com.android.camera:id/done_button']");
	By galleryButton = By
			.xpath("//*[@class = 'android.widget.TextView' and (@text = 'From Gallery' or . = 'From Gallery')]");
	By albumButton = By.xpath("//*[@class = 'android.widget.ImageView' and @resource-id = 'vivo:id/icon' and (@text = '' or . = '')]");

	By cancelButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Cancel' or . = 'Cancel')]");
	By dateofbirthTextfield = By.id("tvDob");
	By monthButton = By.id("tvMonth");
	By monthdropButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Jan' or . = 'Jan') and @resource-id = 'com.app.fitplus:id/tvBottomSheet']");
	By yearButton = By.id("tvYear");
	By dropdownButton = By.xpath("//*[@class = 'android.widget.TextView' and (@text = '2012' or . = '2012') and @resource-id = 'com.app.fitplus:id/tvBottomSheet']");
	By dateButton = By.id("tvDobCalendar");
	By doneButton = By.id("btnDone");
	By genderMaleButton = By.id("tvGenderMale");
	By heightfeetTextfield = By.id("edtHeightFeet");
	By heightinchTextfield = By.id("edtHeightInch");
	By weightTextfield = By.id("edtWeight");
	By cityTextfield = By.id("edtCity");
	By nextButton = By.id("btnNext");

	public CreateprofilePage createProfile(String dateofBirth, String gender, String heightfeet, String heightinch,
			String weight, String city) {
		click(profileButton, "");
		click(cameraButton, "");
		click(popupButton, "");
		click(allowButton, "");
		click(photoButton, "");
		click(okButton, "");
		click(profileButton, "");
		click(galleryButton, "");
		click(albumButton, "");
		click(new Point(120, 350), "");
		click(new Point(150, 400), "");
		click(dateofbirthTextfield, "");
		click(monthButton, "");
		click(monthdropButton, "");
		click(yearButton, "");
		click(dropdownButton,"");
		click(dateButton, "");
		click(doneButton, "");
		switch (gender) {
		case "male":
			click(genderMaleButton, "");
			break;
		case "female":
			click(genderMaleButton, "");
			break;
		case "other":
			click(genderMaleButton, "");
			break;
		}
		enterText(heightfeetTextfield, heightfeet, "");
		enterText(heightinchTextfield, heightinch, "");
		enterText(weightTextfield, weight, "");
		enterText(cityTextfield, city, "");
		click(nextButton, "");

		return new CreateprofilePage(driver);
	}
}
