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

import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userTester240503FixCrash(0.13.7).apk', true)

Mobile.tap(findTestObject('Object Repository/0.test/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/0.test/android.widget.TextView - Skip'), 0)

//Mobile.scrollToText('Latest For Rent')
WebUI.delay(5)



// Get the AppiumDriver instance
AppiumDriver driver = MobileDriverFactory.getDriver()


// Get the size of the device screen
def size = driver.manage().window().getSize()

// Define the percentage of the screen for starting and ending points
def startYPercentage = 0.9 // 70% from the top
def endYPercentage = 0.1   // 30% from the top

// Calculate the starting and ending coordinates based on screen size
def startX = size.width / 2
def startY = (int) (size.height * startYPercentage)
def endX = size.width / 2
def endY = (int) (size.height * endYPercentage)

// Perform the swipe action
Mobile.swipe(startX as int, startY as int, endX as int, endY as int)


Mobile.getText(findTestObject('Object Repository/0.test/android.widget.TextView - Latest For Rent'), 0)


