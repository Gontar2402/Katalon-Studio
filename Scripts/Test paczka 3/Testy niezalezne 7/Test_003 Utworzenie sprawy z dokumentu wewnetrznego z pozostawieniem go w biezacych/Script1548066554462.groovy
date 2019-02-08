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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'), 
    15)

'Czeka aż załaduje się tabela'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

'Wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblDekretacjeIndexGrid\']/tbody/tr/td[4]']), 
    15)

'pobieranie nazwy dokumentu\r\n'
nazwa_dokumentu = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\'tblDekretacjeIndexGrid\']/tbody/tr/td[4]']))

'button Sprawa z dok.'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_moje_dokumenty_dokument_actions_nowa_spr_z_dok\']/div']), 
    15)

'Czeka aż załaduje się okienka tworzenia sprawy z dokumentu'
CustomKeywords.'help_pack.wait_for_text.Present'('Nowa sprawa z dokumentu', 15)

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_sprawy_jrwa_symbol\']']), 
    '2600')

'odblokuj edycje Tytułu'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'container_edytuj_nazwe\']/label/span']), 
    15)


CustomKeywords.'help_pack.wait_for_text.Present'('Źródła zaopatrzenia', 25)
CustomKeywords.'help_pack.wait_for_text.not_Present'('Pobieranie informacji o JRWA...', 25)

'button Generuj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnGenerujBezPodteczki\']']), 
    15)

losowy_tytul = ('sprawa: ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

'wpisz tytuł nowej sprawy'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_sprawy_opis\']']), losowy_tytul)

'odznaczenie opcji Czy usunąć dokument z bieżących'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@name=\'czy_ukryc_dokument\']']), 
    15)
Thread.sleep(500)
CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa generowanie znaku', 10)
'button utwórz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnSprawaSave\']']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(nazwa_dokumentu, 4)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    15)

'Czeka aż załaduje się tabela'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

'wyszukanie utworzonej sprawy'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(losowy_tytul, 5)

