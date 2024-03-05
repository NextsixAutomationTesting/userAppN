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

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Profile (1)'), 0)

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Sign In with Phone Number (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText - 60 Phone Number (1)'), 
    '178454122', 0)

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Submit (1)'), 30)

getOTP = WS.sendRequest(findTestObject('2. Login Phone Number/get otp'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(getOTP.getResponseBodyContent())

def otp = result.documents[0].code

// Assuming otp is a 6-digit number
def otpString = otp.toString()

// Separate each digit into variables
def digit1 = (otpString[0]).toInteger()

def digit2 = (otpString[1]).toInteger()

def digit3 = (otpString[2]).toInteger()

def digit4 = (otpString[3]).toInteger()

def digit5 = (otpString[4]).toInteger()

def digit6 = (otpString[5]).toInteger()

// Print the separated digits
println("Digit 1: $digit1")

println("Digit 2: $digit2")

println("Digit 3: $digit3")

println("Digit 4: $digit4")

println("Digit 5: $digit5")

println("Digit 6: $digit6")

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText (16)'), 0)

Mobile.setText(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText (10)'), digit1.toString(), 0)

Mobile.setText(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText (11)'), digit2.toString(), 
    0)

Mobile.setText(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText (12)'), digit3.toString(), 
    0)

Mobile.setText(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText (13)'), digit4.toString(), 
    0)

Mobile.setText(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText (14)'), digit5.toString(), 
    0)

Mobile.setText(findTestObject('Object Repository/2. Login Phone Number/android.widget.EditText (15)'), digit6.toString(), 
    0)

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Submit (3)'), 0)

WebUI.delay(10)

//Mobile.tap(findTestObject(''), 0)
Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Profile (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Hazim Harith'), 
    0)

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.ImageView'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('Object Repository/2. Login Phone Number/android.widget.TextView - Profile (1)'), 0)

Mobile.verifyElementExist(findTestObject('2. Login Phone Number/android.widget.TextView - Sign In with Phone Number (2)'), 
    0)

Mobile.closeApplication()

