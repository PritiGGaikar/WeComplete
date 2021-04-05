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

'Verify that Personal Details progress step'
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Quote/Personal_Details_Page/step_Personal_Details_Page'),
	GlobalVariable.shortTime)

'Verify  Primary Contact Details header is visible'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/Personal_Details_Page/header_Primary Contact Details'),
	GlobalVariable.shortTime) == true) {
	CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/Personal_Details_Page/header_Primary Contact Details'),
		GlobalVariable.shortTime)

	/*
'Click on  Title'

CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/select_title_DD'))
WebUI.click(findTestObject('Quote/Personal_Details_Page/select_title_DD'))*/
	/*'Select Title Ms'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/select_title_Ms'))
WebUI.click(findTestObject('Quote/Personal_Details_Page/select_title_Ms'))*/
	'Enter first name'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Primary_FirstName'),
		primaryFN)

	'Enter Last name'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Primary_LastName'),
		primaryLN)

	'Enter email id'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Primary_EmailId'),
		primaryEID)

	'Enter mobile number'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Primary_PhoneNo'),
		primaryMNO)

	//WebUI.click(findTestObject('Quote/Personal_Details_Page/checkBox_make same as Joint Seller 2'))
	'Click on check box make same as Joint Seller 2'
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Personal_Details_Page/checkBox_make same as Joint Seller 2'),
		GlobalVariable.shortTime)

	'Verify Joint seller 2 Contact Details header'
	CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/Personal_Details_Page/header_Joint Seller 2 Contact Details'),
		GlobalVariable.shortTime)

	/*'Select Title Ms'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/select_title_Ms'))
WebUI.click(findTestObject('Quote/Personal_Details_Page/select_title_Ms'))*/
	'Enter Joint holder First Name'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Joint_Holder_First Name'),
		jointHolderFN)

	'Enter Joint holder Last Name'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Joint_Holder_LastName'),
		jointHolderLN)

	'Enter Joint holder Phone Number'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Joint_Holder_PhoneNo'),
		jointHolderMNO)

	'Enter Joint holder Email id'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Quote/Personal_Details_Page/input_Joint_Holder_EmailId'),
		jointHolderEID)

	//WebUI.click(findTestObject('Quote/Selling_Property_Details_Page/btn_Save and Next'))
	'Click on “Save&Next” button'
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/btn_Save and Next'),
		GlobalVariable.shortTime)
} else {
	println('Primary Contact Details page  not visible')
}