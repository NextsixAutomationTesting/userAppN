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

Mobile.startApplication('C:\\Users\\Nextsix\\git\\katalon-agentapp\\userTester240508FixCrash(0.13.7).apk', true)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Skip'), 0)


'Click Search icon in Quick Search bar'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - (1)'), 0)

WebUI.delay(8)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Rent'), 0)

'Click Search icon in Quick Search bar'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - (1)'), 0)

WebUI.delay(4)

Mobile.pressBack()

'Click Type'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Type'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Any Residential'), 
    0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Property Type'), 0)

Mobile.pressBack()

'Click Price'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Price'), 0)

WebUI.delay(3)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Property Type'), 0)

Mobile.pressBack()

'Click Agent'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Get Agent'), 0)

WebUI.delay(4)


Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.SeekBar (1)'), 0)

WebUI.delay(5)

'Click Flag Kuchai Lama'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Kuchai Lama1'), 0)

WebUI.delay(5)

flagPropertyName = WS.sendRequest(findTestObject('000.Back Button/Flag (Kuchai Lama)'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(flagPropertyName.getResponseBodyContent())

def property0 = result[0].properties[0].name

println(property0)

String expectedProperty0 = property0

String objectLocator = 'Object Repository/000.Back Button/android.widget.TextView - ' + property0

println(objectLocator)

String actualProperty0 = Mobile.getText(findTestObject(objectLocator), 0)

println(actualProperty0)

println(expectedProperty0)

Mobile.verifyMatch(actualProperty0, expectedProperty0, true)

Mobile.pressBack()

//Get Agent Nearby
agentNearby = WS.sendRequest(findTestObject('000.Back Button/Agent Neraby (Kuchai Lama)'))

def slurper1 = new groovy.json.JsonSlurper()

def result1 = slurper1.parseText(agentNearby.getResponseBodyContent())

def agent1 = result1.areaSpecialists[0].nickname

def agent1Id = result1.areaSpecialists[0]._id

println(agent1)

println(agent1Id)

'Click First agent on Nearby tab'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + agent1), 0)

//Get Agent Listing
agentListing = WS.sendRequest(findTestObject('000.Back Button/Agent Listing V2', [('agent1Id') : agent1Id]))

def slurper2 = new groovy.json.JsonSlurper()

def result2 = slurper2.parseText(agentListing.getResponseBodyContent())

def propertyName = result2[3].name



agentListing = WS.sendRequest(findTestObject('000.Back Button/Agent Listing', [('agent1Id') : agent1Id]))

def slurper21 = new groovy.json.JsonSlurper()

def result21 = slurper21.parseText(agentListing.getResponseBodyContent())

def propertyName21 = result21.documents[6].name

println(propertyName21)

WebUI.delay(5)


//Mobile.scrollToText('Dynasty Garden Condominium')
Mobile.scrollToText(propertyName21)


//Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + propertyName), 0)
'Click on property details'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + propertyName21), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + propertyName21), 
    propertyName21)



WebUI.delay(5)

Mobile.pressBack()


WebUI.delay(5)

Mobile.scrollToText(agent1)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + agent1), agent1)

WebUI.delay(5)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Search this area (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - MapListing (2)'), 0)


WebUI.delay(5)

Mobile.pressBack()

WebUI.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Search this area (3)'), 
    0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Property (1)'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Buy'), 0)

//Nearby property in Kuchai Lama
nearbyProperty = WS.sendRequest(findTestObject('000.Back Button/Property Nearby Kuchai'))

def slurper8 = new groovy.json.JsonSlurper()

def result8 = slurper8.parseText(nearbyProperty.getResponseBodyContent())

def nearbyPropertyKuchai = result8.data[0].name

def nearbyPropertyAgent = result8.data[0].agent.nickname

println(nearbyPropertyKuchai)

println(nearbyPropertyAgent)

WebUI.delay(5)

'Click First Nearby property'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + nearbyPropertyKuchai), 0)

