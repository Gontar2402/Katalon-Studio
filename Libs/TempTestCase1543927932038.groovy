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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\DOKUS Szablon checklisty poaktualizacyjnej\\Test_003.1 wyswietlenie rejestruj dokumentow wychodzacych\\20181204_135212\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: CustomKeywords.'help_pack.Otworz_przegladarke.Otworz'()

not_run: CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.wychodzcej'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr korespondencji wychodzącej', 10)

//Save the desired table to a new WebElement
WebElement Table = WebUI.findWebElement('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe powtarzalne/tabela Rejestr korespondencji wychodzacej', 
    5)

//Capture all the rows in the table and save them to a list called rows_table
List<WebElement> rows_table = ResultsTable.findElements(By.tagName('tr'))

//Use the .size method to determine the number of rows in the table
int rowsInTable = rows_table.size()

//Print to the console or whatever you wish
println(rowsInTable)

def pozycje_na_stronie = WebUI.getText(findTestObject('Obiekty dodatkowe na stronie testy_hsi_pl_login/Obiekty dodatkowe do DOKUS Szablon/Test_002/liczba pozycji w tabelei Rejest kore. wychodz.'))

KeywordUtil.logInfo('w tabeli zaladowalo sie : ' + pozycje_na_stronie)

assert pozycje_na_stronie != ''

CustomKeywords.'help_pack.wait_for_text.Present'('Pierwsza', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Następna', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Poprzednia', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Ostatnia', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Tytuł', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Data podpisu', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Sposób wysyłki', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Sygnatura', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Komentarz do akceptacji', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Akceptujący', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Data akceptacji', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Rodzaj dokumentu', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Data utworzenia', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Znak sprawy', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Podpis elektroniczny', 10)

''', 'Test Cases/DOKUS Szablon checklisty poaktualizacyjnej/Test_003.1 wyswietlenie rejestruj dokumentow wychodzacych', new TestCaseBinding('Test Cases/DOKUS Szablon checklisty poaktualizacyjnej/Test_003.1 wyswietlenie rejestruj dokumentow wychodzacych',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
