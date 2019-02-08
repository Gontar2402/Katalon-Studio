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

miasto = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

imie = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5)

nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5)

skrot_nazwy = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    5)

'Wiersz pierwszy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[5]']), 5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/button Edytuj'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/button odblokuj edycje Miasta'), 
    5)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/pole miasto'), 
    miasto)

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

CustomKeywords.'help_pack.wait_for_text.Present'(skrot_nazwy, 10)

CustomKeywords.'help_pack.wait_for_text.Present'(nazwa, 10)

CustomKeywords.'help_pack.wait_for_text.Present'(imie, 10)

CustomKeywords.'help_pack.wait_for_text.Present'(miasto, 10)

