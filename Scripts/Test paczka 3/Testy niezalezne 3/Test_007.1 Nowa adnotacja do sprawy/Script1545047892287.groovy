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

'Wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[4]']), 15)

GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

losowa_tresc_adnotacji = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(25)

'Dodaj adnotacje'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[4]/div[2]/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Adnotacja do sprawy', 15)

'Pola tytuł adnotacji'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//td/input']), GlobalVariable.losowa_nazwa)

'Edytuj pole w Frame'
WebUI.switchToFrame(findTestObject('button', [('xpath') : '//iframe']), 15)

'Pola tytuł adnotacji'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//body']), losowa_tresc_adnotacji)

'Edytuj pole w Frame'
WebUI.switchToDefaultContent()

'Ok w adnotacja do sprawy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    15)

WebUI.delay(1)

'Pokaż adnotacje'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[4]/div/div']), 
    15)

'Pokaż tresc adnotacji'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : GlobalVariable.losowa_nazwa]), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.losowa_nazwa, 15)

CustomKeywords.'help_pack.wait_for_text.Present'(losowa_tresc_adnotacji, 15)

