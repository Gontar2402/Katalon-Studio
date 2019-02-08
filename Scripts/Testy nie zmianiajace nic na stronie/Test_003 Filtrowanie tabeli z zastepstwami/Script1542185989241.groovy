import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
    5)

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/Zastpstwa'))

filtrowanie_przyczyna()

filtrowanie_stanowisko()

filtrowanie_nazwisko()

filtrowanie_Imie_zastepu()

filtrowanie_komorka()

filtrowanie_imie_zatw()

filtrowanie_imie_zastepo()

filtrowanie_data_akceptacji()

filtrowanie_data_aktywacji()

filtrowanie_data_deaktywacji()

filtrowanie_wazne_do()

filtrowanie_wazne_od()

def filtrowanie_przyczyna() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Przyczyna'), 
        'Urlop bezpłatny')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_6 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 6]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_6 == 'Urlop bezpłatny'

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Przyczyna'), 
        '')
}

def filtrowanie_stanowisko() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Stanowisko'), 
        'Woj. insp. wet. ds. ochrony. zw.')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_7 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 7]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_7 == 'Woj. insp. wet. ds. ochrony. zw.'

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Stanowisko'), 
        '')
}

def filtrowanie_nazwisko() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Nazwisko'), 
        'Tajs')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_10 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 10]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_10 == 'Tajs'

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Nazwisko'), 
        '')
}

def filtrowanie_Imie_zastepu() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Imie zastepu.'), 
        'Elżbieta')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_11 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 11]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_11 == 'Elżbieta'

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/pole Imie zastepu.'), 
        '')
}

def filtrowanie_komorka() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole komorka w tebeli zastepstwa'), 
        'Samodzielne stanowisko ds.bezpieczeństwa i higieny pracy')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_8 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 8]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_8 == 'Samodzielne stanowisko ds.bezpieczeństwa i higieny pracy '

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole komorka w tebeli zastepstwa'), 
        '')
}

def filtrowanie_imie_zatw() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole imie zatw w tabeli zastepstwa'), 
        'Agnieszka')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_13 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 13]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_13 == 'Agnieszka'

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole imie zatw w tabeli zastepstwa'), 
        '')
}

def filtrowanie_imie_zastepo() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole imie zastepo w tabeli zastepstwa'), 
        'Dorota')

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_9 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 9]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_9 == 'Dorota'

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole imie zastepo w tabeli zastepstwa'), 
        '')
}

def filtrowanie_data_akceptacji() {
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie', 15)

    WebUI.setText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data akceptacji w tabeli zastepstwa'), 
        '2014-06-26')

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data akceptacji w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data akceptacji w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_17 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 17]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_17 == '2014-06-26 00:00'

    WebUI.refresh()

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
        5)
}

def filtrowanie_data_aktywacji() {
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie', 15)

    WebUI.setText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data aktywacji w tabeli zastepstwa'), 
        '2015-03-23')

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data aktywacji w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data aktywacji w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_19 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 19]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_19 == '2015-03-23 11:04'

    WebUI.refresh()

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
        5)
}

def filtrowanie_data_deaktywacji() {
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie', 15)

    WebUI.setText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data deaktywacji w tabeli zastepstwa'), 
        '2017-11-24')

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data deaktywacji w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole data deaktywacji w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_20 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 20]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_20 == '2017-11-24 14:56'

    WebUI.refresh()

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
        5)
}

def filtrowanie_wazne_do() {
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie', 15)

    WebUI.setText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole wazne do w tabeli zastepstwa'), 
        '2014-05-21')

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole wazne do w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole wazne do w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_16 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 16]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_16 == '2014-05-20 23:50'

    WebUI.refresh()

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
        5)
}

def filtrowanie_wazne_od() {
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie', 15)

    WebUI.setText(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole wazne od w tabeli zastepstwa'), 
        '2014-12-23')

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole wazne od w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/obiekty dodatkowe zastepstwa/pole wazne od w tabeli zastepstwa'), 
        Keys.chord(Keys.ENTER))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 25)

    def wiersz_2_kolumna_15 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_003/tabela Zastepstwa', 
            [('wiersz') : 2, ('kolumna') : 15]), FailureHandling.CONTINUE_ON_FAILURE)

    assert wiersz_2_kolumna_15 == '2014-12-23 00:00'
}

