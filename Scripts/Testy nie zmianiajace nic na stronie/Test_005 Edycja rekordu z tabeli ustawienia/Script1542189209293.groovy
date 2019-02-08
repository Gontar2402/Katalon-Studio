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

WebUI.navigateToUrl(GlobalVariable.Url_admin)

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.click(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Ustawienia'))

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/pole Opis'), 
    'Adres serwera LDAP')

WebUI.delay(1)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/wyszukany wiersz'), 
    5)

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/button edytuj wybrany wiersz'))

WebUI.setText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/do pola Adres serwera'), 
    'katalon_edycja_rekordu')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/button Zapisz'))

WebUI.delay(2)

def wiersz_2_kolumna_3 = WebUI.getText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/tabela ustawienia', 
        [('wiersz') : 2, ('kolumna') : 3]), FailureHandling.CONTINUE_ON_FAILURE)

assert wiersz_2_kolumna_3 == 'katalon_edycja_rekordu'

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/button edytuj wybrany wiersz'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa przetwarzanie danych', 15)

WebUI.setText(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/do pola Adres serwera'), 
    '')

WebUI.click(findTestObject('admin_php/Obiekty dodatkowe/Obiekty dodatkowe do Test_005/button Zapisz'))

CustomKeywords.'help_pack.wait_for_text.not_Present'('katalon_edycja_rekordu', 10)

