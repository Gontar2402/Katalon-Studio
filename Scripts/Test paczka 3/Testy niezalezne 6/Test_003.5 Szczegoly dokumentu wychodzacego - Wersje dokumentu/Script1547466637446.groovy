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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.wychodzcej'), 
    15)

'poczekaj aż tabela się załaduje'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do', 15)

'wiersz drugi w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[2]/td[3]']), 15)

'button Wersje'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_moje_sprawy_dokument_actions_wersje\']/div']), 
    15)

sprawdzanie_zakladki_wersje_dokumentu()

def sprawdzanie_zakladki_wersje_dokumentu() {
 

    CustomKeywords.'help_pack.wait_for_text.Present'('Lista wersji:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Wersja nr 1 (aktualna)', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('nformacje o wybranej wersji:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Tytuł:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nr. ewid:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nr wersji:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Autor:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Data:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pliki wchodzące w skład wersji:', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nazwa', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Data', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Autor', 15)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Rozmiar', 15)

	CustomKeywords.'help_pack.wait_for_text.Present'('Kategoria', 15)

	CustomKeywords.'help_pack.wait_for_text.Present'('Akcje', 15)
	

	CustomKeywords.'help_pack.wait_for_text.Present'('Zamknij', 15)
	
    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od ', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('pozycji', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pokaż', 15)
}

