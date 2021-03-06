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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Formaty przesylek dokumentu'), 
    15)

'button Nowy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokin_format_przesylki_menu_nowy_button\']/div']), 
    15)

FormatPrzesylki = ('Format przesylki : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

'Wpisujemy losową nazwę formatu przesyłki'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokument_format_przesylki_nazwa\']']), FormatPrzesylki)

'button Utwórz i zamknij'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDokumentFormatPrzesylkiSaveAndClose\']']), 
    15)

'Wyszukujemy w  tabeli utworzony format przesyłki'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
    FormatPrzesylki)

WebUI.comment('Przechodzimy do kancelari i sprawdzamy czy dodał sie nowy foramt przesyłki')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    15)

'button Zarejestruj nową przesyłkę'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_nowy_button\']/div']), 
    15)

'zakładka Dokument elektroniczny'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Dokument elektroniczny\')]']), 
    15)

'button Wybierz Format danych'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//input[@value=\'Wybierz\'])[5]']), 
    15)

'Wpisujemy w wyszukiwarke nazwę utworzonego formatu przesyłki'
CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
    FormatPrzesylki)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 1 ', 15)

'Klikamy wyszukany format przesyłki'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : FormatPrzesylki]), 15)

