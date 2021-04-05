package com.wecomplete.keywords

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Login_URL {


	@Keyword
	def loginURL(String baseURL){
		WebUI.navigateToUrl(baseURL + "/ph", FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def legalURL(String baseURL){
		WebUI.navigateToUrl(baseURL + '/legal', FailureHandling.STOP_ON_FAILURE)
	}
}


