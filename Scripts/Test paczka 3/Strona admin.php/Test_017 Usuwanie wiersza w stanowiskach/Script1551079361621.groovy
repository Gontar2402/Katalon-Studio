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

UtworzStanowiskoIUsun()

SprobujUsunacStanowiskoZPowiazaniami()

def SprobujUsunacStanowiskoZPowiazaniami() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
        15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Login wyszukiwanie'), 
        '')

    'Wpisz tekst do Pola Stanowisko'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_stanowiska[nazwa]\']']), 
        'Z-ca Wojewódzkiego Lekarza Weterynarii')

    'Kliknij wyszukany wiersz'
    WebUI.click(findTestObject('button text', [('text') : 'Z-ca Wojewódzkiego Lekarza Weterynarii']))

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Usun wybrany wiersz (Stanowiska)'))

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Usun'))

    'Sprawdź czy wyświetlił się odpowiedni komunikat'
    CustomKeywords.'help_pack.wait_for_text.Present'('Nie można usunąć tych danych z powodu powiązań', 15)
}

def UtworzStanowiskoIUsun() {
    LosowaNazwaStanowiska = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/obiekty dodatkowe do test_002/button Nowe'), 
        15)

    WebUI.waitForElementPresent(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Nazwa stanowiska'), 15)

    WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Nazwa stanowiska'), LosowaNazwaStanowiska + 
        'katalon stanowisko')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/obiekty dodatkowe do test_002/rowin menu komorka organizacyjna'), 
        5)

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/opcje Zespol ds. administracyjnych'))

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button DALEJ'))

    WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Login'), LosowaNazwaStanowiska + 'katalon.stanowisko')

    WebUI.setEncryptedText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Haslo'), 'gqNiyN/IiIvaUo8G1BKwoQ==')

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button DALEJ'))

    WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Imie'), 'Kamila')

    WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Nazwisko'), 'Baborska')

    WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola E-mail'), LosowaNazwaStanowiska + 'katalon.stanowisko@email.com')

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button DALEJ'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/obiekty dodatkowe do test_002/button ZAPISZ'), 
        25)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nowe stanowisko utworzone.', 5)

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button OK'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola Login wyszukiwanie'), 
        LosowaNazwaStanowiska)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/obiekty dodatkowe do test_002/wyszukane stanowisko '), 
        15)

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Usun wybrany wiersz (Stanowiska)'))

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Usun'))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Uzytkownicy'), 
        25)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/obiekty dodatkowe do test_002/do pola E-mail wyszukiwanie'), 
        LosowaNazwaStanowiska + 'katalon.stanowisko@email.com')

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/wyszukany uzytkownik'))

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Usun wybrany wiersz (Uzytkownicy)'))

    WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_002/button Usun'))
}

