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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 25)

def pozycje_na_stronie = WebUI.getText(findTestObject('hsi_pl_login/Obiekty DOKUS/Test_002/liczba pozycji w tabeli'))

KeywordUtil.logInfo('w tabeli zaladowalo sie : ' + pozycje_na_stronie)

CustomKeywords.'help_pack.wait_for_text.Present'('Pierwsza', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Następna', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Poprzednia', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Ostatnia', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Tytuł', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Znak sprawy', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Rok założenia', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('(JRWA) Teczka', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Termin realizacji', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Polecenie', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Etykieta', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Tryb', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Referent', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Kategoria', 10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Nowa sprawa'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('Nowa sprawa', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Utwórz', 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Referent sprawy', 10)

