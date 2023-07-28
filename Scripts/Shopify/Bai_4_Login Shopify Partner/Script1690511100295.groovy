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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

//def email = 'vilh+1@firegroup.io'
//def password = 'EqVtzLdU21p2p1cXCJVOGA=='

print("=== Start Bai 4 ===")

WebUI.openBrowser(GlobalVariable.spf_partner_url)

WebUI.maximizeWindow()

WebUI.click(button_login_shopify_partner)

WebUI.setText(input_email_partner, email)

WebUI.click(button_continue_with_email)

WebUI.setEncryptedText(input_password_partner, password)

WebUI.click(button_login_with_password)

print("=== End Bai 4 ===")

WebUI.delay(5)

print("=== Start Bai 5 ===")

WebUI.click(button_stores_menu)

WebUI.click(button_add_store)

WebUI.click(button_create_development_store_1)

WebUI.click(rdb_create_store_test_and_build)

WebUI.setText(input_store_name, store_name)

WebUI.click(rdb_start_with_test_data)

WebUI.delay(5)

WebUI.click(button_create_development_store_2)

WebUI.delay(20)

print("=== End Bai 5 ===")

WebUI.delay(5)

print("=== Start Bai 6 ===")

int currentTab = WebUI.getWindowIndex()

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl(GlobalVariable.app_url)

WebUI.setText(input_store_name_shopify, store_name)

WebUI.click(button_log_in_app)

WebUI.click(button_install_app)

WebUI.delay(20)

print("=== End Bai 6 ===")

WebUI.closeBrowser()



