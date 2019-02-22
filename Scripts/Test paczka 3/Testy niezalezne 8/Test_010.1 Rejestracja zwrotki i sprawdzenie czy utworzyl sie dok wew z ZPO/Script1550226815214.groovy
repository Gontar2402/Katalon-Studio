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
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

DodaniePlikuDoRepozytorium()

DodajOsobe()

TworzenieDokumentuWychodzacego()

TworzenieNowegoZPO()

'Wyszukujemy czy zostało dodane ZPO'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'uwagi\']']), 
    LosowaUwaga)

RejestracjaZwrotki()

SprawdzanieCzyDodalSieDokument()

def TworzenieNowegoZPO() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr ZPO'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Zwrotne potwierdzenie odbioru', 15)

    'button Nowy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_uwagi_actions_nowy\']/div']), 
        15)

    'button Koperta Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Zmień\']']), 
        15)

    Thread.sleep(200)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    Thread.sleep(200)

    'Zmieniamy sposób wysyłki na kurier'
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '(//select[@name=\'sposob_wysylki\'])[2]']), 
        'Kurier', false)

    Thread.sleep(200)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    'wyszukany wiersz pierwszy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblKopertyIndexGrid_modal\']/tbody/tr/td[4]']), 
        15)

    LosowaUwaga = ('Uwaga : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

    'pole Uwagi'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//textarea[@id=\'obi_zpo_uwagi\']']), LosowaUwaga)

    'pole data wpływu'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_zpo_data_wplywu\']']), '2019-02-05')

    'pole data odbioru'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_zpo_data_odbioru\']']), '2019-02-05')

    'pole Planowana data wpływu'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_zpo_planowana_data_wplywu\']']), '2019-02-05')

    'button Utworz i zamknij'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnZpoSaveAndClose\']']), 
        15)
}

def DodaniePlikuDoRepozytorium() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Repozytorium'), 
        15)

    'czeka aż załaduje się tabela'
    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

    'button Wgraj pliki'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_pliki_wgraj_plik_button\']/div']), 
        15)

    uploadFile()

    WebUI.delay(1)

    'button Wyślij'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//button[@id=\'WgrajNowyPlikDoRepozytorium_button_wyslij\']/span']), 
        15)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'('Wgrywanie pliku do  repozytorium', 
        4)

    'wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Wgrywanie pliku do  repozytorium']), 
        15)
}

def uploadFile() {
    Thread.sleep(500)

    String filePath = '/tmp/katalon_execute/project/Wgrywanie pliku do  repozytorium.txt'

    StringSelection ss = new StringSelection(filePath)

    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

    Robot robot = new Robot()

    robot.sleep(1000)

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.sleep(1000)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)
}

def DodajOsobe() {
    LosoweNazwisko = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Dodaj (adresata)'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 15)

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/obiekty dodatkowe w Slownik/pole Nazwisko w dodawaniu nowego kontrahenta'), 
        15)

    WebUI.setText(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/obiekty dodatkowe w Slownik/pole Nazwisko w dodawaniu nowego kontrahenta'), 
        LosoweNazwisko)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/button OkAndClose uniwersalny'), 
        15)
}

def TworzenieDokumentuWychodzacego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        5)

    'wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[3]']), 25)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/obiekty w Sprawy/button Wychodzcy w akcje sprawy'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button zmien rodzaj pisma'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja Decyzja'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 3 spacje uniwersalny'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Adresaci'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycji', 10)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button dodaj kontrahenta'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 10)

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/pole nazwisko'), 
        LosoweNazwisko)

    Thread.sleep(200)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 25)

    'proponowany kontrahent'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblProponowaniAdresaciGrid\']/tbody/tr/td']), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button OK'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zmien sposob wysylki'), 
        5)

    'Zaznaczamy opcje kurier'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//*[@data-nazwa = \'Kurier\']']), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Odwzorowania'), 
        5)

    'button Dodaj'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'nowe_odwzorowanie_dysk_button\']']), 
        5)

    uploadFile()

    'zakładka Metadane'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Metadane\')]']), 
        5)

    'button odblokuj edycje tytułu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'frmObidokout_tabs_wymagane\']/table/tbody/tr/td/div/label/span']), 
        5)

    Thread.sleep(200)

    TytulDokumentuWychodzacego = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    'Wpisujemy losowy tytul dokumentu'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokumenty_wychodzace_tytul\']']), TytulDokumentuWychodzacego)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button Utworz'), 
        25)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/rozwin akceptujacy'), 
        10)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/wybierz akceptujacego'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 2 spacje uniwersalny'), 
        5)
}

def SprawdzanieCzyDodalSieDokument() {
    ZnakSprawy = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[18]']))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
        15)

    'Wyszukujemy w tabeli sprawy do której dodał się dokument'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'znak_sprawy\']']), 
        ZnakSprawy)

    'button rozwiń sprawę'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblSprawyBiezace\']/tbody/tr/td/span']), 
        15)

    'Wyszukujemy w tabeli dokumenty powiązane ze sprawą dodany dokument'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '(//input[@name=\'tytul\'])[2]']), 
        TytulDokumentuWychodzacego)
}

def RejestracjaZwrotki() {
    'button Zarejestruj zwrotkę'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_zpo_actions_zwrotka\']/div']), 
        15)

    'button Zmień Odwzorowanie zwrotki'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//input[@value=\'Zmień\'])[2]']), 
        15)

    Thread.sleep(200)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
        'Wgrywanie pliku do  repozytorium')

    Thread.sleep(200)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    'wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblRepoIndexGrid_modal\']/tbody/tr/td[3]']), 
        15)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnZpoZapiszZwrotke\']']), 
        15)
}

