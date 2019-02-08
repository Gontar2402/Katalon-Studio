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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy nie zmianiajace nic na stronie\\Test_005 Edycja rekordu z tabeli ustawienia\\20181116_115001\\execution.properties')

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

WebUI.navigateToUrl(GlobalVariable.Url_admin)

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Ustawienia'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/pole Opis'), 
    'Adres serwera LDAP')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/wyszukany wiersz'), 
    10)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/button edytuj wybrany wiersz'))

WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/do pola Adres serwera'), 
    'katalon_edycja_rekordu')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/button Zapisz'))

WebUI.delay(1)

def wiersz_2_kolumna_3 = WebUI.getText(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/tabela ustawienia', 
        [('wiersz') : 2, ('kolumna') : 3]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_2_kolumna_3 == 'katalon_edycja_rekordu'

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/button edytuj wybrany wiersz'))

WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/do pola Adres serwera'), 
    '')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Obiekty dodatkowe do testy nie zmieniajace nic na stronie/Obiekty dodatkowe do Test_005/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('katalon_edycja_rekordu', 10)

''', 'Test Cases/Testy nie zmianiajace nic na stronie/Test_005 Edycja rekordu z tabeli ustawienia', new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/Test_005 Edycja rekordu z tabeli ustawienia',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
