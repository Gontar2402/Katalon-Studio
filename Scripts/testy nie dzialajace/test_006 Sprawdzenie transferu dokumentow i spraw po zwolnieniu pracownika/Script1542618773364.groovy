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

CustomKeywords.'help_pack.Logowanie.zaloguj'('natalia.zukiel', 'gqNiyN/IiIvaUo8G1BKwoQ==')

//def losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)
GlobalVariable.losowa_nazwa = 'Katalon dokument zwolnienie pracownika'+org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

tworzenie_dokumentu()

tworzenie_sprawy()

CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj_na_admin_php'()

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

zwolnij_pracownika_i_wybierz_przejomjacego()

WebUI.delay(1)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/stanowisko na zastepowane Wojechech'), 
    '4', true)

WebUI.delay(5)

sprawdzanie_czy_dokument_dotarl()

sprawdzanie_czy_sprawa_dotarla()

CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj_na_admin_php'()

przywracananie_pracownika_po_zwolnieniu()

awansowanie_pracownika()

def tworzenie_dokumentu() {
    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/button nowy Wew.'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/mozliwosc edycji tytulu'), 
        5)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/do pola tytul nowy dokument wewnetrzny'), 
          GlobalVariable.losowa_nazwa)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/button utworz i zamknij dokument wewnetrzny'))
}

def tworzenie_sprawy() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Nowa sprawa'))

    CustomKeywords.'help_pack.wait_for_text.Present'('Symbol JRWA', 15)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), '2600')

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/odblokuj edycje'))

    CustomKeywords.'help_pack.wait_for_text.Present'('Źródła zaopatrzenia', 15)

    WebUI.delay(1)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button generuj Znak sprawy'))

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Tytul'),
        GlobalVariable.losowa_nazwa)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'))
}

def zwolnij_pracownika_i_wybierz_przejomjacego() {
    WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/do pola nazwisko w tabeli stanowiska'), 
        'Żukiel-Gorszanow')

    WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wyszukany pierwszy wiersz w tabeli stanowiska'))

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Zwolnienie'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/rowzin menu przeyjmujacy obowiazki'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/do pola przejmujacy obowiazki zwolnienie'), 
        'Bartoszewicz Ludwik (Wojewódzki Lekarz Weterynarii)')

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/button_ZAPISZ'))
}

def sprawdzanie_czy_dokument_dotarl() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'))

   

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.losowa_nazwa, 4)
}

def sprawdzanie_czy_sprawa_dotarla() {
    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

    
	CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.losowa_nazwa, 5) 
}

def przywracananie_pracownika_po_zwolnieniu() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('hsi_pl_login/Obiekty powtarzalne/pole nazwisko w tabeli uzytkownicy'), 
        'Żukiel')

    WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/podmenu uzytkownicy/wyszukany pierwszy wiersz w tabeli uzytkownicy'))

    WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/podmenu uzytkownicy/Edytuj wybrany wiersz'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('admin_php/Menu glowne belka gorna/podmenu uzytkownicy/pole wazne do w Edytuj wybrany wiersz'), 
        '')

    WebUI.delay(2)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty powtarzalne/button zapisz'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
        5)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('hsi_pl_login/Obiekty powtarzalne/pole nazwisko w tabeli stanowiska'), 
        'Żukiel')

    WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wyszukany pierwszy wiersz w tabeli stanowiska'))

    WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Edytuj wybrany wiersz'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/pole wazne do w edytuj rekord'), 
        '')

    WebUI.delay(2)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty powtarzalne/button zapisz'))
}

def awansowanie_pracownika() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wyszukany pierwszy wiersz w tabeli stanowiska'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wyszukany pierwszy wiersz w tabeli stanowiska'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/button Awans'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/rozwin menu grupa praw w awans stanowiska'), 
        5)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/pole grupa praw w awans stanowiska'), 
        'Administrator')

    WebUI.setText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/pole nazwa stanowiska w awans pracownika'), 
        GlobalVariable.losowa_nazwa)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/button DALEJ'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/rozwin menu przelozony w awans stanowiska'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wybrany przelozony w awans stanowiska'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button ZAPISZ z duzych liter'), 
        5)
}