'Click property\'s agent'
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + nearbyPropertyAgent), 0)

WebUI.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + nearbyPropertyAgent), nearbyPropertyAgent)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + nearbyPropertyKuchai), nearbyPropertyKuchai)


Mobile.pressBack()


Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - MapListing (2)'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Default'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Date (New to Old)'), 'Date (New to Old)')

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Default'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/00. Create New Account/android.widget.TextView - Search this area'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/00. Create New Account/android.widget.TextView - Get Agent Nearby'), 0)



Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Profile (1)'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Sign In (2)'), 0)

Mobile.setText(findTestObject('Object Repository/000.Back Button/android.widget.EditText - Email (1)'), 'myson@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/000.Back Button/android.widget.EditText - Password (1)'), '1', 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Sign In (3)'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Home (1)'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - My Likes (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - My Likes'), 'My Likes')

//Get My Likes Property id
myLikes = WS.sendRequest(findTestObject('000.Back Button/My Likes'))

def slurper3 = new groovy.json.JsonSlurper()

def result3 = slurper3.parseText(myLikes.getResponseBodyContent())

def myLikesPropertyId = result3.documents[0].property

println(myLikesPropertyId)

//Get My Like Property Name
myLikesPropertyName = WS.sendRequest(findTestObject('000.Back Button/My Likes Property', [('propertyid') : myLikesPropertyId]))

def slurper4 = new groovy.json.JsonSlurper()

def result4 = slurper4.parseText(myLikesPropertyName.getResponseBodyContent())

def myLikesPropertyName = result4.documents[0].name

println(myLikesPropertyName)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + myLikesPropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Recommendation'), 'Recommendation')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - My Likes'), 'My Likes')

Mobile.pressBack()


Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Get Agent Nearby (1)'), 
    'Get Agent Nearby')

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Home Pro (1)'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Service Record (1)'), 0)

Mobile.pressBack()

Mobile.scrollToText('home renovation rose')

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - home renovation rose'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Enquire Now (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Enquiry Form (1)'), 'Enquiry Form')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Coverage State'), 'Coverage State')

Mobile.pressBack()

Mobile.scrollToText('Recommendation')

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Recommendation (1)'), 'Recommendation')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Get Agent Nearby (2)'), 'Get Agent Nearby')

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Daily'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Tell Us your Identity'), 'Tell Us your Identity')

//click owner(Landlord)/Seller
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.ImageView (5)'), 0)

//Click Next button
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Next'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Seller'), 'Seller')

//Click Seller
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.ImageView (6)'), 0)

//Click Next
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Next (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Where is your property'), 
    'Where is your property?')

Mobile.pressBack()

//Click Landlord
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.ImageView (7)'), 0)

//Click Next
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Next (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Where is your property'), 
    'Where is your property?')

WebUI.delay(3)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Landlord'), 'Landlord')

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Tell Us your Identity'), 
    'Tell Us your Identity')

Mobile.pressBack()

WebUI.delay(3)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - TenantBuyer'), 'Tenant/Buyer')

//Click Tenant/Buyer
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.ImageView (8)'), 0)

//Click Next button
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Next'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Buyer'), 'Buyer')

//Click Buyer
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.ImageView (9)'), 0)

//Click Next
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Next (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Preferrable Location'), 
    'Preferrable Location')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Tenant'), 'Tenant')

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.ImageView (10)'), 0)

//Click Next
Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Next (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Preferrable Location'), 
    'Preferrable Location')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Tell Us your Identity'), 
    'Tell Us your Identity')

Mobile.pressBack()

WebUI.delay(3)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Owner(Landlord)Seller (1)'), 
    'Owner(Landlord)/Seller')

WebUI.delay(3)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Get Agent Nearby (3)'), 
    'Get Agent Nearby')


//Feature Property
featureProperty = WS.sendRequest(findTestObject('000.Back Button/Get Feature Listing'))

def slurper5 = new groovy.json.JsonSlurper()

