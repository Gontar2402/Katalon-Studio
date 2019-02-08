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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy laczone na adminie i Ludwiku\\test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika\\20181121_092012\\execution.properties')

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

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('natalia.zukiel', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/button nowy Wew.'))

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/mozliwosc edycji tytulu'), 
    5)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/do pola tytul nowy dokument wewnetrzny'), 
    'Katalon dokument zwolnienie pracownika')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/button utworz i zamknij dokument wewnetrzny'))

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    5)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/button Nowa sprawa'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), 
    '2600')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/button generuj Znak sprawy'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/odblokuj edycje'))

not_run: def losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/do pola Tytul'), 
    'Katalon sprawa zwolnienie pracownika' + losowa_nazwa)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'))

not_run: CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj_na_admin_php'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/do pola nazwisko w tabeli stanowiska'), 
    'Żukiel-Gorszanow')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/wyszukany pierwszy wiersz w tabeli Stanowiska'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/obiekty dodatkowe do test_002/button Zwolnienie'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/do pola przejmujacy obowiazki zwolnienie'), 
    'Bartoszewicz Ludwik (Wojewódzki Lekarz Weterynarii)')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_006/button_ZAPISZ'))

CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

''', 'Test Cases/Testy laczone na adminie i Ludwiku/test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika', new TestCaseBinding('Test Cases/Testy laczone na adminie i Ludwiku/test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
