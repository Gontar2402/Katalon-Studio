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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy nie zmianiajace nic na stronie\\Test_003 Filtrowanie tabeli z zastepstwami\\20181119_085257\\execution.properties')

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

CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj_na_admin_php'()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/podmenu Zastepstwa/Zastpstwa'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/pole Przyczyna'), 
    'Urlop bezpłatny')

WebUI.delay(1)

def wiersz_2_kolumna_6 = WebUI.getText(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
        [('wiersz') : 2, ('kolumna') : 6]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_2_kolumna_6 == 'Urlop bezpłatny'

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/pole Przyczyna'), 
    '')

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/pole Stanowisko'), 
    'Woj. insp. wet. ds. ochrony. zw.')

WebUI.delay(1)

def wiersz_2_kolumna_7 = WebUI.getText(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
        [('wiersz') : 2, ('kolumna') : 7]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_2_kolumna_7 == 'Woj. insp. wet. ds. ochrony. zw.'

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/pole Stanowisko'), 
    '')

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/pole Nazwisko'), 
    'tajs')

WebUI.delay(1)

def wiersz_2_kolumna_10 = WebUI.getText(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
        [('wiersz') : 2, ('kolumna') : 10]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_2_kolumna_10 == 'Tajs'

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/pole Nazwisko'), 
    '')

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/pole Imie zastepu.'), 
    'elżbieta')

WebUI.delay(1)

def wiersz_2_kolumna_11 = WebUI.getText(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
        [('wiersz') : 2, ('kolumna') : 11]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_2_kolumna_11 == 'Elżbieta'

''', 'Test Cases/Testy nie zmianiajace nic na stronie/Test_003 Filtrowanie tabeli z zastepstwami', new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/Test_003 Filtrowanie tabeli z zastepstwami',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
