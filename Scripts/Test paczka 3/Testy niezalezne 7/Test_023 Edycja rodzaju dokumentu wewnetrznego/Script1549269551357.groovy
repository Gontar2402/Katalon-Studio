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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Rodzaj dokumentow wewnetrznych'), 
    15)

'Nowy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[2]/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

tworzenie_nowego_rodzaju_dkoumentu_wewnetrznego()

UtworzNowyDokumentZNowoUtworzonymRodzajem()

WebUI.comment('Sprawdź czy utworzony dokument ma odpowiedni rodzaj')

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tytul\']']), 
    NazwaDokumentuWewnetrzengo)

'Kliknij butto szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dekretacja_dokument_rejestr_widok_szczeg_dokwew\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'(LosowyRodzajDokuemntu, 15)

'OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

EycjaRodzajuDokumentuWewnetrznego()

def tworzenie_nowego_rodzaju_dkoumentu_wewnetrznego() {
    LosowyRodzajDokuemntu = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//td/input']), LosowyRodzajDokuemntu)

    'Zmień rodzaj nadrzędny'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Zmień\']']), 
        15)

    'Kliknij rodzaj atrybutu Media / publikacje'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : ' Media / publikacje']), 
        15)

    'OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)

    'Utwórz i zamknij'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[3]']), 15)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
        LosowyRodzajDokuemntu)
}

def UtworzNowyDokumentZNowoUtworzonymRodzajem() {
    NazwaDokumentuWewnetrzengo = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'), 
        15)

    'Kliknij button Nowy Wew.'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_sprawy_dokumenty_actions_nowy_wew\']/div']), 
        15)

    'Kliknij button odblokuj możliwość edycji'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'frmObidokwew_tabs_wymagane\']/table/tbody/tr/td[2]/label/span']), 
        15)

    'Wpisz nazwę dokumentu do pola tytuł'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dok_wew_opis\']']), NazwaDokumentuWewnetrzengo)

    'button Zmień Rodzaj dokumentu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Zmień\']']), 
        15)

    'Kliknij rodzaj atrybutu Media / publikacje'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : ' Media / publikacje']), 
        15)

    'Kliknij utworzony rodzaj dokumentu o losowej nazwie'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : LosowyRodzajDokuemntu]), 
        15)

    'OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)

    'Kliknij button Utwórz i zamknij'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDokWewSaveAndClose\']']), 
        15)
}

def EycjaRodzajuDokumentuWewnetrznego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Rodzaj dokumentow wewnetrznych'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Rodzaje dokumentów wewnętrznych', 15)

    'Wyszukaj i kliknij wcześniej utworzony rodzaj'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
        LosowyRodzajDokuemntu)

    'button Edycja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokwew_kategoria_menu_actions_edycja_button\']/div']), 
        15)

    Thread.sleep(400)

    NowaLosowaNazwaRodzajuDokumentu = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    'Wpisz nową losową nazwe'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dok_wew_rodzaje_nazwa\']']), NowaLosowaNazwaRodzajuDokumentu)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnOsobyGrupySave\']']), 
        15)

    WebUI.comment('Sprawdź czy zmieniła się nazwa rodzaju dokumentu po edycji')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'), 
        15)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tytul\']']), 
        NazwaDokumentuWewnetrzengo)

    'Kliknij butto szczegóły'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dekretacja_dokument_rejestr_widok_szczeg_dokwew\']/div']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'(NowaLosowaNazwaRodzajuDokumentu, 15)
}

