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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('Lista adresatów', 15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

'pobierz nazwisko z wiersza 3'
def Nazwisko = WebUI.getText(findTestObject('pole tekstowe', [('xpath') : '//tr[2]/td[5]']))

'Dodaj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[2]/div']), 
    10)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie...', 15)

'Nazwisko'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//td/input']), Nazwisko)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/button OkAndClose uniwersalny'), 
    10)

WebUI.waitForAlert(5)

def komunikat_z_alertu = WebUI.getAlertText()

assert komunikat_z_alertu == 'Prawdopodobnie dublujesz istniejącego kontrahenta. Kontynuować?'

WebUI.dismissAlert()

