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

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Login wyszukiwanie'), 
    'r.bartkowiak')

CustomKeywords.'help_pack.wait_for_text.not_Present'('Przetwarzanie danych', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/obiekty dodatkowe do test_002/wyszukane stanowisko Bartkowiak'), 
    10)

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Kopia'))

CustomKeywords.'help_pack.wait_for_text.Present'('Kopia stanowiska:', 15)

def losowy_tekst = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Login'), 
    losowy_tekst)

WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Haslo'), 
    '4rfvBGT%')

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button DALEJ'))

WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Imie'), 
    'Kamila2')

WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Nazwisko'), 
    'Baborska2')

WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola E-mail'), 
    losowy_tekst + '@email.com')

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button ZAPISZ'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Przetwarzanie danych', 25)

CustomKeywords.'help_pack.wait_for_text.Present'('Stanowisko zostało skopiowane.', 5)

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button OK'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Login wyszukiwanie'), 
    losowy_tekst)

sprawdzanie_czy_sie_skopiowal()

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Login wyszukiwanie'), 
    'r.bartkowiak')

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/wyszukane stanowisko Bartkowiak'))

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Zwolnienie'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/obiekty dodatkowe do test_002/button ZAPISZ'), 
    10)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Przetwarzanie danych', 25)

CustomKeywords.'help_pack.wait_for_text.Present'('Rozpoczęto proces zwalniania pracownika...', 5)

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button OK'))

def sprawdzanie_czy_sie_skopiowal() {
    def wiersz_2_kolumna_5 = WebUI.getText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/tabela Stanowiska', 
            [('wiersz') : 2, ('kolumna') : 5]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_5 == 'AdministratorTensoft'

    def wiersz_2_kolumna_6 = WebUI.getText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Stanowiska/tabela Stanowiska', 
            [('wiersz') : 2, ('kolumna') : 6]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_6 == 'Wojewódzki Inspektorat Weterynarii'
}

