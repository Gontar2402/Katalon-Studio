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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr wysyek'), 
    15)

'poczekaj aż załaduje się tabela'
CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr wysyłek', 15)

WebUI.delay(1)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(26, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(27, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(28, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(29, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(30, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(31, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(32, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(33, 3)

