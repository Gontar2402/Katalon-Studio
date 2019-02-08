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
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Slownik/przyciski glowne/button JRWA'), 
    10)

'Button Lista w Widoki'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[10]/ul/li[2]/div[2]/div']), 
    10)

'czeka na załadowanie się tabeli'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

'Pętla która filtruje w kolumnie komórka organizacyjna'
for (def nr_value = 3; nr_value < 7; nr_value++) {
    def nr_value_przed = nr_value - 1
	Thread.sleep(1000)
    'Wybierz opcje w komórce organizacyjnej'
    WebUI.selectOptionByValue(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'idwydzial\']']), ('' + nr_value_przed) + 
        '', false)

    new help_pack.wait_for_text().not_Present('Proszę czekać...', 10)

    def wartosc_1 = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[1]/td[3]']))

    'Wybierz opcje w komórce organizacyjnej'
    WebUI.selectOptionByValue(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'idwydzial\']']), ('' + nr_value) + 
        '', false)

    new help_pack.wait_for_text().not_Present('Proszę czekać...', 10)

    def wartosc_2 = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr[1]/td[3]']))

    assert wartosc_1 != wartosc_2
}

