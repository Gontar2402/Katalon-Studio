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

GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Ustawienia'))

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/podmenu Ustawienia/Rodzaje pism wychodzcych'))

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_003/button Dodaj nowy wiersz'))

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_003/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.Present'('Nazwa: Pole jest wymagane', 5)

WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_003/do pola nazwa'), 
    GlobalVariable.losowa_nazwa)

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_003/button Zapisz'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/obiekty dodatkowe do test_003/do pola Nazwa wyszukiwanie'), 
    GlobalVariable.losowa_nazwa)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : GlobalVariable.losowa_nazwa]), 5)

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_003/button edytuj wybrany wiersz'))

WebUI.setText(findTestObject('admin_php/obiekty dodatkowe do test_003/do pola nazwa'), 
    GlobalVariable.losowa_nazwa + 'edycja')

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_003/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.losowa_nazwa + 'edycja', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : GlobalVariable.losowa_nazwa + 'edycja']), 5)

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_003/usun wybrany wiersz'))

WebUI.click(findTestObject('admin_php/obiekty dodatkowe do test_003/button usun'))

CustomKeywords.'help_pack.wait_for_text.not_Present'(GlobalVariable.losowa_nazwa + 'edycja', 5)

