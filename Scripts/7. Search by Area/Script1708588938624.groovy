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

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Skip'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Get Agent (1)'), 0)


//Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.RelativeLayout'), 0)

WebUI.delay(10)


//simpang ampat
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (1)'), 'simpang ampat', 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Simpang Ampat - AreaState'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - grunch'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - fixan'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Mat Ropi'), 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView -'), 0)


//johor bahru
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (1)'), 'johor bahru', 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Johor Bahru - AreaState'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - toro'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - youvie'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - mam nick'), 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView -'), 0)


//kuchai lama
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (1)'), 'kuchai lama', 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Kuchai Lama - AreaState'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - lim salak 1'), 'lim salak 1')

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - lisa lee'), 0)

Mobile.verifyElementExist(findTestObject(''), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - kicker'), 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView -'), 0)



//kuching
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (3)'), 'kuching', 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Kuching - AreaState'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - mariael'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - haman'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - sony'), 0)

Mobile.closeApplication()


