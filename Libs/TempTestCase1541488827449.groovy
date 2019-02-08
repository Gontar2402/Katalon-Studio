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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy laczone na adminie i Ludwiku\\test_last_007 Nowe zastepstwo oraz jego edycja\\20181106_082022\\execution.properties')

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

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'))

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe do test_007/Do pola nazwisko'), 
    'naczelny')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_007/Wiersz pierwszy w tabela Stanwiska'), 
    10)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/Button Nowe zastpestwo'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/Button zmien osobe zastepujaca'))

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_007/wiersz pierwszy w osobach uprawnionych do pracy na stanowisku w zastepstwie'), 
    10)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe do test_007/pole tekstowe Wane od'), '2018-10-10')

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe do test_007/pole tekstowe Wane do'), '2022-10-10')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button Utworz i zamknij'))

not_run: WebUI.comment('edycja zastepstwa')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_007/wiersz pierwszy w tabela Zastepstwa'), 
    10)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button Edycja'))

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe do test_007/pole tekstowe Wane od'), '2032-10-10')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button zapisz'))

not_run: WebUI.verifyTextPresent('Data w polu "Ważne od" nie może być poźniejsza niż data w polu "Ważne do"', false)

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_002/button_OK'), 
    10)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe do test_007/pole tekstowe Wane od'), '2017-10-10')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button zapisz'))

not_run: WebUI.comment('koniec edycji zastepstwa')

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj'()

not_run: WebUI.comment('akceptacja zastepstwa na Ludwiku')

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'))

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Akceptacja)'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe powtarzalne/Usun wszystkie powiadomienia'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/Wiersze pierwszy w tabeli Akceptacja zastepstw'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button Akceptacja'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button Zmien'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/Ludwik z wybor stanowiska'))

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'))

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe do test_007/Do pola nazwisko'), 
    'naczelny')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_007/Wiersz pierwszy w tabela Stanwiska'), 
    10)

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_007/wiersz pierwszy w tabela Zastepstwa'), 
    10)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button Aktywuj'))

not_run: WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/td_Tak'))

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.verifyTextPresent('Nazwa użytkownika i/lub hasło jest błędne.', false)

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'))

WebUI.click(findTestObject('Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

WebUI.click(findTestObject('Obiekty dodatkowe powtarzalne/Usun wszystkie powiadomienia'), FailureHandling.OPTIONAL)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe do test_007/Do pola nazwisko'), 
    'naczelny')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_007/Wiersz pierwszy w tabela Stanwiska'), 
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe do test_007/wiersz pierwszy w tabela Zastepstwa'), 
    10)

WebUI.click(findTestObject('Obiekty dodatkowe do test_007/button Deaktywuj'))

WebUI.waitForElementClickable(findTestObject('Page_System obiegu dokumentw ESOD l/a_Powody wycof.ze skadu_menu-i'), 5)

WebUI.click(findTestObject('Page_System obiegu dokumentw ESOD l/a_Powody wycof.ze skadu_menu-i'))

not_run: WebUI.click(findTestObject('Object Repository/Page_System obiegu dokumentw ESOD l/a_Wyloguj'))

WebUI.acceptAlert()

''', 'Test Cases/Testy laczone na adminie i Ludwiku/test_last_007 Nowe zastepstwo oraz jego edycja', new TestCaseBinding('Test Cases/Testy laczone na adminie i Ludwiku/test_last_007 Nowe zastepstwo oraz jego edycja',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
