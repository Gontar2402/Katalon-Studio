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

not_run: WebUI.navigateToUrl(GlobalVariable.Url)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

tworzenie_sprawy()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/do pola Tytul'), 
    GlobalVariable.losowa_nazwa)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/tabela sprawy wiersz pierwszy'), 
    5)

//def wiersz_1_kolumna_2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/tabela Rejestr korespondencji przychodzacej',
//[('wiersz') : 1, ('kolumna') : 2]), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/button Udostpnij'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Przygotowywanie procesu przedkładania sprawy', 20)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/do pola szczegoly'), GlobalVariable.losowa_nazwa + 
    'test katalon przyjmij zastepowane')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/stanowisko docelowe'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/button przedluz'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/tabela sprawy wiersz pierwszy'), 
    6)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/button Udostpnij'), 
    5)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Przygotowywanie procesu przedkładania sprawy', 20)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/do pola szczegoly'), GlobalVariable.losowa_nazwa + 
    'test katalon odeslij zastepowane')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/stanowisko docelowe'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/button przedluz'))

WebUI.waitForAlert(4, FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/stanowisko na zastepowane Wojechech'), 
    '4', true)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Aktywacja stanowiska', 25)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/button Do przyjecia'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/do pola Uwagi do udostepnienia'), 
    GlobalVariable.losowa_nazwa + 'test katalon przyjmij zastepowane')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/wiersz pierwszy w tabeli sprway do przyjecia'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/button Przyjmij'))

CustomKeywords.'help_pack.wait_for_text.not_Present'(GlobalVariable.losowa_nazwa + 'test katalon przyjmij zastepowane', 
    3)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/do pola Uwagi do udostepnienia'), 
    GlobalVariable.losowa_nazwa + 'test katalon odeslij zastepowane')

CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/wiersz pierwszy w tabeli sprway do przyjecia'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/button Odeslij'))

CustomKeywords.'help_pack.wait_for_text.not_Present'(GlobalVariable.losowa_nazwa + 'test katalon odeslij zastepowane', 10)

def tworzenie_sprawy() {
    def losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    GlobalVariable.losowa_nazwa = ('Udostepnianie spraw ' + losowa_nazwa)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Nowa sprawa'), 
        15)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), '2600')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/odblokuj edycje'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Źródła zaopatrzenia', 25)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie informacji o JRWA...', 25)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button generuj Znak sprawy'), 
        15)

    WebUI.delay(1)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Tytul'), GlobalVariable.losowa_nazwa)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'), 
        15)
}

