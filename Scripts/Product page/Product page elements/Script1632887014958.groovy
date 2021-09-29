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

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/svg_Add To Cart_Collapse_icon__1PlZL'))

WebUI.click(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/svg_Add To Cart_Collapse_icon__1PlZL'))

'Verify Care text shown correctly'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/div_This is a limited edition production ru_79e120'), 
    0)

'Verify Details text shown correctly'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/div_This is a limited edition production ru_82e1f1'), 
    0)

'Verify "Add to cart" displayed correctly'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'), 0)

'Verify "Add to cart" clickability'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_Add To Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xs'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_s'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_m'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_l'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xl'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xxl'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_color_Button_root__24MxS Swatch_swat_a3e6f3'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xs'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_s'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_m'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_l'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_xxl'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_T-Shirt - ACME Storefront/button_color_Button_root__24MxS Swatch_swat_a3e6f3'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

