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

CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr wysyłek', 15)

'Zmiana statusu Doręczenia na Doręczono'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'doreczenie\']']), 'Doręczono', 
    false)

'Zmiana statusu wysyłki na zakopertowana'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'status_wysylki\']']), 'Zakopertowana', 
    false)

Thread.sleep(300)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

'Wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[4]']), 15)

'button Wysłano'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_koperta_actions_wyslany\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Oznaczanie wysyłki jako wysłanej', 15)

'Wpisujemy datę z przyszłości'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wysylka_data_wyslania\']']), '')

'Wpisujemy datę z przyszłości'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wysylka_data_wyslania\']']), '2033-03-14 14:50:22')

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Zapisz\']']), 
    15)

'Zmiana statusu wysyłki na Wszystkie'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'status_wysylki\']']), 'Wszystkie', 
    false)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//th[7]/input']), 
    '2033-03-14')

'Klikamy wyszukany wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[7]']), 15)

'button Nie Wysłano'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[2]/ul/li[2]/div/div']), 
    15)

WebUI.waitForAlert(5)

WebUI.acceptAlert()

