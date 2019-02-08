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

GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Dodaj (adresata)'), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 15)

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/obiekty dodatkowe w Slownik/pole Nazwisko w dodawaniu nowego kontrahenta'), 
    15)

WebUI.setText(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/obiekty dodatkowe w Slownik/pole Nazwisko w dodawaniu nowego kontrahenta'), 
    GlobalVariable.losowa_nazwa)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/button OkAndClose uniwersalny'), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('hsi_pl_login/Obiekty powtarzalne/pole nazwisko uniwersalne'), 
    GlobalVariable.losowa_nazwa)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/obiekty dodatkowe w Slownik/button Raport z danych'), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Założył: Naczelny Adam', 15)

