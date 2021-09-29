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

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/a_All'))

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/a_Trending'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/img_249.99 USD_ProductCard_productImage__2DvT0'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/a_Latest arrivals'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_Long Sleeve Shirt'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_Long Sleeve Shirt'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/a_Price Low to high'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_Short-Sleeve Unisex T-Shirt'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_Short-Sleeve Unisex T-Shirt'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/a_Price High to low'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/img_249.99 USD_ProductCard_productImage__2DvT0'), 
    0)

WebUI.closeBrowser()

