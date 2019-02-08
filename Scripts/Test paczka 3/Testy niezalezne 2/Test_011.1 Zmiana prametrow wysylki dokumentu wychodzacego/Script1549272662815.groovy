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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr wysyek'), 
    10)

'Zmiana statusu wysylki na "W toku"'
WebUI.selectOptionByValue(findTestObject('button', [('xpath') : '//select[@name=\'status_wysylki\']']), 'W toku', false)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

'Wyszukany wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblKopertyIndexGrid\']/tbody/tr/td[4]']), 
    5)

zmiana_wysylki()

def zmiana_wysylki() {
    def sposob_przesylki_przed = WebUI.getText(findTestObject('pole tekstowe', [('xpath') : '//table[@id=\'tblKopertyIndexGrid\']/tbody/tr/td[5]']))

    'Zmiana parametrów wysyłki'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[2]/ul/li[2]/div[4]/div']), 
        10)

    for (int i = 1; i < 10; i++) {
        Random rnd = new Random()

        def zmiana_wysylki = 1 + rnd.nextInt(5)

        WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/testy niezalezne 2/zmiana sposobu wysylki'), 
            ('' + zmiana_wysylki) + '', false)

        println(sposob_przesylki_przed)

        'Zmień'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button[2]/span']), 
            5)

        def sposob_przesylki_po = WebUI.getText(findTestObject('pole tekstowe', [('xpath') : '//table[@id=\'tblKopertyIndexGrid\']/tbody/tr/td[5]']))

        println(sposob_przesylki_po)

        if (zmiana_wysylki != sposob_przesylki_przed) {
            i = 11
        } else {
            'Wyszukany wiersz'
            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'tblKopertyIndexGrid\']/tbody/tr/td[4]']), 
                5)

            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[2]/ul/li[2]/div[4]/div']), 
                10)
        }
    }
}

