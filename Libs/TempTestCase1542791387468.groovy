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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy laczone na adminie i Ludwiku\\test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika\\20181121_100947\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Testy laczone na adminie i Ludwiku/test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika', new TestCaseBinding('Test Cases/Testy laczone na adminie i Ludwiku/test_006 Sprawdzenie transferu dokumentow i spraw po zwolnieniu pracownika',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
