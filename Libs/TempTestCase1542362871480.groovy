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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy na koncie Ludwik\\test_002.1 Nowy dokument wewnetrzny zakonczenie\\20181116_110751\\execution.properties')

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
import java.lang.Integer as Integer
import java.lang.Float as Float

CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj'()

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'))

WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/na odpowienidenie stanowisko'), 
    '29', true)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/do pola tytul dokumentu'), 
    'doZakończenia')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/wyszukany wiersz'), 
    10)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/button Zakoncz'))

WebUI.acceptAlert()

WebUI.dismissAlert()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/button Zakoczone'), 
    10)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/wiersz pierwszy w zakonczonych dokuemntach'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/button szczegoly zakonczone'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/zakladka metryka'))

def porownaj = WebUI.getText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/wiersz z tabeli z ostatnia czynnoscia'))

assert porownaj == 'Zakończenie procedowania dokumentu wewnętrznego; ;'

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/button OK w szczegoly'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe na koncie Ludwik/Obiekty dodatkowe do test_004/button Wycofaj zakonczenie'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('doZakończenia', 10)

''', 'Test Cases/Testy na koncie Ludwik/test_002.1 Nowy dokument wewnetrzny zakonczenie', new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_002.1 Nowy dokument wewnetrzny zakonczenie',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
