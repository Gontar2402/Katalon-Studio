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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy laczone na adminie i Ludwiku\\test_005 Odeslanie dokumentu na nieaktywne stanowisko\\20181126_110905\\execution.properties')

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

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/na odpowiednie stanowisko'), 
    '4', true)

CustomKeywords.'help_pack.Powtarzlna_dekretacja.dekretacja_tytul_wyszukaj'('test_325587')

/*
WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/do pola tytul w dokumenty do dekretacji'), 
    'test_4065867')

CustomKeywords.'help_pack.wait_for_text.Present'('test_4065867', 10)

WebUI.click(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/wyszukany wiersz w tabelido dekretacji'))
*/
WebUI.click(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button Dekretuj'))

WebUI.click(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/stanowisko docelowe Jan'))

WebUI.click(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button OK w dekretacja'))

wyloguj_zaloguj('jan.popielarz')

CustomKeywords.'help_pack.Powtarzlna_dekretacja.dekretacja_tytul_wyszukaj'('test_325587')

WebUI.click(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button Dekretuj'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/stanowisko docelowe Patrycja'), 
    5)

WebUI.click(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button OK w dekretacja'))

WebUI.navigateToUrl(GlobalVariable.Url_admin)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/pole nazwisko'), 
    'Popielarz')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/wyszukany wiersz w tabeli stanowiska'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/edytuj wybrany wiersz'))

WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/pole wazne do'), 
    '2018-11-11')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button zapisz edycje wybranego wierszu'))

wyloguj_zaloguj('patrycja.podlasz')

CustomKeywords.'help_pack.Powtarzlna_dekretacja.dekretacja_tytul_wyszukaj'('test_325587')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button Odeslij'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button OK w adnotacja'), 
    5)

wyloguj_zaloguj('ludwik.bartoszewicz')

WebUI.selectOptionByValue(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/na odpowiednie stanowisko'), 
    '4', true)

CustomKeywords.'help_pack.Powtarzlna_dekretacja.dekretacja_tytul_wyszukaj'('test_325587')

CustomKeywords.'help_pack.wait_for_text.Present'('test_325587', 4)

CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj_na_admin_php'()

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('Object Repository/Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/pole nazwisko'), 
    'Popielarz')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/wyszukany wiersz w tabeli stanowiska'), 
    5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/edytuj wybrany wiersz'))

WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/pole wazne do'), 
    '')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_005/button zapisz edycje wybranego wierszu'))

def wyloguj_zaloguj(String login) {
    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'(login, 'gqNiyN/IiIvaUo8G1BKwoQ==')
}

''', 'Test Cases/Testy laczone na adminie i Ludwiku/test_005 Odeslanie dokumentu na nieaktywne stanowisko', new TestCaseBinding('Test Cases/Testy laczone na adminie i Ludwiku/test_005 Odeslanie dokumentu na nieaktywne stanowisko',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
