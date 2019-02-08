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

CustomKeywords.'help_pack.Wyloguj.wyloguj_archiwum'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_archiwum'('wmwlw@hsi.pl', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.wait_for_text.Present'('Spisy spraw', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Nowy archiwalny', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Spisy składów', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Lista', 15)

'klikamy główne zakładki'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'obi_topmenu_archiwum_sprawy\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Elektroniczne', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Papierowe', 15)

'zakładka Wypożyczenie'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'obi_topmenu_archiwum_wypozyczanie\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Wnioski', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Udostępnienia', 15)

'zakładka Brakowanie'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'obi_topmenu_archiwum_brakowanie\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Teczki', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Sprawy', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Nowy', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Otwarte', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Zamknięte', 15)

'zakładka Przekazywanie do AP'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'obi_topmenu_archiwum_przekazywanie\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Lista spisów', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Lista paczek', 15)

'zakładka Wycofywanie sprawy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[@id=\'obi_topmenu_archiwum_wycofanie_spraw\']']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Powrót', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Odśwież', 15)

CustomKeywords.'help_pack.wait_for_text.Present'('Lista', 15)

