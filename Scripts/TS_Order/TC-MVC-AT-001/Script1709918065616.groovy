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

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/androidx.cardview.widget.CardView'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Choose Address'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.EditText - Find Location'), 0)

Mobile.setText(findTestObject('Object Repository/Order/Airport Transfer/android.widget.EditText - Find Location'), 'jakarta', 
    0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Choose Airport'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Date'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.view.View - 20'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Time'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.Button - Choose'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.Button - Search'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.Button - Select'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView -  See All Reviews'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Pickup'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Reschedule Policy'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Refund Policy'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Additional Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Pickup'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Reschedule Policy'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Refund Policy'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.TextView - Additional Payment'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.Button - Continue'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.Button - Order Confirmation'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Airport Transfer/android.widget.FrameLayout'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

