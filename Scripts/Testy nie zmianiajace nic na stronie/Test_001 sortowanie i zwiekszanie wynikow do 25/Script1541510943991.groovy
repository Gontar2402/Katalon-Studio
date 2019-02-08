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
import java.lang.Integer as Integer
import java.lang.Float as Float

WebUI.comment('Call custom keyword in katalon Studio.')

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

not_run: CustomKeywords.'help_pack.Przeladowanie_strony.przeladuj'()

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'))

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'))

WebUI.waitForElementNotVisible(findTestObject('hsi_pl_login/Obiekty powtarzalne/komunikat Prosze czekac'), 
    5)

//przed = WebUI.getText(findTestObject('Page_System obiegu dokumentw ESOD l/td_122017'))
WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/liczba_wynikow na stronie'), 
    '25', true)

WebUI.waitForElementNotVisible(findTestObject('hsi_pl_login/Obiekty powtarzalne/komunikat Prosze czekac'), 
    15)

WebUI.verifyTextPresent('Pozycje od 1 do 25', true)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/sortuj_po_Nr ewidencyjnym'), 
    5)

WebUI.waitForElementPresent(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/pierwszy_wiersz_druga_kolumna_wartosc_12013'), 
    5)

def wiersz_1_kolumna_2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/tabela Rejestr korespondencji przychodzacej', 
        [('wiersz') : 1, ('kolumna') : 2]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_1_kolumna_2 == '1/2013'

def wiersz_2_kolumna_2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/tabela Rejestr korespondencji przychodzacej', 
        [('wiersz') : 2, ('kolumna') : 2]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_2_kolumna_2 == '2/2013'

def wiersz_3_kolumna_2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_001/tabela Rejestr korespondencji przychodzacej', 
        [('wiersz') : 3, ('kolumna') : 2]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_3_kolumna_2 == '3/2013'

