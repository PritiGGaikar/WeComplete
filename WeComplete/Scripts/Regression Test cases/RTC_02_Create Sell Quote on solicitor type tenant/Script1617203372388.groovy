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

'Navigate to  legal URL'
CustomKeywords.'com.wecomplete.keywords.Login_URL.legalURL'(baseSFUrl)

'Click on Sell tab'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Quote/tab_Selling'), GlobalVariable.shortTime)

'Enter Sell Property details'
WebUI.callTestCase(findTestCase('Quote/Selling Property deatils'), [('quoteHeaderEA') : quoteHeaderSF, ('sellPropertyHeader') : sellPropertyHeader
        , ('sellPropertyPrice') : sellPropertyPrice, ('postCode') : sellPostCode, ('houseNo') : sellhouseNo, ('streetName') : sellStreetName
        , ('sellPropertyComments') : sellComment], FailureHandling.CONTINUE_ON_FAILURE)

'Enter Personal details'
WebUI.callTestCase(findTestCase('Quote/Personal Details'), [('primaryFN') : '', ('primaryLN') : '', ('primaryMNO') : '', ('primaryEID') : ''
        , ('jointHolderFN') : '', ('jointHolderLN') : '', ('jointHolderMNO') : '', ('jointHolderEID') : ''], FailureHandling.CONTINUE_ON_FAILURE)

