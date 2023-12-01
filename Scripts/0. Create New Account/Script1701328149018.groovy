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

Mobile.getText(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Join Now'), 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText - Name'), 'lmao', 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText - Email'), 'lmao@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText - Mobile Number'), '145654323', 
    0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText - Password'), '1', 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText - Confirm Password'), '1', 
    0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Sign Up'), 0)

Mobile.getText(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Please key in your phone number for verification'), 
    0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Submit'), 0)

Mobile.getText(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Input the 6 digit code that we sent to your mobile number ending with (4323)'), 
    0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText'), '2', 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText (1)'), '8', 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText (2)'), '5', 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText (3)'), '3', 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText (4)'), '7', 0)

Mobile.setText(findTestObject('Object Repository/0. Create New Account/android.widget.EditText (5)'), '5', 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Submit (1)'), 0)

Mobile.getText(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Your phone number has been verified'), 
    0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Wilayah Persekutuan Kuala Lumpur'), 
    0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Negeri Sembilan'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Terengganu'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - AparmentFlat'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - HotelResort'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Agricultural Land'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - What is Your Budget'), 
    0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - Submit (2)'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.ImageView'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/0. Create New Account/android.widget.TextView - lmaogmail.com'), 0)

Mobile.tap(findTestObject('Object Repository/0. Create New Account/android.widget.ImageView (1)'), 0)

Mobile.closeApplication()

