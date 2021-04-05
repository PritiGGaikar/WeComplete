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

'Verify created property is presenet'
if (WebUI.verifyElementPresent(findTestObject('Dashborad/get_first_Quote_on_tab'), GlobalVariable.shortTime) == true) {
    'Click on Created property'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Dashborad/get_first_Quote_on_tab'), GlobalVariable.shortTime)

    'Verify Deal status page is opened'
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Deal Status/Deal Status_Page'), GlobalVariable.shortTime) == 
    true) {
        /*'Verify opened Property name address '
        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/get_PropertyName'), 
            firstPropertyDetails)*/

        //CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_edit'))
        'Click on Edit button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_edit'), 
            GlobalVariable.shortTime)

        'Verify property details header'
        CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Property Details Section/header_Propert Details'), 
            GlobalVariable.shortTime)

        //CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Property Details Section/image_edit'))
        //WebUI.uploadFile(findTestObject('Deal Status/Property Details Section/image_edit'), 'Data Files/Property Images/Propertyimage1.jpg')
        'Re-enter property Price'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Property Details Section/input_Price'), 
            buyPrice)

        'Enter UPRN'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Property Details Section/input_UPRN'), 
            uprn)

        'Enter Title number'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Property Details Section/input_title number'), 
            titleNumber)

        'Enter Local Authority'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Property Details Section/input_Local Authority'), 
            localAuthority)

        'Enter Flood Risk'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Property Details Section/input_Flood Risk'), 
            floodRisk)

        'Enter Plot Size'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Property Details Section/input_Plot Size'), 
            plotSize)

        'Enter Summary'
        CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Deal Status/Property Details Section/input_Summary'), 
            summary)

        //CustomKeywords.'com.wecomplete.keywords.TestBase.clickElement'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Update'))
        'Click on Update'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Property Details Section/btn_Update'), 
            GlobalVariable.shortTime)

        'Verify alert pop up Details Updated successfully'
        CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Property Details Section/alert_message'), 
            GlobalVariable.shortTime)

        //WebUI.click(findTestObject('Deal Status/Property Details Section/btn_Ok'))
        'Click on Ok'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Deal Status/Property Details Section/btn_Ok'), 
            GlobalVariable.shortTime)

        'Verify Deal status page opened'
        CustomKeywords.'com.wecomplete.keywords.TestBase.isElementPresent'(findTestObject('Object Repository/Deal Status/Deal Status_Page'), 
            GlobalVariable.shortTime)
    } else {
        System.out.print('Deal status page is not opened')
    }
} else {
    System.out.print('Created propery is not present')
}