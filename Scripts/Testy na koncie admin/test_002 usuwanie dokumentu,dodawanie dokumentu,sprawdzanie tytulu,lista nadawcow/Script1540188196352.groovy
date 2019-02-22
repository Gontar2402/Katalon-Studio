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

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'))

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'opis\']']), 
    'Testy linku')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/button_usun'))

WebUI.acceptAlert()

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa zapisywanie danych', 10)

WebUI.comment('powinien wyskoczyc alert, aby potwierdzic usuniecie')

WebUI.comment('sprawdzamy czy wyskoczyl blad i akceptujemy go')

CustomKeywords.'help_pack.wait_for_text.Present'('Można usunąć jedynie ostatni dokument w rejestrze. Obecnie ostatnim dokumentem w rejestrze jest', 
    15)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/button_OK'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty powtarzalne/button_powrot'))

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/Zarejestruj nowa przesylke'), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Dokument elektroniczny', 15)

WebUI.waitForElementPresent(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola data nowego dokumentu przychodzacego'), 
    15)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola data nowego dokumentu przychodzacego'), 
    '2018-10-10')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/odblokuj mozliwosc edycji tytulu'))

//sprawdzanie tytułu o takiej samej nazwie
WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola tytulu nowego dokumentu przychodzacego'), 
    'dok3')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/button zapisz'), 
    15)

WebUI.comment('Dokument został przedłożony do dekretacji lub zadekretowany i nie może być usunięty')

WebUI.comment('odrzucamy blad i rejestrujemy przesylke jeszcze raz')

WebUI.waitForAlert(10)

alertText = WebUI.getAlertText()

assert alertText == 'Dokument o danym tytule już istnieje. Czy chcesz kontynuować?'

WebUI.dismissAlert()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/Zarejestruj nowa przesylke'), 
    15)

WebUI.waitForElementNotPresent(findTestObject('hsi_pl_login/Obiekty powtarzalne/Komunikat Trwa ladowanie...'), 15)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola data nowego dokumentu przychodzacego'), 
    '2018-10-10')

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/odblokuj mozliwosc edycji tytulu'))

WebUI.comment('generowanie losowego strina')

def username = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8 //generowanie losowego strina
    )

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 15)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola tytulu nowego dokumentu przychodzacego'), 
    username)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zakladka Nadawca'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 15)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/do pola Nazwisko'), 'Kowalski')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/pole pod forumlarzem aby pokaza kontrahenta '), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Proponowany kontrahent ktorego szukamy'), 
    15)

WebUI.delay(1)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button_OK2'), 15)

WebUI.waitForAlert(4, FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/rowzin menu'), 
    15)

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/Pelne odwzoraowanie cyfrowe'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/zapisz nowy dokument przychodzacy'))

WebUI.waitForElementNotVisible(findTestObject('hsi_pl_login/Obiekty powtarzalne/komunikat Prosze czekac'), 20)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('hsi_pl_login/Obiekty powtarzalne/pole tytul rejestr korespondencji'), 
    username)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_002/button_usun'), 
    15)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

