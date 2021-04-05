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


WebUI.callTestCase(findTestCase('common_test _cases/login_Page'), [('headerDashboard') : headerDashboard, ('loginId') : User1
	, ('Password') : Password, ('baseEAUrl') : baseEAUrl], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.longTime)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dashborad/hedaer_Your Recent Propertie'), GlobalVariable.shortTime) == 
true) {
    'Your Recent Propertie header'
    CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Dashborad/hedaer_Your Recent Propertie'), 
        GlobalVariable.shortTime)

   /* 'Verify created first quote dispalyed on recent property section'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Dashborad/get_created_First_Property_Details'), 
        firstPropertyDetails)

    'Verify created second quote  dispalyed on recent property section'
    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Dashborad/get_created_Second_Property_Details'), 
        secondPropertyDetails)
*/
    'Visible Quote Accepted tab '
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dashborad/tab_Quotes Accepted'), GlobalVariable.shortTime) == 
    true) {
        WebUI.delay(5)

        'Click on Quote Accepted tab'
       // WebUI.click(findTestObject('Object Repository/Dashborad/tab_Quotes Accepted'))
		CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Dashborad/tab_Quotes Accepted'),
			GlobalVariable.shortTime)
		
       /* 'Verify created Sell/ Buy quote displayed on tab'
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Dashborad/get_first_Quote_on_tab'), 
            firstPropertyDetails)

        'Verify created Sell/ Buy quote displayed on tab'
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Dashborad/get_second_Quote_on_tab'), 
            secondPropertyDetails)*/
    } else {
        System.out.print('Accepted tan not  visible')
    }
} else {
    System.out.print('Dashboard page not loaded')
}