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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Tecra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Testy jeden po drugim zastepstwa\\Test_004 Zmiana kolejnosci w schemacie akceptacji zastepstw\\20190226_123743\\execution.properties')

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

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

ZmienKolejnoscAkceptacji()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

TworzenieZastepstwa()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('bernadeta.niedzielska', 'gqNiyN/IiIvaUo8G1BKwoQ==')

AkceptacjaNaKoncieBernadetaNiedzielska()

SprawdzenieCzyKolejnoscZostalaZmieniona()

def ZmienKolejnoscAkceptacji() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
        10)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/Konfiguracja zastepstw'), 
        10)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\\'gs_obi_zastepstwa_konfiguracja_stanowiska[login]\\']']), 
        'radoslaw.grochowalski')

    'Kliknij wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[7]/div[2]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[4]']), 
        15)

    'Kliknij na Ludwika w tabeli Schemat akceptacji zastępstwa'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\\'62\\']/td[6]']), 
        15)

    KolejnoscLudwik = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\\'62\\']/td[6]']))

    if (KolejnoscLudwik == '1') {
        'Kliknij button przesuń w dół'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\\'admin_zastepstwa_schematy_akceptacji_ptable_left\\']/table/tbody/tr/td[8]/div/span']), 
            15)

        Thread.sleep(900)

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)
    } else {
        'Kliknij button przesuń w górę'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\\'admin_zastepstwa_schematy_akceptacji_ptable_left\\']/table/tbody/tr/td[7]/div/span']), 
            15)

        Thread.sleep(900)

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)
    }
    
    KolejnoscLudwikaWSchemacieAkceptacji = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\\'62\\']/td[6]']))
}

def losowa_data_urlopu() {
    Random rnd = new Random()

    int rok = 2040 + rnd.nextInt(50)

    int miesiac = 1 + rnd.nextInt(8)

    int dzien = 14 + rnd.nextInt(14)

    GlobalVariable.data = ((((rok + '-0') + miesiac) + '-') + dzien)

    int dzien_wczesniej = dzien - 3

    GlobalVariable.data_dzien_wczesniej = ((((rok + '-0') + miesiac) + '-') + dzien_wczesniej)
}

def TworzenieZastepstwa() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        10)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Do pola nazwisko'), 
        'Bogulak')

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
    int LiczbaWierszyPrzedDodaniemZastepstwa = rows_table.size()

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button Nowe zastpestwo'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Button zmien osobe zastepujaca'))

    'Wyszukaj osobę w tabeli'
    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '(//input[@name=\\'nazwisko\\'])[2]']), 
        'Niedzielska')

    Thread.sleep(300)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    'Kliknij wyszukany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\\'tblDostepnizastepujacyIndexGrid\\']/tbody/tr/td[2]']), 
        15)

    losowa_data_urlopu()

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane od'), GlobalVariable.data_dzien_wczesniej)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/pole tekstowe Wane do'), GlobalVariable.data)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/button Utworz i zamknij'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa zapisywanie...', 15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/wiersz pierwszy w tabela Zastepstwa'), 
        5)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\\'tblZastepstwaIndexGrid_length\\']']), 
        '100', false)

    Thread.sleep(300)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    WebDriver driver2 = DriverFactory.getWebDriver()

    'To locate table'
    WebElement Table2 = driver2.findElement(By.xpath('//table[@id=\\'tblZastepstwaIndexGrid\\']/tbody'))

    'To locate rows of table it will Capture all the rows available in the table'
    List<WebElement> rows_table2 = Table.findElements(By.tagName('tr'))

    'To calculate no of rows In table'
    int LiczbaWierszyPoDodaniuZastepstwa = rows_table2.size()

    if (LiczbaWierszyPrzedDodaniemZastepstwa == 1) {
        CustomKeywords.'help_pack.wait_for_text.not_Present'('Nie znaleziono żadnych pasujących indeksów', 15)
    } else {
        'przy pobieraniu rozmiaru tabeli tabela przed dodanie ma i po dodaniu ma 1 wiersz, ale przed dodaniem ma komunikat '
        assert LiczbaWierszyPrzedDodaniemZastepstwa != LiczbaWierszyPoDodaniuZastepstwa
    }
}

