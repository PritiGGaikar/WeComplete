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

//-------------------------Buying Property details-----------------------//

'Verify Buy Currency '
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Buy_Property_Section/get_Buy_Currency'),
	buyCurrency)

'Verify Buying Property Value'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Buy_Property_Section/get_Buy_Price'),
	buyPropertyPrice)

'Verify Buying Property Post code'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Buy_Property_Section/get_Buy_Post_Code'),
	postCode)

'Verify Buying Property Comments'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Buy_Property_Section/get_Buy_Comments'),
	buyPropertyComments)