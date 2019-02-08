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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Test paczka 3\\Testy niezalezne\\Test_006.1 Dodanie wniosku urlopowego\\20181206_115640\\execution.properties')

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

Random rnd = new Random()

rok = (2040 + rnd.nextInt(50))

miesiac = (1 + rnd.nextInt(12))

dzien = (1 + rnd.nextInt(31))

println(rok)

println(miesiac)

println(dzien)

println((((rok + '-') + miesiac) + '-') + dzien)

GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Moje wnioski'), 
    5)

'Nowy wniosek'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button uniwersalny podajac xpath', [('xpath') : '//li[7]/ul/li[2]/div[2]/div']), 
    5)

WebUI.waitForAlert(5)

WebUI.acceptAlert()

'Data koncowa'
WebUI.setText(findTestObject('pole input uniwersalne po nazwie', [('xpath') : '//tr[4]/td/input', ('nazwa') : 'wniosek[data_koncowa]']), 
    '2055-11-30')

'Data poczatkowa'
WebUI.setText(findTestObject('pole input uniwersalne po nazwie', [('xpath') : '//tr[3]/td/input', ('nazwa') : 'wniosek[data_poczatkowa]']), 
    '2055-11-29')

'Losowa nazwa w uwagach, nastepnie w tabeli wyszuka czy sie dodal wniosek urlopowy'
WebUI.setText(findTestObject('pole input uniwersalne po nazwie', [('xpath') : '//tr[6]/td/input', ('nazwa') : 'wniosek[tresc]']), 
    GlobalVariable.losowa_nazwa)

'button zmien osobe zastepujaca'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button uniwersalny podajac xpath', [('xpath') : '//div/div/input']), 
    5)

'wybierz odpowiednia osobe'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button uniwersalny podajac xpath', [('xpath') : '//div[2]/div/div[2]/table/tbody/tr/td[2]']), 
    5)

'Button zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button uniwersalny podajac xpath', [('xpath') : '//input[4]']), 
    5)

'Wyszukaj w teabeli utworzony wniosek urlopowy'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.losowa_nazwa, 9)

''', 'Test Cases/Test paczka 3/Testy niezalezne/Test_006.1 Dodanie wniosku urlopowego', new TestCaseBinding('Test Cases/Test paczka 3/Testy niezalezne/Test_006.1 Dodanie wniosku urlopowego',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
