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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Rodzaje dokumentow  przychodzacych'), 
    15)

'Nowy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[2]/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

tworzenie_nowego_rodzaju_dkoumentu_przychodzacego()

UtworzNowyDokumentZNowoUtworzonymRodzajem()

WebUI.comment('Sprawdź czy utworzony dokument ma odpowiedni rodzaj')

'Kliknij butto szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_pelna_informacja\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'(LosowyRodzajDokuemntu, 15)

'OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

EdycjaRodzajuDokumentu()

def tworzenie_nowego_rodzaju_dkoumentu_przychodzacego() {
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

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(LosowyRodzajDokuemntu, 2)
}

def UtworzNowyDokumentZNowoUtworzonymRodzajem() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
        15)

    'button Zarejestruj nową przesyłkę'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_nowy_button\']/div']), 
        15)

    'ikona odblokuj możliwość edycji tytułu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//label/span']), 15)

    GlobalVariable.losowa_nazwa = ('Rejestracja przesylki ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(
        8))

    'wpisz do pola tytuł'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_opis\']']), GlobalVariable.losowa_nazwa)

    'pole Data pisma'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_pisma\']']), '2018-12-31')

    'pole Data wpływu'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_data_wplyniecia\']']), '2018-12-31')

    'button Wybierz Rodzaj dokumentu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//input[@value=\'Wybierz\'])[3]']), 
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

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zakladka Nadawca'))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 5)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola Nazwisko'), 'Kowalski')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/pole pod forumlarzem aby pokaza kontrahenta '), 
        5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Proponowany kontrahent ktorego szukamy'), 
        5)

    WebUI.delay(1)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button_OK2'), 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/rowzin menu'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Pelne odwzoraowanie cyfrowe'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zapisz nowy dokument przychodzacy'))

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'opis\']']), 
        GlobalVariable.losowa_nazwa)
}

def EdycjaRodzajuDokumentu() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Rodzaje dokumentow  przychodzacych'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Rodzaje dokumentów', 15)

    'Wyszukaj wcześniej utworzony rodzaj dokumentu'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
        LosowyRodzajDokuemntu)

    'button Edycja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_kategoria_menu_actions_edycja_button\']/div']), 
        15)

    Thread.sleep(400)
	NowaLosowaNazwaRodzajuDokumentu = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)
	

    'Wpisz nową losową nazwe'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokument_kategorie_nazwa\']']), NowaLosowaNazwaRodzajuDokumentu)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDokumentkategoriaSaveChanges\']']), 
        15)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(NowaLosowaNazwaRodzajuDokumentu, 2)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
        15)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'opis\']']), 
        GlobalVariable.losowa_nazwa)

    WebUI.comment('Sprawdź czy zmienił się rodzaj dokumentu po edycji')

    'Kliknij butto szczegóły'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_pelna_informacja\']/div']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'(NowaLosowaNazwaRodzajuDokumentu, 15)
}

