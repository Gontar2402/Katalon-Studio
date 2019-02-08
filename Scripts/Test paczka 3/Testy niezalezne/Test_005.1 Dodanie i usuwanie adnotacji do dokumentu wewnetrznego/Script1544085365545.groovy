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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_004/zmiana stanowiska'), 
    '4', false)

GlobalVariable.losowa_nazwa = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'('test_5645646', 4)

'Dodaj Adnotacje'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Dodaj']), 15 //li[5]/ul/li[3]/div[2]/div
    )

WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//td/input', ('nazwa') : 'tytul']), GlobalVariable.losowa_nazwa)

'OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span', ('nazwa') : '  OK ']), 
    15)

'Pokaz Adnotacje'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Pokaż']), 15)

'Sprawdza czy dodała się Adnotacja'
CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.losowa_nazwa, 10)

for (int i = 1; i < 10; i++) {
	
    'Kliknij prawym na Adnotacje'
    WebUI.rightClick(findTestObject('button', [('xpath') : '//td/div/div[2]', ('nazwa') : GlobalVariable.losowa_nazwa]))

    'Usuń adnotacje'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div/ul/li[3]/a']), 15)
	Thread.sleep(500)
    CustomKeywords.'help_pack.wait_for_text.not_Present'('Zapisywanie', 5)

    'Sprawdz czy Adnotacja się usuneła'
    def a = WebUI.verifyTextNotPresent(GlobalVariable.losowa_nazwa, false, FailureHandling.OPTIONAL)

    if (a == true) {
        i = 22
    }
}

