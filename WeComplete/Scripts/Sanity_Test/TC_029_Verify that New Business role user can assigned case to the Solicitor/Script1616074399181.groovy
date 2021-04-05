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

WebUI.callTestCase(findTestCase('common_test _cases/do_sign out'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Login as solicitor'
WebUI.callTestCase(findTestCase('common_test _cases/login_Page'), [('headerDashboard') : headerDashboard, ('loginId') : solicitor
        , ('Password') : Password, ('baseEAUrl') : baseSFUrl], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.longTime)

'Visiable Quote Accepted tab '
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dashborad/tab_Quotes Accepted'), GlobalVariable.shortTime) == 
true) {
    'Click on Quote Accepted tab'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Dashborad/tab_Quotes Accepted'), 
        GlobalVariable.shortTime)

    'Scroll to filter icon'
    WebUI.scrollToElement(findTestObject('Object Repository/Dashborad/icon_Filter'), GlobalVariable.shortTime)

    'Click on filter icon'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Dashborad/icon_Filter'), 
        GlobalVariable.shortTime)

    'Select Property type Commercial'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/toggle_Commercial'), 
        GlobalVariable.shortTime)

    'Select Property Leasehold'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Quote/Selling_Property_Details_Page/toggle_Leasehold'), 
        GlobalVariable.shortTime)

    'Enter Post code '
    CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Dashborad/input_Property Post Code'), 
        postCode)

    'Verify Apply button is clickable'
    if (WebUI.verifyElementClickable(findTestObject('Object Repository/Dashborad/btn_Apply'), FailureHandling.STOP_ON_FAILURE) == 
    true) {
        'Click on Apply button'
        CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Dashborad/btn_Apply'), 
            GlobalVariable.shortTime)

        'Verify Created Quote is available'
        if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dashborad/get_first_Quote_on_tab'), GlobalVariable.shortTime) == 
        true) {
            'Verify created Sell/ Buy quote displayed on tab'
            CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Dashborad/get_first_Quote_on_tab'), 
                firstPropertyDetails)

            'Verify Assigned to button is clickable'
            if (WebUI.verifyElementClickable(findTestObject('Dashborad/btn_AssignTo'), FailureHandling.STOP_ON_FAILURE) == 
            true) {
                'Click on Assigned to button'
                CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Dashborad/btn_AssignTo'), 
                    GlobalVariable.shortTime)

                'Verify Case Assignment is opnened'
                if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dashborad/Assign To Section/title_Case Assignment'), 
                    GlobalVariable.shortTime, FailureHandling.STOP_ON_FAILURE) == true) {
                    'Verify that Case Assignment pop up title'
                    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Dashborad/Assign To Section/title_Case Assignment'), 
                        titleAssignto)

                    'Enter user name'
                    CustomKeywords.'com.wecomplete.keywords.TestBase.sendkeyElement'(findTestObject('Object Repository/Dashborad/Assign To Section/input_userName'), 
                        userName)

                    'Select user'
                    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Dashborad/Assign To Section/select_user'), 
                        GlobalVariable.shortTime)

                    'Click on Update'
                    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Dashborad/Assign To Section/btn_Update'), 
                        GlobalVariable.shortTime)

                    'Verify assigned Estate agent'
                    CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Dashborad/get_AssigedUser'), 
                        assinedSolicitorName)

                    'Click on Created property'
                    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Dashborad/get_first_Quote_on_tab'), 
                        GlobalVariable.shortTime)

                    'Verify Deal status page opened'
                    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Deal Status/Deal Status_Page'), GlobalVariable.shortTime, 
                        FailureHandling.STOP_ON_FAILURE) == true) {
                        'Verify that assigned EA property opened'
                        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/get_PropertyName'), 
                            firstPropertyDetails /* 'Verify Assigned estate agent name displayed in property details section'
                        CustomKeywords.'com.wecomplete.keywords.TestBase.getText'(findTestObject('Object Repository/Deal Status/get_EstateAgentName'), 
                            solicitorName)*/ )
                    } else {
                        System.out.print('Deal status page is not opened')
                    }
                } else {
                    System.out.print('Case Assign Pop up is not opened')
                }
            } else {
                System.out.print('Assigned to button is not clickable')
            }
        } else {
            System.out.print('Quote not available')
        }
    } else {
        System.out.print('Apply button is not clickable')
    }
} else {
    System.out.print('Accepted tan not  visible')
}