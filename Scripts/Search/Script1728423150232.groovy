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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.sanketdudhe.online/login')

WebUI.setText(findTestObject('Object Repository/qa_automation/Page_Login  Digital Advancer/input_Email_email'), 'mrunalshivarkar21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/qa_automation/Page_Login  Digital Advancer/input_Password_password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/qa_automation/Page_Login  Digital Advancer/a_Accept'))

WebUI.click(findTestObject('Object Repository/qa_automation/Page_Login  Digital Advancer/button_Login'))

WebUI.setText(findTestObject('Object Repository/qa_automation/Page_Home  Digital Advancer/input_Start learning from best platform_query'), 
    'advanced')

WebUI.click(findTestObject('Object Repository/qa_automation/Page_Home  Digital Advancer/button_Search'))

WebUI.closeBrowser()

