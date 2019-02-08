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

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/stanowisko na zastepowane Wojechech'), 
    '4', true)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'), 
    10)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/testy niezalezne 2/zmiana Rodzaju dokumentu'), 
    'Wewnętrzny', false)

tworzenie_dokumentu()

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'('edycja metadanych' + GlobalVariable.losowa_nazwa, 
    4)

CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

'Edycja Metadanych'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[3]/div/div']), 
    10)

losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

'odblokowanie edycji tytułu'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//label/span']), 10)

'Tytuł'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dok_wew_opis\']']), 'Katalon edycja metadanych' + 
    losowa_nazwa)

'Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[4]']), 10)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'('Katalon edycja metadanych' + losowa_nazwa, 
    4)

CustomKeywords.'help_pack.metryka_sprawdz_statna_czynnosc.szczegoly_metryka_ostatnia_czynnosc1'('Edycja dokumentu wewnętrznego; ;', 
    'Wojewódzki Lekarz Weterynarii (Ludwik Bartoszewicz)')

def tworzenie_dokumentu() {
    GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/button nowy Wew.'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/mozliwosc edycji tytulu'), 
        5)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/do pola tytul nowy dokument wewnetrzny'), 
        'edycja metadanych' + GlobalVariable.losowa_nazwa)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/button utworz i zamknij dokument wewnetrzny'))
}

