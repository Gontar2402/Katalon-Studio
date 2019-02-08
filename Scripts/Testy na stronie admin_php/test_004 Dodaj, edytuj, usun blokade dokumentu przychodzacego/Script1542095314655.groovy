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

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Blokada dokumentow'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Obiekty dodatkowe do test_004/wiersz pierwszy w tabeli dokumenty przychodzace'), 
    6)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_004/dodaj nowy wiersz w Zablokowani uzytkownicy'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Obiekty dodatkowe do test_004/zaznacz blokada podgladu'), 
    5)

WebUI.delay(2)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_004/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Obiekty dodatkowe do test_004/wiersz pierwszy w Zablokowani uzytkownicy'), 
    15)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_004/edytuj zablokowanego uzytkownika'))

WebUI.selectOptionByValue(findTestObject('admin_php/Obiekty dodatkowe do test_004/wybierz innego uzytkownika'), 
    '8', true)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_004/button Zapisz'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Obiekty dodatkowe do test_004/wiersz pierwszy w tabeli zablokowani uzytkownicy Taciak'), 
    5)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_004/usun wybrany wiersz'))

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_004/button usun'))

