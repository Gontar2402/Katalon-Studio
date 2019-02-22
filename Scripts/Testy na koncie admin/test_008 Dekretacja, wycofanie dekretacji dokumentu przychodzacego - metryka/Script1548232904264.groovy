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

tworzenie_dokumentu_przychodzacego()

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'opis\']']), 
    GlobalVariable.losowa_nazwa)

'button Przedłóż do dekretacji'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_przekaz_do_dekretacji\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Przedkładanie do dekretacji', 15)

WebUI.selectOptionByValue(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'przedlozenie[stanowisko]\']']), 
    '1', false)

'button Przedłóż'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Przedłóż\']']), 
    15)

sprawdz_metryke()

'button Cofnij do kancelarnii'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_cofnij_przedlozenie\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Cofnięty\\Odesłany do kancelarii', 15)

sprawdz_metryke_cofniecia()

def tworzenie_dokumentu_przychodzacego() {
    GlobalVariable.losowa_nazwa = ('dek przychodz' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
        15)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

    'Zarejestruj nową przesyłkę'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_nowy_button\']/div']), 
        15)

    'Odblokuj możliwość edycji tytułu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'frmObidokumenty_tabs_wymagane\']/table/tbody/tr[6]/td[2]/label/span']), 
        15)

    'Pole Tytuł'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_opis\']']), GlobalVariable.losowa_nazwa)

    'Pole Data pisma'
    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_pisma\']']), 
        '2019-01-09')

    'zakładka Nadawca'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'frmObidokumenty_tabs\']/ul/li[2]/a']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie...', 15)

    'Pole Nazwisko\r\n'
    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_nazwisko\']']), 
        'Kowalski')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    'proponowany Kontrahent'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblProponowaniAdresaciGrid\']/tbody/tr/td']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnOkAndClose\']']), 
        15)

    'Rozwiń rodzaj odwzorowania'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'s2id_obi_dokumenty_rodzaj_odwzorowania\']/a/span[2]/b']), 
        15)

    'Pełne odwzorowanie cyfrowe'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Pełne odwzorowanie cyfrowe']), 
        15)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Zapisz\']']), 
        15)
}

def sprawdz_metryke() {
    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button szczegoly uniwersalny'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/zakladka Metryka w szczegolach'), 
        5)

    new help_pack.wait_for_text().Present('Przedłożenie dokumentu przychodzącego do dekretacji', 15)

    new help_pack.wait_for_text().Present('Administrator EZD (Adam Naczelny)', 15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
        15)
}

def sprawdz_metryke_cofniecia() {
    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button szczegoly uniwersalny'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/zakladka Metryka w szczegolach'), 
        5)

    new help_pack.wait_for_text().Present('Cofnięcie operacji typu: Przedłożenie', 15)

    new help_pack.wait_for_text().Present('Administrator EZD (Adam Naczelny)', 15)
}

