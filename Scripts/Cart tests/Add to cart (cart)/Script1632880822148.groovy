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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.vercel.store/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_Accept cookies'))

'Select product\r\n'
WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/img_80.00 USD_ProductCard_productImage__2DvT0'))

'Add to cart'
WebUI.click(findTestObject('Object Repository/Page_Black Hat - ACME Storefront/button_Add To Cart'))

'Go to full page cart'
WebUI.click(findTestObject('Object Repository/Page_Black Hat - ACME Storefront/h2_My Cart'))

'Check if the item was added correctly one time'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_80.00'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_80.00_Quantity_actions__wWpcD'))

'Check if the amount changed to the new value'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_160.00'), 
    0)

'Go to the item page'
WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_Black Hat'))

'Add the item again'
WebUI.click(findTestObject('Object Repository/Page_Black Hat - ACME Storefront/button_Add To Cart'))

'Go to full page cart'
WebUI.click(findTestObject('Object Repository/Page_Black Hat - ACME Storefront/h2_My Cart'))

'Check if new amount is correct'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_240.00'), 
    0)

'Empty Cart'
WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_80.00_Quantity_actions__wWpcD_1'))

'Check if cart is empty'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/h2_Your cart is empty'), 
    0)

WebUI.closeBrowser()

