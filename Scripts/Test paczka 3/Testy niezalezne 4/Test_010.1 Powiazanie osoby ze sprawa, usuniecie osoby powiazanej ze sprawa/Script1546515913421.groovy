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

tworzenie_sprawy()

'Wyszukuje w tabeli sprawe'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.losowa_nazwa, 5)

'button Osoby'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[3]/div/div']), 
    15)

'czeka aż załadują sie osoby'
CustomKeywords.'help_pack.wait_for_text.Present'('Nowy', 15)

osoba_nr_1 = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[2]/div[2]/div/div[2]/div']))

osoba_nr_2 = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[2]/div[2]/div/div[2]/div[3]']))

'wybiera osobe nr 2'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div[2]/div/div[2]/div[3]']), 
    15)

'wybiera osobe nr 1'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div[2]/div/div[2]/div']), 
    15)

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

'button Szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[2]/div/div']), 
    15)

'zakładka metryka'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/ul/li[8]/a']), 15)

'sprawdzanie czy osoby dodały się w metryce'
CustomKeywords.'help_pack.wait_for_text.Present'('Dodanie kontrahenta do sprawy', 15)

'zakładka osoby'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/ul/li[11]/a']), 15)

'sprawdzanie czy osoby dodały się w zakładce Osoby'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 2 z 2 łącznie', 15)

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

'button Osoby'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[3]/div/div']), 
    15)

'usuwanie osobe nr 2'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div[2]/div']), 15)

'usuwanie osobe nr 1'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div[2]/div']), 15)

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

'button Szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[2]/div/div']), 
    15)

'zakładka osoby'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/ul/li[11]/a']), 15)

'sprawdzanie czy osoby usuneły się z zakładki Osoby'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycji 0 z 0 dostępnych', 15)

def tworzenie_sprawy() {
    GlobalVariable.losowa_nazwa = ('powiazanie ze sprawa' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(
        8))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Nowa sprawa'), 
        15)
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie danych...', 15)
    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), '2600')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/odblokuj edycje'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Źródła zaopatrzenia', 25)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie informacji o JRWA...', 10)
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button generuj Znak sprawy'), 
        15)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Tytul'), GlobalVariable.losowa_nazwa)
	Thread.sleep(500)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa generowanie znaku', 10)
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'), 
        15)
}

