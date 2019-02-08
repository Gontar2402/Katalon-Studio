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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    15)

'poczekaj aż tabela się załaduje'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do', 15)

'wiersz drugi w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[2]/td[3]']), 15)

'button Szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_pelna_informacja\']/div']), 
    15)

sprawdzanie_zakladki_sprawy()

def sprawdzanie_zakladki_sprawy() {
    'zakładka Sprawy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'full_info_dokument\']/ul/li[3]/a']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Sprawy powiązane z dokumentem', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Id', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Znak sprawy', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Tytuł', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Data rejestracji', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Termin realizacji sprawy', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Referent', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od ', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('pozycji', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pokaż', 15)
}

