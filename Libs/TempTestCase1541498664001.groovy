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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy laczone na adminie i Ludwiku\\test_002 Udostepnianie spraw, przyjmowanie,odeslanie\\20181106_110423\\execution.properties')

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

not_run: CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj'()

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'))

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_002/do pola Tytul'), 
    'katalon_sprawa_test')

CustomKeywords.'help_pack.Element_w_tabeli.w_obiekcie'(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_002/tabela sprawy'), 
    1, 2)

//def wiersz_1_kolumna_2 = WebUI.getText(findTestObject('Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_001/tabela Rejestr korespondencji przychodzacej',
//[('wiersz') : 1, ('kolumna') : 2]), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_002/button Udostpnij'))

WebUI.setText(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_002/do pola szczegoly'), 
    'test katalon przyjmij ')

WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_002/stanowisko docelowe'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_002/button przedluz'))

WebUI.click(findTestObject('Obiekty dodatkowe w testach laczonych na adminie i ludwiku/Obiekty dodatkowe do test_002/tabela sprawy', 
        [('wiersz') : 2, ('kolumna') : 2]), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_Udostpnij'))

WebUI.setText(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/textarea_Szczegy_dekretacjauwa'), 'test katalon odeslij')

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_Wojewdzki Lekarz Weterynar (1)'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/input_Usu_ui-button ui-widget'))

WebUI.waitForAlert(22)

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_System obiegu dokumentw ESOD l/a_Powody wycof.ze skadu_menu-i'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/a_Wyloguj'))

WebUI.waitForAlert(22)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD/input_Nazwa uytkownika__userna'), 'ludwik.bartoszewicz')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD/input_Haso__password'), 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD/input_Haso_zaloguj'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_Aktualny uytkownik (1) (1)'), 
    10)

WebUI.click(findTestObject('Page_System obiegu dokumentw ESOD l/zakladka_Sprawy'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_Sprawy'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_Do przyjcia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/select_testowa nazwa stanowisk'), 
    '5', true)

WebUI.waitForElementPresent(findTestObject('Page_System obiegu dokumentw ESOD l/td_test katalon przyjmij'), 10)

if (WebUI.verifyTextPresent('test katalon przyjmij', false, FailureHandling.CONTINUE_ON_FAILURE) == false) {
    println('cos nie wyszlo przy udostepnianiu sprawy, nie ma jej w zakladce do przyjecia')
} else {
    println('sprawa dotarla i jest w zakladce do przyjecia')
}

if (WebUI.verifyTextPresent('test katalon odeslij', false, FailureHandling.CONTINUE_ON_FAILURE) == false) {
    println('cos nie wyszlo przy udostepnianiu sprawy, nie ma jej w zakladce do przyjecia')
} else {
    println('sprawa dotarla i jest w zakladce do przyjecia')
}

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/td_test katalon przyjmij'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_Przyjmij'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/td_test katalon odeslij'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_Odelij'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/div_W realizacji'))

WebUI.click(findTestObject('Page_System obiegu dokumentw ESOD l/a_Ostatnia'))

WebUI.waitForElementPresent(findTestObject('Page_System obiegu dokumentw ESOD l/td_WIW.wl.621.2.2015'), 10)

if (WebUI.verifyTextPresent('WIW.wl.621.2.2015', false, FailureHandling.CONTINUE_ON_FAILURE) == false) {
    println('cos nie wyszlo przy przyjmowaniu udostepnianej sprawy, nie ma jej w sprawach')
} else {
    println('sprawa zostala poprawnie przyjeta')
}

WebUI.click(findTestObject('Page_System obiegu dokumentw ESOD l/a_Powody wycof.ze skadu_menu-i'))

WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/a_Wyloguj'))

WebUI.waitForAlert(22)

WebUI.acceptAlert()

''', 'Test Cases/Testy laczone na adminie i Ludwiku/test_002 Udostepnianie spraw, przyjmowanie,odeslanie', new TestCaseBinding('Test Cases/Testy laczone na adminie i Ludwiku/test_002 Udostepnianie spraw, przyjmowanie,odeslanie',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
