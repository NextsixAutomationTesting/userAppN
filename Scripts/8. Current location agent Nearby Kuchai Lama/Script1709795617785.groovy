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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userMapTesterV1.apk', true)

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userMapTesterV1.apk', true)

Mobile.tap(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - Get Agent'), 
    0)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - Alastair'), 
    0)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - lim salak 1'), 
    0)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - Hazim Nickto'), 
    0)

Mobile.swipe(1, 1, 1, 1)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - kicker'), 
    0)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - lim salak'), 
    0)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - lim kuchai 3'), 
    0)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - ralph'), 
    0)

Mobile.getText(findTestObject('Object Repository/8. Current location agent Nearby Kuchai Lama/android.widget.TextView - lisa lee'), 
    0)

Mobile.closeApplication()

