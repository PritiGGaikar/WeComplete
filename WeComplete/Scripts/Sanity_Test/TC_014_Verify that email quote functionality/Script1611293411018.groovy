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

'Verify Email Quote button is present'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/btn_Email Quote'), 
    GlobalVariable.shortTime) == true) {
    //WebUI.click(findTestObject('Quote/PriceCompare_Page/btn_Email Quote'))
    'Click on Email quote'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/btn_Email Quote'), 
        GlobalVariable.shortTime)

    'Verify Thank You for Requesting Our Quote Page header'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Quote/Email_Quote_Page/Header_Email_Quote'), 
        GlobalVariable.shortTime)

    'Verify Email sent successfully Message'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Email_Quote_Page/get_Email_sent_successfully'), 
        emailsentMSG)

    'Verify Email Quote message details'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Email_Quote_Page/get_Email_Quote_details'), 
        emailQuoteDetails)

    //WebUI.click(findTestObject('Quote/Email_Quote_Page/btn_Return to your quotes'))
    'Click on Return to your quote'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Email_Quote_Page/btn_Return to your quotes'), 
        GlobalVariable.shortTime)

    WebUI.refresh()

    'Verify Conveyancing Page header'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/header_Pricecompare_Page'), 
        GlobalVariable.shortTime)
} else {
    println('Email Quote button is not present')
}