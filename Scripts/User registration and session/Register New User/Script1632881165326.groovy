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

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/svg_Shop All_WishlistButton_icon__30qku'))

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/a_Sign Up'))

'Name to register'
WebUI.setText(findTestObject('Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG'), 'Enrique')

'Lastname to register'
WebUI.setText(findTestObject('Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG_1'), 
    'Prueba')

'email to register (change or delete from user database before running test)'
WebUI.setText(findTestObject('Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG_1_2'), 
    'enrique.hernaez@gmail.com')

'Password to register'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG_1_2_3'), 
    'LjDxI+kZtNr+9TBnVwFHRA==')

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/svg_Created by_h-6 w-6'))

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/svg_Shop All_WishlistButton_icon__30qku'))

WebUI.setText(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG'), 
    'enrique.hernaez@gmail.com')

'Incorrect password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG_1_2_3'), 
    'ecCRzUxU9HjTtcHAzKAn7g==')

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_Log In'))

'Checks if the wrong password fails'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/div_Cannot find an account that matches the_ef9cb7'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG'), 
    'enrique.hernaez93@gmail.com')

'Correct password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/input_Created by_Input_root__2vmVG_1_2_3'), 
    'LjDxI+kZtNr+9TBnVwFHRA==')

WebUI.click(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/button_Log In'))

'Checks if the correct password works'
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_ACME Storefront  Powered by Next.js Co_01c2ce/div_Cannot find an account that matches the_ef9cb7'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

