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

'Verify Conveyancing Page header'
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/header_Pricecompare_Page'), 
    GlobalVariable.shortTime)

'Verify Property Details is visible'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/header_Property Details'), 
    GlobalVariable.shortTime) == true) {
    'Verify Property Details section'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/header_Property Details'), 
        heradrPropertyDetails)

    'Verify Price of property you are selling text'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Property_Section/gettext_Sell_Price_Of_Property'), 
        sellPricetext)

    'Verify Sell price'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Property_Section/get_SellBuy_Price'), 
        sellPrice)

    //WebUI.click(findTestObject('Quote/PriceCompare_Page/Property_Section/btn_Show more'))
    'Click on Show more'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/Property_Section/btn_Show more'), 
        GlobalVariable.shortTime)

    ' Verify Selling property details comment'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/get_Sell_Comments'), 
        sellComments)

    //WebUI.click(findTestObject('Quote/PriceCompare_Page/Property_Section/toggle_Buy'))
    'Click on Buy toggel'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/Property_Section/toggle_Buy'), 
        GlobalVariable.shortTime)

    'Verify Price of property you are buying text'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/getText_Buy_Price_Of_Property'), 
        buyPricetext)

    'Verify Buy price'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/PriceCompare_Page/Property_Section/get_SellBuy_Price'), 
        buyPrice)

    //WebUI.click(findTestObject('Quote/PriceCompare_Page/Property_Section/btn_Show more'))
    'Click on Show more'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/Property_Section/btn_Show more'), 
        GlobalVariable.shortTime)

    ' Verify Buying property details  comment'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/PriceCompare_Page/Property_Section/get_Buy_Comments'), 
        buyComments)
} else {
    println('Property Details header is not visible')
}