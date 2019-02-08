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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\test_015 Dodaj, edytuj, usun blokade dokumentu przychodzacego\\20181113_083025\\execution.properties')

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

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Blokada dokumentow'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/wiersz pierwszy w tabeli dokumenty przychodzace'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/dodaj nowy wiersz w Zablokowani uzytkownicy'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/zaznacz blokada podgladu'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/button Zapisz'))

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Romanowicz', 5)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/wiersz pierwszy w Zablokowani uzytkownicy'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/edytuj zablokowanego uzytkownika'))

not_run: WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/wybierz innego uzytkownika'), 
    '8', true)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/button Zapisz'))

not_run: CustomKeywords.'help_pack.wait_for_text.not_Present'('Romanowicz', 5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/wiersz pierwszy w Zablokowani uzytkownicy'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/usun wybrany wiersz'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do test_004/button usun'))

CustomKeywords.'help_pack.wait_for_text.Present'('Taciak', 5)

''', 'Test Cases/test_015 Dodaj, edytuj, usun blokade dokumentu przychodzacego', new TestCaseBinding('Test Cases/test_015 Dodaj, edytuj, usun blokade dokumentu przychodzacego',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
