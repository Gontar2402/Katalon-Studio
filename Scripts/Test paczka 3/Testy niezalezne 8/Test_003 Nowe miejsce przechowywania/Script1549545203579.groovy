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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Miejsca przechowywania'), 
    15)

'button Nowy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_dokumenty_miejsce_przechowywania_menu_nowy_button\']/div']), 
    15)

LosowaNazwa = ('Miejsce przech : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

NazwaSkrocona = ('Nazwa skrocona : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

Opis = ('Opis : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

Thread.sleep(300)

WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokument_miejsca_przechowywania_nazwa\']']), 
    LosowaNazwa)

WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_dokument_miejsca_przechowywania_nazwa_skrocona\']']), 
    NazwaSkrocona)

WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//textarea[@id=\'obi_dokument_miejsca_przechowywania_opis\']']), 
    Opis)

WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//li/input']), 'Punkt kancelaryjny ESOD')

WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//li/input']), Keys.chord(Keys.ENTER))


'rozwiń Komórka organizacyjna'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'s2id_obi_dokument_miejsca_przechowywania_idwydzial\']/a/span']), 
    15)

'wyszukaj odpowiednią komórkę\r\n'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), 'Zespół ds. finansowo - księgowych')

'wyszukaj odpowiednią komórkę\r\n'
WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), Keys.chord(Keys.ENTER))

'button Utwórz i zamknij'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDokumentMiejsceprzechowywaniaSaveAndClose\']']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa\']']), 
    LosowaNazwa)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nazwa_skrocona\']']), 
    NazwaSkrocona)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'opis\']']), 
    Opis)


CustomKeywords.'help_pack.wait_for_text.Present'('Zespół ds. finansowo - księgowych', 15)
