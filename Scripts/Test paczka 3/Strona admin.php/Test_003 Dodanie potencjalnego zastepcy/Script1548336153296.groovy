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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/Konfiguracja zastepstw'), 
    15)

'zakładka Potencjalni zastępujący'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'zastepstwaKonfiguracjaTabs\']/ul/li[2]/a']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Użytkownicy którzy mogą pracować na stanowisku w zastępstwie', 15)

'wyszukaj stanowisko '
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'gview_admin_zastepstwa_konfiguracja_stanowiska_table\']/div[2]/div/table/thead/tr[2]/th[3]/div/table/tbody/tr/td[2]/input']), 
    'Wojciechowski')

'kliknij wyszukany wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Wojciechowski']), 15)

'button zmień'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_zastepstwa_dostepni_zastepujacy_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

'wyszukaj osobe'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'gview_admin_edycja_uprawnien_table\']/div[2]/div/table/thead/tr[2]/th/div/table/tbody/tr/td[2]/input']), 
    'Hinc')

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

'zaznacz jak osoba która może zastępować'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[7]/input']), 15)

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
    15)

'wyszukaj osobę czy się dodała'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_zastepstwa_dostepni_zastepujacy[last_name]\']']), 
    'Hinc')

CustomKeywords.'help_pack.wait_for_text.Present'('Hinc', 15)

cofnij_zmiany()

def cofnij_zmiany() {
    'button zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_zastepstwa_dostepni_zastepujacy_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

    'wyszukaj osobe'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'gview_admin_edycja_uprawnien_table\']/div[2]/div/table/thead/tr[2]/th/div/table/tbody/tr/td[2]/input']), 
        'Hinc')

    'zaznacz jak osoba która może zastępować'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[7]/input']), 15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

