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

'Verify sell Property tab is visible'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Quote/Selling_Property_Details_Page/header_Buying Property Details'),
	GlobalVariable.shortTime) == true) {
	' Verify the Buying Property Details page'
	CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Selling_Property_Details_Page/header_Buying Property Details'),
		buylPropertyHeader)

	'Enter  price of Buy property '
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Quote/Selling_Property_Details_Page/input_Price_Of_Property'),
		buyPropertyPrice)

	'Enter Post code '
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Quote/Selling_Property_Details_Page/input_Property_PostCode'),
		postCode)

	'Click on Enter Address Manually'
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/click_Enter_Address_Manually'),
		GlobalVariable.shortTime)

	'Enter Plot/Flat/House No'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Quote/Selling_Property_Details_Page/input_House_No'),
		houseNo)

	'Enter Street name'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Quote/Selling_Property_Details_Page/input_Street'),
		streetName)

	//WebUI.click(findTestObject('Quote/Selling_Property_Details_Page/Click_No_Of_Seller_Buyer'))
	'Select Number of seller'
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/Click_No_Of_Seller_Buyer'),
		GlobalVariable.shortTime)

	//WebUI.click(findTestObject('Quote/Selling_Property_Details_Page/toggle_Commercial'))
	'Select Property type Commercial'
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/toggle_Commercial'),
		GlobalVariable.shortTime)

	//WebUI.click(findTestObject('Quote/Selling_Property_Details_Page/toggle_Leasehold'))
	'Select Property Leasehold'
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/toggle_Leasehold'),
		GlobalVariable.shortTime)

	'Enter Comment'
	CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Quote/Selling_Property_Details_Page/input_Comment'),
		buyPropertyComments)

	//WebUI.click(findTestObject('Quote/Selling_Property_Details_Page/btn_Save and Next'))
	'Click on “Save&Next” button'
	CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/btn_Save and Next'),
		GlobalVariable.shortTime)
} else {
	println('Buying Property Details page  not visible')
}