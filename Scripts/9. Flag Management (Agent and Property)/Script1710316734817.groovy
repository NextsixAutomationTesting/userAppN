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

flagNearby = WS.sendRequest(findTestObject('9. Flag Management (Agent and Property)/flagNearby'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(flagNearby.getResponseBodyContent())

def prop0 = result[0].properties[0].name

def prop1 = result[0].properties[1].name

def areaSpecialist = result[0].agents.areaSpecialists[0].nickname

def normalAgent0 = result[0].agents.normalAgents[0].nickname

def normalAgent1 = result[0].agents.normalAgents[1].nickname
println(prop0)

println(prop1)

println(areaSpecialist)

println(normalAgent0)

println(normalAgent1)

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userMapTesterV1.apk', true)

Mobile.tap(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Get Agent'), 0)

Mobile.tap(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Kuchai Lama'), 0)



String expectedProp0 = prop0

String actualProp0 = Mobile.getText(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Dua Residency', [('expectedProp0') : expectedProp0]), 0)

Mobile.verifyMatch (actualProp0, expectedProp0, true )



String expectedProp1 = prop1

String actualProp1 = Mobile.getText(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Kiara Designer Suites - Serviced Condominium', [('expectedProp1') : expectedProp1]), 0)

Mobile.verifyMatch(actualProp1, expectedProp1, true)



Mobile.tap(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Agents'), 0)


String expectedAreaSpecialist = areaSpecialist

String actualAreaSpecialist = Mobile.getText(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - trrpublic',[('expectedAreaSpecialist') : expectedAreaSpecialist]), 0)

Mobile.verifyMatch(actualAreaSpecialist, expectedAreaSpecialist, true )


String expectedNormalAgent0 = normalAgent0

String actualNormalAgent0 = Mobile.getText(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Cade',[('expectedNormalAgent0'):expectedNormalAgent0]), 0)

Mobile.verifyMatch(actualNormalAgent0, expectedNormalAgent0, true )


String expectedNormalAgent1 = normalAgent1

String actualNormalAgent1 = Mobile.getText(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Jess Yee', [('expectedNormalAgent1'): expectedNormalAgent1]), 0)

Mobile.verifyMatch(actualNormalAgent1, expectedNormalAgent1, true)


Mobile.tap(findTestObject('Object Repository/9. Flag Management (Agent and Property)/android.widget.TextView - Properties'), 0)

Mobile.pressBack()

Mobile.closeApplication()

