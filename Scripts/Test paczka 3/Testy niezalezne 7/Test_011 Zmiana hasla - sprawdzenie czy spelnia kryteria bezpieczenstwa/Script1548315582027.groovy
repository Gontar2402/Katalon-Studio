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

CustomKeywords.'help_pack.Logowanie.zaloguj'('kamila.wojciechowska', 'gqNiyN/IiIvaUo8G1BKwoQ==')

'rozwiń dodatkowe menu'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//ul[2]/li/a']), 15)

'button zmiana hasła'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'ribbon_przycisk_zmien_haslo\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Zmień hasło', 15)

inne_hasla()

krotkie_i_brak_liter_w_hasle()

zle_obecne_haslo()

def inne_hasla() {
    'pole obecne hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[obecne]\']']), 'NPnhp8lbvIHTcBx1PsaVyg==')

    'pole Nowe hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[nowe1]\']']), 'EoA5IjQGoKc=')

    'pole Potwierdź nowe hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[nowe2]\']']), '8ylGA/40/qI=')

    'button Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//button[2]/span']), 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Podane nowe hasło jest inne od jego potwierdzenia!', 15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK'), 15)
}

def krotkie_i_brak_liter_w_hasle() {
    'pole obecne hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[obecne]\']']), 'NPnhp8lbvIHTcBx1PsaVyg==')

    'pole Nowe hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[nowe1]\']']), 'Vl2156Mg+xc=')

    'pole Potwierdź nowe hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[nowe2]\']']), 'Vl2156Mg+xc=')

    'button Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//button[2]/span']), 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nowe hasło jest za krótkie.', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nowe hasło posiada zbyt mało znaków specjalnych.', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nowe hasło posiada zbyt mało dużych liter.', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nowe hasło musi zawierać przynajmniej 1 dużą literę', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Nowe hasło musi zawierać przynajmniej 1 znak specjalny spośród:', 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Minimalna długość hasła to 8 znaków', 15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK2'), 15)
}

def zle_obecne_haslo() {
    'pole obecne hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[obecne]\']']), 'S2AZ2CswOAPS0XFsHWIkZH7T2PNz3Q6t')

    'pole Nowe hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[nowe1]\']']), 'xG/WdlIl2/IoIpCsbgvQzQ==')

    'pole Potwierdź nowe hasło'
    WebUI.setEncryptedText(findTestObject('pole tekstowe', [('xpath') : '//input[@name=\'zmiana_hasla[nowe2]\']']), 'xG/WdlIl2/IoIpCsbgvQzQ==')

    'button Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//button[2]/span']), 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Podano nieprawidłowe obecne hasło!', 15)

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/span_OK3'), 15)
}

