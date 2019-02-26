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

DezaktywacjaZastepstwa()

SprawdzCzyZastepstwoZostaloDezaktywowane()

def DezaktywacjaZastepstwa() {
    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        10)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/Podmenu zastepstwa i wnioski/Lista (Definiowane)'))

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_001/Do pola nazwisko'), 
        'Wojciechowski')

    Thread.sleep(200)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/Wiersz pierwszy w tabela Stanwiska'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_001/wiersz pierwszy w tabela Zastepstwa'), 
        5)

    'Kliknij button Deaktywuj'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//div[@id=\'obi_zastepstwa_actions_aktywuj\']/div)[2]']), 
        15)

    Thread.sleep(700)

    CzyAktywne = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\'tblZastepstwaIndexGrid\']/tbody/tr/td[10]']))

    DataDeaktywacji = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\'tblZastepstwaIndexGrid\']/tbody/tr/td[12]']))

    assert CzyAktywne == 'Nie'

    assert DataDeaktywacji != ''
}

def SprawdzCzyZastepstwoZostaloDezaktywowane() {
    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'('michal.wojciechowski', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    CustomKeywords.'help_pack.Logowanie.zaloguj'('anna.borowska', 'gqNiyN/IiIvaUo8G1BKwoQ==')

    'Kliknij button select, aby zobaczyć dostępne stanowiska'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'aktualne_stanowisko\']']), 
        15)

    'Zmień stanowisko na zastępowane'
    CzyUdaloSieZmienic = WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'aktualne_stanowisko\']']), 
        'St. referent. adm. w A.AGZ (za: Michał Wojciechowski)', false, FailureHandling.OPTIONAL)

    assert CzyUdaloSieZmienic == null
}