def result5 = slurper5.parseText(featureProperty.getResponseBodyContent())

def featurePropertyName = result5[0].property.name

println(featurePropertyName)


// Get device screen dimensions
int screenWidth = Mobile.getDeviceWidth()

int screenHeight = Mobile.getDeviceHeight()

// Convert percentage values to pixel values
int startX = ((screenWidth * 0.5 // 40% of screen width
    ) as int)

int startY = ((screenHeight * 0.6 // 80% of screen height
    ) as int)

int endX = ((screenWidth * 0.5 // 60% of screen width
    ) as int)

int endY = ((screenHeight * 0.4 // 20% of screen height
    ) as int)

// Perform swipe action with failure handling
Mobile.swipe(startX, startY, endX, endY)


Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName), 
    featurePropertyName)

Mobile.pressBack()


Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - See All'), 0)



Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Featured Property Listing'), 
    'Featured Property Listing')

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + featurePropertyName), 
    featurePropertyName)

Mobile.pressBack()


Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Featured Property Listing'), 
    'Featured Property Listing')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Featured'), 'Featured')


// Get device screen dimensions
int screenWidth1 = Mobile.getDeviceWidth()

int screenHeight1 = Mobile.getDeviceHeight()

// Convert percentage values to pixel values
int startX1 = ((screenWidth1 * 0.5 // 40% of screen width
    ) as int)

int startY1 = ((screenHeight1 * 0.6 // 80% of screen height
    ) as int)

int endX1 = ((screenWidth1 * 0.5 // 60% of screen width
    ) as int)

int endY1 = ((screenHeight1 * 0.4 // 20% of screen height
    ) as int)

// Perform swipe action with failure handling
Mobile.swipe(startX1, startY1, endX1, endY1)


//Latest For Sale
latestForSale = WS.sendRequest(findTestObject('000.Back Button/Get Latest for Sale'))

def slurper6 = new groovy.json.JsonSlurper()

def result6 = slurper6.parseText(latestForSale.getResponseBodyContent())

def latestSalePropertyName = result6[0].name

println(latestSalePropertyName)


Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestSalePropertyName), 0)

//Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestSalePropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestSalePropertyName), 
    latestSalePropertyName)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - See All (1)'), 0)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestSalePropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestSalePropertyName), 
    latestSalePropertyName)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Latest For Sales'), 
    'Latest For Sales')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Latest For Sale'), 
    'Latest For Sale')

// Get device screen dimensions
int screenWidth2 = Mobile.getDeviceWidth()

int screenHeight2 = Mobile.getDeviceHeight()

// Convert percentage values to pixel values
int startX2 = ((screenWidth2 * 0.5 // 40% of screen width
    ) as int)

int startY2 = ((screenHeight2 * 0.6 // 80% of screen height
    ) as int)

int endX2 = ((screenWidth2 * 0.5 // 60% of screen width
    ) as int)

int endY2 = ((screenHeight2 * 0.4 // 20% of screen height
    ) as int)

// Perform swipe action with failure handling
Mobile.swipe(startX2, startY2, endX2, endY2)

//Latest for Rent
latestForRent = WS.sendRequest(findTestObject('000.Back Button/Get Latest for Rent'))

def slurper7 = new groovy.json.JsonSlurper()

def result7 = slurper7.parseText(latestForRent.getResponseBodyContent())

def latestRentPropertyName = result7[0].name

println(latestRentPropertyName)

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestRentPropertyName), 0)

//Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestRentPropertyName), 0)
Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestRentPropertyName), 
    latestRentPropertyName)

Mobile.pressBack()


Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - See All (5)'), 0)


Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Latest For Rent (4)'), 
    'Latest For Rent')

Mobile.tap(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestRentPropertyName), 0)

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - ' + latestRentPropertyName), 
    latestRentPropertyName)

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Latest For Rent (2)'), 
    'Latest For Rent')

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/000.Back Button/android.widget.TextView - Latest For Rent (3)'), 
    'Latest For Rent')




