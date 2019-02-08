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
    12)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    12)

'poczekaj aż tabela się załaduje'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do', 12)

'wiersz drugi w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[2]/td[3]']), 12)

'button Szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_pelna_informacja\']/div']), 
    12)

sprawdzanie_zakladki_wersje()

def sprawdzanie_zakladki_wersje() {
    'zakładka Sprawy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'full_info_dokument\']/ul/li[4]/a']), 
        12)

    CustomKeywords.'help_pack.wait_for_text.Present'('Aktualizował', 12)

    CustomKeywords.'help_pack.wait_for_text.Present'('Kod kreskowy', 2)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nr ewidencyjny', 2)

    CustomKeywords.'help_pack.wait_for_text.Present'('Wersje historyczne', 2)

    CustomKeywords.'help_pack.wait_for_text.Present'('Tytuł', 2)

    CustomKeywords.'help_pack.wait_for_text.Present'('Znak pisma (sygnatura)', 2)

    CustomKeywords.'help_pack.wait_for_text.Present'('Do dekretacji', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Rodzaj dokumentu', 2)

	CustomKeywords.'help_pack.wait_for_text.Present'('Data nadania', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Data pisma', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Data wpływu', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Data rejestracji', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Miejsce przechowywania', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Dysponent', 2)
		
	CustomKeywords.'help_pack.wait_for_text.Present'('Pierwszy dekretujący', 2)
		
	CustomKeywords.'help_pack.wait_for_text.Present'('Termin na odpowiedź', 2)
		
	CustomKeywords.'help_pack.wait_for_text.Present'('Liczba załączników', 2)
		
	CustomKeywords.'help_pack.wait_for_text.Present'('Uwagi', 2)
		
	CustomKeywords.'help_pack.wait_for_text.Present'('Sposób przysłania', 2)

	CustomKeywords.'help_pack.wait_for_text.Present'('Dokument elektroniczny', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Nadawca imię', 2)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Nadawca nazwisko', 2)
	



	
	
	
    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od ', 2)

    CustomKeywords.'help_pack.wait_for_text.Present'('pozycji', 2)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pokaż', 2)
}

