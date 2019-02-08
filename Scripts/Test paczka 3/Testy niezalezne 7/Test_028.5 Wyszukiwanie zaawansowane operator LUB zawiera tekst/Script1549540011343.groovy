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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr korespondencji przychodzącej', 15)

NrEwidencyjny = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[2]/td[2]']))

Tytul = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[2]/td[3]']))

NadawcaImie = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[2]/td[19]']))

TestowanieWyszukiwanaiZaawansowanegoOperatorLUB()

def TestowanieWyszukiwanaiZaawansowanegoOperatorLUB() {
    'button wyszukiwanie zaawansowane'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//img[@alt=\'Zaawansowane wyszukiwanie\']']), 
        15)

    'odpowiednia nazwa kolumny'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Numer ewidencyjny']), 
        15)

    'przenosimy na formularz wyszukiwania'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div[2]']), 15)

    'operator ,,LUB"'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div/div[2]']), 
        15)

    'przenosimy na formularz wyszukiwania'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div[2]']), 15)

    'odpowiednia nazwa kolumny'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text and title', [('text') : 'Tytuł dokumentu'
                , ('title') : 'Tytuł dokumentu']), 15)

    'przenosimy na formularz wyszukiwania'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div[2]']), 15)

    'operator ,,LUB"'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div/div[2]']), 
        15)

    'przenosimy na formularz wyszukiwania'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div[2]']), 15)

    'odpowiednia nazwa kolumny'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text and title', [('text') : 'Nadawca imię'
                , ('title') : 'Imię nadawcy']), 15)

    'przenosimy na formularz wyszukiwania'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div[2]']), 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'rodzaj-warunku\']']), 'zawiera', 
        false)

    'wpisujemy wartosc pobrana z tabeli'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'wartosc-warunku\']']), NrEwidencyjny)

    WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'wartosc-warunku\']']), Keys.chord(Keys.BACK_SPACE, 
            Keys.BACK_SPACE, Keys.BACK_SPACE))

    WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'wartosc-warunku\']']), '*')



    'wpisujemy wartosc pobrana z tabeli'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '(//input[@name=\'wartosc-warunku\'])[2]']), 'jakis tekst')



    'wpisujemy wartosc pobrana z tabeli'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '(//input[@name=\'wartosc-warunku\'])[3]']), 'NieMaTakiejOsoby')



    'button szukaj'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@value=\'Szukaj\']']), 
        15)

    'sprawdzamy czy został wyszukany jeden wiersz'
    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 1', 15)
}

