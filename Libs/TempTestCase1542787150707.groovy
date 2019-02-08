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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy na koncie admin\\test_002 usuwanie dokumentu,dodawanie dokumentu,sprawdzanie tytulu,lista nadawcow\\20181121_085910\\execution.properties')

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

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/pole tytul rejestr korespondencji'), 
    'Testy linku')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/wiersz_2'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/button_usun'))

not_run: WebUI.comment('powinien wyskoczyc alert, aby potwierdzic usuniecie')

not_run: WebUI.acceptAlert()

not_run: WebUI.comment('sprawdzamy czy wyskoczyl blad i akceptujemy go')

not_run: WebUI.waitForElementPresent(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/button_OK'), 
    5)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Dokument został przedłożony do dekretacji lub zadekretowany i nie może być usunięty', 
    5)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/button_OK'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/button_powrot'))

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/Zarejestruj nowa przesylke'))

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/do pola data nowego dokumentu przychodzacego'), 
    '2018-10-10')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/odblokuj mozliwosc edycji tytulu'))

//sprawdzanie tytułu o takiej samej nazwie
not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/do pola tytulu nowego dokumentu przychodzacego'), 
    'dok3')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/zakladka Nadawca'))

not_run: WebUI.comment('Dokument został przedłożony do dekretacji lub zadekretowany i nie może być usunięty')

not_run: WebUI.comment('odrzucamy blad i rejestrujemy przesylke jeszcze raz')

not_run: WebUI.waitForAlert(10)

not_run: alertText = WebUI.getAlertText()

not_run: assert alertText == 'Dokument o danym tytule już istnieje. Czy chcesz kontynuować?'

not_run: WebUI.dismissAlert()

not_run: WebUI.waitForElementClickable(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/button_X'), 
    5)

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/button_X'), 
    5)

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/Zarejestruj nowa przesylke'), 
    5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/Komunikat Trwa ladowanie...'), 
    10)

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/do pola data nowego dokumentu przychodzacego'), 
    '2018-10-10')

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/odblokuj mozliwosc edycji tytulu'))

not_run: WebUI.comment('generowanie losowego strina')

not_run: def username = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8 //generowanie losowego strina
    )

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/do pola tytulu nowego dokumentu przychodzacego'), 
    username)

not_run: WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/zakladka Nadawca'))

not_run: WebUI.setText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/do pola Nazwisko'), 
    'Kowalski')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/pole pod forumlarzem aby pokaza kontrahenta '), 
    4)

not_run: WebUI.waitForElementVisible(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/Proponowany kontrahent ktorego szukamy'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('admin@testy.jap', 5)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/Proponowany kontrahent ktorego szukamy'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/button_OK2'), 
    10)

WebUI.waitForElementVisible(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/rowzin menu'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/rowzin menu'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/Pelne odwzoraowanie cyfrowe'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/zapisz nowy dokument przychodzacy'))

WebUI.waitForElementNotVisible(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/komunikat Prosze czekac'), 
    30)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/pole tytul rejestr korespondencji'), 
    username)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/utworzona przez test nowa przesylke'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/button_usun'))

WebUI.acceptAlert()

''', 'Test Cases/Testy na koncie admin/test_002 usuwanie dokumentu,dodawanie dokumentu,sprawdzanie tytulu,lista nadawcow', new TestCaseBinding('Test Cases/Testy na koncie admin/test_002 usuwanie dokumentu,dodawanie dokumentu,sprawdzanie tytulu,lista nadawcow',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
