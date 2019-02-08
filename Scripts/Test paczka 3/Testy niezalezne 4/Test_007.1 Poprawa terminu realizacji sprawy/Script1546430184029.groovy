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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    15)

'wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblSprawyBiezace\']/tbody/tr/td[4]']), 
    15)

'pobierz aktualna date realizacji'
obecny_termin_realizacji = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[6]']))

'button Edytuj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[3]/div[3]/div']), 
    15)

'Poczekaj aż wyśietli się okienko do modyfikacji'
CustomKeywords.'help_pack.wait_for_text.Present'('Sprawy - modyfikacja', 15)

losowa_data()

'wpisz nową date realizacji'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_sprawy_planowany_termin\']']), GlobalVariable.data)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnSprawaSaveChanges\']']), 
    15)

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

'Poczekaj aż wyśietli się okienko do modyfikacji'
CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.data, 15)

'pobierz date realizacji po zmianie'
nowy_termin_realizacji = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[6]']))

assert obecny_termin_realizacji != nowy_termin_realizacji

def losowa_data() {
    Random rnd = new Random()

    int rok = 2040 + rnd.nextInt(50)

    int miesiac = 1 + rnd.nextInt(8)

    int dzien = 14 + rnd.nextInt(14)

    GlobalVariable.data = ((((rok + '-0') + miesiac) + '-') + dzien)
}

