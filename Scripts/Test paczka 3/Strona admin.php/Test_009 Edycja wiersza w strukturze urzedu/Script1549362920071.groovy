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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Struktura urzedu'), 
    15)

'wybierz odpowiednią koórke organizacyjną'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[@id=\'14\']/td[2]/span']), 
    15)

'button Edytuj wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'edit_admin_wydzialy_table\']/div/span']), 
    15)

GenerujLosoweNazwy()

'Pole Nazwa'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_wydzialy[nazwa]\']']), LosowaNazwa)

'Pole Symbol komórki w znaku sprawy'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_wydzialy[skrot]\']']), LosowySymbolKomorki)

'Pole Skrót organizacyjny'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_wydzialy[skrot_organizacyjny]\']']), LosowySkrotOrganizacyjny)

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)

WebUI.waitForAlert(5)

WebUI.acceptAlert()

CustomKeywords.'help_pack.wait_for_text.Present'(LosowaNazwa, 15)

CustomKeywords.'help_pack.wait_for_text.Present'(LosowySkrotOrganizacyjny, 15)

CustomKeywords.'help_pack.wait_for_text.Present'(LosowySymbolKomorki, 15)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('wlodzimierz.ficek', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Tworzenie_sprawy.tworzenie_sprawy'('Edycja str urz ')

CustomKeywords.'help_pack.wait_for_text.Present'(LosowySymbolKomorki, 15)

def GenerujLosoweNazwy() {
    LosowySymbolKomorki = ((org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3) + '.') + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(
        1))

    LosowySkrotOrganizacyjny = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(2)

    LosowaNazwa = ('Edycja: ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(7))
}

