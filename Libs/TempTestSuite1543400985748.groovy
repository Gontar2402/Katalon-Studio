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


suiteProperties.put('id', 'Test Suites/Test analystic/1')

suiteProperties.put('name', '1')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Tecra\\Katalon Studio\\SystemObeguDokumentow\\Reports\\Test analystic\\1\\20181128_112945\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Test analystic/1', suiteProperties, [new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/Test_001 sortowanie i zwiekszanie wynikow do 25', 'Test Cases/Testy nie zmianiajace nic na stronie/Test_001 sortowanie i zwiekszanie wynikow do 25',  null), new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/test_002 Edycja zastepstwa', 'Test Cases/Testy nie zmianiajace nic na stronie/test_002 Edycja zastepstwa',  null), new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/Test_003 Filtrowanie tabeli z zastepstwami', 'Test Cases/Testy nie zmianiajace nic na stronie/Test_003 Filtrowanie tabeli z zastepstwami',  null), new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/test_004 Wyrefikowanie mechanizmu sprawdzajcego daty', 'Test Cases/Testy nie zmianiajace nic na stronie/test_004 Wyrefikowanie mechanizmu sprawdzajcego daty',  null), new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/Test_005 Edycja rekordu z tabeli ustawienia', 'Test Cases/Testy nie zmianiajace nic na stronie/Test_005 Edycja rekordu z tabeli ustawienia',  null), new TestCaseBinding('Test Cases/Testy nie zmianiajace nic na stronie/Test_006 Weryfikowanie nadawcy nowej przesylki', 'Test Cases/Testy nie zmianiajace nic na stronie/Test_006 Weryfikowanie nadawcy nowej przesylki',  null), new TestCaseBinding('Test Cases/Testy na stronie admin_php/test_001 Nowy uzytkowni , zmiana hasla uzytkownika', 'Test Cases/Testy na stronie admin_php/test_001 Nowy uzytkowni , zmiana hasla uzytkownika',  null), new TestCaseBinding('Test Cases/Testy na stronie admin_php/test_002.1 Nowe stanowsiko, awans pracownika, usuniecie pracownika', 'Test Cases/Testy na stronie admin_php/test_002.1 Nowe stanowsiko, awans pracownika, usuniecie pracownika',  null), new TestCaseBinding('Test Cases/Testy na stronie admin_php/test_002.2 Kopia stanowiska, zwolnienie pracownika', 'Test Cases/Testy na stronie admin_php/test_002.2 Kopia stanowiska, zwolnienie pracownika',  null), new TestCaseBinding('Test Cases/Testy na stronie admin_php/test_003 Dodaj, edytuj, usun rodzaj pisma wychodzacego', 'Test Cases/Testy na stronie admin_php/test_003 Dodaj, edytuj, usun rodzaj pisma wychodzacego',  null), new TestCaseBinding('Test Cases/Testy na stronie admin_php/test_004 Dodaj, edytuj, usun blokade dokumentu przychodzacego', 'Test Cases/Testy na stronie admin_php/test_004 Dodaj, edytuj, usun blokade dokumentu przychodzacego',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_002.1 Nowy dokument wewnetrzny zakonczenie', 'Test Cases/Testy na koncie Ludwik/test_002.1 Nowy dokument wewnetrzny zakonczenie',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_002.2 Nowy dokument wewnetrzny przyjecie', 'Test Cases/Testy na koncie Ludwik/test_002.2 Nowy dokument wewnetrzny przyjecie',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_002.3 Nowy dokument wewnetrzny odeslanie', 'Test Cases/Testy na koncie Ludwik/test_002.3 Nowy dokument wewnetrzny odeslanie',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_002.4 Cofniecie zakonczenia dokumentu wewnetrzengo - metryka', 'Test Cases/Testy na koncie Ludwik/test_002.4 Cofniecie zakonczenia dokumentu wewnetrzengo - metryka',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_002.5 Cofniecie odeslania dokumentu wewnetrznego - metryka', 'Test Cases/Testy na koncie Ludwik/test_002.5 Cofniecie odeslania dokumentu wewnetrznego - metryka',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_002.6 Cofniecie przyjecia dokumentu wewnetrzengo - metryka', 'Test Cases/Testy na koncie Ludwik/test_002.6 Cofniecie przyjecia dokumentu wewnetrzengo - metryka',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_005.1 Dekretacja automatyczna', 'Test Cases/Testy na koncie Ludwik/test_005.1 Dekretacja automatyczna',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_005.2 Dekretacja automatyczna - na zastepowane stanowisko', 'Test Cases/Testy na koncie Ludwik/test_005.2 Dekretacja automatyczna - na zastepowane stanowisko',  null), new TestCaseBinding('Test Cases/Testy na koncie Ludwik/test_005.2 Dekretacja automatyczna - z zastepowanego stanowiska na zastepowane stanowisko', 'Test Cases/Testy na koncie Ludwik/test_005.2 Dekretacja automatyczna - z zastepowanego stanowiska na zastepowane stanowisko',  null)])
