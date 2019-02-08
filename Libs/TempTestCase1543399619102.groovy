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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Test paczka 3\\Testy niezalezne\\Test_001 Adresaci. Filtrowanie po Wazne do\\20181128_110659\\execution.properties')

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

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('agnieszka.holak', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    5)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'))

not_run: WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '1', true)

not_run: CustomKeywords.'help_pack.wartosc_z_tabeli.wez'('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/tabele/tabela Lista adresatow', 
    1, 27, '2014-07-03')

not_run: WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '0', true)

not_run: CustomKeywords.'help_pack.wartosc_z_tabeli.wez'('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/tabele/tabela Lista adresatow', 
    1, 27, '')

not_run: WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '1', true)

not_run: CustomKeywords.'help_pack.wartosc_z_tabeli.wez'('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/tabele/tabela Lista adresatow', 
    1, 27, '2014-07-03')

not_run: WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja wazne do'), 
    '-1', true)

not_run: CustomKeywords.'help_pack.wartosc_z_tabeli.wez'('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/tabele/tabela Lista adresatow', 
    1, 27, '')

CustomKeywords.'help_pack.wait_for_text.Present'('Opole', 2)

''', 'Test Cases/Test paczka 3/Testy niezalezne/Test_001 Adresaci. Filtrowanie po Wazne do', new TestCaseBinding('Test Cases/Test paczka 3/Testy niezalezne/Test_001 Adresaci. Filtrowanie po Wazne do',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
