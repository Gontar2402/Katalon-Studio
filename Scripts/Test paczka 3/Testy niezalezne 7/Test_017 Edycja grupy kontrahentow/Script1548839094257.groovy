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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    15)

'button Grupy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[3]/div']), 
    15)

'Dodaj grupe'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[4]/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Nowa grupa kontrahentów', 15)

losowa_grupa_kontrahentow = ('grupa: ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

'Do pola Nazwa wpisz losową nazwę grupy'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_osoby_grupy_nazwa\']']), losowa_grupa_kontrahentow)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnOsobyGrupySave\']']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(losowa_grupa_kontrahentow, 3)

'button Edytuj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li[2]/div/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Edycja grupy kontrahentów', 15)

losowa_grupa_kontrahentow_edycja = ('grupa po edycji: ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

'Do pola Nazwa wpisz losową nazwę grupy'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_osoby_grupy_nazwa\']']), losowa_grupa_kontrahentow_edycja)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnOsobyGrupySave\']']), 
    15)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
    '')

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(losowa_grupa_kontrahentow_edycja, 
    3)

'button usuń'
WebUI.click(findTestObject('button', [('xpath') : '//li[11]/ul/li[2]/div[2]/div']), FailureHandling.OPTIONAL)

