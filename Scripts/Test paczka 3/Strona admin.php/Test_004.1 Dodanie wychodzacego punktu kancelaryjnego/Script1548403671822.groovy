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

tworzenie_PK_wych()

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '(//input[@id=\'gs_punkt[nazwa]\'])[2]']), 
    GlobalVariable.losowa_nazwa)

CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.losowa_nazwa, 15)

zmiana_PK_na_stworzony()

dodanie_do_grupy()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('beata.alchimowicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Tworzenie_sprawy.tworzenie_sprawy'('dok wych PK')

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tytul\']']), 
    GlobalVariable.Nazwa_sprawy)

CustomKeywords.'help_pack.Tworzenie_dokumentu.wychodzacego_w_obiegu_papierowym'(GlobalVariable.losowa_nazwa)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.wychodzcej'), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tytul\']']), 
    GlobalVariable.losowa_nazwa)

def nowy_PK = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[21]']))

assert GlobalVariable.skrot_PK == nowy_PK

def tworzenie_PK_wych() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Punkty kancelaryjne'), 
        15)

    'podmenu Dokumenty wychodz�ce'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'ui-id-15\']/div']), 
        15)

    'button dodaj nowy wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_punkty_kancelaryjne_wych_table\']/div/span']), 
        15)

    GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    GlobalVariable.skrot_PK = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

    'wpisz losow� nazawe nowego PK'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[nazwa]\']']), GlobalVariable.losowa_nazwa)

    'wpisz losow� nazawe nowego PK'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[skrot]\']']), GlobalVariable.skrot_PK)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)

    GlobalVariable.zmienna_pomocna = (((GlobalVariable.losowa_nazwa + ' (') + GlobalVariable.skrot_PK) + ')')
}

def zmiana_PK_na_stworzony() {
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

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska[idpkw]\']']), 
        GlobalVariable.zmienna_pomocna, false)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)
}

def dodanie_do_grupy() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Grupy'), 
        15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_sf_guard_group[description]\']']), 
        GlobalVariable.losowa_nazwa)

    'wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//div[4]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[3]']), 
        15)

    'rozwi� stanowiska grupy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'gview_admin_stanowiska_grupy_table\']/div/a/span']), 
        15)

    'button zmie�'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_stanowiska_grupy_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
        15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_username\']']), 
        'beata.alchimowicz')

    'opcja "zaznacz" stan'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@type=\'checkbox\']']), 
        15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

