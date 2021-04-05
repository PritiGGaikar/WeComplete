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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Click on “+” icon on channels tab'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Deal Status/Message_Section/Channels/btn_Create_channel'), 
    GlobalVariable.shortTime)

'Verify Create a channel  pop up is opened'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/title_Create_channel'), 
    GlobalVariable.shortTime) == true) {
    'Enter channel Name'
    CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/input_channelName'), 
        channelName)

    'Select member on channel'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/select_member'), 
        GlobalVariable.shortTime)

    'Click on create button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Create'), 
        GlobalVariable.shortTime)

    'Verify pop up Channel is created successfully.'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/alert_created channel'), 
        GlobalVariable.shortTime)

    'Click on Ok button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Deal Status/Property Details Section/btn_Ok'), 
        GlobalVariable.shortTime)
} else {
    println('Create a channel  pop up is not opened')
}