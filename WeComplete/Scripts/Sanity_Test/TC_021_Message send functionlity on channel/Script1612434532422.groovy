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

'Verify channel is present'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Deal Status/Message_Section/Channels/get_Channel'), 
    GlobalVariable.shortTime) == true) {
    'Click on created channel'
   /* CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Deal Status/Message_Section/Channels/get_Channel'), 
        GlobalVariable.shortTime)*/
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Deal Status/Message_Section/Channels/get_Channel'))
	
    'Enter message'
    CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/input_Compose'), 
        message)

	'Click on send button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Send')) 
   /* CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Send'), 
        GlobalVariable.shortTime)*/
	
	'Click on Document Request tab'
	    CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/tab_Document Request'))
    /*CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/tab_Document Request'), 
        GlobalVariable.shortTime)*/

    'Enter message document request tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/input_Docuemnt_Request'), 
        documentRequest)

	'Click on send button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Document_request_Send'))
  
   /* CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Document_request_Send'), 
        GlobalVariable.shortTime)*/

    'Verify that Document request successfully text .'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Deal Status/Message_Section/get _Request_Successfully_MSG'), 
        docRequestMSG)

    //WebUI.click(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Ok'))
    'Click on Ok button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Ok'), 
        GlobalVariable.shortTime)

    //WebUI.click(findTestObject('Object Repository/Deal Status/Message_Section/btn_ Back to calendar'))
    'Click on Back to calendar btn'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/btn_ Back to calendar'), 
        GlobalVariable.shortTime)
} else {
    println('channel is not present')
}