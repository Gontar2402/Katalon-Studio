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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/Slownik powodow zastepstw'), 
    15)

Thread.sleep(600)

'button Dodaj nowy wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_slownik_powody_zastepstw_table\']/div/span']), 
    15)

GlobalVariable.losowa_nazwa = ('Losowa przyczyna ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_przyczyna_zastepstwa[nazwa]\']']), GlobalVariable.losowa_nazwa)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)

'wyszukaj przyczyne'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_przyczyna_zastepstwa[nazwa]\']']), 
    GlobalVariable.losowa_nazwa)

'sprawdź czy przyczyna się dodała'
CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.losowa_nazwa, 15)

'wyszukana przyczyna'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : GlobalVariable.losowa_nazwa]), 
    15)

'button Usuń'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'del_admin_slownik_powody_zastepstw_table\']/div/span']), 
    15)

'button potwierdz Usuniecie'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Usuń\')]']), 
    15)

'wyszukaj przyczyne'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_przyczyna_zastepstwa[nazwa]\']']), 
    GlobalVariable.losowa_nazwa)

'sprawdź czy przyczyna się usuneła'
CustomKeywords.'help_pack.wait_for_text.not_Present'(GlobalVariable.losowa_nazwa, 15)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

Dodanie_nowego_zastepstwa_i_sprawdzenie_czy_sie_usunelo()

def Dodanie_nowego_zastepstwa_i_sprawdzenie_czy_sie_usunelo() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        10)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Do pola nazwisko'), 
        'Daniluk')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/Wiersz pierwszy w tabela Stanwiska'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button Nowe zastpestwo'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button zmien osobe zastepujaca'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/wiersz pierwszy '), 
        5)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane od'), '2022-10-09')

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane do'), '2022-10-10')

    'zmień przyczyne zastepstwa'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Zmień\']']), 
        5)

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '(//input[@name=\'nazwa\'])[2]']), 
        GlobalVariable.losowa_nazwa)

    CustomKeywords.'help_pack.wait_for_text.not_Present'(GlobalVariable.losowa_nazwa, 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nie znaleziono żadnych pasujących indeksów', 15)
}

