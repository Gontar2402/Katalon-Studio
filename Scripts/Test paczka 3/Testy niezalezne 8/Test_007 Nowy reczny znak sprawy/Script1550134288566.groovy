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

'button Ręczny znak'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[4]/ul/li[2]/div[2]/div']), 
    15)

LosowyTytul = ('Reczny znak : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

Thread.sleep(300)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa zapisywanie danych...', 15)

'wpisujemy losowy tytuł sprawy'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_sprawy_opis\']']), LosowyTytul)

LosowyRecznyZnak = ((((('WIW.wl' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(4)) + '.') + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(
    2)) + '.') + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(4))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), 
    '2600')

CustomKeywords.'help_pack.wait_for_text.Present'('Źródła zaopatrzenia', 25)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie informacji o JRWA...', 10)

'wpisujemy losowy Znak sprawy'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_sprawy_znak_sprawy\']']), LosowyRecznyZnak)

'button Utwórz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnSprawaSave\']']), 
    15)

'Wyszukujemy w tabeli utworzoną sprawę po Znaku sprawy'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'znak_sprawy\']']), 
    LosowyRecznyZnak)

