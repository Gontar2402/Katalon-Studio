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

not_run: CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj'()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/stanowisko na zastepowane Wojechech'), 
    '5', true)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'))

WebUI.comment('test step jest wylaczony, ponieważ w tabeli jest tylko jeden element')

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/do pola tytul'), 
    'test48511')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/Tabela dokumenty do dekretacji wiersz 1'), 
    15)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/button Dekretuj'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/stanowisko docelowe zastepowane'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/button OK'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/button Zadekretowane '), 
    15)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/button Przychodzce'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/do pola tytul (zdekretowane)'), 
    'test48511')

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/Tabela zdekretowane dokumenty wiersz 1'), 
    15)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_006/button Wycofaj'))

WebUI.acceptAlert()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'), 
    15)

szczegoly_metryka_statnia_czynnosc()

def szczegoly_metryka_statnia_czynnosc() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/Tabela dokumenty do dekretacji wiersz 1'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button szczegoly uniwersalny'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/zakladka Metryka w szczegolach'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.Present'('Cofnięcie operacji typu: Dekretacja; ze Stanowiska:', 10)

    def porownaj2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty powtarzalne/ostatnia osoba w metryce dokumentu'))

    assert porownaj2 == 'Z-ca Wojewódzkiego Lekarza Weterynarii (Ludwik Bartoszewicz za: Wojciech Tułodziecki)'
}

