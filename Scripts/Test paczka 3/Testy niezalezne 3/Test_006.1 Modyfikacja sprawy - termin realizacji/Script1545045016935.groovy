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

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.losowa_nazwa, 5)

Data_realizacji_przed = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[6]']))

'Edycja'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[3]/div[3]/div']), 
    15)

losowa_data()

'Do pola data realizacji'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//tr[2]/td/input']), GlobalVariable.data)

'Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnSprawaSaveChanges\']']), 
    15)

'OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.losowa_nazwa, 15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 5)

Data_realizacji_po = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[6]']))

assert Data_realizacji_przed != Data_realizacji_po

def tworzenie_sprawy() {
    GlobalVariable.losowa_nazwa = ('Modyfikacja sprawy' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        15)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Nowa sprawa'))

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), '2600')

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/odblokuj edycje'))

    CustomKeywords.'help_pack.wait_for_text.Present'('Źródła zaopatrzenia', 25)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie informacji o JRWA...', 10)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button generuj Znak sprawy'))

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Tytul'), GlobalVariable.losowa_nazwa)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa generowanie znaku', 10)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'))
}

def losowa_data() {
    Random rnd = new Random()

    int rok = 2020 + rnd.nextInt(50)

    int miesiac = 1 + rnd.nextInt(8)

    int dzien = 14 + rnd.nextInt(14)

    GlobalVariable.data = ((((rok + '-0') + miesiac) + '-') + dzien)
}

