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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    15)

GlobalVariable.losowa_nazwa = ('Rejestracja przesylki ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

zakladanie_przesylki_nr_1()

zakladanie_przesylki_z_taka_sama_nazwa()

'wyszukaj w tabeli zarejestrowane przesyłki'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'opis\']']), 
    GlobalVariable.losowa_nazwa)

'sprawdza czy wyszukało 2 dokumenty o takim samym tytule'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 2 z 2 łącznie', 15)

'sprawdza czy przesyłka dodała sie poprawnie próbuje edytować przesyłkę '
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_usun_nieewidencjonowany\']/div']), 
    15)

'button anuluj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDokumentCancel\']']), 
    15)

'wiersz drugi'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[2]/td[2]']), 15)

'sprawdza czy przesyłka dodała sie poprawnie próbuje edytować przesyłkę '
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_usun_nieewidencjonowany\']/div']), 
    15)

'button anuluj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDokumentCancel\']']), 
    15)

def zakladanie_przesylki_nr_1() {
    'button Zarejestruj nową przesyłkę'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_nowy_button\']/div']), 
        15)

    'ikona odblokuj możliwość edycji tytułu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//label/span']), 15)

    'wpisz do pola tytuł'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_opis\']']), GlobalVariable.losowa_nazwa)

    WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_opis\']']), Keys.chord(Keys.TAB))

    'pole Data pisma'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_pisma\']']), '2018-12-31')

    'pole Data wpływu'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_wplyniecia\']']), '2018-12-31')

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zakladka Nadawca'))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 25)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola Nazwisko'), 'Kowalski')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/pole pod forumlarzem aby pokaza kontrahenta '), 
        5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 25)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Proponowany kontrahent ktorego szukamy'), 
        5)

    WebUI.delay(1)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button_OK2'), 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/rowzin menu'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Pelne odwzoraowanie cyfrowe'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zapisz nowy dokument przychodzacy'))
}

def zakladanie_przesylki_z_taka_sama_nazwa() {
    'button Zarejestruj nową przesyłkę'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_nowy_button\']/div']), 
        15)

    'ikona odblokuj możliwość edycji tytułu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//label/span']), 15)

    'wpisz do pola tytuł'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_opis\']']), GlobalVariable.losowa_nazwa)

    WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_opis\']']), Keys.chord(Keys.TAB))

    WebUI.waitForAlert(3, FailureHandling.STOP_ON_FAILURE)

    WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

    'pole Data pisma'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_pisma\']']), '2018-12-31')

    'pole Data wpływu'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_wplyniecia\']']), '2018-12-31')

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zakladka Nadawca'))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 25)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola Nazwisko'), 'Damjan')

    WebUI.sendKeys(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola Nazwisko'), Keys.chord(
            Keys.TAB))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 25)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Proponowany kontrahent ktorego szukamy'), 
        5)

    WebUI.delay(1)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button_OK2'), 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/rowzin menu'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Pelne odwzoraowanie cyfrowe'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zapisz nowy dokument przychodzacy'))
}

