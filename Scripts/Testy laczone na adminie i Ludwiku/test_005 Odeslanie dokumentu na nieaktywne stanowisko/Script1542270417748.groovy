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

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/na odpowiednie stanowisko'), 
    '4', true)

dekretacja_tytul_wyszukaj('test_325587')

/*
WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'))

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/do pola tytul w dokumenty do dekretacji'), 
    'test_4065867')

CustomKeywords.'help_pack.wait_for_text.Present'('test_4065867', 10)

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/wyszukany wiersz w tabelido dekretacji'))
*/
WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button Dekretuj'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/stanowisko docelowe Jan'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button OK w dekretacja'))

wyloguj_zaloguj('jan.popielarz')

dekretacja_tytul_wyszukaj('test_325587')

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button Dekretuj'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/stanowisko docelowe Patrycja'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button OK w dekretacja'))

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/pole nazwisko'), 
    'Popielarz')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/wyszukany wiersz w tabeli stanowiska'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/edytuj wybrany wiersz'))

WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/pole wazne do'), '2018-11-11')

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button zapisz edycje wybranego wierszu'))

wyloguj_zaloguj('patrycja.podlasz')

dekretacja_tytul_wyszukaj('test_325587')

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button Odeslij'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button OK w adnotacja'), 
    5)

wyloguj_zaloguj('ludwik.bartoszewicz')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/na odpowiednie stanowisko'), 
    '4', true)

dekretacja_tytul_wyszukaj('test_325587')

szczegoly_metryka_ostatnia_czynnosc('Odesłanie dekretacji dokumentu przychodzącego; do: Wojewódzki Lekarz Weterynarii (Ludwik Bartoszewicz); tryb: Wiodąca', 
    'St.inspektor wet. (Patrycja Podlasz)')

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

CustomKeywords.'help_pack.wait_for_text.Present'('Grupy stanowiska', 10)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/pole nazwisko'), 
    'Popielarz')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/wyszukany wiersz w tabeli stanowiska'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/edytuj wybrany wiersz'))

WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/pole wazne do'), '')

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/button zapisz edycje wybranego wierszu'))

def wyloguj_zaloguj(String login) {
    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'(login, 'gqNiyN/IiIvaUo8G1BKwoQ==')
}

def szczegoly_metryka_ostatnia_czynnosc(String czynnosc, String ostatnia_osoba) {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button szczegoly uniwersalny'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/zakladka Metryka w szczegolach'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.Present'(czynnosc, 15)

    def porownaj = WebUI.getText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_004/wiersz z tabeli z ostatnia czynnoscia'))

    assert porownaj == czynnosc

    def porownaj2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty powtarzalne/ostatnia osoba w metryce dokumentu'))

    assert porownaj2 == ostatnia_osoba

    WebUI.click(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'))
}

def dekretacja_tytul_wyszukaj(String szukany_tekst) {
    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
        5)

    new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'), 
        5)

    new help_pack.Set_text_and_press_enter().set_text(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/do pola tytul w dokumenty do dekretacji'), 
        szukany_tekst)

    new help_pack.wait_for_text().Present(szukany_tekst, 10)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/wyszukany wiersz w tabelido dekretacji'), 
        15)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_005/wyszukany wiersz w tabelido dekretacji'))
}

