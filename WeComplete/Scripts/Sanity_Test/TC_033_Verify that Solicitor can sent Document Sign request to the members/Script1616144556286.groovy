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

'Verify Document Sign button is clickable'
if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/Document_Sign_Section/btn_Document Sign'), 
    FailureHandling.CONTINUE_ON_FAILURE) == true) {
    'Scroll to  Document Sign button '
    WebUI.scrollToElement(findTestObject('Object Repository/Deal Status/Document_Sign_Section/btn_Document Sign'), GlobalVariable.shortTime)

    'Click on Document Sign button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Document_Sign_Section/btn_Document Sign'))

    'Verify Document Sign pop is opened'
    if (WebUI.verifyElementClickable(findTestObject('Object Repository/Deal Status/Document_Sign_Section/header_Document Sign'), 
        FailureHandling.CONTINUE_ON_FAILURE) == true) {
        'Get Document Sig pop up header'
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/Document_Sign_Section/header_Document Sign'), 
            headerDocSign)

        'Click on Me & others button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Document_Sign_Section/btn_Me and others'), 
            GlobalVariable.shortTime)

        'Enter Signer name or id'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Document_Sign_Section/input_addSigner'), 
            addSigner)

        'Click on Add as external button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Document_Sign_Section/btn_Add as external'), 
            GlobalVariable.shortTime)

        File directory = new File('')

        String signDocument = directory.getAbsolutePath() + '\\Data Files\\Property Images\\SignDocument.pdf'

        System.out.println(signDocument)

        'Upload file'
        WebUI.uploadFile(findTestObject('/Deal Status/Document_Sign_Section/btn_Add_file'), signDocument)

        'Click on Request Signature button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Document_Sign_Section/btn_Request Signature'), 
            GlobalVariable.shortTime)

        'Verify Document signature requested successfully alter message'
        CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Document_Sign_Section/alert_Document_signature'), 
            GlobalVariable.shortTime)

        'Clicon on Ok button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Ok'), 
            GlobalVariable.shortTime)
    } else {
        System.out.print('Document Sign pop is not opened')
    }
} else {
    System.out.print('Document Sign button is not clickable')
}