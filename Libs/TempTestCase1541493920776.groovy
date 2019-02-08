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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy na koncie admin\\test_006 Dekretowanie przesylki\\20181106_094516\\execution.properties')

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

WebUI.click(findTestObject('Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'))

WebUI.click(findTestObject('Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'))

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/wiersz z tytulem Katalon_przyjmij_zakoncz_odeslij'))

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/button Dekretuj'))

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/opcja Radca prawny w RP'))

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/button OK'))

WebUI.waitForElementVisible(findTestObject('Obiekty dodatkowe do test_006/button Zadekretowane'), 11)

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/button Zadekretowane'))

WebUI.waitForElementPresent(findTestObject('Obiekty dodatkowe do test_006/button Wewntrzne'), 11)

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/button Wewntrzne'))

WebUI.waitForElementPresent(findTestObject('Obiekty dodatkowe do test_006/z napisem Katalon_przyjmij'), 10)

WebUI.verifyTextPresent('Katalon_przyjmij_zakoncz_odeslij', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/posortuj po dacie'))

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/posortuj po dacie'))

WebUI.waitForElementNotPresent(findTestObject('Obiekty dodatkowe powtarzalne/komunikat Prosze czekac'), 5, FailureHandling.OPTIONAL)

CustomKeywords.'help_pack.Wait_and_click.click'(findTestObject('Obiekty dodatkowe do test_006/wiersz 1 Katalon_przyjmij_zakoncz_odeslij'), 
    10)

WebUI.click(findTestObject('Obiekty dodatkowe do test_006/button Wycofaj'))

CustomKeywords.'help_pack.Wait_and_click.click'(findTestObject('Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'), 
    10)

WebUI.waitForElementPresent(findTestObject('Obiekty dodatkowe do test_006/z napisem Katalon_przyjmij'), 10)

WebUI.verifyTextPresent('Katalon_przyjmij_zakoncz_odeslij', false, FailureHandling.CONTINUE_ON_FAILURE)

''', 'Test Cases/Testy na koncie admin/test_006 Dekretowanie przesylki', new TestCaseBinding('Test Cases/Testy na koncie admin/test_006 Dekretowanie przesylki',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
