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

GlobalVariable.losowa_nazwa = ('Uwaga: ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

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
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblDostepnizastepujacyIndexGrid\']/tbody/tr[2]/td[2]']), 
    15)

'Button zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[4]']), 15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tresc\']']), 
    GlobalVariable.losowa_nazwa)

'button rozpocznij akceptację'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//div[@id=\'obi_wniosek_menu_nowy_button\']/div)[2]']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Wybór stanowiska akceptującego', 15)

'rozwiń menu kolejny akceptujący'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'s2id_kolejny_akceptujacy_select\']/a/span']), 
    15)

'Wyszukiwanie zastępującego'
CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), 
    'Bartoszewicz Ludwik')

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button[2]/span']), 
    15)

sprawdzenie_metryki()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

akceptacja_wniosku()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

sprawdzenie_akceptacji()

def losowa_data_urlopu() {
    Random rnd = new Random()

    int rok = 2040 + rnd.nextInt(500)

    int miesiac = 1 + rnd.nextInt(8)

    int dzien = 14 + rnd.nextInt(14)

    GlobalVariable.data = ((((rok + '-0') + miesiac) + '-') + dzien)

    int dzien_wczesniej = dzien - 3

    GlobalVariable.data_dzien_wczesniej = ((((rok + '-0') + miesiac) + '-') + dzien_wczesniej)
}

def sprawdzenie_metryki() {
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tresc\']']), 
        GlobalVariable.losowa_nazwa)

    'button szczegóły'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_wniosek_menu_szczegoly_button\']/div']), 
        15)

    'zakładka metryka'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'full_info_wniosek\']/ul/li[2]/a']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Rozpoczęto akceptacje wniosku', 15)
}

def akceptacja_wniosku() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Akceptacja)'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Akceptacja zastępstw', 15)

    'wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblInstancjeakceptacjiIndexGrid\']/tbody/tr/td[3]']), 
        15)

    'button akceptacja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_zastepstwa_akceptacja_actions_akceptacja\']/div']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Akceptacja zastępstw - modyfikacja', 15)

    'button zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnInstancjaakceptacjiSaveChanges\']']), 
        15)
}

def sprawdzenie_akceptacji() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'), 
        15)

    'wyszukaj osobę na którą jest zastępstwo'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwisko\']']), 
        'Naczelny')

    'wiersz z dodanym zastępstwem'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblZastepstwaIndexGrid\']/tbody/tr/td[3]']), 
        15)

    'Pole Nazw. ost. akcept.'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//th[8]/input']), 
        'Bartoszewicz')

    'pobierz datę akceptacji'
    def Data_akceptacji = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\'tblZastepstwaIndexGrid\']/tbody/tr/td[12]']))

    assert Data_akceptacji != ''

    'button Aktywuj'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_zastepstwa_actions_aktywuj\']/div']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nie można aktywować zastępstwa z przyszłości', 15)
}

