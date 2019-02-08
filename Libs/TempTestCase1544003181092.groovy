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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\DOKUS Szablon checklisty poaktualizacyjnej\\Test_005.2 Sprawdzenie filtrowania i sortowania rejestru dok. biezacych\\20181205_104621\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/DOKUS Szablon checklisty poaktualizacyjnej/Test_005.2 Sprawdzenie filtrowania i sortowania rejestru dok. biezacych', new TestCaseBinding('Test Cases/DOKUS Szablon checklisty poaktualizacyjnej/Test_005.2 Sprawdzenie filtrowania i sortowania rejestru dok. biezacych',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
