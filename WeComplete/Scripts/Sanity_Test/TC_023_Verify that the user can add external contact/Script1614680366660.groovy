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

'Verify that External Contact tab is Present'
if (WebUI.verifyElementPresent(findTestObject('Deal Status/Message_Section/External_Contact _Section/tab_External Contacts'), 
    GlobalVariable.shortTime) == true) {
    //WebUI.click(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/add_External'))
    'Click on add External icon'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/add_External'), 
        GlobalVariable.shortTime)

    'Verify that External Contact pop up header'
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/header_External Contacts'), 
        GlobalVariable.shortTime) == true) {
        'Verify External Contact pop up header text '
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/header_External Contacts'), 
            titleExternal)

        'Enter External Id'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/input_Email'), 
            externalMember)

        'Enter External Name'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/input_Name'), 
            externalName)

        //CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/button_Add'))
        'Click on Add button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/External_Contact _Section/button_Add'), 
            GlobalVariable.shortTime)
    } else {
        System.out.print('External Contact pop up not opened')
    }
} else {
    System.out.print('External Contact tab is not Present')
}