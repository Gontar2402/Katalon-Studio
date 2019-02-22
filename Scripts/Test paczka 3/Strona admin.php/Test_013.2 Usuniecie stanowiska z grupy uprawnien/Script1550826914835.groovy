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

PrzypisanieStanowiskaDoGrupy()

UsuniecieStanowiskaZGrupy()

WebUI.comment('Sprawdzamy czy osoba została usunięta z tabeli Stanowiska grupy')

'Wysuzkujemy w tabeli odpowiednią osobe'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_sf_guard_stanowisko_grupa[username]\']']), 
    'karolina.lukasiak')

Thread.sleep(100)

'Wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('karolina.lukasiak', 15)

WebUI.comment('Sprawdzamy czy osoba została usunięta z tabeli Grupy stanowiska')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
    15)

'button Rozwiń Grupy stanowiska'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'gview_admin_grupy_stanowiska_table\']/div/a/span']), 
    15)

'Wysuzkujemy w tabeli odpowiednią osobe'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_stanowiska[login]\']']), 
    'karolina.lukasiak')

Thread.sleep(100)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

'Wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'karolina.lukasiak']), 15)

'Sprawdzamy w tabeli czy grupa została usunięta'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_sf_guard_stanowisko_grupa[name]\']']), 
    'Administrator')

Thread.sleep(100)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Administrator', 15)

def UsuniecieStanowiskaZGrupy() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Grupy'), 
        15)

    'Wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '(//tr[@id=\'1\']/td[2])[2]']), 
        15)

    'button Zmień (Edycja stanowisk w grupie)'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_stanowiska_grupy_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
        15)

    'Wysuzkujemy w tabeli odpowiednią osobe'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_username\']']), 
        'karolina.lukasiak')

    Thread.sleep(100)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

    CzyZaznaczony = WebUI.verifyElementChecked(findTestObject('pole tekstowe', [('xpath') : '//td[9]/input']), 4, FailureHandling.OPTIONAL)

    if (CzyZaznaczony == true) {
        'Odznaczamy pole input'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[9]/input']), 15)
    } else {
        'nie zaznaczony'
    }
    
    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

def PrzypisanieStanowiskaDoGrupy() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Grupy'), 
        15)

    'Wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '(//tr[@id=\'1\']/td[2])[2]']), 
        15)

    'button Rozwiń Stanowiska grupy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'gview_admin_stanowiska_grupy_table\']/div/a/span']), 
        15)

    'button Zmień (Edycja stanowisk w grupie)'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_stanowiska_grupy_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
        15)

    'Wysuzkujemy w tabeli odpowiednią osobe'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_username\']']), 
        'karolina.lukasiak')

    Thread.sleep(100)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

    'Wiersz pierwszy w tabeli'
    not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'karolina.lukasiak']), 
        15)

    CzyNieZaznaczony = WebUI.verifyElementNotChecked(findTestObject('pole tekstowe', [('xpath') : '//td[9]/input']), 4, 
        FailureHandling.OPTIONAL)

    if (CzyNieZaznaczony == true) {
        'Zaznaczamy pole input'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[9]/input']), 15)
    } else {
        'już zaznaczony'
    }
    
    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

