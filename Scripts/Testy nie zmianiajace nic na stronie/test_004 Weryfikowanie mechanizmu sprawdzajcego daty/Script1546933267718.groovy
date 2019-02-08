import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'))

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty powtarzalne/Zarejestruj nowa przesylke'))

WebUI.waitForElementPresent(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_004/do pola Data pisma'), 
    25)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_004/do pola Data pisma'), 
    '2050-10-25')

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_004/do pola Data nadania'), 
    '2050-10-24', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_004/do pola data wplywu'), 
    '2050-20-17')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_004/button zapisz'))

WebUI.waitForElementPresent(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_004/Data wystawienia pisma nie'), 
    10)

WebUI.verifyTextPresent('Data wystawienia pisma nie może być datą w przyszłości', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Data wystawienia pisma nie może być późniejsza niż data nadania', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Data wystawienia pisma nie może być późniejsza niż data wpływu', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Data wystawienia pisma nie może być późniejsza niż termin na odpowiedź', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Data nadania pisma nie może być późniejsza niż termin na odpowiedź', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Proszę podać datę w formacie: rrrr-mm-dd', false, FailureHandling.CONTINUE_ON_FAILURE)

