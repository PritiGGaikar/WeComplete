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

'Verify that Invite people tab is Present'
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/tab_Invite People'), 
    GlobalVariable.shortTime) == true) {
    // WebUI.click(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/add_invite_icon'))
    'Click on Add Invite People'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/add_invite_icon'), 
        GlobalVariable.shortTime)

    'Verify that Invite People pop up title'
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/title_invite_people'), 
        GlobalVariable.shortTime) == true) {
        'Verify Invite People pop up title '
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/title_invite_people'), 
            titleInvite)

        'Enter email address'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/input_Email_Address'), 
            inviteMemberID)

        // CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/select_Role_DD'))
        'Select Role Drop down'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/select_Role_DD'), 
            GlobalVariable.shortTime)

        // WebUI.click(findTestObject('Deal Status/Message_Section/Invite_Section/select_Role_Value'))
        'Select Role drop down value'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Deal Status/Message_Section/Invite_Section/select_Role_Value'), 
            GlobalVariable.shortTime)

        'Enter Name'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/input_Name'), 
            inviteMemberName)

        //CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/btn_Send_Invitation'))
        'Click on Send Invitation button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/Invite_Section/btn_Send_Invitation'), 
            GlobalVariable.shortTime)

        'Verify that Document request successfully text .'
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Deal Status/Message_Section/get _Request_Successfully_MSG'), 
            invitationRequestMSG)

        //WebUI.click(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Ok'))
        'Click on Ok button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Ok'), 
            GlobalVariable.shortTime)
    } else {
        System.out.print('Invite People pop up is not present')
    }
} else {
    System.out.print('Invite people tab is not present')
}