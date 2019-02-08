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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button JRWA'), 
    15)

'button Lista'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//div[@id=\'obi_jrwa_drzewo_jrwa_button\']/div)[2]']), 
    15)

'sprawdzanie czy załadowała się tabela ze wszystkimi kolumnami'
sprawdzanie_czy_tabela_sie_zaladowala()

sprawdz_wiersz_pierwszy()

sprawdz_wiersz_drugi()

sprawdz_wiersz_trzeci()

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(1, 2)

CustomKeywords.'help_pack.Sortowanie_tabeli.Sortowanie'(2, 2, 5)

def sprawdz_wiersz_pierwszy() {
    'wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[2]']), 15)

    'sprawdza czy po kliknięciu w wiersz wyświetlają się odpowiednie Operacje'
    CustomKeywords.'help_pack.wait_for_text.Present'('Edytuj', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Szczegóły', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Utrwal zmiany', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Dołącz', 15)

    'button powrót'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li/div/div']), 
        15)
}

def sprawdz_wiersz_drugi() {
    'wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[2]/td[2]']), 15)

    'sprawdza czy po kliknięciu w wiersz wyświetlają się odpowiednie Operacje'
    CustomKeywords.'help_pack.wait_for_text.Present'('Edytuj', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Szczegóły', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Utrwal zmiany', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Dołącz', 15)

    'button powrót'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li/div/div']), 
        15)
}

def sprawdz_wiersz_trzeci() {
    'wiersz pierwszy w tabeli'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[3]/td[2]']), 15)

    'sprawdza czy po kliknięciu w wiersz wyświetlają się odpowiednie Operacje'
    CustomKeywords.'help_pack.wait_for_text.Present'('Edytuj', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Szczegóły', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Utrwal zmiany', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Dołącz', 15)

    'button powrót'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li/div/div']), 
        15)
}

def sprawdzanie_czy_tabela_sie_zaladowala() {
    CustomKeywords.'help_pack.wait_for_text.Present'('JRWA dla najbliższej', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Hasło klasyfikacyjne', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Symbol klasyfikacyjny', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Komórka organizacyjna', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Kategoria archiwalna macierzysta', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Kategoria archiwalna inna', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Uwagi', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Ważne od', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Ważne do', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 10', 15)
}

