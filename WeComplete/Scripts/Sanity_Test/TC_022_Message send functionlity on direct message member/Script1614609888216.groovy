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

'Verify that Direct message is Present'
if (WebUI.verifyElementPresent(findTestObject('Deal Status/Message_Section/Direct Messages section/tab_Direct Messages'), 
    GlobalVariable.shortTime) == true) {
    //WebUI.click(findTestObject('Deal Status/Message_Section/Direct Messages section/tab_Direct Messages'))
    'Click on Direct message tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Deal Status/Message_Section/Direct Messages section/tab_Direct Messages'), 
        GlobalVariable.shortTime)

    'Verify member present on direct message section'
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Deal Status/Message_Section/Direct Messages section/dircte_message_member_1'), 
        GlobalVariable.shortTime) == true) {
         WebUI.click(findTestObject('Object Repository/Deal Status/Message_Section/Direct Messages section/dircte_message_member_1'))
        'Select direct message member'
       /* CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Direct Messages section/dircte_message_member_1'), 
            GlobalVariable.shortTime)*/

        'Enter message'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/input_Compose'), 
            message)

        //CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Send'))
        'Click on send button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Send'), 
            GlobalVariable.shortTime)

        // CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/tab_Document Request'))
        'Click on Document Request tab'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/tab_Document Request'), 
            GlobalVariable.shortTime)

        'Enter message document request tab'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/input_Docuemnt_Request'), 
            documentRequest)

        // CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Document_request_Send'))
        'Click on send button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Channels/btn_Document_request_Send'), 
            GlobalVariable.shortTime)

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
        System.out.print('Member not present on direct message section')
    }
} else {
    System.out.print('Direct messages is not visible')
}