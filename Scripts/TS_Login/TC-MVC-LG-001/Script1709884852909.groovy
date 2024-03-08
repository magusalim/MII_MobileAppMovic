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

Mobile.startExistingApplication('id.astra.adp.movic')

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Sign in with Google'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.LinearLayout'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.FrameLayout'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - View and Edit Profile'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Login/android.widget.TextView - magusalim354gmail.com'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Logout'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - OK'), 0)

Mobile.closeApplication()

