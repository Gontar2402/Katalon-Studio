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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Rodzaj dokumentow wewnetrznych'), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Rodzaje dokumentów wewnętrznych', 15)

'wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[2]']), 15)

'nazwa rodzaju dokumentu'
Nazwa = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[2]']))

'Zestaw Atrybutow'
ZestawAtrybutow = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[3]']))

'button Edycja'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokwew_kategoria_menu_actions_edycja_button\']/div']), 
    15)

'button zmień zestaw atrybutów'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//input[@value=\'Zmień\'])[2]']), 
    15)

Thread.sleep(400)

'Nazwa Zestawu Atrybutow'
NazwaZestawuAtrybutow = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\'tblDefinicjetypowIndexGrid\']/tbody/tr/td[2]']))

'wybierz inny zestaw atrybutów niż obecny'
if (NazwaZestawuAtrybutow != ZestawAtrybutow) {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblDefinicjetypowIndexGrid\']/tbody/tr/td[2]']), 
        15)
} else {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblDefinicjetypowIndexGrid\']/tbody/tr[2]/td[2]']), 
        15)
}

LosowaNazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

'Wpisz nową losową nazwe'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dok_wew_rodzaje_nazwa\']']), LosowaNazwa)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnOsobyGrupySave\']']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(LosowaNazwa, 2)

'nazwa rodzaju dokumentu'
NazwaPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[2]']))

'Zestaw Atrybutow'
ZestawAtrybutowPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[3]']))

assert Nazwa != NazwaPoEdycji

assert ZestawAtrybutow != ZestawAtrybutowPoEdycji

