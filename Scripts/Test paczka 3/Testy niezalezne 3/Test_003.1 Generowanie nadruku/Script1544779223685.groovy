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

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr wysyek'), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

WebUI.selectOptionByValue(findTestObject('Wybierz opcje', [('xpath') : '//th[4]/select']), 'Zakopertowana', false)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

'Wyszukany wiersz w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[4]']), 15)

Nazwisko_do_nadruku = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[27]']))

'Nadruk'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[2]/ul/li[3]/div/div']), 
    15)

'Drukuj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa przygotowywanie podglądu...', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Podgląd nadruku koperty', 15)

WebUI.switchToFrame(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Testy niezalezne 3/iframe pogladu nadruku'), 
    10)

'Wyszukaj w dokumencie'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div[3]/div/div/div/button[2]']), 
    15)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input']), Nazwisko_do_nadruku)

'pobieramy do zmiennej  czy w dokumencie znajduje sie nazwisko do nadruku'
liczba_wyszukanych_wynikow = WebUI.getText(findTestObject('pole tekstowe', [('xpath') : '//div/span']))

assert liczba_wyszukanych_wynikow != 'Tekst nieznaleziony'

