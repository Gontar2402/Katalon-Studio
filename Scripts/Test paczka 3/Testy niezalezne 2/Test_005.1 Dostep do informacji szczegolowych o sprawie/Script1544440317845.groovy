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

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_004/zmiana stanowiska'), 
    '4', false)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    5)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'), 
    5)

'Wiersz w tabeli sprawy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[2]/td[4]']), 10)

'Szczegóły'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[5]/ul/li[2]/div/div']), 
    10)

sprawdzanie_czy_sa_wszystkie_zakladki()

def sprawdzanie_czy_sa_wszystkie_zakladki() {
    CustomKeywords.'help_pack.wait_for_text.Present'('Ogólne', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Realizacja', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Udostępnianie', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Dok. przych.', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Dok. wew.', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Dok. wych.', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Odwzorowania', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Metryka', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Adnotacje', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Atrybuty', 10)

    CustomKeywords.'help_pack.wait_for_text.Present'('Osoby', 10)
}

