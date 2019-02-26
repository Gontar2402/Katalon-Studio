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
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Rodzaje dokumentow wychodzacych'), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

'Nowy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[2]/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

tworzenie_nowego_rodzaju_dkoumentu_wychodzacego()

'Wyszukaj w tabeli utworzony rodzaj dokumentu i kliknij go'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
    NowyRodzajDokumentu)

StworzDokumentWychodzacyWObieguPapieropwym()

'Kliknij button rozwiń sprawe'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblSprawyBiezace\']/tbody/tr[4]/td/span']), 
    15)

'Kliknij utworzony dokument wychodzący'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : NazwaDokumentuWychodzacego]), 
    15)

'Kliknij button szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_moje_sprawy_dokument_actions_widok_szczeg_dokout\']/div']), 
    15)

'Sprzwdz czy w szczegółach dokumentu jest nazwa utworzonego rodzaju dokumentu'
CustomKeywords.'help_pack.wait_for_text.Present'(NowyRodzajDokumentu, 15)

'Kliknij button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

EdytowanieRodzajuDokumentuWychodzacego()
SprawdzCzyRodzajPismaWSzegolachZostalEdytowany()
def tworzenie_nowego_rodzaju_dkoumentu_wychodzacego() {
    NowyRodzajDokumentu = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//td/input']), NowyRodzajDokumentu)

    'Utwórz i zamknij'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[3]']), 15)
}

def EdytowanieRodzajuDokumentuWychodzacego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Rodzaje dokumentow wychodzacych'), 
        15)

    'Wyszukaj w tabeli utworzony rodzaj dokumentu i kliknij go'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
        NowyRodzajDokumentu)

    'Kliknij button Edytuj'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_slownik_rodzaj_pisma_wychodzacego_actions_edit_button\']/div']), 
        15)

    NazwaRodzajuDokumentuPoEdycji = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokument_wychodzacy_rodzaj_pisma_nazwa\']']), 
        NazwaRodzajuDokumentuPoEdycji)

    'Kliknij button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnRodzajpismaSaveChanges\']']), 
        15)

    'Wyszukaj w tabeli edytowany rodzaj dokumentu i kliknij go'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
        NazwaRodzajuDokumentuPoEdycji)
}

def SprawdzCzyRodzajPismaWSzegolachZostalEdytowany() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.wychodzcej'), 
        15)

    'Wyszukaj w tabeli utworzony dokument wychodzacy'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tytul\']']), 
        NazwaDokumentuWychodzacego)

    'Kliknij button szczegóły'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_pelna_informacja\']/div']), 
        15)

    'Sprzwdz czy w szczegółach dokumentu jest nazwa edytowanego rodzaju dokumentu'
    CustomKeywords.'help_pack.wait_for_text.Present'(NazwaRodzajuDokumentuPoEdycji, 15)
}

def StworzDokumentWychodzacyWObieguPapieropwym() {
    NazwaDokumentuWychodzacego = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        15)

    'Kliknij wiersz czwarty w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[4]/td[4]']), 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/obiekty w Sprawy/button Wychodzcy w akcje sprawy'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button zmien rodzaj pisma'), 
        5)

    'Kliknij utworzony wcześniej rodzaj pisma'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : NowyRodzajDokumentu]), 
        10)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 3 spacje uniwersalny'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Adresaci'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycji', 10)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button dodaj kontrahenta'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycji', 10)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/pole nazwisko'), 
        'Kowalski')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/proponowany kontrahent'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button OK'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zmien sposob wysylki'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zaznacz opcje sposobu wysylki'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Odwzorowania'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/button brak w odwzorowania'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/zakladka Metadane'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/odblokuj edycje'), 
        15)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/pole tytul dokumentu'), 
        NazwaDokumentuWychodzacego)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'obi_dokumenty_wychodzace_dalsza_akceptacja\']']), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button Utworz'), 
        15)
}

