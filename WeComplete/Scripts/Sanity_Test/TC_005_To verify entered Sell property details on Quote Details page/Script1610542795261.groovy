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

'Verify Quote details step '
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/Quote_Details_Page/Progress_Step_Quote_Details'), 
    GlobalVariable.shortTime)

'Verify Quote Details  page is visible'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Quote/Quote_Details_Page/header_Quote_Details'), 
    GlobalVariable.shortTime) == true) {
    'Verify Quote Details page header'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/header_Quote_Details'), 
        headerQuotePreview)

    //-------------------------Selling Property details-----------------------//
    'Verify Sell Currency '
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Seller_Property_Section/get_Sell_Currency'), 
        sellCurrency)

    'Verify Selling Property Value'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Seller_Property_Section/get_Sell_Price'), 
        sellPropertyPrice)

    'Verify Selling Property Post code'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Seller_Property_Section/get_Sell_Post_Code'), 
        postCode)

    'Verify Selling Property Comments'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Seller_Property_Section/get_Sell_Comments'), 
        sellPropertyComments)
} else {
    println('Quote Details page is not visible')
}