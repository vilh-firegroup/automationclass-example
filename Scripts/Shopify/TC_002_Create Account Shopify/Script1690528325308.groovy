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

def emails = new String[3]

emails[0] = 'vilh@firegroup.io'
emails[1] = 'vilh+1@firegroup.io'
emails[1] = 'vilh+2@firegroup.io'

def customer_info = [
	customer1:[
		first_name: 'vĩ 1',
		last_name: 'lê 1',
		email: 'vilh+1@firegroup.io'
		],
		
	customer2:[
		firt_name: 'vĩ 2',
		last_name: 'lê 2',
		email: 'vilh+2@firegroup.io'
		]
]


WebUI.openBrowser(GlobalVariable.store_url)

WebUI.maximizeWindow()

WebUI.setText(input_first_name, customer_info.customer1.first_name)

WebUI.setText(input_last_name, customer_info.customer1.last_name)

addEmail(input_email, customer_info.customer1.email)

def addEmail(def iput_email, def email){
	for(int i=0;i<=5;i++)
	{
	WebUI.setText(input_email, email)
}
}
WebUI.setEncryptedText(input_password, password)

WebUI.click(button_create)




