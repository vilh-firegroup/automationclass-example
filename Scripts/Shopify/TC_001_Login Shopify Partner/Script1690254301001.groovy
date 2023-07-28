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

WebUI.openBrowser('https://www.shopify.com/partners')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Shopify Partner Page/Login Partner Page - Bai 2 - Bai 4/btn_login_partner'))

WebUI.setText(findTestObject('Shopify Partner Page/Login Partner Page - Bai 2 - Bai 4/txt_email_partner'), 'vilh+1@firegroup.io')

WebUI.click(findTestObject('Shopify Partner Page/Login Partner Page - Bai 2 - Bai 4/btn_continue_with_email'))

WebUI.setText(findTestObject('Shopify Partner Page/Login Partner Page - Bai 2 - Bai 4/txt_password_partner'), 'Vile@12345')

WebUI.click(findTestObject('Shopify Partner Page/Login Partner Page - Bai 2 - Bai 4/btn_login_with_password'))

WebUI.closeBrowser()

