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

LosowaNazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Uzytkownicy'), 
    15)

'button rozwiń Stanowiska użytkownika'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'gview_admin_user_stanowiska_table\']/div/a/span']), 
    15)

'Wyszukaj w tabeli użytkownicy\r\n'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_sf_guard_user[username]\']']), 
    'monika.bogulak')

'wyszukana osoba'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[@id=\'9\']/td[2]']), 15)

'Sotanowiska użytkownika'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[@id=\'10\']/td']), 15)

PobierzAktualnedane()

'button Edytuj wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'edit_admin_user_stanowiska_table\']/div/span']), 
    15)

Thread.sleep(400)

WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_stanowiska_user[nazwa]\']']), LosowaNazwa)

if (AktualKomorka == 'Zespół ds. finansowo - księgowych') {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska_user[idwydzial]\']']), 
        '--Zakład Higieny Weterynaryjnej', false)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_stanowiska_user[wazne_od]\']']), '2014-10-12')
} else {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska_user[idwydzial]\']']), 
        '--Zespół ds. finansowo - księgowych', false)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_stanowiska_user[wazne_od]\']']), '2013-07-21')
}

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)

Thread.sleep(400)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

PobierzDanePoEdycji()

assert AktualnaNazwa != NazwaPoEdycji

assert AktualKomorka != KomorkaPoEdycji

assert WazneOdPrzedEdycja != WazneOdPoEdycji

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('monika.bogulak', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.wait_for_text.Present'(NazwaPoEdycji, 15)

def PobierzAktualnedane() {
    AktualnaNazwa = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\'10\']/td[2]']))

    AktualKomorka = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\'10\']/td[3]']))

    WazneOdPrzedEdycja = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\'10\']/td[6]']))
}

def PobierzDanePoEdycji() {
    NazwaPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\'10\']/td[2]']))

    KomorkaPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\'10\']/td[3]']))

    WazneOdPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\'10\']/td[6]']))
}

