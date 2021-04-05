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

'Navigate to legal URL'
//WebUI.navigateToUrl(GlobalVariable.baseEAUrl + "/ph", FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(baseEAUrl + "/ph", FailureHandling.STOP_ON_FAILURE)


'Verify Login tab'
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/login_Page/tab_login'), 
    GlobalVariable.shortTime)

'Verify Login Page header'
CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/login_Page/header_login'), 
    GlobalVariable.shortTime)

'Enter Login id'
CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/login_Page/input_login_id'), 
    loginId)

'Enter Password'
CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/login_Page/input_Password'), 
    Password)

'Click on Login button'
WebUI.click(findTestObject('login_Page/btn_login'))
//CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('login_Page/btn_login'))
WebUI.delay(7)

'Verify after login Dashbard page opned'
CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Dashborad/header_Dashboard'), headerDashboard)
