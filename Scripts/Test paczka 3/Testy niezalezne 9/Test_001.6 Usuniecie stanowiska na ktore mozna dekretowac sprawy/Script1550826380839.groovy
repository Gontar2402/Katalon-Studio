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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
    15)

usuniecie_osoby_na_ktora_mozna_dekretowac()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('katarzyna.janczyk', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Tworzenie_sprawy.tworzenie_sprawy'('Dodanie stanowiska')

SprwdzCzyUsunietoStanowsikoNaKtoreMoznaDekretowac()

def usuniecie_osoby_na_ktora_mozna_dekretowac() {
    'podmenu Dekretacja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'ui-id-14\']']), 
        15)

    'Sprawy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'dekretacjaUprawnieniaTabs\']/ul/li[3]/a']), 
        15)

    'wyszuakj osobe w tabeli'
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_dekretacja_stanowiska[nazwisko]\']']), 
        'Jańczyk')

    'wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[@id=\'23\']/td[3]']), 
        15)

    'button edytuj stanowiska na które można dekretować dokumenty'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_dekretacja_sprawy_uprawnienia_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Edycja stanowisk na które można dekretować sprawy', 15)

    'Kliknij button odznacz wszystkie'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_edycja_uprawnien_ptable_left\']/table/tbody/tr/td[5]/div/span']), 
        15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

def SprwdzCzyUsunietoStanowsikoNaKtoreMoznaDekretowac() {
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.Nazwa_sprawy, 
        5)

    'button udostępnij'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_moje_sprawy_sprawa_actions_dekretuj_sprawe\']/div']), 
        15)

    Thread.sleep(400)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Wczytywanie danych...', 15)

    'Pobierz nazwy stanowisk na które można dekretować dokument'
    StanowiskaNaKtoreMoznaDekretowac = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[@id=\'frmSprawaDekretacjaPrzedlozenieListaStanowisk\']']))

    'Sprawdz czy tabele jest pusta (brak stanowisk możliwych do dekretacji)'
    assert StanowiskaNaKtoreMoznaDekretowac == ''
}

