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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr ZPO'), 
    15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 35)

'button Nowy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_uwagi_actions_nowy\']/div']), 
    15)

'czeka aż załaduje się okienko tworzenie ZPO'
CustomKeywords.'help_pack.wait_for_text.Present'('nowy', 15)

'Zmień koperta'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Zmień\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Wybór pozycji z rejestru wysyłek', 15)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

'wybierz wiersz pierwszy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblKopertyIndexGrid_modal\']/tbody/tr/td[2]']), 
    15)

'ustawianie daty wpływu'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//tr[6]/td/input']), '2019-01-03')

GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

'pole Uwagi'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//textarea[@id=\'obi_zpo_uwagi\']']), GlobalVariable.losowa_nazwa)

'button Utwórz i zamknij'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnZpoSaveAndClose\']']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.losowa_nazwa, 11)

'Pobieranie daty wpływu w celu sprawdzenia czy jest poprawna'
data_wplywu = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\'tblZposIndexGrid\']/tbody/tr/td[9]']))

assert data_wplywu == '2019-01-03'

