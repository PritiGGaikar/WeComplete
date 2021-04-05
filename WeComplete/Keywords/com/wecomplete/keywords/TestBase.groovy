package com.wecomplete.keywords
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


class TestBase {

	//public static WebDriver driver= null;
	public static WebDriver webDriver = DriverFactory.getWebDriver()
	/**
	 * Refresh browser
	 */
	@Keyword
	def static refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */

	@Keyword
	def clickElement(TestObject to) {

		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			element.click()
			highlight(to);
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

	@Keyword
	def clickUsingJS(TestObject to, int timeout)
	{
		try {
			WebDriver driver = DriverFactory.getWebDriver()
			WebElement element = WebUiCommonHelper.findWebElement(to, timeout)
			JavascriptExecutor executor = ((driver) as JavascriptExecutor)
			executor.executeScript('arguments[0].click()', element)
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
	@Keyword
	def isElementPresent(TestObject to, int timeout){
		try {


			WebElement element = WebUiBuiltInKeywords.findWebElement(to, timeout);
			highlight(to);

			if (element != null) {
				KeywordUtil.markPassed("Element has been present")
			}

			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Element is not present")
		}

		return false;
	}
	@Keyword
	def isElementVisible(TestObject to, int timeout){
		try {


			WebElement element = WebUiBuiltInKeywords.findWebElement(to, timeout);
			highlight(to);
			element.displayed();
			KeywordUtil.markPassed("Element has been visible")

		} catch (Exception e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element is not visible")
		}

		return false;
	}
	@Keyword
	def sendkeyElement(TestObject to ,String value){
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			element.clear();
			highlight(to);
			KeywordUtil.markPassed("Element has been cleared")
			element.sendKeys(value)

			KeywordUtil.markPassed("Sendkey value has been send")
		}
		catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {

			KeywordUtil.markFailed("Fail to send on elementvalue")
		}
	}

	@Keyword
	def rightclickElement(TestObject to) {
		try {

			Actions actions = new Actions(webDriver);
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			actions.contextClick(element).perform();

			KeywordUtil.logInfo("Clicking element")
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {

			KeywordUtil.markFailed("Fail to click on element")
		}
	}


	@Keyword
	def getText(TestObject to , String Expected) {
		try {
			String Actuletext = WebUiBuiltInKeywords.findWebElement(to).getText().trim();
			highlight(to);
			KeywordUtil.logInfo("Get actule text")
			Assert.assertEquals(Actuletext, Expected)
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
	def SelectDD(TestObject to ,String value){
		try {

			Select dd = new Select(WebUiBuiltInKeywords.findWebElement(to));
			KeywordUtil.markPassed("Dropdown has been selected")
			dd.selectByVisibleText(value);
			KeywordUtil.markPassed("Dropdown value has been selected")
		}
		catch (WebElementNotFoundException e) {
			Assert.fail(e.getMessage());
			KeywordUtil.markFailed("Dropdown not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to select on elementvalue")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

}