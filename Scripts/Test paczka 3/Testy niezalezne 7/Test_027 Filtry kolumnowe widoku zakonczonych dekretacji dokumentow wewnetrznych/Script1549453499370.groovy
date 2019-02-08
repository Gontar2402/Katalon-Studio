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
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'), 
    15)

'button Zakończone (wewnętrzne)'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_sprawy_dokumenty_actions_zakonczone_wewnetrzne\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Zakończone dekretacje dokumentów wewnętrznych', 15)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(1, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(2, 4)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(5, 3)

FiltrowanieKolumnyPoprzedniaOperacja()

FiltrowanieKolumnyWykonanaOperacja()

FiltrowanieKolumnySprawaDokumentu()

def FiltrowanieKolumnyWykonanaOperacja() {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'rodzaj\']']), 'Zakończenie procedowania', 
        false)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'rodzaj\']']), 'Wszystkie', 
        false)
}

def FiltrowanieKolumnySprawaDokumentu() {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'sprawa\']']), 'Tak', false)

    CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'sprawa\']']), 'Wszystkie', 
        false)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'sprawa\']']), 'Nie', false)

    CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'sprawa\']']), 'Wszystkie', 
        false)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('filtrowanie spośród', 15)
}

def FiltrowanieKolumnyPoprzedniaOperacja() {
    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'poprzedni_rodzaj\']']), 'Dekretacja', 
        false)

    CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'poprzedni_rodzaj\']']), 'Wszystkie', 
        false)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'poprzedni_rodzaj\']']), 'Przedłożenie', 
        false)

    CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'poprzedni_rodzaj\']']), 'Wszystkie', 
        false)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'poprzedni_rodzaj\']']), 'Odesłanie', 
        false)

    CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród', 15)

    WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'poprzedni_rodzaj\']']), 'Wszystkie', 
        false)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('filtrowanie spośród', 15)
}

