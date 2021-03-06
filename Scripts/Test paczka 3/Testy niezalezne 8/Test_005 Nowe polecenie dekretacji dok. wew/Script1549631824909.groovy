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

'button Polecenia dekretacji dok. wew'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//div[@id=\'obi_osoby_rodzaj_button\']/div)[3]']), 
    15)

'button Nowe polecenie'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dekretacja_dokwew_sposob_realizacji_new_button\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Nowe polecenie do dekretacji', 15)

LosowePolecenie = ('ZPolecenie : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

'Wpisujemy losowe polecenie'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dekretacja_dokwew_sposob_realizacji_nazwa\']']), 
    LosowePolecenie)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDekretacjaDokWewSposobRealizacjiSave\']']), 
    15)

'wyszukujemy w tabeli dodane polecenie'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
    LosowePolecenie)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Dokumenty bieżące', 25)

'zmieniamy rodzaj doumentu na wewnętrzny'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'rodzaj_dokumentu\']']), 'Wewnętrzny', 
    false)

'kilkamy wiersz pierwszy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblDekretacjeIndexGrid\']/tbody/tr/td[3]']), 
    15)

'button Dekretuj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[8]/div/div']), 15)

Thread.sleep(300)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Wczytywanie danych...', 15)

'Zmieniamy polecenie na nowo utworzone'
WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'frmDekretacjaDokumentuSposobRealizacji\']']), 
    LosowePolecenie, false)

