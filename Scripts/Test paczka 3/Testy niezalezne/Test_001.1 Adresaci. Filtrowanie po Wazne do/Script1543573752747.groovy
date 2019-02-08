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

CustomKeywords.'help_pack.Logowanie.zaloguj'('agnieszka.holak', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 25)

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '1', true)

pobierz_wartosc_i_porownaj()

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '1', true)

pobierz_wartosc_i_porownaj()

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '-1', true)

pobierz_wartosc_i_porownaj_puste()

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '1', true)

pobierz_wartosc_i_porownaj()

def pobierz_wartosc_i_porownaj() {
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    def wartosc_z_komorki = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[27]']))
	
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)
	
	assert wartosc_z_komorki == '2014-07-03'
	
}
def pobierz_wartosc_i_porownaj_puste() {
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

	def wartosc_z_komorki = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[27]']))
	
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)
	
	assert wartosc_z_komorki == ''
	
}
