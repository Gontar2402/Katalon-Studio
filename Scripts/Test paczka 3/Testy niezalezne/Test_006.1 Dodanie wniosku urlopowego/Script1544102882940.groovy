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

GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

'generowanie losowej daty dla wniosku'
losowa_data_urlopu()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Moje wnioski'), 
    15)

'Nowy wniosek'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[7]/ul/li[2]/div[2]/div']), 
    15)

WebUI.waitForAlert(5)

WebUI.acceptAlert()

'Losowa nazwa w uwagach, nastepnie wyszuka w tabeli'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_tresc\']']), GlobalVariable.losowa_nazwa)

'Data koncowa'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_data_koncowa\']']), GlobalVariable.data)

'Data poczatkowa'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_data_poczatkowa\']']), GlobalVariable.data_dzien_wczesniej)

Thread.sleep(500)

'button zmien osobe zastepujaca'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/div/input']), 15)

'wybierz odpowiednia osobe'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div[2]/table/tbody/tr/td[2]']), 
    15)

'Button zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[4]']), 15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tresc\']']), 
    GlobalVariable.losowa_nazwa)

def losowa_data_urlopu() {
    Random rnd = new Random()

    int rok = 2040 + rnd.nextInt(500)

    int miesiac = 1 + rnd.nextInt(8)

    int dzien = 14 + rnd.nextInt(14)

    GlobalVariable.data = ((((rok + '-0') + miesiac) + '-') + dzien)

    int dzien_wczesniej = dzien - 3

    GlobalVariable.data_dzien_wczesniej = ((((rok + '-0') + miesiac) + '-') + dzien_wczesniej)
}

