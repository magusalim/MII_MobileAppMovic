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

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Hello, Welcome to Movic'), 0)

Mobile.tap(findTestObject('Object Repository/Home/android.widget.FrameLayout (1)'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - My Order'), 0)

Mobile.tap(findTestObject('Object Repository/Home/android.widget.FrameLayout (2)'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Inbox'), 0)

Mobile.tap(findTestObject('Object Repository/Home/android.widget.FrameLayout (3)'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/Home/android.widget.FrameLayout'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Hello, Welcome to Movic'), 0)

Mobile.tap(findTestObject('Object Repository/Home/android.widget.FrameLayout (5)'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - My Cart'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Home/android.widget.FrameLayout (4)'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - My Voucher'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Home/android.widget.TextView - See All'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Info  Promo'), 0)

Mobile.pressBack()

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Home/android.widget.FrameLayout'), 0)

WebUI.delay(3)

not_run: Mobile.scrollToText('Most Popular')

not_run: Mobile.tap(findTestObject('Object Repository/Home/android.widget.TextView - See All (1)'), 0)

not_run: WebUI.delay(3)

not_run: Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Select Rental'), 0)

not_run: Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Home/android.view.ViewGroup'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Car Rental'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Home/androidx.cardview.widget.CardView'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Airport Transfer'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Home/androidx.cardview.widget.CardView (1)'), 0)

WebUI.delay(3)

Mobile.verifyElementExist(findTestObject('Object Repository/Home/android.widget.TextView - Search Buses  Travel'), 0)

Mobile.pressBack()

WebUI.delay(3)

Mobile.closeApplication()

