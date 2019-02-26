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

TworzeniePkWychodzacego()

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '(//input[@id=\'gs_punkt[nazwa]\'])[2]']), 
    NazwaStworzonegoPK)

CustomKeywords.'help_pack.wait_for_text.Present'(NazwaStworzonegoPK, 15)

UsuniecieStworzonegoPK()

ProbaZmianyPkNaUsuniety()

ProbaUsunieciaWychodzacegoPunktuKancelaryjnegoKtoregoNieMoznaUsunac()

def ProbaUsunieciaWychodzacegoPunktuKancelaryjnegoKtoregoNieMoznaUsunac() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Punkty kancelaryjne'), 
        15)

    'podmenu Dokumenty wychodz�ce'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'ui-id-15\']/div']), 
        15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '(//input[@id=\'gs_punkt[nazwa]\'])[2]']), 
        'Punkt kancelaryjny ESOD')

    'Kliknij wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//div[5]/div[2]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[2]']), 
        15)

    'button Usuń wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'del_admin_punkty_kancelaryjne_wych_table\']/div/span']), 
        15)

    'button potwierdź usuń'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Usuń\')]']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nie można usunąć systemowego punktu kancelaryjnego', 10)
}

def TworzeniePkWychodzacego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Punkty kancelaryjne'), 
        15)

    'podmenu Dokumenty wychodz�ce'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'ui-id-15\']/div']), 
        15)

    'button dodaj nowy wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_punkty_kancelaryjne_wych_table\']/div/span']), 
        15)

    NazwaStworzonegoPK = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    SkrotPK = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

    'wpisz losow� nazawe nowego PK'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[nazwa]\']']), NazwaStworzonegoPK)

    'wpisz losow� nazawe nowego PK'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[skrot]\']']), SkrotPK)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)

    PunktKancelaryjnyWychodzacy = (((NazwaStworzonegoPK + ' (') + SkrotPK) + ')')
}

def UsuniecieStworzonegoPK() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : NazwaStworzonegoPK]), 
        15)

    'button Usuń wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'del_admin_punkty_kancelaryjne_wych_table\']/div/span']), 
        15)

    'button potwierdź usuń'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Usuń\')]']), 
        15)
}

def ProbaZmianyPkNaUsuniety() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
        15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_stanowiska[login]\']']), 
        'beata.alchimowicz')

    'wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[4]']), 
        15)

    'button Edytuj rekord'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'edit_admin_stanowiska_table\']/div/span']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Edytuj rekord', 15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie danych...', 15)

    'Rozwiń Punkt kancelaryjny wychodzący'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//select[@id=\'obi_stanowiska[idpkw]\']']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'(PunktKancelaryjnyWychodzacy, 15)

    'button Anuluj'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Anuluj\')]']), 
        15)
}

