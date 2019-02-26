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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Test paczka 3\\Testy niezalezne 9\\Test_002.1 Nowe zastepstwo\\20190225_125304\\execution.properties')

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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
    10)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Do pola nazwisko'), 
    'Wojciechowski')

Thread.sleep(200)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/Wiersz pierwszy w tabela Stanwiska'), 
    5)

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//table[@id=\\'tblZastepstwaIndexGrid\\']/tbody'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

List<WebElement> columns_table = Table.findElements(By.tagName('td'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button Nowe zastpestwo'))

WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button zmien osobe zastepujaca'))

'Wyszukaj osobę w tabeli'
CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '(//input[@name=\\'nazwisko\\'])[2]']), 
    'Borowska')

Thread.sleep(300)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

'Kliknij wyszukany wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\\'tblDostepnizastepujacyIndexGrid\\']/tbody/tr/td[2]']), 
    15)

WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane od'), '2022-10-09')

WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane do'), '2022-10-10')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/button Utworz i zamknij'), 
    5)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa zapisywanie...', 15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/wiersz pierwszy w tabela Zastepstwa'), 
    5)

WebDriver driver2 = DriverFactory.getWebDriver()

'To locate table'
WebElement Table2 = driver2.findElement(By.xpath('//table[@id=\\'tblZastepstwaIndexGrid\\']/tbody'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table2 = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count2 = rows_table2.size()

OczekiwanaLiczbaWierszyrows = (rows_count + 1)

assert OczekiwanaLiczbaWierszyrows == rows_count2

''', 'Test Cases/Test paczka 3/Testy niezalezne 9/Test_002.1 Nowe zastepstwo', new TestCaseBinding('Test Cases/Test paczka 3/Testy niezalezne 9/Test_002.1 Nowe zastepstwo',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
