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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy laczone na adminie i Ludwiku\\test_003 Udostepnianie spraw, przyjmowanie,odeslanie\\20181108_123924\\execution.properties')

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

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/do pola Tytul'), 
    'katalon_sprawa_test')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/tabela sprawy wiersz pierwszy'), 
    5)

//def wiersz_1_kolumna_2 = WebUI.getText(findTestObject('Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_001/tabela Rejestr korespondencji przychodzacej',
//[('wiersz') : 1, ('kolumna') : 2]), FailureHandling.CONTINUE_ON_FAILURE)
not_run: WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/button Udostpnij'))

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/do pola szczegoly'), 
    'test katalon przyjmij zastepowe')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/stanowisko docelowe'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/button przedluz'))

not_run: CustomKeywords.'help_pack.wait_for_alert_and_akcept.alert'()

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/tabela sprawy wiersz drugi'), 
    6)

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/button Udostpnij'), 
    5)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/do pola szczegoly'), 
    'test katalon odeslij zastepowe')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/stanowisko docelowe'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/button przedluz'))

not_run: CustomKeywords.'help_pack.wait_for_alert_and_akcept.alert'()

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/button Do przyjecia'))

WebUI.selectOptionByValue(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/stanowisko na Wojechech'), 
    '4', true)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/do pola Uwagi do udostepnienia'), 
    'test katalon przyjmij zastepowe')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/wiersz pierwszy w tabeli sprway do przyjecia'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/button Przyjmij'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('test katalon przyjmij zastepowe', 10)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/do pola Uwagi do udostepnienia'), 
    'test katalon odeslij zastepowe')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/wiersz pierwszy w tabeli sprway do przyjecia'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_003/button Odeslij'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('test katalon odeslij zastepowe', 10)

''', 'Test Cases/Testy laczone na adminie i Ludwiku/test_003 Udostepnianie spraw, przyjmowanie,odeslanie', new TestCaseBinding('Test Cases/Testy laczone na adminie i Ludwiku/test_003 Udostepnianie spraw, przyjmowanie,odeslanie',[:]), FailureHandling.STOP_ON_FAILURE , false)
    