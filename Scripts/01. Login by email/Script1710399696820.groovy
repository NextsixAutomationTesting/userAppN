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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\USER(ANDROID)v2.apk', true)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Profile (1)'), 0)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/01. Login by email/android.widget.EditText - Email'), 'myson@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/01. Login by email/android.widget.EditText - Password'), '1', 0)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Sign In (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Myson'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/01. Login by email/android.widget.TextView - mysongmail.com'), 
    0)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Profile'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/01. Login by email/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Profile (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/01. Login by email/android.widget.TextView - Sign In (2)'), 0)

Mobile.closeApplication()


