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

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

NowyRodzajPismaWychodzacego()

SprawdzenieCzyRodzajPismaZostalDodany()
SprawdzanieCzyUtworzonyDokumentMaNowoUtworzonyRodzajPisma()
def NowyRodzajPismaWychodzacego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Ustawienia'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Ustawienia/Rodzaje pism wychodzcych'), 
        15)

    'button Dodaj nowy wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_dic_rodzaj_pisma_table\']/div/span']), 
        15)

    LosowaNazwaRodzajuPisma = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    'Wpisujemy losową nazwę pisma'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_rodzaj_pisma[nazwa]\']']), LosowaNazwaRodzajuPisma)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Zapisz\')]']), 
        15)

    'Wyszukujemy dodany rodzaj pisma'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_rodzaj_pisma[nazwa]\']']), 
        LosowaNazwaRodzajuPisma)

    'sprawdzamy czy rodzaj pisma został dodany'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : LosowaNazwaRodzajuPisma]), 15)
}

def SprawdzenieCzyRodzajPismaZostalDodany() {
    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        15)

    'wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[2]']), 15)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/obiekty w Sprawy/button Wychodzcy w akcje sprawy'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button zmien rodzaj pisma'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : LosowaNazwaRodzajuPisma]), 15)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 3 spacje uniwersalny'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Adresaci'), 
        5)

    new help_pack.wait_for_text().Present('Pozycji', 10)

    new help_pack.wait_for_text().not_Present('Proszę czekać...', 15)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button dodaj kontrahenta'), 
        5)

    new help_pack.wait_for_text().Present('Pozycji', 10)

    new help_pack.wait_for_text().not_Present('Proszę czekać...', 15)

    new help_pack.Set_text_and_press_enter().set_text(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/pole nazwisko'), 
        'Kowalski')

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/proponowany kontrahent'), 
        5)

    new help_pack.wait_for_text().not_Present('Proszę czekać...', 15)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button OK'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zmien sposob wysylki'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zaznacz opcje sposobu wysylki'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Odwzorowania'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/button brak w odwzorowania'), 
        15)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/zakladka Metadane'), 
        15)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/odblokuj edycje'), 
        15)

    LosowyTytul = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/pole tytul dokumentu'), 
        LosowyTytul)

    new help_pack.Wait_and_click().Clickable(findTestObject('button', [('xpath') : '//input[@id=\'obi_dokumenty_wychodzace_dalsza_akceptacja\']']), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button Utworz'), 
        15)
}

def SprawdzanieCzyUtworzonyDokumentMaNowoUtworzonyRodzajPisma() {
    'button Rozwiń sprawe'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblSprawyBiezace\']/tbody/tr/td/span']), 
        15)

    'wyszukujemy utworzony dokument'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '(//input[@name=\'tytul\'])[2]']), 
        LosowyTytul)

    'button Szczegóły'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_moje_sprawy_dokument_actions_widok_szczeg_dokout\']/div']), 
        15)
	CustomKeywords.'help_pack.wait_for_text.Present'(LosowaNazwaRodzajuPisma, 10)
}

