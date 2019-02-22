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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Punkty kancelaryjne'), 
    15)

'podmenu Dokumenty przychodzące'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'ui-id-14\']/div']), 
    15)

'button dodaj nowy wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_punkty_kancelaryjne_przych_table\']/div/span']), 
    15)

losowa_nazwa_PK = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

skrot_PK = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

'wpisz losową nazawe nowego PK'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[nazwa]\']']), losowa_nazwa_PK)

'wpisz losową nazawe nowego PK'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[skrot]\']']), skrot_PK)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    15)

'czekaj na załadowanie tabeli'
CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr korespondencji przychodzącej', 15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'pkp\']']), 
    'ESOD')

'button przenieś do innego PK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_przenies_do_pk\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Wybór docelowego punktu kancelaryjnego', 15)

'Rozwiń opcje punkt kancelaryjny'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'punktkancelaryjny\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'(losowa_nazwa_PK, 15)

'stworzony PK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : losowa_nazwa_PK]), 15)

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button[2]/span']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'pkp\']']), 
    skrot_PK)



CustomKeywords.'help_pack.metryka_sprawdz_statna_czynnosc.sprawdz_informacje'('Przeniesienie dokumentu między punktami kancelaryjnymi', 
    'Administrator EZD (Adam Naczelny)')

