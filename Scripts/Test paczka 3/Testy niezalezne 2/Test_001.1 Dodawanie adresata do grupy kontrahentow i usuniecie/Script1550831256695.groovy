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
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button Adresaci'), 
    5)

'Wyszukujemy wiersz ktory nie ma grupy'
wyszukiwanie_w_tabeli_odpowiedniego_wiersza()

'Dodaj do (Grupy)'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li[4]/div/div']), 
    5)

'Wybiera odpowienia grupę kontrahentów'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[2]/div/div[2]/table/tbody/tr/td[2]']), 
    5)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.zmienna_pomocna, 
    5)

'Rozwija aby sprawdzić czy dodał do grupy kontrahentów'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'grd_adresaci\']/tbody/tr/td/span']), 
    5)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Pozycji 0 z 0 dostępnych', 5)

'grupa do których należy Adresat'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td/div/div[2]/table/tbody/tr/td']), 
    5)

'Usuń z grupy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[11]/ul/li[2]/div/div']), 
    5)

def wyszukiwanie_w_tabeli_odpowiedniego_wiersza() {
    int rozwin_wiersz = 2

    def xpath_wiersza = ('//table[@id=\'grd_adresaci\']/tbody/tr[' + rozwin_wiersz) + ']/td'

    for (int liczba_prob = 1; liczba_prob < 8; liczba_prob++) {
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 5)

        CustomKeywords.'help_pack.wait_for_text.Present'('Grupy do których należy Adresat', 5)

        def czy_znaleziono_napis = WebUI.verifyTextPresent('Pozycji 0 z 0 dostępnych', false, FailureHandling.OPTIONAL)

        println(czy_znaleziono_napis)

        if (czy_znaleziono_napis == true) {
            println('nie ma napisu')

            xpath_wiersza = (('//table[@id=\'grd_adresaci\']/tbody/tr[' + rozwin_wiersz) + ']/td[5]')

            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 5)

            GlobalVariable.zmienna_pomocna = WebUI.getText(findTestObject('button', [('xpath') : xpath_wiersza]))

            liczba_prob = 10
        } else {
            CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : xpath_wiersza]), 5)

            rozwin_wiersz++

            xpath_wiersza = (('//table[@id=\'grd_adresaci\']/tbody/tr[' + rozwin_wiersz) + ']/td')

            println('nie udana proba')
        }
    }
}

