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

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_Shop All_WishlistButton_root__1LnSA _c2e67f'))

WebUI.setText(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG'), 
    'hernaez@edb.com.py')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG_1'), 
    '5GAhx+qaOt+LpHtjMBfzBg==')

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/svg_Shop All_WishlistButton_icon__30qku'))

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/svg'))

WebUI.verifyImagePresent(findTestObject('Page_ACME Storefront  Powered by Next.js Co_01c2ce/img_80.00 USD_ProductCard_productImage__2DvT0'))

