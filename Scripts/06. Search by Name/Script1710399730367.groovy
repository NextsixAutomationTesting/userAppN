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

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - Get Agent'), 0)

Mobile.setText(findTestObject('Object Repository/06. Search by Name/android.widget.EditText - Search agent here'), 'bio', 
    0)

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - Bio'), 0)

Mobile.getText(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - Bio (1)'), 0)

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.widget.TextView -'), 0)

Mobile.clearText(findTestObject('Object Repository/06. Search by Name/android.widget.EditText - bio'), 0)

Mobile.setText(findTestObject('Object Repository/06. Search by Name/android.widget.EditText - Search agent here (1)'), 'mike', 
    0)

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - Mike'), 0)


Mobile.getText(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - Mike (1)'), 0)

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/06. Search by Name/android.view.ViewGroup'), 0)

Mobile.closeApplication()

