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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.time.LocalDateTime as LocalDateTime

String xpath = ('//*[@id="' + currentDate()) + '"]'

System.out.println(xpath)

TestObject to = new TestObject('objectName')

to.addProperty('xpath', ConditionType.EQUALS, xpath)

'Click on current date of calendar'
CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(to, GlobalVariable.shortTime)

'Verify Conveyancer tab is present'
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Deal Status/Calendar/Conveyancer Steps/tab_Conveyancer Steps'), 
    GlobalVariable.shortTime, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    'Click on Parent step drop down'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Calendar/Conveyancer Steps/parent_step_DD'), 
        GlobalVariable.shortTime)

    'Select  on Parent step from drop down'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Calendar/Conveyancer Steps/parent_Step_value'), 
        GlobalVariable.shortTime)

    'Click on Update button'
    CustomKeywords.'com.wecomplete.keywords.TestBase.clickUsingJS'(findTestObject('Object Repository/Deal Status/Calendar/Conveyancer Steps/btn_Update'), 
        GlobalVariable.shortTime)
	
	WebUI.delay(GlobalVariable.shortTime)
	
} else {
    System.out.print('Conveyancer tab is not present')
}


def currentDate() {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern('d-MMMM-yyyy')

    LocalDateTime now = LocalDateTime.now()

    System.out.println(dateFormat.format(now))

    return dateFormat.format(now)
}

