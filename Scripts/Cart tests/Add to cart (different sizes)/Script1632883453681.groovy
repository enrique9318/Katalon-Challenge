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

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/img_160.12 USD_ProductCard_productImage__2DvT0'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/img_My Cart_CartItem_productImage__DGtit'))

'Select Small Size'
WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_s'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/img_My Cart_CartItem_productImage__DGtit'))

'Select Medium Size'
WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_m'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/img_My Cart_CartItem_productImage__DGtit'))

'Select Large Size'
WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_l'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/img_My Cart_CartItem_productImage__DGtit'))

'Select Extra Large Size'
WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xl'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/img_My Cart_CartItem_productImage__DGtit'))

'Select Extra Extra Large Size'
WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xxl'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/h2_My Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/span_960.72'), 
    0)

WebUI.closeBrowser()

