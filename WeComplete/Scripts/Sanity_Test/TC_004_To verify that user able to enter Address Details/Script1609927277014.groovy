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

'Verify that Correspondence Address progress step'
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/Correspondence_Address_Page/progressStep_Correspondence Address'), 
    GlobalVariable.shortTime)

'Verify Correspondence Address is visible'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/Correspondence_Address_Page/header_Correspondence Address'), 
    GlobalVariable.shortTime) == true) {
    'Verify header as Correspondence Address'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/Correspondence_Address_Page/header_Correspondence Address'), 
        headerAddress)

    //WebUI.click(findTestObject('Quote/Correspondence_Address_Page/CheckBox_Correspondence Address Same as Buying Address'))
    'Select check box Correspondence AddressSame as Buying Address'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Correspondence_Address_Page/CheckBox_Correspondence Address Same as Buying Address'), 
        GlobalVariable.shortTime)

    //WebUI.click(findTestObject('Quote/Correspondence_Address_Page/CheckBox_Correspondence Address Same as Buying Address'))
    'Unselect check box Correspondence AddressSame as Buying Address'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Correspondence_Address_Page/CheckBox_Correspondence Address Same as Buying Address'), 
        GlobalVariable.shortTime)

    'Enter PostCode'
    CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Correspondence_Address_Page/input_PostCode'), 
        postCode)

    WebUI.delay(5)

    //WebUI.click(findTestObject('Quote/Correspondence_Address_Page/DD_Select_Address'))
    'Click on Select Address drop down'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Correspondence_Address_Page/DD_Select_Address'), 
        GlobalVariable.shortTime)

    //WebUI.click(findTestObject('Quote/Correspondence_Address_Page/DD_Select_Address'))
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Correspondence_Address_Page/DD_Select_Address'), 
        GlobalVariable.shortTime)

    WebUI.delay(5)

    //WebUI.click(findTestObject('Quote/Correspondence_Address_Page/DDVlaue_Select Address'))
    'Select Address from Drop down'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Correspondence_Address_Page/DDVlaue_Select Address'), 
        GlobalVariable.shortTime)

    //WebUI.click(findTestObject('Quote/Selling_Property_Details_Page/btn_Save and Next'))
    'Click on “Save&Next” button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/btn_Save and Next'), 
        GlobalVariable.shortTime)
} else {
    println('Correspondence Address page  not visible')
}