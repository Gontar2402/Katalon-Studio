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

UsuwanieAktywnegoZastepstwa()

def UsuwanieAktywnegoZastepstwa() {
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

    Thread.sleep(700)

    CzyAktywne = WebUI.getText(findTestObject('tabela', [('xpath') : '//table[@id=\'tblZastepstwaIndexGrid\']/tbody/tr/td[10]']))

    assert CzyAktywne == 'Tak'

    'Kliknij button Usuń'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_zastepstwa_actions_del\']/div']), 
        15)

    WebUI.waitForAlert(5)

    WebUI.acceptAlert()

    CustomKeywords.'help_pack.wait_for_text.Present'('Nie można usunąć aktywnego zastępstwa', 15)

    CustomKeywords.'help_pack.Wyloguj.wyloguj'()

    WebUI.setText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole Nazwa uzytkownika'), 'michal.wojciechowski')

    WebUI.setEncryptedText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole haslo'), 'NPnhp8lbvIHTcBx1PsaVyg==')

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/button zaloguj'))

    CustomKeywords.'help_pack.wait_for_text.Present'('Nazwa użytkownika i/lub hasło jest błędne.', 15)
}

