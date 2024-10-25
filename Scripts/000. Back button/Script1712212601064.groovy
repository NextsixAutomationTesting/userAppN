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
import org.openqa.selenium.Point as Point
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import org.openqa.selenium.Dimension as Dimension
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.annotation.Keyword as Keyword
import io.appium.java_client.MobileElement as MobileElement
import io.appium.java_client.touch.WaitOptions as WaitOptions
import java.time.Duration as Duration

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\UserSDK51Tester(0.13.8)V2.apk', true)

//Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userTester240508FixCrash(0.13.7).apk', true)
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Skip'), 0)

'Click Search icon in Quick Search bar'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - (1)'), 0)

WebUI.delay(8)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Rent'), 0)

'Click Search icon in Quick Search bar'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - (1)'), 0)

WebUI.delay(4)

Mobile.pressBack()

'Click Type'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Type'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Any Residential'), 
    0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Property Type'), 0)

Mobile.pressBack()

'Click Price'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Price'), 0)

WebUI.delay(3)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Property Type'), 0)

Mobile.pressBack()

'Click Agent'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Get Agent'), 0)

WebUI.delay(4)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.SeekBar (1)'), 0)

WebUI.delay(5)

'Click Flag Kuchai Lama'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Kuchai Lama1'), 0)

'xxxxx 10/9/24'
WebUI.delay(5)

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\UserSDK51Tester(0.13.8)V2.apk', true)

'new flag 11/9'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Kuchai Lama (1)'), 0)

Mobile.closeApplication()

