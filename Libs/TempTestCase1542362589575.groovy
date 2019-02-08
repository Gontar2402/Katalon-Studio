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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy na koncie admin\\test_005 Przedlozenie do dekretacji dokumentu przychodzacego\\20181116_110309\\execution.properties')

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

CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj'()

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/pole tytul rejestr korespondencji'), 
    'Testy linku')

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/wiersz_2'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_005/button przedloz do dekretacji'))

WebUI.waitForElementPresent(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_005/Komunikat dokument byl juz przedlozony'), 
    15)

WebUI.verifyTextPresent('Dokument był już przedłożony do dekretacji.', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_002/button_OK'))

WebUI.click(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_005/button cofnij do kancelarii'))

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_005/button przedloz do dekretacji'), 
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_005/button przedloz'), 
    10)

WebUI.waitForElementNotVisible(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/komunikat Prosze czekac'), 
    10, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_005/z napisem dokmenty zostaly przedlozone'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

def wiersz_1_kolumna_6 = WebUI.getText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do testow na adminie/Obiekty dodatkowe do test_001/tabela Rejestr korespondencji przychodzacej', 
        [('wiersz') : 1, ('kolumna') : 6]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_1_kolumna_6 == 'Przedłożony'

''', 'Test Cases/Testy na koncie admin/test_005 Przedlozenie do dekretacji dokumentu przychodzacego', new TestCaseBinding('Test Cases/Testy na koncie admin/test_005 Przedlozenie do dekretacji dokumentu przychodzacego',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
