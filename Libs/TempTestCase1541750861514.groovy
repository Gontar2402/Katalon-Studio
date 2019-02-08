import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy na stronie admin_php\\test_001 Nowy uzytkowni , zmiana hasla uzytkownika\\20181109_090741\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: CustomKeywords.'help_pack.Otworz_przegladarke.Otworz_admin'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Dodaj nowy wiersz '))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Login: Pole jest wymagane', 5)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/do pola Login'), 
    'tadeusz.lis')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('E-mail: Pole jest wymagane', 5)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/do pola E-mail'), 
    'tl@')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('E-mail: nie jest poprawnym adresem e-mail', 5)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/do pola E-mail'), 
    'tl@email.com')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Operacja zakończyła się niepowodzeniem', 5)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Użytkownik o podanej nazwie już w systemie istnieje', 5)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('W systemie został już zarejestrowany użytkownik któremu przypisano taki sam e-mail', 
    5)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/do pola Login'), 
    'katalon')

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/do pola E-mail'), 
    'katalon@email.com')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Zapisz'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/do pola E-mail w wyszukiwaniu'), 
    'katalon@email.com')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/pole wyszukane'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button zmiana hasla'))

WebUI.setEncryptedText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/pole Nowe haslo'), 
    'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.setEncryptedText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/pole potwierdz nowe haslo'), 
    '+jqBztiTCvs=')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Akceptuj'))

CustomKeywords.'help_pack.wait_for_text.Present'('Podane hasła nie są identyczne', 5)

WebUI.setEncryptedText(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/pole potwierdz nowe haslo'), 
    'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button Akceptuj'))

CustomKeywords.'help_pack.wait_for_text.Present'('Poprawnie zmieniono hasło', 5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button OK'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button usun wybrany wiersz'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie admin_php/Obiekty dodatkowe do test_001/button usun'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('katalon', 5)

''', 'Test Cases/Testy na stronie admin_php/test_001 Nowy uzytkowni , zmiana hasla uzytkownika', new TestCaseBinding('Test Cases/Testy na stronie admin_php/test_001 Nowy uzytkowni , zmiana hasla uzytkownika',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
