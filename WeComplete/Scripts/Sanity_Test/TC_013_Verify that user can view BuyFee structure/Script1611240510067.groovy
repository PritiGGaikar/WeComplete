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

//WebUI.click(findTestObject('Quote/PriceCompare_Page/Fees_Table/Buy_Fee_toggle_on_Table'))
'Click on Buy Fee toggle'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/Fees_Table/Buy_Fee_toggle_on_Table'), 
    GlobalVariable.shortTime)

'Verify Transaction of Buy price is present'
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/Sell_Buy_Fees_On_Table'), 
    GlobalVariable.shortTime)

/*'Verify Transaction of Buy price'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/PriceCompare_Page/Sell_Buy_Fees_On_Table'),
	REBuyPrice)*/
'Verify  Professional Fees Column'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/Column_Professional Fees'), 
    professionalFees)

'Verify  NET Fees Column '
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/column_NET'), 
    net)

'Verify  VAT Fees Column'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/column_VAT'), 
    vat)

'Verify  Gross Fees Column'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/column_GROSS'), 
    gross)

'Verify Third Party Disbursements column'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/column_Third Party Disbursements'), 
    thirdPartyDisbursements)

'Verify Third Party Disbursements column'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/column_Stamp duty'), 
    stampDuty)

/*'Verify Selling Total column'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/column_BuyingTotal'), 
    buyingTotal)

'Verify Selling + Buying Total column'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Fees_Table/column_Selling Buying total on Buy table'), 
    sellBuyTotal)*/
//WebUI.click(findTestObject('Quote/PriceCompare_Page/Fees_Table/btn_Close Icon'))
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/Fees_Table/btn_Close Icon'), 
    GlobalVariable.shortTime)