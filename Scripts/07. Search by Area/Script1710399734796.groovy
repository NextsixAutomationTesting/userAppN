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

//Request Simpang Ampat agent 
simpangAmpat = WS.sendRequest(findTestObject('7. Search by Area/search area-simpang ampat'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(simpangAmpat.getResponseBodyContent())

def agent0 = result.data[0].nickname

def agent1 = result.data[1].nickname

def agent2 = result.data[2].nickname

println(agent0)

println(agent1)

println(agent2)

//simpang ampat
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (1)'), 'simpang ampat', 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Simpang Ampat - AreaState'), 0)

String expectedAgent0 = agent0

String actualAgent0 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - grunch', 
        [('expectedAgent0') : expectedAgent0]), 0)

Mobile.verifyMatch(actualAgent0, expectedAgent0, true)

String expectedAgent1 = agent1

String actualAgent1 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Mat Ropi', 
        [('expectedAgent1') : expectedAgent1]), 0)

Mobile.verifyMatch(actualAgent1, expectedAgent1, true)

String expectedAgent2 = agent2

String actualAgent2 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - fixan', 
        [('expectedAgent2') : expectedAgent2]), 0)

Mobile.verifyMatch(actualAgent2, expectedAgent2, true)


//Request Johor Bahru agent

johorBahru = WS.sendRequest(findTestObject('7. Search by Area/search area-johor bahru'))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(johorBahru.getResponseBodyContent())

def agent00 = result1.data[0].nickname

def agent01 = result1.data[1].nickname

def agent02 = result1.data[2].nickname

println(agent00)

println(agent01)

println(agent02)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView -'), 0)

//johor bahru
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (1)'), 'johor bahru', 
    0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Johor Bahru - AreaState'), 0)


String expectedAgent00 = agent00

String actualAgent00 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - toro', 
        [('expectedAgent00') : expectedAgent00]), 0)

Mobile.verifyMatch(actualAgent00, expectedAgent00, true)

String expectedAgent01 = agent01

String actualAgent01 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - mam nick', [('expectedAgent01') : expectedAgent01]), 0)

Mobile.verifyMatch(actualAgent01, expectedAgent01, true)

String expectedAgent02 = agent02

String actualAgent02 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - youvie', [('expectedAgent02') : expectedAgent02]), 0)

Mobile.verifyMatch(actualAgent02, expectedAgent02, true)





/**
//kuchai lama
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (1)'), 'kuchai lama', 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Kuchai Lama - AreaState'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - lim salak 1'), 'lim salak 1')

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - lisa lee'), 0)

Mobile.verifyElementExist(findTestObject(''), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - kicker'), 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView -'), 0)
**/



//Request Kuching agent

kuching = WS.sendRequest(findTestObject('7. Search by Area/search area-kuching'))

def slurper2 = new groovy.json.JsonSlurper()

def result2 = slurper2.parseText(kuching.getResponseBodyContent())

def agent10 = result2.data[0].nickname

def agent11 = result2.data[1].nickname

def agent12 = result2.data[2].nickname

println(agent10)

println(agent11)

println(agent12)


Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView -'), 0)


//kuching
Mobile.setText(findTestObject('Object Repository/7. Search by Area/android.widget.EditText - Search agent here (3)'), 'kuching', 0)

Mobile.tap(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - Kuching - AreaState'), 0)


String expectedAgent10 = agent10

String actualAgent10 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - mariael',['expectedAgent10':expectedAgent10]), 0)

Mobile.verifyMatch(actualAgent10, expectedAgent10, true )


String expectedAgent12 = agent12

String actualAgent12 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - sony',['expectedAgent11':expectedAgent12]), 0)

Mobile.verifyMatch(actualAgent12, expectedAgent12, true)


String expectedAgent11 = agent11

String actualAgent11 = Mobile.getText(findTestObject('Object Repository/7. Search by Area/android.widget.TextView - haman', ['expectedAgent12':expectedAgent11]), 0)

Mobile.verifyMatch(actualAgent11, expectedAgent11, true)


Mobile.closeApplication()

