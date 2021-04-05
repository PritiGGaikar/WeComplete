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

'Verify Search order button is clickable'
if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/Search_Order_Section/btn_Search Order'), 
    FailureHandling.CONTINUE_ON_FAILURE) == true) {
    'Scroll to  Search order button '
    WebUI.scrollToElement(findTestObject('Object Repository/Deal Status/Search_Order_Section/btn_Search Order'), GlobalVariable.shortTime)

    'Click on Search order button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Search_Order_Section/btn_Search Order'))

    'Verify Search order pop is opened'
    if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/Search_Order_Section/header_Search Order'), 
        FailureHandling.CONTINUE_ON_FAILURE) == true) {
        'Get Search order pop up header'
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Search_Order_Section/header_Search Order'), 
            headerSearchOrder)

        'Click on Add serches button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Search_Order_Section/btn_Add Searches'), 
            GlobalVariable.shortTime)

        'Click on cart 1'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Search_Order_Section/cart_1'))

        'Click on cart 2'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Search_Order_Section/cart_2'))

        'Click on Next button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Search_Order_Section/btn_Next'), 
            GlobalVariable.shortTime)

        'Click on confirm button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Search_Order_Section/btn_Confirm'), 
            GlobalVariable.shortTime)

        'Verify Pop up done message'
        CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Search_Order_Section/done_pop up'), 
            GlobalVariable.shortTime)

        'Click on Ok button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Ok'), 
            GlobalVariable.shortTime)
		
		
		
    } else {
        System.out.print('Search order pop is not opened')
    }
} else {
    System.out.print('Search order button is not clickable')
}