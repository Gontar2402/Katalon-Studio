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

imie = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5)

nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5)

skrot_nazwy = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('Lista adresatów', 15)

'pobierz nazwisko z wiersza 3'
def Nazwisko = WebUI.getText(findTestObject('button', [('xpath') : '//tr[2]/td[5]']))

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('hsi_pl_login/Obiekty powtarzalne/pole nazwisko uniwersalne'), 
    Nazwisko)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/button Edytuj'), 
    5)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 15)

'Imię'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//tr[2]/td/input']), imie)

'Nazwa'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//tr[3]/td/input']), nazwa)

'Skrót nazwy'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//tr[4]/td/input']), skrot_nazwy)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/button zapisz w edycji kontrahenta'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/button OkAndClose uniwersalny'), 
    10)

'Historia zmian'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li[2]/div[3]/div']), 
    10)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać', 15)

'pobierz nazwe z tabeli historia zmian danych osobowych'
def Nazwa_po_zmianie = WebUI.getText(findTestObject('button', [('xpath') : '//table[@id=\'tblOsobaVersionGrid\']/tbody/tr/td[2]']))

assert Nazwa_po_zmianie == nazwa

'pobierz imie z tabeli historia zmian danych osobowych'
def imie_po_zmianie = WebUI.getText(findTestObject('button', [('xpath') : '//table[@id=\'tblOsobaVersionGrid\']/tbody/tr/td[4]']))

assert imie_po_zmianie == imie

