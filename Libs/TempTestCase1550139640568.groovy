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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Test paczka 3\\Strona admin.php\\Test_011 Nowy wiersz w stanowiskach uzytkownika\\20190214_112035\\execution.properties')

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

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Uzytkownicy'), 
    15)

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\\'gs_sf_guard_user[username]\\']']), 
    'katarzyna.baczek')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'katarzyna.baczek']), 
    15)

'button roziń Stanowiska użytkownika'
not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\\'gview_admin_user_stanowiska_table\\']/div/a/span']), 
    15)

'button dodaj nowy wiersz'
not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\\'add_admin_user_stanowiska_table\\']/div/span']), 
    15)

not_run: LosowyNazwa = ('Stanowisko : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Dodaj rekord', 15)

'wpisujemy losową nazwę stanowiska'
not_run: WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\\'obi_stanowiska_user[nazwa]\\']']), LosowyNazwa)

'Zmieniamy komórke'
not_run: WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\\'obi_stanowiska_user[idwydzial]\\']']), 
    '--Zespół ds. Zdrowia i Ochrony Zwierząt', false)

'button Zapisz'
not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\\'sData\\']']), 
    15)

not_run: CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\\'gs_obi_stanowiska_user[nazwa]\\']']), 
    LosowyNazwa)

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : LosowyNazwa]), 15)

not_run: CustomKeywords.'help_pack.Wyloguj.wyloguj'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('katarzyna.baczek', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: StanowiskoDoZmiany = (LosowyNazwa + ' w Zespół ds. Zdrowia i Ochrony Zwierząt')

'Zmieniamy stanowisko na nowo dodane'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\\'aktualne_stanowisko\\']']), 'Stanowisko : cRqHTy4Z w Z ', 
    false, FailureHandling.OPTIONAL)

'Zmieniamy stanowisko na nowo dodane'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\\'aktualne_stanowisko\\']']), 'Stanowisko : cRqHTy4Z w Zespół ds. Zdrowia i Ochrony Zwierząt', 
    false)

''', 'Test Cases/Test paczka 3/Strona admin.php/Test_011 Nowy wiersz w stanowiskach uzytkownika', new TestCaseBinding('Test Cases/Test paczka 3/Strona admin.php/Test_011 Nowy wiersz w stanowiskach uzytkownika',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
