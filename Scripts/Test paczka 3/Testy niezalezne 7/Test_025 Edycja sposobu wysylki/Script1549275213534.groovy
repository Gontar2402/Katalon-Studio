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

ObecnyProfilWysylki = ''

ObecnyRodzajZpo = ''

ProfilWysylkiPoEdycji = ''

RodzajZpoPoEdycji = ''

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Sposoby wysylki'), 
    15)

LosowaNazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

CustomKeywords.'help_pack.wait_for_text.Present'('Sposoby wysyłki dokumentów', 15)

'wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[2]']), 15)

pobieranie_danych()

'button Edycja'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokout_sposob_wysylki_menu_edycja_button\']/div']), 
    15)

if (ObecnyProfilWysylki == 'Standardowy') {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//form[@id=\'frmObidokoutsposobywyslki\']/table/tbody/tr[2]/td/select']), 
        'Każdy dokument w osobnej kopercie', false)
} else {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//form[@id=\'frmObidokoutsposobywyslki\']/table/tbody/tr[2]/td/select']), 
        'Standardowy', false)
}

if (ObecnyRodzajZpo == 'Brak ZPO') {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//form[@id=\'frmObidokoutsposobywyslki\']/table/tbody/tr[3]/td/select']), 
        'ZZPO', false)
	
	'liczba dni'
	WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokument_wychodzacy_sposob_wysylki_ilosc_dni_zpo\']']),
		'2')
	
} else {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//form[@id=\'frmObidokoutsposobywyslki\']/table/tbody/tr[3]/td/select']), 
        'Brak ZPO', false)
}

'wpisz nową, losową nazwę sposobu przysyłania'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokument_wychodzacy_sposob_wysylki_nazwa\']']), 
    LosowaNazwa)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnSposobwyslkiSaveChanges\']']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(LosowaNazwa, 2)

sprawdzenie_czy_dane_zostaly_zmienione()

def pobieranie_danych() {
    ObecnyProfilWysylki = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[3]']))

    ObecnyRodzajZpo = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[4]']))

    println(ObecnyRodzajZpo)
}

def sprawdzenie_czy_dane_zostaly_zmienione() {
    ProfilWysylkiPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[3]']))

    RodzajZpoPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[4]']))

    assert ObecnyProfilWysylki != ProfilWysylkiPoEdycji

    assert ObecnyRodzajZpo != RodzajZpoPoEdycji
}

