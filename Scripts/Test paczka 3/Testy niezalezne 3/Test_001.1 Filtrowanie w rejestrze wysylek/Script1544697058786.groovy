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

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj'()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr wysyek'))

CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr wysyłek', 25)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 25)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(2, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(3, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(12, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(13, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(16, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(2, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(3, 4)

liczba_pozycji()

def liczba_pozycji() {
    def pozycje_na_stronie = WebUI.getText(findTestObject('hsi_pl_login/Obiekty DOKUS/Test_002/liczba pozycji w tabeli'))

    assert pozycje_na_stronie != ''

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 35)

    WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/liczba_wynikow na stronie'), 
        '25', true)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 35)

    def pozycje_na_stronie2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty DOKUS/Test_002/liczba pozycji w tabeli'))

    assert pozycje_na_stronie != pozycje_na_stronie2
}

