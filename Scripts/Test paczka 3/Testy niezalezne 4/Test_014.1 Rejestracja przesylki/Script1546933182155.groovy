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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    15)

'button Zarejestruj nową przesyłkę'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_nowy_button\']/div']), 
    15)

'ikona odblokuj możliwość edycji tytułu'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//label/span']), 15)

GlobalVariable.losowa_nazwa = ('Rejestracja przesylki ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

'wpisz do pola tytuł'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_opis\']']), GlobalVariable.losowa_nazwa)

'pole Data pisma'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_pisma\']']), '2018-12-31')

'pole Data wpływu'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_wplyniecia\']']), '2018-12-31')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zakladka Nadawca'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 5)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola Nazwisko'), 'Kowalski')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/pole pod forumlarzem aby pokaza kontrahenta '), 
    5)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Proponowany kontrahent ktorego szukamy'), 
    5)

WebUI.delay(1)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button_OK2'), 5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/rowzin menu'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Pelne odwzoraowanie cyfrowe'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zapisz nowy dokument przychodzacy'))

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'opis\']']), 
    GlobalVariable.losowa_nazwa)

