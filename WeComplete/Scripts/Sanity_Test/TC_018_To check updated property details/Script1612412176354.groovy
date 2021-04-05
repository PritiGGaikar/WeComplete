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

'Verify updated Agreed Price'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Property Details Section/get_Agreed_Price'), 
    buyPrice)

'Verify updated Title Number'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Property Details Section/get_Title Number'),
	titleNumber)


'Verify updated UPRN'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Property Details Section/get_UPRN'),
	uprn)

'Verify updated Local Authority'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Property Details Section/get_Local Authority'),
	localAuthority)


'Verify updated Flood Risk'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Property Details Section/get_Flood Risk'),
	floodRisk)

'Verify updated Plot Size'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Property Details Section/get_Plot Size'),
	plotSize)

'Verify updated Summary'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Property Details Section/get_Summary'),
	summary)





