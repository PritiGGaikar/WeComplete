package com.wecomplete.keywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Page_Login {

	private TestObject inputUserName   =   findTestObject('Object Repository/login_Page/input_login_id')
	private TestObject inputPassword   =   findTestObject('Object Repository/login_Page/input_Password')
	private TestObject buttonLogin     =   findTestObject('Object Repository/login_Page/btn_login')

	@Keyword
	def login(String userName , String password){
		enterUserName(userName)
		enterPassword(password)
		WebUI.takeScreenshot()
		clickOnLoginButton()
	}


	@Keyword
	def enterUserName(String userName){
		WebUI.waitForElementVisible(inputUserName, GlobalVariable.shortTime)
		WebUI.setText(inputUserName, userName)
	}

	@Keyword
	def enterPassword(String password){
		WebUI.waitForElementVisible(inputPassword, GlobalVariable.shortTime)
		WebUI.setText(inputPassword, password)
	}

	@Keyword
	def clickOnLoginButton(){
		WebUI.waitForElementVisible(buttonLogin, GlobalVariable.shortTime)
		WebUI.click(buttonLogin)
	}
}
