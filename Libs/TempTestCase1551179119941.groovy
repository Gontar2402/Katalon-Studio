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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy jeden po drugim zastepstwa\\Test_004 Zmiana kolejnosci w schemacie akceptacji zastepstw\\20190226_120515\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Testy jeden po drugim zastepstwa/Test_004 Zmiana kolejnosci w schemacie akceptacji zastepstw', new TestCaseBinding('Test Cases/Testy jeden po drugim zastepstwa/Test_004 Zmiana kolejnosci w schemacie akceptacji zastepstw',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
