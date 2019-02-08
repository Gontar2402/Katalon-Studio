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

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Punkty kancelaryjne'), 
    15)

'podmenu Dokumenty wychodzące'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'ui-id-15\']/div']), 
    15)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '(//input[@id=\'gs_punkt[nazwa]\'])[2]']), 
    'Wychodzący punkt kancelaryjny DOKUS')

'Odpowieni PK wyszukany w tabeli'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '(//tr[@id=\'2\']/td[2])[3]']), 
    15)

'button edytuj wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'edit_admin_punkty_kancelaryjne_wych_table\']/div/span']), 
    15)

EdytowanieRekordu()

SprawdzmyCzyDaneZostalyZmienione()

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Stanowiska'), 
    15)

'Wyszukujemy w tabeli zmieniony punkt kacelaryjny wychodzący'
CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_stanowiska[pkw]\']']), 
    skrot_PK)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : skrot_PK]), 15)

def EdytowanieRekordu() {
    skrot_PK = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(4)

    'wpisujemy nowy losowy skrót'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[skrot]\']']), skrot_PK)

    NazwaSkrocona = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3)

    'wpisujemy nowa losowa skrocona nazwe'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[nazwa_skrocona]\']']), NazwaSkrocona)

    Miasto = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(6)

    'wpisujemy nowe losowe miasto'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[miasto]\']']), Miasto)

    AdresUlica = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(7)

    'wpisujemy nowy losowy skrót'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[ulica]\']']), AdresUlica)

    Email = (((org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(3) + '.') + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(
        3)) + '@google.com')

    'wpisujemy nowy losowy email'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[email]\']']), Email)

    Poczta = ('Poczta ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(4))

    'wpisujemy nowy losowa poczte'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'punkt[poczta]\']']), Poczta)

    NaglowekRaportu = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(4)

    'wpisujemy nowy losowy Nagłówek raportu'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//textarea[@id=\'punkt[opis]\']']), NaglowekRaportu)

    'button Zapisz'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'sData\']']), 15)
}

def SprawdzmyCzyDaneZostalyZmienione() {
    Thread.sleep(500)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 10)

    SkrotPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '(//tr[@id=\'2\']/td[3])[3]']))

    assert skrot_PK == SkrotPoEdycji

    NaglowegraportuPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '(//tr[@id=\'2\']/td[4])[3]']))

    assert NaglowekRaportu == NaglowegraportuPoEdycji

    NazwaSkroconaPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '(//tr[@id=\'2\']/td[5])[2]']))

    assert NazwaSkrocona == NazwaSkroconaPoEdycji

    MiastoPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '(//tr[@id=\'2\']/td[7])[2]']))

    assert Miasto == MiastoPoEdycji

    EmailPoEdycji = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[@id=\'2\']/td[14]']))

    assert Email == EmailPoEdycji
}

