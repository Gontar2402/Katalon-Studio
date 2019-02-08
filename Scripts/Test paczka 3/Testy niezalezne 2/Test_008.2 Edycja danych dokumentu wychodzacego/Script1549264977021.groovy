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
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.wychodzcej'), 
    10)

'Wiersz 3'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblDokumentywychodzaceIndexGrid\']/tbody/tr[3]/td[3]']), 
    10)

Sygnatura_pisma = WebUI.getText(findTestObject('button', [('xpath') : '//tr[2]/td[3]']))

'Edytuj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[5]/div']), 10)

'Zmień Rodzaj pisma'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/div/input']), 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od ', 15)

Random rnd = new Random()

int losowy_rodzaj_dokumentu = 1 + rnd.nextInt(6)

nowy_rodzaj_dokumentu = WebUI.getText(findTestObject('button', [('xpath') : ('//div[2]/div/div[2]/table/tbody/tr[' + losowy_rodzaj_dokumentu) + 
            ']/td[2]']))

'Wybierz losowy rodzaj dokumentu'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : ('//div[2]/div/div[2]/table/tbody/tr[' + 
            losowy_rodzaj_dokumentu) + ']/td[2]']), 10)

'Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[2]']), 10)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(Sygnatura_pisma, 3)

'Szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[2]/ul/li[2]/div/div']), 
    10)

CustomKeywords.'help_pack.wait_for_text.Present'(nowy_rodzaj_dokumentu, 10)

