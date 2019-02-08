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



WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_004/zmiana stanowiska'), 
    '4', false)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    5)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

CustomKeywords.'help_pack.Tworzenie_sprawy.tworzenie_sprawy'('wiele przesylek')


not_run: wyszukiwanie_w_tabeli_odpowiedniego_wiersza()

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.Nazwa_sprawy, 5)

tworzenie_dokumentu_wychodzacego()

'Rozwin sprawe'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblSprawyBiezace\']/tbody/tr/td']), 
    15)

'Rozwin dokument powiazany ze sprawa'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td/div/div[2]/table/tbody/tr/td/span']), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('Adresaci', 15)

'wyszukaj w tabeli odpowiednią przesyłkę '
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'_sposob_wysylki\']']), 
    'Kurier')

'wyszukaj w tabeli odpowiednią przesyłkę '
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'_sposob_wysylki\']']), 
    'ePUAP')

'wyszukaj w tabeli odpowiednią przesyłkę '
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'_sposob_wysylki\']']), 
    'Poczta elektroniczna (email)')

'wyszukaj w tabeli odpowiednią przesyłkę '
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'_sposob_wysylki\']']), 
    'Poczta')

def tworzenie_dokumentu_wychodzacego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/obiekty w Sprawy/button Wychodzcy w akcje sprawy'), 
        5)
	
	GlobalVariable.losowa_nazwa = 'wiele wys '+org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)
	
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button zmien rodzaj pisma'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja Decyzja'), 
        5)

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

    'Zaznacz wszytko'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Odwzorowania'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/button brak w odwzorowania'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/zakladka Metadane'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/odblokuj edycje'), 
        5)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/pole tytul dokumentu'), 
        GlobalVariable.losowa_nazwa)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button Utworz'), 
        5)
}



def wyszukiwanie_w_tabeli_odpowiedniego_wiersza() {
    int rozwin_wiersz = 2

    def xpath_wiersza = ('//table[@id=\'tblSprawyBiezace\']/tbody/tr[' + rozwin_wiersz) + ']/td'

    for (int liczba_prob = 1; liczba_prob < 25; liczba_prob++) {
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 5)

        CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od ', 5)

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

        def czy_znaleziono_napis = WebUI.verifyTextPresent('Pozycji 0 z 0 dostępnych', false, FailureHandling.OPTIONAL)

        println(czy_znaleziono_napis)

        if (czy_znaleziono_napis == true) {
            println('nie ma napisu')

            xpath_wiersza = (('//table[@id=\'tblSprawyBiezace\']/tbody/tr[' + rozwin_wiersz) + ']/td[5]')

            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 5)

            GlobalVariable.zmienna_pomocna = WebUI.getText(findTestObject('button', [('xpath') : xpath_wiersza]))

            liczba_prob = 10
        } else {
            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 5)

            rozwin_wiersz++

            xpath_wiersza = (('//table[@id=\'tblSprawyBiezace\']/tbody/tr[' + rozwin_wiersz) + ']/td')

            println('nie udana proba')
        }
    }
}

