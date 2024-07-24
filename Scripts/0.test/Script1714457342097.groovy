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
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userTester240508FixCrash(0.13.7).apk', true)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Skip'), 0)



//Feature Property
featureProperty = WS.sendRequest(findTestObject('000.Back Button/Get Feature Listing'))

def slurper5 = new groovy.json.JsonSlurper()

def result5 = slurper5.parseText(featureProperty.getResponseBodyContent())

def featurePropertyName = result5[0].property.name

println(featurePropertyName)



//Mobile.scrollToText('Featured')

//Mobile.scrollToText(featurePropertyName)

// Get device screen dimensions

int screenWidth = Mobile.getDeviceWidth()
int screenHeight = Mobile.getDeviceHeight()


// Convert percentage values to pixel values
int startX = (int) (screenWidth * 0.5)    // 50% of screen width
int startY = (int) (screenHeight * 0.5)   // 80% of screen height
int endX = (int) (screenWidth * 0.5)      // 50% of screen width
int endY = (int) (screenHeight * 0.5)     // 20% of screen height

// Perform swipe action
Mobile.swipe(startX, startY, endX, endY)



Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName),
	featurePropertyName)

Mobile.pressBack()


Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - See All'), 0)



Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Featured Property Listing'),
	'Featured Property Listing')

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName),
	featurePropertyName)

Mobile.pressBack()


Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Featured Property Listing'),
	'Featured Property Listing')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Featured'), 'Featured')
