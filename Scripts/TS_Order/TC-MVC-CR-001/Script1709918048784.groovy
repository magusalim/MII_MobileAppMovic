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

Mobile.tap(findTestObject('Object Repository/Order/Car/androidx.cardview.widget.CardView'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.TextView - Jl. H. Usman No.29, Lenteng Agung, Kec. Jagakarsa, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12530, Indonesia'), 
    0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.EditText - Find Location'), 0)

Mobile.setText(findTestObject('Object Repository/Order/Car/android.widget.EditText - Find Location'), 'jakarta', 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.TextView - Sun, 10 Mar 2024'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.TextView - Sun, 10 Mar 2024 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.view.View - 20'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.TextView - 0800'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.Button - Batalkan'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.TextView - Car  Driver'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.TextView - Car Only'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.Button - Search'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Car/androidx.appcompat.widget.LinearLayoutCompat'), 0)

Mobile.tap(findTestObject('Object Repository/Order/Car/androidx.appcompat.widget.LinearLayoutCompat (1)'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.Button - See Reviews'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Order/Car/android.widget.Button - Choose Car'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

