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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy na koncie Ludwik\\test_001.1 Dekretacja dokumentu z stanowiska zastepowanego\\20181108_134417\\execution.properties')

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

not_run: CustomKeywords.'help_pack.Otworz_przegladarke.Otworz'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'))

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'))

not_run: WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/stanowisko na zastepowane Wojechech'), 
    '5', true)

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/do pola tytul'), 
    'test48511')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/Tabela dokumenty do dekretacji wiersz 1'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/button Dekretuj'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/stanowisko docelowe'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/button OK'))

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/button Zadekretowane '), 
    5)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/button Przychodzce'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/do pola tytul (zdekretowane)'), 
    'test48511')

WebUI.click(findTestObject('Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_001/Tabela dokumenty do dekretacji wiersz 1'))

WebUI.click(findTestObject('Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_006/button Wycofaj'))

WebUI.acceptAlert()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('test48511', 10)

''', 'Test Cases/Testy na koncie Ludwik/test_001.1 Dekretacja dokumentu z stanowiska zastepowanego', new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_001.1 Dekretacja dokumentu z stanowiska zastepowanego',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
