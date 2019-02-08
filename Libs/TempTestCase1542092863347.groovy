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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy na stronie admin_php\\test_003 Dodaj, edytuj, usun pismo wychodzace\\20181113_080743\\execution.properties')

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

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Ustawienia'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Ustawienia/Rodzaje pism wychodzcych'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/button Dodaj nowy wiersz'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/button Zapisz'))

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Nazwa: Pole jest wymagane', 5)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/do pola nazwa'), 
    'katalonTestNowePismo')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/button Zapisz'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/do pola Nazwa wyszukiwanie'), 
    'katalonTestNowePismo')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/wyszukane pismo katalon'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/button edytuj wybrany wiersz'))

WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/do pola nazwa'), 
    'katalonTestNowePismoEdycja')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.Present'('katalonTestNowePismoEdycja', 5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/wyszukane pismo katalon'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/usun wybrany wiersz'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_003/button usun'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('katalonTestNowePismoEdycja', 5)

''', 'Test Cases/Testy na stronie admin_php/test_003 Dodaj, edytuj, usun pismo wychodzace', new TestCaseBinding('Test Cases/Testy na stronie admin_php/test_003 Dodaj, edytuj, usun pismo wychodzace',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
