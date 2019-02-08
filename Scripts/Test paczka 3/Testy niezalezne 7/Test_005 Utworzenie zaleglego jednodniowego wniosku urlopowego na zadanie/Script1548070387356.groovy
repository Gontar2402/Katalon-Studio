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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Moje wnioski'), 
    10)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 10)

tworzenie_zaleglego_wniosku_urlopowego_na_zadanie()

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tresc\']']), 
    GlobalVariable.losowa_nazwa)

def tworzenie_zaleglego_wniosku_urlopowego_na_zadanie() {
    GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

    'Nowy wniosek'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[7]/ul/li[2]/div[2]/div']), 
        15)

    WebUI.waitForAlert(5)

    WebUI.acceptAlert()

    'zmiana rodzaju urlopu'
    WebUI.selectOptionByValue(findTestObject('Wybierz opcje', [('xpath') : '//form[@id=\'frmWniosek\']/table/tbody/tr/td/select']), 
        '2', false)

    'Losowa nazwa w uwagach, nastepnie wyszuka w tabeli'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_tresc\']']), GlobalVariable.losowa_nazwa)

    for (int liczba_prob = 0; liczba_prob < 6; liczba_prob++) {
        Random rnd = new Random()

        int rok = 2000 + rnd.nextInt(18)

        int miesiac = 1 + rnd.nextInt(8)

        int dzien = 13 + rnd.nextInt(15)

        GlobalVariable.data = ((((rok + '-0') + miesiac) + '-') + dzien)

        'Data koncowa'
        WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_data_koncowa\']']), GlobalVariable.data)

        'Data poczatkowa'
        WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_data_poczatkowa\']']), GlobalVariable.data)

        WebUI.click(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_liczba_dni\']']))

        'Button zapisz'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[4]']), 15)

        WebUI.delay(1)

        def czy_dobra_data = WebUI.verifyTextPresent('Nie można złożyć wniosku urlopowego w tym przedziale, ponieważ wszystkie dni z wybranego zakresu są wolne od pracy!', 
            false, FailureHandling.OPTIONAL)

        if (czy_dobra_data == true) {
            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
                15)
        } else {
            liczba_prob = 10
        }
    }
}

