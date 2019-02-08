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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\DOKUS Szablon checklisty poaktualizacyjnej\\Test_006.1 Wyswietlenie widoku do dekretacji\\20181205_105330\\execution.properties')

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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

not_run: CustomKeywords.'help_pack.Otworz_przegladarke.Otworz'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
    5)

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'), 
    5)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Dokumenty do dekretacji', 10)

not_run: def pozycje_na_stronie = WebUI.getText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do DOKUS Szablon/Test_002/liczba pozycji w tabeli'))

not_run: KeywordUtil.logInfo('w tabeli zaladowalo sie : ' + pozycje_na_stronie)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Pierwsza', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Następna', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Poprzednia', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Ostatnia', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Tytuł', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Kod kreskowy', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Pokaż', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Nr ewidencyjny', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Dokumenty', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Rodzaj dokumentu', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Data rejestracji', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Rodzaj operacji', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Tryb dekretacji', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Polecenie', 10)

not_run: CustomKeywords.'help_pack.wait_for_text.Present'('Termin realizacji', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Uwagi do dekretacji', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Termin realizacji', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Nadawca', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Adres nadawcy', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Adres nadawcy 2', 10)

''', 'Test Cases/DOKUS Szablon checklisty poaktualizacyjnej/Test_006.1 Wyswietlenie widoku do dekretacji', new TestCaseBinding('Test Cases/DOKUS Szablon checklisty poaktualizacyjnej/Test_006.1 Wyswietlenie widoku do dekretacji',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