def AkceptacjaNaKoncieBernadetaNiedzielska() {
    LosowaUwaga1 = ('Uwaga: ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        10)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Akceptacja)'))

    Thread.sleep(300)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    'Wpisz date do pola ważne od i kliknij enter'
    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/thead/tr/th[6]/input']), 
        GlobalVariable.data_dzien_wczesniej)

    'Kliknij wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[3]']), 15)

    'Kliknij button akceptacja'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\\'obi_zastepstwa_akceptacja_actions_akceptacja\\']/div']), 
        15)

    Thread.sleep(500)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\\'obi_zastepstwa_instancja_akceptacji_uwagi\\']']), 
        LosowaUwaga1)

    'Kliknij button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\\'btnInstancjaakceptacjiSaveChanges\\']']), 
        15)

    'Wyszukaj w tabeli stan akceptacji po uwadze'
    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\\'uwagi\\']']), 
        LosowaUwaga1)
}

def SprawdzenieCzyKolejnoscZostalaZmieniona() {
    'Jezeli Ludwik jest pierwszy to sprawdz czy nie wiedzi tego zastepstwa Radosław, a następnie spradź czy widzi je Ludwik'
    if (KolejnoscLudwikaWSchemacieAkceptacji == '1') {
        CustomKeywords.'help_pack.Wyloguj.wyloguj'()

        CustomKeywords.'help_pack.Logowanie.zaloguj'('wojciech.parulski', 'gqNiyN/IiIvaUo8G1BKwoQ==')

        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
            10)

        WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Akceptacja)'))

        Thread.sleep(300)

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

        'Wpisz date do pola ważne od i kliknij enter'
        CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/thead/tr/th[6]/input']), 
            GlobalVariable.data_dzien_wczesniej)

        Thread.sleep(400)

        TekstWPierwszymWierszu = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/tbody/tr/td']))

        assert TekstWPierwszymWierszu == 'Nie znaleziono żadnych pasujących indeksów'

        CustomKeywords.'help_pack.Wyloguj.wyloguj'()

        CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
            10)

        WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Akceptacja)'))

        Thread.sleep(300)

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

        'Wpisz date do pola ważne od i kliknij enter'
        CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/thead/tr/th[6]/input']), 
            GlobalVariable.data_dzien_wczesniej)

        'Kliknij wiersz pierwszy w tabeli'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/tbody/tr/td[3]']), 
            15)
    } else {
        CustomKeywords.'help_pack.Wyloguj.wyloguj'()

        CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
            10)

        WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Akceptacja)'))

        Thread.sleep(300)

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

        'Wpisz date do pola ważne od i kliknij enter'
        CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/thead/tr/th[6]/input']), 
            GlobalVariable.data_dzien_wczesniej)

        Thread.sleep(400)

        TekstWPierwszymWierszu = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/tbody/tr/td']))

        assert TekstWPierwszymWierszu == 'Nie znaleziono żadnych pasujących indeksów'

        CustomKeywords.'help_pack.Wyloguj.wyloguj'()

        CustomKeywords.'help_pack.Logowanie.zaloguj'('wojciech.parulski', 'gqNiyN/IiIvaUo8G1BKwoQ==')

        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
            10)

        WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Akceptacja)'))

        Thread.sleep(300)

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

        'Wpisz date do pola ważne od i kliknij enter'
        CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/thead/tr/th[6]/input']), 
            GlobalVariable.data_dzien_wczesniej)

        'Kliknij wiersz pierwszy w tabeli'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\\'tblInstancjeakceptacjiIndexGrid\\']/tbody/tr/td[3]']), 
            15)
    }
}

''', 'Test Cases/Testy jeden po drugim zastepstwa/Test_004 Zmiana kolejnosci w schemacie akceptacji zastepstw', new TestCaseBinding('Test Cases/Testy jeden po drugim zastepstwa/Test_004 Zmiana kolejnosci w schemacie akceptacji zastepstw',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
