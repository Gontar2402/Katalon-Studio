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
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

GlobalVariable.losowa_nazwa = ('odrzucenie wych ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

tworzenie_sprawy()

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('hsi_pl_login/Obiekty powtarzalne/pole tytul uniwersalne'), 
    GlobalVariable.losowa_nazwa)

tworzenie_dokumentu_wychodzacego()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('ludwik.bartoszewicz', 'gqNiyN/IiIvaUo8G1BKwoQ==')

WebUI.selectOptionByValue(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_003/stanowisko na zastepowane Wojechech'), 
    '4', true)

odrzucenie_dokumentu_wychodzacego()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
    5)

WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz.set_text'(findTestObject('hsi_pl_login/Obiekty powtarzalne/pole tytul uniwersalne'), 
    GlobalVariable.losowa_nazwa)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button rozwin sprawe'), 
    5)

CustomKeywords.'help_pack.wait_for_text.Present'('Akceptacja pisma wychodzacego', 10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/dokument powiazany ze sprawa'), 
    5)

'button Przyczyna odrzucenia'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[4]/div[3]/div']), 15)

CustomKeywords.'help_pack.wait_for_text.Present'(GlobalVariable.zmienna_pomocna, 15)

WebUI.comment('na windows slash ma być w lewo a na linux w prawo')

WebUI.comment('na windows slash ma być w lewo a na linux w prawo' //na windows slash ma być w lewo (dwa) a na linux w prawo(jeden)
    ) //String filePath = 'C:\\Users\\Tecra\\Katalon Studio\\SystemObeguDokumentow\\Akceptacja pisma wychodzacego.txt'

def odrzucenie_dokumentu_wychodzacego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Dekretacja i akceptacja/Do akceptacji'), 
        5)

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('tabela', [('xpath') : '//th[3]/input']), 
        GlobalVariable.Znak_sprawy)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'('Akceptacja pisma wychodzacego', 
        4)

    GlobalVariable.zmienna_pomocna = ('losowa przyczyna ' + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(
        8))

    'button odrzuć'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[6]/div[2]/div']), 15)

    WebUI.switchToFrame(findTestObject('button', [('xpath') : '//iframe']), 5)

    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//body']), GlobalVariable.zmienna_pomocna)

    WebUI.switchToDefaultContent()

    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[11]/div/button/span']), 
        15)
}

def tworzenie_sprawy() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        5)

    WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'))

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Nowa sprawa'))

    WebUI.delay(1)

    WebUI.waitForElementPresent(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), 
        15)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'), 
        '2600')

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/odblokuj edycje'))

    WebUI.delay(2)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button generuj Znak sprawy'))
	Thread.sleep(500)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa generowanie znaku', 10)

    WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Tytul'), 
        GlobalVariable.losowa_nazwa)

    WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'))

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 15)

    CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'(GlobalVariable.losowa_nazwa, 
        5)

    GlobalVariable.Znak_sprawy = WebUI.getText(findTestObject('tabela', [('xpath') : '//td[2]']))
}

def tworzenie_dokumentu_wychodzacego() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/obiekty w Sprawy/button Wychodzcy w akcje sprawy'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button zmien rodzaj pisma'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja Decyzja'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 3 spacje uniwersalny'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Adresaci'), 
        5)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czkeać...', 10)
	
		CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 10)
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button dodaj kontrahenta'), 
        5)

	CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czkeać...', 10)
	
		CustomKeywords.'help_pack.wait_for_text.not_Present'('Trwa ładowanie', 10)

    CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/pole nazwisko'), 
        'Kowalski')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/proponowany kontrahent'), 
        5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać', 25)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button OK'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zmien sposob wysylki'), 
        5)
	
	CustomKeywords.'help_pack.wait_for_text.Present'('Wybór sposobu wysyłki', 15)
	
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zaznacz opcje sposobu wysylki'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Odwzorowania'), 
        5)

    uploadFile()

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button Utworz'), 
        25)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/rozwin akceptujacy'), 
        10)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/wybierz akceptujacego'), 
        5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 2 spacje uniwersalny'), 
        5)
}

def uploadFile() {
    String filePath = '/tmp/katalon_execute/project/Akceptacja pisma wychodzacego.txt'

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/dodaj plik'), 
        5)

    StringSelection ss = new StringSelection(filePath)

    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.sleep(1000)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)
}

