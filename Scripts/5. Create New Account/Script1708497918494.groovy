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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\easUpdateTesterUserV1.apk', true)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Create Account'), 0)

randomName = WS.sendRequest(findTestObject('5. Create New Account/random name'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(randomName.getResponseBodyContent())

def name = result.address.Full_Name

def email = result.address.Temporary_mail

def telephone = result.address.Telephone

String newTelephone = telephone.replaceAll('\\+60|\\s', '')

String otpTelephone = telephone.replaceAll('\\+|\\s', '')

println(name)

println(email)

println(newTelephone)

println(otpTelephone)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText - Name'), name, 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText - Email'), email, 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText - Mobile Number'), newTelephone, 
    0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText - Password'), '1', 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText - Confirm Password'), '1', 
    0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Sign Up'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Submit'), 0)

getOTP = WS.sendRequest(findTestObject('5. Create New Account/getOTP', [('otp') : otpTelephone]))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(getOTP.getResponseBodyContent())

def otp = result1.documents[0].code

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

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText'), "$digit1", 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText (7)'), "$digit2", 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText (2)'), "$digit3", 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText (3)'), "$digit4", 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText (4)'), "$digit5", 0)

Mobile.setText(findTestObject('Object Repository/5. Create New Account/android.widget.EditText (5)'), "$digit6", 0)


Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Submit (1)'), 0)

Mobile.getText(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Your phone number has been verified'), 
    0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Wilayah Persekutuan Kuala Lumpur'), 
    0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Terengganu'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Wilayah Persekutuan Putrajaya'), 
    0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - AparmentFlat'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - ShopOfficeRetail Space'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Agricultural Land'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - Submit (2)'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.ImageView'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/5. Create New Account/android.widget.TextView - grimgmail.com'), 0)

Mobile.tap(findTestObject('Object Repository/5. Create New Account/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject(''), 0)

Mobile.closeApplication()

