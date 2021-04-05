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

'Verify Request a Payment button is clickable'
if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/Payemnt/btn_Request a Payment'), FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
    'Scroll to Request a Payment button '
    WebUI.scrollToElement(findTestObject('Object Repository/Deal Status/Payemnt/btn_Request a Payment'), GlobalVariable.shortTime)

    'Click on Request a Payment button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Payemnt/btn_Request a Payment'), 
        GlobalVariable.shortTime)

    'Verify Payment tab is visible'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Deal Status/Payemnt/tab_Payment'), FailureHandling.CONTINUE_ON_FAILURE) == 
    true) {
        'Click on Service drop down'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Payemnt/service_DD'))

        'Selecte  Additional Payment service from drop down'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Payemnt/service_value'), 
            GlobalVariable.shortTime)

        'Enter Amount to request'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Payemnt/input_amount_to_request'), 
            requestAmount)

        'Enter Amount to request'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Payemnt/input_remark'), 
            remark)

        'Verify Add Request  button is clickable'
        if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/Payemnt/btn_Add Request'), FailureHandling.CONTINUE_ON_FAILURE) == 
        true) {
            'Click on Add request button'
            CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Payemnt/btn_Add Request'), 
                GlobalVariable.shortTime)

            'Click on Request Payment button'
            CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Payemnt/btn_Request Payment'), 
                GlobalVariable.shortTime)

            'Verify on Pop up Successful message'
            CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Payemnt/get_successfully_alert'), 
                GlobalVariable.shortTime)

            'Click on Ok button'
            CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Ok'), 
                GlobalVariable.shortTime)
			
			'Click on Back to calendar btn'
			CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Message_Section/btn_ Back to calendar'),
				GlobalVariable.shortTime)
        } else {
            System.out.print('Add Request  button is not clickable')
        }
    } else {
        System.out.print('Payment tab is not visible')
    }
} else {
    System.out.print('Request a Payment button is not clickable')
}