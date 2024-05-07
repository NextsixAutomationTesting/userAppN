package customKeyWords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException




import org.openqa.selenium.Point

import org.openqa.selenium.Dimension
import io.appium.java_client.TouchAction
import io.appium.java_client.touch.offset.PointOption

import io.appium.java_client.MobileElement


import io.appium.java_client.touch.WaitOptions
import java.time.Duration



public class CustomKeywords {
	@Keyword
	public static void swipeUpToObject(TestObject toObject, int duration) {
		MobileElement element = MobileBuiltInKeywords.findMobileElement(toObject, 10)
		Dimension size = MobileDriverFactory.getDriver().manage().window().getSize()
		int startX = size.getWidth() / 2
		int startY = size.getHeight() * 3 / 4
		int endX = startX
		int endY = size.getHeight() / 4
		
		WebElement element1 = MobileBuiltInKeywords.findWebElement(toObject)
		Point location = element1.getLocation()
		int objectCenterX = location.getX() + (element1.getSize().getWidth() / 2)
		int objectCenterY = location.getY() + (element1.getSize().getHeight() / 2)

		TouchAction action = new TouchAction(MobileDriverFactory.getDriver())
		action.press(PointOption.point(startX, startY))
			  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
			  .moveTo(PointOption.point(objectCenterX, objectCenterY))
			  .release()
			  .perform()
	}
}