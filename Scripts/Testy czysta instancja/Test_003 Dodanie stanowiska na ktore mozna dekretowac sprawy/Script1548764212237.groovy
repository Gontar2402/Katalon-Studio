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

dodanie_osoby_na_ktora_mozna_dekretowac()

'wyszuakj osobe w tabeli'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_dekretacja_sprawy_uprawnienia[nazwisko]\']']), 
    'Alchimowicz')

CustomKeywords.'help_pack.wait_for_text.Present'('Alchimowicz', 15)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('katarzyna.janczyk', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Tworzenie_sprawy.tworzenie_sprawy'('Dodanie stanowiska')

dekretacja_stworzonej_sprawy()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('beata.alchimowicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

sprawdzenie_czy_dokument_dotarl()

def dodanie_osoby_na_ktora_mozna_dekretowac() {
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

    WebUI.selectOptionByValue(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'gs_edit_param_list[stan]\']']), 
        '2', false)

    Thread.sleep(400)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_username\']']), 
        'beata.alchimowicz')

    'zaznacz opcje Stan'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[9]/input']), 15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

def sprawdzenie_czy_dokument_dotarl() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        15)

    'button Do przyjęcia'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[4]/ul/li[3]/div[2]/div']), 
        5)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.Nazwa_sprawy, 
        4)
}

def dekretacja_stworzonej_sprawy() {
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.Nazwa_sprawy, 
        5)

    'button udostępnij'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_moje_sprawy_sprawa_actions_dekretuj_sprawe\']/div']), 
        15)

    'osoba na którą ma być dekretacja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td/div/div[2]']), 15)

    'button Przedłóż'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Przedłóż\']']), 
        15)
}

