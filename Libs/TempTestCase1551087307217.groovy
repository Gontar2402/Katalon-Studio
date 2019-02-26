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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Test paczka 3\\Testy niezalezne 9\\Test_002.1 Nowe zastepstwo\\20190225_103502\\execution.properties')

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

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
    10)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Do pola nazwisko'), 
    'Naczelny')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/Wiersz pierwszy w tabela Stanwiska'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button Nowe zastpestwo'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button zmien osobe zastepujaca'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/wiersz pierwszy '), 
    5)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane od'), '2022-10-09')

WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane do'), '2022-10-10')

'zmień przyczyne zastepstwa'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\\'Zmień\\']']), 
    5)

'wybierz przyczyne zastepstwa'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\\'tblPrzyczynyzastepstwIndexGrid\\']/tbody/tr[2]/td[2]']), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/button Utworz i zamknij'), 
    5)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa zapisywanie...', 15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/wiersz pierwszy w tabela Zastepstwa'), 
    5)

'pobierz przyczyne z tabeli'
def przyczyna = WebUI.getText(findTestObject('button', [('xpath') : '//table[@id=\\'tblZastepstwaIndexGrid\\']/tbody/tr/td[2]']))

assert przyczyna != ''

''', 'Test Cases/Test paczka 3/Testy niezalezne 9/Test_002.1 Nowe zastepstwo', new TestCaseBinding('Test Cases/Test paczka 3/Testy niezalezne 9/Test_002.1 Nowe zastepstwo',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
