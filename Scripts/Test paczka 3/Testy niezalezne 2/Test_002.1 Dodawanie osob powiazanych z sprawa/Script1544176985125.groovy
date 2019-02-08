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
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    10)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

wyszukiwanie_w_tabeli_odpowiedniego_wiersza()

'Osoby'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[3]/div/div']), 
    10)

'Wybierame osobę '
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div[2]/div/div[2]/div']), 
    10)

'OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    10)

'Szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[2]/div/div']), 
    10)

'Zakładka Metryka'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/ul/li[8]/a']), 10)

CustomKeywords.'help_pack.wait_for_text.Present'('Dodanie kontrahenta do sprawy', 10)

'OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    10)

'Osoby'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[3]/div/div']), 
    10)

'Osoba usun z powiazanych ze sprawa'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div[2]/div']), 10)

'OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
    10)

def wyszukiwanie_w_tabeli_odpowiedniego_wiersza() {
    int wiersz = 2

    for (int liczba_prob = 1; liczba_prob < 8; liczba_prob++) {
        def xpath_wiersza = ('//tr[' + wiersz) + ']/td[2]'

        Thread.sleep(400)

        'Sprawa w tabeli'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 10)

        'Szczegóły'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[2]/div/div']), 
            10)

        'Zakładka Osoby'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/ul/li[11]/a']), 
            10)

        CustomKeywords.'help_pack.wait_for_text.Present'('Osoby powiązane ze sprawą', 10)

        def czy_znaleziono_napis = WebUI.verifyTextPresent('Nie znaleziono żadnych pasujących indeksów', false, FailureHandling.OPTIONAL)

        'ok'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
            10)

        println(czy_znaleziono_napis)

        if (czy_znaleziono_napis == true) {
            println('nie ma napisu')

            xpath_wiersza = (('//tr[' + wiersz) + ']/td[2]')

            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 10)

            liczba_prob = 10
        } else {
            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 10)

            wiersz++

            println('nie udana proba')
        }
    }
}

