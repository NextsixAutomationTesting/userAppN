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



Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userTester240503FixCrash(0.13.7).apk', true)

//test25/10/24
//test 2026

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('null'), 0)

/**
'Click Search icon in Quick Search bar'
Mobile.tap(findTestObject('null'), 0)
WebUI.delay(8)
Mobile.pressBack()
Mobile.tap(findTestObject('null'), 0)
Mobile.tap(findTestObject('null'), 0)
'Click Search icon in Quick Search bar'
Mobile.tap(findTestObject('null'), 0)
WebUI.delay(4)
Mobile.pressBack()
	@@ -52,13 +70,130 @@ Mobile.pressBack()
'Click Price'
Mobile.tap(findTestObject('null'), 0)
WebUI.delay(3)
Mobile.pressBack()
Mobile.verifyElementExist(findTestObject('null'), 0)
Mobile.pressBack()
**/




'Click Agent'
Mobile.tap(findTestObject('null'), 0)

WebUI.delay(4)





Mobile.tap(findTestObject('null'), 0)
WebUI.delay(5)
'Click Flag Kuchai Lama'
Mobile.tap(findTestObject('null'), 0)
WebUI.delay(5)
flagPropertyName = WS.sendRequest(findTestObject('null'))
def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(flagPropertyName.getResponseBodyContent())
def property0 = result[0].properties[0].name
println(property0)
String expectedProperty0 = property0
String objectLocator = 'Object Repository/000.Back Button/android.widget.TextView - ' + property0
String actualProperty0 = Mobile.getText(findTestObject(objectLocator), 0)
Mobile.verifyMatch(actualProperty0, expectedProperty0, true)
//String actualProperty0 = Mobile.getText(findTestObject('null', [('property0'): property0]), 0)
//String actualProperty0 = Mobile.getText(findTestObject('null',[('expectedProperty0') : expectedProperty0]), 0)
Mobile.pressBack()




//Get Agent Nearby
agentNearby = WS.sendRequest(findTestObject('null'))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(agentNearby.getResponseBodyContent())

def agent1 = result1.areaSpecialists[0].nickname

def agent1Id = result1.areaSpecialists[0]._id

println(agent1)

println(agent1Id)




'Click First agent on Nearby tab'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + agent1), 0)


//Get Agent Listing
agentListing = WS.sendRequest(findTestObject('null', [('agent1Id') : agent1Id]))

def slurper2 = new groovy.json.JsonSlurper()

def result2 = slurper2.parseText(agentListing.getResponseBodyContent())

def propertyName = result2.documents[0].name

println(propertyName)


WebUI.delay(5)

'Click on property details'
Mobile.tap(findTestObject('null'), 0)


/**
WebUI.delay(5)
'Verify agent name in property details'
Mobile.verifyElementText(findTestObject('null'), 'Alastair')
WebUI.delay(5)
Mobile.pressBack()
'Verify agent name in agent details'
Mobile.verifyElementText(findTestObject('null'), 'Alastair')
WebUI.delay(5)
Mobile.pressBack()
'Verify Search this area button'
Mobile.verifyElementExist(findTestObject('null'), 
    0)
WebUI.delay(5)
Mobile.pressBack()
'Click Property shortcut in Homepage'
Mobile.tap(findTestObject('null'), 0)
WebUI.delay(5)
**/