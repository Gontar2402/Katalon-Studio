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

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Dodaj nowy wiersz '))

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.Present'('Login: Pole jest wymagane', 5)

WebUI.setText(findTestObject('admin_php/Obiekty dodatkowe do test_001/do pola Login'), 
    'tadeusz.lis')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.Present'('E-mail: Pole jest wymagane', 5)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

WebUI.setText(findTestObject('admin_php/Obiekty dodatkowe do test_001/do pola E-mail'), 
    'tl@')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.Present'('E-mail: nie jest poprawnym adresem e-mail', 5)

WebUI.setText(findTestObject('admin_php/Obiekty dodatkowe do test_001/do pola E-mail'), 
    'tl@email.com')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.Present'('Operacja zakończyła się niepowodzeniem', 5)

CustomKeywords.'help_pack.wait_for_text.Present'('Użytkownik o podanej nazwie już w systemie istnieje', 5)

CustomKeywords.'help_pack.wait_for_text.Present'('W systemie został już zarejestrowany użytkownik któremu przypisano taki sam e-mail', 
    5)

def losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

WebUI.setText(findTestObject('admin_php/Obiekty dodatkowe do test_001/do pola Login'), 
    'katalon' + losowa_nazwa)

WebUI.setText(findTestObject('admin_php/Obiekty dodatkowe do test_001/do pola E-mail'), 
    losowa_nazwa + 'katalon@email.com')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie', 5)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe do test_001/do pola E-mail w wyszukiwaniu'), 
    losowa_nazwa + 'katalon@email.com')

CustomKeywords.'help_pack.wait_for_text.Present'(losowa_nazwa + 'katalon@email.com', 15)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/pole wyszukane', 
        [('text') : losowa_nazwa + 'katalon@email.com']))

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button zmiana hasla'))

WebUI.setEncryptedText(findTestObject('admin_php/Obiekty dodatkowe do test_001/pole Nowe haslo'), 
    'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.setEncryptedText(findTestObject('admin_php/Obiekty dodatkowe do test_001/pole potwierdz nowe haslo'), 
    '+jqBztiTCvs=')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Akceptuj'))

CustomKeywords.'help_pack.wait_for_text.Present'('Podane hasła nie są identyczne', 5)

WebUI.setEncryptedText(findTestObject('admin_php/Obiekty dodatkowe do test_001/pole potwierdz nowe haslo'), 
    'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button Akceptuj'))

CustomKeywords.'help_pack.wait_for_text.Present'('Poprawnie zmieniono hasło', 5)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button OK'))

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button usun wybrany wiersz'))

WebUI.delay(1)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe do test_001/button usun'))

