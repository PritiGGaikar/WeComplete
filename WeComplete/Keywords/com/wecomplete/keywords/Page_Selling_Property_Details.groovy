package com.wecomplete.keywords

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert
import org.openqa.selenium.interactions.Actions;
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import java.text.DateFormat
import java.text.SimpleDateFormat


import internal.GlobalVariable

public class Page_Selling_Property_Details {

	public static WebDriver webDriver = DriverFactory.getWebDriver()

	private TestObject headerQuote                        =    findTestObject('Quote/header_Quote')
	private TestObject herderSellPropertyDetails          =    findTestObject('Quote/Selling_Property_Details_Page/header_Selling_Property_Details')
	private TestObject inputSellPrice                     =    findTestObject('Quote/Selling_Property_Details_Page/input_Price_Of_Property')
	private TestObject inputSellPostCode                  =    findTestObject('Quote/Selling_Property_Details_Page/input_Property_PostCode')
	private TestObject buttonManualAddress                =    findTestObject('Quote/Selling_Property_Details_Page/click_Enter_Address_Manually')
	private TestObject inputHouseNo                       =    findTestObject('Quote/Selling_Property_Details_Page/input_House_No')
	private TestObject inputStreetName                    =    findTestObject('Quote/Selling_Property_Details_Page/input_Street')
	private TestObject buttonNoOfSeller                   =    findTestObject('Quote/Selling_Property_Details_Page/Click_No_Of_Seller_Buyer')
	private TestObject buttonCommercial                   =    findTestObject('Quote/Selling_Property_Details_Page/toggle_Commercial')
	private TestObject buttonFreeLeaseHold                =    findTestObject('Quote/Selling_Property_Details_Page/toggle_Leasehold')
	private TestObject inputSellComment                   =    findTestObject('Quote/Selling_Property_Details_Page/input_Comment')
	private TestObject buttonSaveandNext                  =    findTestObject('Quote/Selling_Property_Details_Page/btn_Save and Next')

	@Keyword
	def createSellProperty(String quoteHeader , String sellPropertyHeader , String sellPropertyPrice , String sellPostCode , String sellhouseNo, String sellStreetName , String sellComment){
		headerQuotey(quoteHeader)
		headerSellProperty(sellPropertyHeader)
		enterSellPropertyPrice(sellPropertyPrice)
		enterSellPostCode(sellPostCode)
		clickOnEnterAddressManually()
		enterHouseNo(sellhouseNo)
		entersellStreetName(sellStreetName)
		clickOnNoOfSeller()
		clickOnNProprtyType()
		clickOnFreeLeaseHold()
		enterSellComment(sellComment)
		WebUI.takeScreenshot()
		clickOnSaveandNext()
	}
	@Keyword
	def headerQuotey(String quoteHeader){
		/*WebUI.waitForElementVisible(headerQuote, GlobalVariable.shortTime)
		 String Actuletext = WebUI.getText(headerQuote).trim()
		 WebUI.verifyMatch(Actuletext, quoteHeader, false)
		 */
		try {
			WebUI.waitForElementVisible(headerQuote, GlobalVariable.shortTime)
			String Actuletext = WebUI.getText(headerQuote).trim()
			WebUI.verifyMatch(Actuletext, quoteHeader, false)
			highlight(headerQuote);
			KeywordUtil.logInfo("Get actule text")
			Assert.assertEquals(Actuletext,   Expected)
			KeywordUtil.markPassed("Verifed actule & expected data")
		}
		catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Text not found")
		} catch (Exception e) {

			KeywordUtil.markFailed("Fail to gettext on elementvalue")
		}
	}


	@Keyword
	def headerSellProperty(String sellPropertyHeader){
		WebUI.waitForElementVisible(herderSellPropertyDetails, GlobalVariable.shortTime)
		String Actuletext = WebUI.getText(herderSellPropertyDetails).trim()
		WebUI.verifyMatch(Actuletext, sellPropertyHeader, false)
	}


	@Keyword
	def enterSellPropertyPrice(String sellPropertyPrice){
		WebUI.waitForElementVisible(inputSellPrice, GlobalVariable.shortTime)
		WebUI.setText(inputSellPrice, sellPropertyPrice)
	}

	@Keyword
	def enterSellPostCode(String sellPostCode){
		WebUI.waitForElementVisible(inputSellPostCode, GlobalVariable.shortTime)
		WebUI.setText(inputSellPostCode, sellPostCode)
	}

	@Keyword
	def clickOnEnterAddressManually(){
		WebUI.waitForElementVisible(buttonManualAddress, GlobalVariable.shortTime)
		WebUI.click(buttonManualAddress)
	}

	@Keyword
	def enterHouseNo(String sellhouseNo){
		WebUI.waitForElementVisible(inputHouseNo, GlobalVariable.shortTime)
		WebUI.setText(inputHouseNo, sellhouseNo)
	}

	@Keyword
	def entersellStreetName(String sellStreetName){
		WebUI.waitForElementVisible(inputStreetName, GlobalVariable.shortTime)
		WebUI.setText(inputStreetName, sellStreetName)
	}

	@Keyword
	def clickOnNoOfSeller(){
		WebUI.waitForElementVisible(buttonNoOfSeller, GlobalVariable.shortTime)
		WebUI.click(buttonNoOfSeller)
	}

	@Keyword
	def clickOnNProprtyType(){
		WebUI.waitForElementVisible(buttonCommercial, GlobalVariable.shortTime)
		WebUI.click(buttonCommercial)
	}

	@Keyword
	def clickOnFreeLeaseHold(){
		WebUI.waitForElementVisible(buttonFreeLeaseHold, GlobalVariable.shortTime)
		WebUI.click(buttonFreeLeaseHold)
		KeywordUtil.logInfo("Clicking element")
		KeywordUtil.markPassed("Element has been clicked")
	}

	@Keyword
	def enterSellComment(String sellComment){
		WebUI.waitForElementVisible(inputSellComment, GlobalVariable.shortTime)
		WebUI.setText(inputSellComment, sellComment)
	}

	@Keyword
	def clickOnSaveandNext(){
		/*WebUI.waitForElementVisible(buttonSaveandNext, GlobalVariable.shortTime)
		 WebUI.click(buttonSaveandNext)*/

		try {
			WebUI.waitForElementVisible(buttonSaveandNext, GlobalVariable.shortTime)
			WebUI.click(buttonSaveandNext)
			highlight(buttonSaveandNext);
			KeywordUtil.logInfo("Clicking element")
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			//System.out.println(" Reason for exception: Debug---------------" + e)
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	def highlight(TestObject to){
		WebElement element = WebUiBuiltInKeywords.findWebElement(to);
		JavascriptExecutor js = (JavascriptExecutor)webDriver;
		js.executeScript("arguments[0].setAttribute('style','background: white; border: 3px solid green;');",
				element)
	}
}


