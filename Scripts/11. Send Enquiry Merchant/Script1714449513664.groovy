import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import io.appium.java_client.TouchAction
import io.appium.java_client.android.AndroidDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver



Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userTester240508FixCrash(0.13.7).apk', true)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.EditText - Email'), 'myson@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.EditText - Password'), '1', 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Sign In (1)'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Home12'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Home Pro'), 0)

WebUI.delay(10)

Mobile.scrollToText('Company Name')

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Company Name'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Enquire Now'), 0)


Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Property Type'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Flat'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Size'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - 1000-2000sqft'), 0)

Mobile.setText(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.EditText - Address'), '123', 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - State'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Wilayah Persekutuan Kuala Lumpur'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Area'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Ampang Hilir'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Budget'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - 50,000-100,000'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.EditText - Any'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Entire house'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Select'), 0)

WebUI.delay(10)

// Get the AppiumDriver instance
AppiumDriver driver = MobileDriverFactory.getDriver()


// Get the size of the device screen
def size = driver.manage().window().getSize()

// Define the percentage of the screen for starting and ending points
def startYPercentage = 0.7 // 70% from the top
def endYPercentage = 0.3   // 30% from the top

// Calculate the starting and ending coordinates based on screen size
def startX = size.width / 2
def startY = (int) (size.height * startYPercentage)
def endX = size.width / 2
def endY = (int) (size.height * endYPercentage)

// Perform the swipe action
Mobile.swipe(startX as int, startY as int, endX as int, endY as int)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.EditText - Any (1)'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Bedrooms'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Select (1)'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.EditText - Any (2)'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Traditional'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Select (1)'), 0)

Mobile.tap(findTestObject('Object Repository/11. Send Enquiry Merchant/android.widget.TextView - Submit'), 0)

WebUI.delay(10)

Mobile.closeApplication()

