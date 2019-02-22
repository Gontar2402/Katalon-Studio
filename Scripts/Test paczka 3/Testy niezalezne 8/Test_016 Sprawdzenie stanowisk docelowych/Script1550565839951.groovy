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

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
    15)

'zakładka Dekretacja'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Dekretacja\')]']), 
    15)

'zakładka Sprawy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Sprawy\')]']), 
    15)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_dekretacja_stanowiska[stanowisko]\']']), 
    'Wojewódzki Lekarz Weterynarii')

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Wojewódzki Lekarz Weterynarii']), 
    15)

Thread.sleep(400)

NazwiskoOsobyPierwszej = WebUI.getText(findTestObject('tabela', [('xpath') : '(//tr[@id=\'7\']/td[3])[2]']))

NazwiskoOsobyDrugiej = WebUI.getText(findTestObject('tabela', [('xpath') : '(//tr[@id=\'2\']/td[3])[2]']))

NazwiskoOsobyTrzeciej = WebUI.getText(findTestObject('tabela', [('xpath') : '(//tr[@id=\'3\']/td[3])[2]']))

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'aktualne_stanowisko\']']), 'Wojewódzki Lekarz Weterynarii w WL', 
    false)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    15)

'Wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblSprawyBiezace\']/tbody/tr/td[2]']), 
    15)

'button Udostępnij'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_moje_sprawy_sprawa_actions_dekretuj_sprawe\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'(NazwiskoOsobyPierwszej, 5)

CustomKeywords.'help_pack.wait_for_text.Present'(NazwiskoOsobyDrugiej, 5)
CustomKeywords.'help_pack.wait_for_text.Present'(NazwiskoOsobyTrzeciej, 5)