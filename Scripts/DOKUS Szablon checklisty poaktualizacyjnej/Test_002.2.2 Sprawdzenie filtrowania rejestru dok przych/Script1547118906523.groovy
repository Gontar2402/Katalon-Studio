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

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'))

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr korespondencji przychodzącej', 10)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(2, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(3, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(4, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(5, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(6, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(8, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(9, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(10, 4)

for (def kolumna_nr = 15; kolumna_nr <= 16; kolumna_nr++) {
    CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(kolumna_nr, 4)
}

