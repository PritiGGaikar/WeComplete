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

'Verify header Correspondence Address on Quote Details page'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Corresponding_Address_Section/get_header_Correspondence Address'), 
    headerAddress)

'Verify  Correspondence Address PostCode on Quote Details page'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Corresponding_Address_Section/get_Post_Code'), 
    postCode)

'Verify  Correspondence Address on Quote Details page'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Quote/Quote_Details_Page/Corresponding_Address_Section/get_Address'), 
    address)

'click on Get Quote Button'
//WebUI.click(findTestObject('Quote/Quote_Details_Page/btn_Get_Quote'))
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Quote_Details_Page/btn_Get_Quote'),
	GlobalVariable.shortTime)
