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

'Verify Instruct us button is present'
if (CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/PriceCompare_Page/btn_Instruct Us'),
	GlobalVariable.shortTime) == true) {


'Click on Instruct us'
//WebUI.click(findTestObject('Quote/PriceCompare_Page/btn_Instruct Us'))
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/PriceCompare_Page/btn_Instruct Us'),
	GlobalVariable.shortTime)

WebUI.delay(30)

'Verify Thank You for Accepting Your Quote Page header'
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Quote/Instruct_Us_Page/header_Instructed Page'), 
    GlobalVariable.shortTime)

/*'Verify Completed Message'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Quote/Instruct_Us_Page/get_instruct Us_Complete'), 
    completestext)*/

} else {
    println('Instruct us button is not present')
}