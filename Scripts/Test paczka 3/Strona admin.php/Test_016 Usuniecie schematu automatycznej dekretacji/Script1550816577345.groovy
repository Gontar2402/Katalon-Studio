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

UsuniecieSchematuAutomatycznejDekretacji()

DekretacjaAutomatyczna()

DodanieNowegoSchematuAutomatycznejDekretacji()

def UsuniecieSchematuAutomatycznejDekretacji() {
    CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

    CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
        15)

    'Kliknij zakładkę Automatyczna dekretacja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Automatyczna dekretacja\')]']), 
        15)

    'Wyszukaj osobę, którą usuniemy wraz ze schematem automatycznej dekretacji'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_wrk_schemat_dekretacji[nazwisko]\']']), 
        'Zuchowicz')

    'Kliknij wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Zuchowicz']), 15)

    'Kliknij button Usuń wybrany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'del_admin_ustawienia_schematy_dekretacji_table\']/div/span']), 
        15)

    'Kliknij button Usuń'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Usuń\')]']), 
        15)

    'Wyszukaj osobę, którą została usunięta w cele sprawdzeni czy została poprwanie usunięta'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_wrk_schemat_dekretacji[nazwisko]\']']), 
        'Zuchowicz')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Zuchowicz', 15)
}

def DodanieNowegoSchematuAutomatycznejDekretacji() {
    CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

    CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
        15)

    'Przejdź do zakładki Automatyczna dekretacja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Automatyczna dekretacja\')]']), 
        15)

    'Kliknij button Dodaj nowy wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_ustawienia_schematy_dekretacji_table\']/div/span']), 
        15)

    Thread.sleep(600)

    'Wprowadź teskst do pola Uwagi'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//textarea[@id=\'wrk_schemat_dekretacji[uwagi]\']']), 'testowa uwaga')

    'Wprowadź liczbę dni w polu Ilość dni realizacji'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wrk_schemat_dekretacji[czas_realizacji]\']']), 
        '7')

    'Wybierz odpowiednie Stanowisko'
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'wrk_schemat_dekretacji[idstanowisko_referenta]\']']), 
        '---- Zuchowicz Irena (St. insp. fin-księgowy)', false)

    'Wybierz odpowiednie Kategorie dokumentu'
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'wrk_schemat_dekretacji[idkategoria_dokumentu]\']']), 
        ' RASFF', false)

    'Kliknij button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Zapisz\')]']), 
        15)
}

def DekretacjaAutomatyczna() {
    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
        25)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button zarejestruj nowa przesylke'))

    WebUI.verifyElementPresent(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/pole Data pisma'), 
        5)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/pole Data pisma'), '2018-11-14')

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/odblokowanie edycji tytulu'))

    def losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/pole tytul'), 'dekretacja automatyczna' + 
        losowa_nazwa)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button wybierz rodzaj dokumentu'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/dokument RASFF z automatyczna dekretacja'), 
        10)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button OK w Rodzaje dokumentow'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/zakladka nadawca'))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 5)

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/pole nazwisko w nadawcy'), 
        'Kowalski')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/proponowany kontrahent'), 
        5)

    WebUI.delay(1)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button OK w  nadawcy'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/rozwin Rodzaj odwzorowania'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/opcja Pelne odwzorowanie cyfrowe'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button zapisz i przedloz'))

    'Sprawdź czy wyskoczyło okno Przedkładanie do dekretacji'
    CustomKeywords.'help_pack.wait_for_text.Present'('Wskazany dokument/dokumenty zostanie przedłożony do dekretacji:', 
        15)
}

