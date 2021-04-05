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

'Verify AML button is clickable'
if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/AML_Section/btn_AML'), FailureHandling.CONTINUE_ON_FAILURE) == 
true) {
'Scroll to  AML button '
    WebUI.scrollToElement(findTestObject('Object Repository/Deal Status/AML_Section/btn_AML'), GlobalVariable.shortTime)

    'Click on AML button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/AML_Section/btn_AML'))

    'Verify AML pop is opened'
    if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/AML_Section/btn_AML'), FailureHandling.CONTINUE_ON_FAILURE) == 
    true) {
        'Get AML pop up header'
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/AML_Section/header_AML_Pop_Up'), 
            headerAML)

        'Selecte Remort check box'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/AML_Section/checkbox_Remote'))

        'Click on Continue button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/AML_Section/btn_Continue'))

        'Click on Member 2 check box'
       CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/AML_Section/checkbox_member2'), GlobalVariable.shortTime)
       
	    'Click on Continue button'
       CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/AML_Section/btn_Continue'), GlobalVariable.shortTime)
		
        'Verify Personal details is displayed'
        if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/AML_Section/get_Personal Details'), 
            FailureHandling.CONTINUE_ON_FAILURE) == true) {
            'Verify Personal details form is opened'
            CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/AML_Section/get_Personal Details'), 
                personalDetails)           

            'Verify Contact details form is opened'
            CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/AML_Section/get_Contact Details'), 
                contactDetails)
			
			'Click on submit button'
			CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/AML_Section/btn_Submit'), GlobalVariable.shortTime)
			
        } else {
            System.out.print(' Personal details is not displayed')
        }
    } else {
        System.out.print('AML pop is not opened')
    }
} else {
    System.out.print('Verify AML button is not clickable')
}

