
package com.cultsport.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.collections.Lists;

import com.cultsport.utils.Adapters.WaitTime;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.screenrecording.CanRecordScreen;


public class AppiumUtilities {

	private WebDriverWait wait;
	private AppiumDriver<MobileElement> driver;
	private String recordScreen = "";

	public AppiumUtilities(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 10);
	}

	public MobileElement isElementPresent(By by) {

		MobileElement mobileElement = null;
		int attempt = 5;
		while (mobileElement == null && attempt > 0) {
			try {
				mobileElement = driver.findElement(by);
			} catch (Exception e) {
				CommonUtilities.wait(WaitTime.TWO_SEC);
				attempt--;
			}
		}
		return mobileElement;
	}

	public boolean isElementDisplayed(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public MobileElement findElement(By by) {
		try {
			MobileElement mobileElement = isElementPresent(by);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			mobileElement.isDisplayed();
			CommonUtilities.wait(WaitTime.FIVE100_MILISEC);
			return mobileElement;
		} catch (Exception e) {
			Assert.fail("Failed to locate Element by locator - " + by + " <br>" + e.getMessage());
		}
		return null;
	}

	public Alert switchToAlert() {
		wait.until(ExpectedConditions.alertIsPresent());
		return driver.switchTo().alert();
	}

	public boolean isAlertPresent() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Point generateSwipeEndCordinates(Point value, String direction, int pixelsToSwipe) {

		int endX = value.x;
		int endY = value.y;
		switch (direction) {
		case Adapters.SWIPE_DOWN:
			endY = value.y + pixelsToSwipe;
			break;
		case Adapters.SWIPE_UP:
			endY = value.y - pixelsToSwipe;
			break;
		case Adapters.SWIPE_RIGHT:
			endX = value.x + pixelsToSwipe;
			break;
		case Adapters.SWIPE_LEFT:
			endX = value.x - pixelsToSwipe;
			break;
		}
		return new Point(endX, endY);
	}

	public String captureScreenshot() {
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		String filename = "screenshot_" + System.currentTimeMillis();
		File filePath = new File(Adapters.SCREENSHOT_FILE_PATH + filename + ".jpg");
		try {
			FileUtils.copyFile(srcFile, filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath.toString();
	}

	public TouchAction<?> touchAction() {
		return new TouchAction<>(driver);
	}

	public List<MobileElement> findElements(By by) {
		List<MobileElement> mobileElements = new ArrayList<>();
		;
		int attempt = 5;
		while (mobileElements.size() == 0 && attempt > 0) {
			try {
				mobileElements = driver.findElements(by);
				if (mobileElements.size() == 0) {
					CommonUtilities.wait(WaitTime.ONE_SEC);
					attempt--;
				}
			} catch (Exception e) {
				CommonUtilities.wait(WaitTime.ONE_SEC);
				attempt--;
			}
		}
		if (mobileElements.size() == 0) {
			Assert.fail("Failed to locate Elements by locator - " + by);
		}
		return mobileElements;
	}

	public void startScreenRecording() {
		if (recordScreen.equalsIgnoreCase("true"))
			((CanRecordScreen) driver).startRecordingScreen(
					new AndroidStartScreenRecordingOptions().withTimeLimit(Duration.ofSeconds(1800)));
	}

	public void stopScreenRecording() {
		if (recordScreen.equalsIgnoreCase("true"))

			((CanRecordScreen) driver).stopRecordingScreen();
	}

	public String stopAndSaveScreenRecording() {
		if (recordScreen.equalsIgnoreCase("true")) {
			String video = ((CanRecordScreen) driver).stopRecordingScreen();
			byte[] decode = Base64.getDecoder().decode(video);
			try {
				String filePath = Adapters.SCREENRECORD_FILE_PATH + "screenrecord_" + System.currentTimeMillis()
						+ ".mp4";
				FileUtils.writeByteArrayToFile(new File(filePath), decode);
				return filePath;
			} catch (IOException e) {
				Assert.fail(e.getMessage());
			}
		}
		return null;
	}

	public String captureLogCatLogs() {
		List<LogEntry> adbLogs = driver.manage().logs().get("logcat").getAll();
		try {
			String filePath = Adapters.LOGCAT_FILE_PATH + "logcat_" + System.currentTimeMillis() + ".log";
			FileUtils.writeLines(new File(filePath), adbLogs, false);
			return filePath;
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
		return null;
	}

	public void deleteFileFromDevice(String filePath) {
		//Log.startLog("Deleting file from device");
		Map<String, Object> args = new HashMap<>();
		args.put("command", "rm");
		args.put("args", Lists.newArrayList(filePath));
		driver.executeScript("mobile: shell", args);
		//Log.info("Deleted file - " + filePath);
	}

	public MobileElement getEmelentByText(String uiName) {
		CommonUtilities.wait(WaitTime.FIVE100_MILISEC);
		List<MobileElement> elements = findElements(By.className("android.widget.TextView"));
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equals(uiName)) {
				return elements.get(i);
			}
		}
		return null;
	}

	public Boolean isKeyBoardOpen() {
		return ((AndroidDriver<MobileElement>) driver).isKeyboardShown();

	}
}
