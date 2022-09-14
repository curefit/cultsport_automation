
package com.cultsport.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.cultsport.utils.Adapters.WaitTime;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumActions extends AppiumUtilities {

	protected AppiumDriver<MobileElement> driver;

	public AppiumActions(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	public void click(By by, String messageToLogs) {
		findElement(by).click();
		//Logs.clicked(messageToLogs, by);
	}

	public void click(MobileElement elem, String messageToLogs) {
		elem.click();
		//Logs.clicked(messageToLogs);
	}

	public void enterText(By by, String textToEnter, String messageToLogs) {
		findElement(by).sendKeys(textToEnter);
		//Logs.enterText(messageToLogs, textToEnter, by);
	}

	public void click(Point cordinates, String messageToLogs) {
		tapOnCordinates(cordinates);
		//Logs.clicked(messageToLogs, cordinates);
	}

	public String getText(By by) {
		return findElement(by).getText();
	}

	public void acceptAlert() {
		switchToAlert().accept();
	}

	public void launchApp() {
		driver.launchApp();
	}

	public void minimiseApp(WaitTime timeInSec) {
		//Logs.action("Minimized App in background for " + timeInSec + " Seconds");
		driver.runAppInBackground(Duration.ofMillis(timeInSec.getDuration()));
	}

	public void dragTimeline(By by, String swipeDirection, int noOfSwipes) {
		Point endCordinates = generateSwipeEndCordinates(getCordinates(by), swipeDirection, 500);
		swipeOrDragByCordinates(getCordinates(by), endCordinates, noOfSwipes, Adapters.SWIPE);
	}

	public void swipeOrDragFromOneElementToAnother(By fromElement, By toElement, String swipeOrDrag) {
		Point startCordinates = getCenterCordinatesOfElement(fromElement);
		Point endCordinates = getCenterCordinatesOfElement(toElement);
		swipeOrDragByCordinates(startCordinates, endCordinates, 1, swipeOrDrag);

	}

	public Point getCenterCordinatesOfElement(By element) {
		Point startCordinates = getCordinates(element);
		Dimension startDim = getSize(element);
		return new Point(startCordinates.getX() + startDim.getWidth() / 2,
				startCordinates.getY() + startDim.getHeight() / 2);
	}

	public Point getCenterCordinatesOfElement(MobileElement element) {
		Point startCordinates = element.getLocation();
		Dimension startDim = element.getSize();
		return new Point(startCordinates.getX() + startDim.getWidth() / 2,
				startCordinates.getY() + startDim.getHeight() / 2);
	}

	public void swipeOrDragByCordinates(Point from, Point to, int noOfSwipes, String swipeOrDrag) {
		for (int i = 1; i <= noOfSwipes; i++) {
			//Logs.action(swipeOrDrag + " Cordinates - from " + from + " to " + to);
			switch (swipeOrDrag) {
			case Adapters.SWIPE:
				touchAction().press(PointOption.point(from.getX(), from.getY()))
						.waitAction(new WaitOptions().withDuration(Duration.ofMillis(WaitTime.FIVE_SEC.getDuration())))
						.moveTo(PointOption.point(to.getX(), to.getY())).release().perform();
				break;
			case Adapters.DRAG:
			case Adapters.LONGPRESS_SWIPE:
				touchAction().longPress(PointOption.point(from.getX(), from.getY()))
						.moveTo(PointOption.point(to.getX(), to.getY())).release().perform();
				break;
			}
		}
	}

	public void tapOn(By locator) {
		Point cordinates = getCordinates(locator);
		tapOnCordinates(cordinates);
	}

	public void tapOnCordinates(Point cordinates) {
		touchAction().tap(PointOption.point(cordinates.getX(), cordinates.getY())).perform();
	}

	public Point getCordinates(By locator) {
		return findElement(locator).getLocation();
	}

	public Dimension getSize(By locator) {
		return findElement(locator).getSize();
	}

	public void clickDeviceBackButton() {
		CommonUtilities.wait(WaitTime.FIVE100_MILISEC);
		driver.navigate().back();
		//Logs.clicked("Device Back Button");

	}

	public String captureToastMsg() {
		String source = driver.getPageSource();
		if (source.contains("android.widget.Toast")) {
			return source.split("android.widget.Toast\" text=\"")[1].split("\"")[0];
		}
		return "";
	}

	public String[] getDataFromNotification() {
		//Logs.start//Logs("Fetching data from Notification");
		((AndroidDriver<?>) driver).openNotifications();
		CommonUtilities.wait(WaitTime.ONE_SEC);
		List<MobileElement> elements = findElements(By.className("android.widget.TextView"));
		String[] data = new String[2];
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().toLowerCase().contains("montagepro")) {
				data[0] = elements.get(i + 3).getText();
				data[1] = elements.get(i + 4).getText();
				//Logs.info("Notification data - " + data);
				clickDeviceBackButton();
				return data;
			}
		}
		//Logs.info("Notification data Not Found");
		clickDeviceBackButton();
		return null;
	}

	public String[] getDataFromNotificationPocketFm() {
		//Logs.start//Logs("Fetching data from Notification");
		((AndroidDriver<?>) driver).openNotifications();
		CommonUtilities.wait(WaitTime.ONE_SEC);
		List<MobileElement> elements = findElements(By.className("android.widget.TextView"));
		String[] data = new String[2];
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
			if (elements.get(i).getText().contains("POCKFM")) {
				data[0] = elements.get(i + 3).getText();
				data[1] = elements.get(i + 4).getText();
				//Logs.info("Notification data - " + data);
				clickDeviceBackButton();
				return data;
			}
		}
		//Logs.info("Notification data Not Found");
		clickDeviceBackButton();
		return null;
	}
}
