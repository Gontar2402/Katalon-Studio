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


suiteProperties.put('id', 'Test Suites/TestJenkins2')

suiteProperties.put('name', 'TestJenkins2')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Tecra\\Katalon Studio\\SystemObeguDokumentow\\Reports\\TestJenkins2\\20181121_102103\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestJenkins2', suiteProperties, [new TestCaseBinding('Test Cases/Testy na koncie admin/test_002 usuwanie dokumentu,dodawanie dokumentu,sprawdzanie tytulu,lista nadawcow', 'Test Cases/Testy na koncie admin/test_002 usuwanie dokumentu,dodawanie dokumentu,sprawdzanie tytulu,lista nadawcow',  null), new TestCaseBinding('Test Cases/Testy na koncie admin/test_003 Weryfikowanie nadawcy nowoej przesylki', 'Test Cases/Testy na koncie admin/test_003 Weryfikowanie nadawcy nowoej przesylki',  null), new TestCaseBinding('Test Cases/Testy na koncie admin/test_005 Przedlozenie do dekretacji dokumentu przychodzacego', 'Test Cases/Testy na koncie admin/test_005 Przedlozenie do dekretacji dokumentu przychodzacego',  null), new TestCaseBinding('Test Cases/Testy na koncie admin/test_006 Dekretowanie przesylki', 'Test Cases/Testy na koncie admin/test_006 Dekretowanie przesylki',  null), new TestCaseBinding('Test Cases/Testy na koncie admin/test_007 Zalozenie, zamkniecie i wznowienie sprawy', 'Test Cases/Testy na koncie admin/test_007 Zalozenie, zamkniecie i wznowienie sprawy',  null), new TestCaseBinding('Test Cases/Testy na koncie admin/test_008 Dekretacja, wycofanie dekretacji - metryka', 'Test Cases/Testy na koncie admin/test_008 Dekretacja, wycofanie dekretacji - metryka',  null)])
