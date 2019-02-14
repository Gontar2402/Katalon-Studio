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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Uzytkownicy'), 
    15)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_sf_guard_user[username]\']']), 
    'katarzyna.baczek')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'katarzyna.baczek']), 15)

'button roziń Stanowiska użytkownika'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'gview_admin_user_stanowiska_table\']/div/a/span']), 
    15)

'button dodaj nowy wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_user_stanowiska_table\']/div/span']), 
    15)

LosowyNazwa = ('Stanowisko : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

CustomKeywords.'help_pack.wait_for_text.Present'('Dodaj rekord', 15)

'wpisujemy losową nazwę stanowiska'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_stanowiska_user[nazwa]\']']), LosowyNazwa)

'Zmieniamy komórke'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska_user[idwydzial]\']']), 
    '--Zespół ds. Zdrowia i Ochrony Zwierząt', false)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_stanowiska_user[nazwa]\']']), 
    LosowyNazwa)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : LosowyNazwa]), 15)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('katarzyna.baczek', 'gqNiyN/IiIvaUo8G1BKwoQ==')

StanowiskoDoZmiany = (LosowyNazwa + ' w Z')

'Zmieniamy stanowisko na nowo dodane'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'aktualne_stanowisko\']']), StanowiskoDoZmiany, 
    false, FailureHandling.STOP_ON_FAILURE)

