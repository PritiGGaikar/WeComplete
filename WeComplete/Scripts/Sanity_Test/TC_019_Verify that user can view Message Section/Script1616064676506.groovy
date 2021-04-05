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
import internal.GlobalVariable as GlobalVariable

'Message section is visible'
if (WebUI.verifyElementPresent(findTestObject('Deal Status/Message_Section/tab_Messages'), GlobalVariable.shortTime) == 
true) {
    'Verify Channels tab '
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Message_Section/tab_Channels'), 
        GlobalVariable.shortTime)

    WebUI.scrollToElement(findTestObject('Object Repository/Deal Status/Message_Section/tab_Channels'), GlobalVariable.shortTime)

    'Verify Direct messages tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Deal Status/Message_Section/Direct Messages section/tab_Direct Messages'), 
        GlobalVariable.shortTime)

    'Verify  External contacts tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Deal Status/Message_Section/External_Contact _Section/tab_External Contacts'), 
        GlobalVariable.shortTime)

    'Verify Pending Invitations tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Message_Section/tab_Pending Invitations'), 
        GlobalVariable.shortTime)

    'Verify Archives tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Message_Section/tab_Archives'), 
        GlobalVariable.shortTime)

    'Verify Invite People tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Deal Status/Message_Section/Invite_Section/tab_Invite People'), 
        GlobalVariable.shortTime)
} else {
    System.out.print('Message section is not  visible')
}

