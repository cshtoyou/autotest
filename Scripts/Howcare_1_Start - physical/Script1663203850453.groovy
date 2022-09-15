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

Mobile.startExistingApplication('com.gchc.combination')

Mobile.tap(findTestObject('Launch/android.widget.Button - 1_Stg_login_Tab'), 0)

Mobile.tap(findTestObject('Launch/android.widget.Button - 2_permission OK'), 0)

Mobile.tap(findTestObject('Launch/android.widget.TextView - 3_SKIP'), 0)

Mobile.tap(findTestObject('Launch/android.widget.Button - 4_Start'), 0)

Mobile.checkElement(findTestObject('Launch/android.widget.ImageView iv_checkbox_all'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Launch/android.widget.Button - 6_Agree_Self certification'), 0)

Mobile.setText(findTestObject('Launch/android.widget.EditText 7_name input'), '최성호', 0)

Mobile.setText(findTestObject('Launch/android.widget.EditText 8_age_year_input'), '19810126', 0)

Mobile.setText(findTestObject('Launch/android.widget.EditText 9_phone number'), '01030973593', 0)

Mobile.tap(findTestObject('Launch/android.widget.Button - 9_Request authentication result'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 7'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 5'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 9'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 1'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 7'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 5'), 0)

Mobile.tap(findTestObject('Launch/Pass/android.widget.Button - 9'), 0)

Mobile.closeApplication()

