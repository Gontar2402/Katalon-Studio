import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.wychodzcej'), 
    15)

'button Rezerwacja puli dok.'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_dokout_rejestr_rezerwacja_puli\']/div']), 
    15)

LosowyOpis = ('Opis : ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

CustomKeywords.'help_pack.wait_for_text.Present'('Rezerwacja puli dokumentów wychodzących', 15)

'Wpisujemy losowy opis do pola Opis'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//form[@id=\'frmDokOutRezerwacjaPuli\']/table/tbody/tr/td/input']), 
    LosowyOpis)

'Wpisujemy liczbę rezerwowanych dokumentów'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'obi_pula_rezerwacji_dokumentow_wychodzacych_liczba\']']), 
    '1')

'button Zarezerwuj'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//input[@id=\'btnDokumentwychodzacyRezerwacjaPuli\']']), 
    15)

'pobieramy nr ewidencyjny ostatniego dokumentu'
NrEwidencyjnyOstatniegoDokumentu = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[2]']))

NrEwidencyjnyPrzedInt = NrEwidencyjnyOstatniegoDokumentu.find('\\d+').toInteger()

KolejnyNrEwidencyjny = (NrEwidencyjnyPrzedInt + 2)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    15)

'wiersz pierwszy w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//td[3]']), 15)

TytulDokumentuWychodzacego = ('Rezerwacja ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

CustomKeywords.'help_pack.Tworzenie_dokumentu.wychodzacego_w_obiegu_papierowym'(TytulDokumentuWychodzacego)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.wychodzcej'), 
    15)

'Wyszukujemy utworzony dokument wychodzacy'
CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tytul\']']), 
    TytulDokumentuWychodzacego)

'pobieramy nr ewidencyjny nowego dokumentu'
NrEwidencyjnyNowegoDokumentu = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[2]']))

NrEwidencyjnyPoInt = NrEwidencyjnyNowegoDokumentu.find('\\d+').toInteger()

'Kolejny nr ewidencyjny powinien być o dwa wiekszy od nr ewidencyjnego po rezerwacji puli, ponieważ rezerwujemy jeden dokument'
assert NrEwidencyjnyPoInt == KolejnyNrEwidencyjny

CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'tytul\']']), 
    '')

'sprawdzamy czy zarezerwowany dokument nie został utworzony'
SprawdzNrEwidencyjnyZarezerwowany()

def SprawdzNrEwidencyjnyZarezerwowany() {
    Date today = new Date()

    String rok = today.format('yyyy')

    NrEwidencyjnyZarezerwowany = (NrEwidencyjnyPrzedInt + 1)

    def DoWyszukania = (NrEwidencyjnyZarezerwowany + '/') + rok

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'nr_ewidencyjny\']']), 
        DoWyszukania)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycji 0 z 0 dostępnych', 15)
}

