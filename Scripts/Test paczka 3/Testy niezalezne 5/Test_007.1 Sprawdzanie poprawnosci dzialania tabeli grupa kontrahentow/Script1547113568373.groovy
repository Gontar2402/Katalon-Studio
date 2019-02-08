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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    15)

'button Grupy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[3]/div']), 
    15)

'nazwa tabeli Grupy kontrahentów'
CustomKeywords.'help_pack.wait_for_text.Present'('Grupy kontrahentów', 15)

sprawdz_wiersz_pierwszy()

sprawdz_wiersz_drugi()

sprawdz_wiersz_trzeci()

CustomKeywords.'help_pack.Sortowanie_tabeli.Sortowanie'(2, 2, 3)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(3, 3 //pierwsze sortowanie
    //sortowanie wartosci w tablicy
    ) //drugie sortowanie
//sortowanie wartosci w tablicy

def sprawdz_wiersz_pierwszy() {
    'wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[2]']), 15)

    'sprawdza czy po kliknięciu w wiersz wyświetką się opce edytu oraz usuń'
    CustomKeywords.'help_pack.wait_for_text.Present'('Edytuj', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Usuń', 15)

    'button powrót'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li/div/div']), 
        15)
}

def sprawdz_wiersz_drugi() {
    'wiersz drugi w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[2]/td[2]']), 15)

    'sprawdza czy po kliknięciu w wiersz wyświetką się opce edytu oraz usuń'
    CustomKeywords.'help_pack.wait_for_text.Present'('Edytuj', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Usuń', 15)

    'button powrót'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li/div/div']), 
        15)
}

def sprawdz_wiersz_trzeci() {
    'wiersz trzeci w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[3]/td[2]']), 15)

    'sprawdza czy po kliknięciu w wiersz wyświetką się opce edytu oraz usuń'
    CustomKeywords.'help_pack.wait_for_text.Present'('Edytuj', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Usuń', 15)

    'button powrót'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li/div/div']), 
        15)
}

