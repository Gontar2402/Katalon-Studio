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

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

LosowaNazwaStanowiska = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
    15)

Thread.sleep(300)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_stanowiska[login]\']']), 
    'jozef.orchowski')

'wyszukany wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[@id=\'30\']/td[4]']), 15)

edytowanie_rekordow()

sprawdz_czy_dane_zostaly_zmienione()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('jozef.orchowski', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.wait_for_text.Present'(StanowiskoPoEdycji, 15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr korespondencji przychodzącej', 15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'('NPP', 5)

'button Przedłóż do dekretacji'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokumenty_actions_przekaz_do_dekretacji\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Twoje stanowisko przypisane jest do punktu kancelaryjnego ' + PktKancPrzychPoEdycji, 
    15)

def edytowanie_rekordow() {
    'Aktualne Stanowisko'
    AktualneStanowisko = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[5]']))

    'Aktualne Komórka'
    AktualnaKomorka = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[6]']))

    'Aktualny Pkt Kanc Przych'
    AktualnyPktKancPrzych = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[10]']))

    'Aktualny Pkt Kanc Wych'
    AktualnyPktKancWych = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[2]/td[12]']))

    'Edytuj wybrany wiersz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'edit_admin_stanowiska_table\']/div']), 
        15)

    Thread.sleep(300)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie danych...', 15)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_stanowiska[nazwa]\']']), LosowaNazwaStanowiska)

    'Rozwiń komórka'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[2]/div/a/span']), 15)

    if (AktualnaKomorka == 'Samodzielne Stanowisko ds. Ochrony Inf. Niej. I ds. Obronnych') {
        'zmiana komórki'
        WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), 'finansowo - księgowych')

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Szukanie…', 15)

        CustomKeywords.'help_pack.wait_for_text.Present'('finansowo - księgowych', 15)

        WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), Keys.chord(
                Keys.ENTER))

        'zmiana Przełożonego'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[6]/td[2]/div/a/span']), 
            15)

        CustomKeywords.'help_pack.wait_for_text.Present'('Wpisz co najmniej 3 znaki', 15)

        WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), 'Bartkowiak Rafał')

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Szukanie…', 15)

        CustomKeywords.'help_pack.wait_for_text.Present'('Bartkowiak Rafał', 15)

        WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), Keys.chord(
                Keys.ENTER))

        WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska[idpkp]\']']), 
            'Punkt kancelaryjny DOKUS (DOKUS)', false)

        WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska[idpkw]\']']), 
            'Wychodzący punkt kancelaryjny DOKUS (WDOKUS)', false)
    } else {
        'zmiana komórki'
        WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), 'Samodzielne Stanowisko')

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Szukanie…', 15)

        CustomKeywords.'help_pack.wait_for_text.Present'('Samodzielne Stanowisko', 15)

        WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), Keys.chord(
                Keys.ENTER))

        'zmiana Przełożonego'
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[6]/td[2]/div/a/span']), 
            15)

        CustomKeywords.'help_pack.wait_for_text.Present'('Wpisz co najmniej 3 znaki', 15)

        WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), ' Bartoszewicz Ludwik ')

        CustomKeywords.'help_pack.wait_for_text.not_Present'('Szukanie…', 15)

        CustomKeywords.'help_pack.wait_for_text.Present'('Bartoszewicz Ludwik ', 15)

        WebUI.sendKeys(findTestObject('pole tekstowe', [('xpath') : '//div[@id=\'select2-drop\']/div/input']), Keys.chord(
                Keys.ENTER))

        WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska[idpkp]\']']), 
            'Punkt kancelaryjny ESOD (ESOD)', false)

        WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@id=\'obi_stanowiska[idpkw]\']']), 
            'Punkt kancelaryjny ESOD (ESOD)', false)
    }
    
    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)
}

def sprawdz_czy_dane_zostaly_zmienione() {
    Thread.sleep(400)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ladowanie…', 15)

    StanowiskoPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[5]']))

    KomorkaPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[6]']))

    PktKancPrzychPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//div[3]/div/div[3]/div[3]/div/table/tbody/tr[2]/td[10]']))

    PktKancWychPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[2]/td[12]']))

    assert AktualneStanowisko != StanowiskoPoEdycji

    assert AktualnaKomorka != KomorkaPoEdycji

    assert AktualnyPktKancPrzych != PktKancPrzychPoEdycji

    assert AktualnyPktKancWych != PktKancWychPoEdycji
}

