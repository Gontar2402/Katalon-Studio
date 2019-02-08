import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Testy na koncie Ludiwk')

suiteProperties.put('name', 'Testy na koncie Ludiwk')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Tecra\\Katalon Studio\\SystemObeguDokumentow\\Reports\\Testy na koncie Ludiwk\\20181109_080953\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Testy na koncie Ludiwk', suiteProperties, [new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_001.1 Dekretacja dokumentu z stanowiska zastepowanego', 'Test Cases/Testy na koncie Ludwik/test_001.1 Dekretacja dokumentu z stanowiska zastepowanego',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_001.2 Dekretacja dokumentu z stanowiska zastepowanego na stanowisko zastepowane', 'Test Cases/Testy na koncie Ludwik/test_001.2 Dekretacja dokumentu z stanowiska zastepowanego na stanowisko zastepowane',  null)])
