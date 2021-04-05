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

//WebUI.click(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/toggle_Buy'))
'Click on Buy toggle'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/toggle_Buy'), 
    GlobalVariable.shortTime)

//WebUI.click(findTestObject('Quote/PriceCompare_Page/Property_Section/btn_Edit the info'))
'Click on Edit the Info button'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/Property_Section/btn_Edit the info'), 
    GlobalVariable.shortTime)

'Verify Selling& Buying Property pop up header'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/header_Sell and Buy pop up'), 
    GlobalVariable.shortTime) == true) {
    'Verify Buying Property Details header'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/header_ Buying Property Details'), 
        GlobalVariable.shortTime)

    'Re-enter price'
    CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Selling_Property_Details_Page/input_Price_Of_Property'), 
        editBuyPrice)

    //WebUI.click(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/btn_Update Quote'))
    'Click on Update Quote'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/btn_Update Quote'), 
        GlobalVariable.shortTime)

    //WebUI.click(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/toggle_Buy'))
    'Click on Buy toggle'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/toggle_Buy'), 
        GlobalVariable.shortTime)

    'Verify updated Price on Property details section'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/get_SellBuy_Price'), 
        editBuyPrice)
} else {
    println('Selling & Buying  pop up is not opened')
}