import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy laczone na adminie i Ludwiku\\test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika\\20181126_111911\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('natalia.zukiel', 'gqNiyN/IiIvaUo8G1BKwoQ==')

//def losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)
not_run: GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

not_run: tworzenie_dokumentu()

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    5)

not_run: tworzenie_sprawy()

not_run: CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj_na_admin_php'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: zwolnij_pracownika_i_wybierz_przejomjacego()

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_003/stanowisko na zastepowane Wojechech'), 
    '4', true)

not_run: sprawdzanie_czy_dokument_dotarl()

not_run: sprawdzanie_czy_sprawa_dotarla()

not_run: CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj_na_admin_php'()

przywracananie_pracownika_po_zwolnieniu()

awansowanie_pracownika()

def tworzenie_dokumentu() {
    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/button nowy Wew.'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/mozliwosc edycji tytulu'), 
        5)

    WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/do pola tytul nowy dokument wewnetrzny'), 
        'Katalon dokument zwolnienie pracownika' + GlobalVariable.losowa_nazwa)

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/button utworz i zamknij dokument wewnetrzny'))
}

def tworzenie_sprawy() {
    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/button Nowa sprawa'))

    WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), 
        '2600')

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/odblokuj edycje'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/button generuj Znak sprawy'))

    WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/do pola Tytul'), 
        'Katalon sprawa zwolnienie pracownika' + GlobalVariable.losowa_nazwa)

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'))
}

def zwolnij_pracownika_i_wybierz_przejomjacego() {
    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/do pola nazwisko w tabeli stanowiska'), 
        'Żukiel-Gorszanow')

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wyszukany pierwszy wiersz w tabeli stanowiska'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_002/button Zwolnienie'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/rowzin menu przeyjmujacy obowiazki'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/do pola przejmujacy obowiazki zwolnienie'), 
        'Bartoszewicz Ludwik (Wojewódzki Lekarz Weterynarii)')

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/button_ZAPISZ'))
}

def sprawdzanie_czy_dokument_dotarl() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        5)

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/pole tytul dokumenty biezace'), 
        GlobalVariable.losowa_nazwa)
}

def sprawdzanie_czy_sprawa_dotarla() {
    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/pole tytul sprawy w tabeli'), 
        GlobalVariable.losowa_nazwa)
}

def przywracananie_pracownika_po_zwolnieniu() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/pole nazwisko w tabeli uzytkownicy'), 
        'Żukiel')

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu uzytkownicy/wyszukany pierwszy wiersz w tabeli uzytkownicy'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu uzytkownicy/Edytuj wybrany wiersz'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu uzytkownicy/pole wazne do w Edytuj wybrany wiersz'), 
        '')

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/button zapisz'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
        5)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/pole nazwisko w tabeli stanowiska'), 
        'Żukiel')

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wyszukany pierwszy wiersz w tabeli stanowiska'))

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Edytuj wybrany wiersz'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/pole wazne do w edytuj rekord'), 
        '')

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/button zapisz'))
}

def awansowanie_pracownika() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wyszukany pierwszy wiersz w tabeli stanowiska'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/button Awans'), 
        5)

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/rozwin menu grupa praw w awans stanowiska'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/pole grupa praw w awans stanowiska'), 
        'Administrator')

    WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/pole nazwa stanowiska w awans pracownika'), 
        GlobalVariable.losowa_nazwa)

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/button DALEJ'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/rozwin menu przelozony w awans stanowiska'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Stanowiska/Awans stanowiska/wybrany przelozony w awans stanowiska'), 
        5)

    WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/button ZAPISZ z duzych liter'))
}

''', 'Test Cases/Testy laczone na adminie i Ludwiku/test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika', new TestCaseBinding('Test Cases/Testy laczone na adminie i Ludwiku/test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
