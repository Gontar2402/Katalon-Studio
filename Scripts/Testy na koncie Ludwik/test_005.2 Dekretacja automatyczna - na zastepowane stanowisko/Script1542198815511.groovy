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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    25)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/na stanowisko zastepowane'), 
    '5', false)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button zarejestruj nowa przesylke'), 
    15)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/pole Data pisma'), '2018-11-14')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/odblokowanie edycji tytulu'))

def losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/pole tytul'), 'dekretacja automatyczna' + 
    losowa_nazwa)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button wybierz rodzaj dokumentu'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/Dokument Sprawa kadrowa'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/Dokument inne pismowniosek Ludwik'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button OK w Rodzaje dokumentow'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/zakladka nadawca'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 5)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/pole nazwisko w nadawcy'), 
    'Kowalski')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/proponowany kontrahent'), 
    5)

WebUI.delay(1)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button OK w  nadawcy'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/rozwin Rodzaj odwzorowania'), 
    4)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/opcja Pelne odwzorowanie cyfrowe'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button zapisz i przedloz'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/do pola tutul w tabeli rejestr kores przych'), 
    'dekretacja automatyczna' + losowa_nazwa)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 1', 10)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/wyszukany wiersz'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button szczegoly'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/zakladka metryka'))
Thread.sleep(400)
def porownaj = WebUI.getText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/ostatnia czynnosc'))

assert porownaj == 'Przedłożenie i dekretacja w trybie dekretacji uproszczonej; na: Radca prawny (Ludwik Bartoszewicz za: Beata Romanowicz); tryb: Wiodąca'

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button OK w metryce'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button cofnij do kancelari'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_005/button usun'), 
    5)

WebUI.acceptAlert()

