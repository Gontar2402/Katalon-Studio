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

for (def liczba_prob = 1; liczba_prob < 4; liczba_prob++) {
    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    WebUI.selectOptionByValue(findTestObject('Wybierz opcje', [('xpath') : '//select']), '4', false)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
        10)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do dekretacji_(dokumenty)'), 
        10)

    WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/testy niezalezne 2/zmiana typu dokumentu'), 
        'Przychodzący', false)

    CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

    'Wyszukany wiersz 1'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblDekretacjaCommonGrid\']/tbody/tr/td[2]']), 
        10)

    'Szczegóły'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[3]/ul/li[2]/div/div']), 
        10)

    rodzaj_dokumentu_przed = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[2]/div/div/table/tbody/tr[6]/td[2]']))

    'OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
        10)

    'Edytuj'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[3]/ul/li[2]/div[4]/div']), 
        10)

    'Zmień Rodzaj dokumentu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[8]/td/div/div/input']), 
        10)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa inicjalizacja ', 15)

    Random rnd = new Random()

    int losowy_rodzaj_dokumentu = 2 + rnd.nextInt(19)

    'Wybierz losowy rodzaj dokumentu'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'kategorie-tree\']/ul/li['+losowy_rodzaj_dokumentu+']/a']), 
        10)

    'OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        10)

    'Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[6]']), 10)

    'Szczegóły'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[3]/ul/li[2]/div/div']), 
        10)

    rodzaj_dokumentu_po = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[2]/div/div/table/tbody/tr[6]/td[2]']))

    if (rodzaj_dokumentu_po != rodzaj_dokumentu_przed) {
        liczba_prob = 10
    }
}

