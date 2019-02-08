package help_pack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable

public class Tworzenie_dokumentu {


	@Keyword
	def wychodzacego_z_plikiem() {


		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/obiekty w Sprawy/button Wychodzcy w akcje sprawy'),
				5))
		(new help_pack.Wait_and_click().Clickable(findTestObject('button', [('xpath') : '//input[@id=\'obi_dokumenty_wychodzace_dalsza_akceptacja\']']),
		5))
		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button zmien rodzaj pisma'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja Decyzja'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 3 spacje uniwersalny'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Adresaci'),
				5))

		(new help_pack.wait_for_text().Present('Pozycji', 10))

		(new help_pack.wait_for_text().not_Present('Proszę czekać...', 15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button dodaj kontrahenta'),
				5))

		(new help_pack.wait_for_text().Present('Pozycji', 10))

		(new help_pack.wait_for_text().not_Present('Proszę czekać...', 15))

		(new help_pack.Set_text_and_press_enter().set_text(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/pole nazwisko'),
				'Kowalski'))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/proponowany kontrahent'),
				5))

		(new help_pack.wait_for_text().not_Present('Proszę czekać...', 15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button OK'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zmien sposob wysylki'),
				5))



		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zaznacz opcje sposobu wysylki'),
				5))


		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Odwzorowania'),
				5))


		uploadFile()


		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button Utworz'),
				25))
		/*
		 (new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/rozwin akceptujacy'),
		 10))
		 (new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/wybierz akceptujacego'),
		 5))
		 (new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 2 spacje uniwersalny'),
		 5))
		 */
	}

	@Keyword
	def wychodzacego_w_obiegu_papierowym(String nazwa_dokumentu_wychodzacego) {


		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/obiekty w Sprawy/button Wychodzcy w akcje sprawy'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button zmien rodzaj pisma'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/opcja Decyzja'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK 3 spacje uniwersalny'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Adresaci'),
				5))

		(new help_pack.wait_for_text().Present('Pozycji', 10))

		(new help_pack.wait_for_text().not_Present('Proszę czekać...', 15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button dodaj kontrahenta'),
				5))

		(new help_pack.wait_for_text().Present('Pozycji', 10))

		(new help_pack.wait_for_text().not_Present('Proszę czekać...', 15))

		(new help_pack.Set_text_and_press_enter().set_text(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/pole nazwisko'),
				'Kowalski'))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/proponowany kontrahent'),
				5))

		(new help_pack.wait_for_text().not_Present('Proszę czekać...', 15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button OK'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zmien sposob wysylki'),
				5))



		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zaznacz opcje sposobu wysylki'),
				5))


		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button OK uniwersalny z spacja z przodu'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/zakladka Odwzorowania'),
				5))
		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/button brak w odwzorowania'),
				15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/zakladka Metadane'),
				15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/odblokuj edycje'),
				15))

		WebUI.setText(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_003/pole tytul dokumentu'),
				nazwa_dokumentu_wychodzacego)


		(new help_pack.Wait_and_click().Clickable(findTestObject('button', [('xpath') : '//input[@id=\'obi_dokumenty_wychodzace_dalsza_akceptacja\']']),
		5))



		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/button Utworz'),
				15))
	}

	@Keyword
	def wewnetrznego(String Nazwa_dokumentu_wew) {


		GlobalVariable.Nazwa_dokumentu_wew = (Nazwa_dokumentu_wew + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(
				8))

		(new help_pack.Wait_and_click().Clickable(findTestObject('Object Repository/hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'),
				15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('Object Repository/hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Dokumenty'),
				15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('Object Repository/hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/button nowy Wew.'),
				15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('Object Repository/hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/mozliwosc edycji tytulu'),
				15))

		WebUI.setText(findTestObject('Object Repository/hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/do pola tytul nowy dokument wewnetrzny'),
				GlobalVariable.Nazwa_dokumentu_wew)

		(new help_pack.Wait_and_click().Clickable(findTestObject('Object Repository/hsi_pl_login/Obiekty A i L/Obiekty dodatkowe do test_006/button utworz i zamknij dokument wewnetrzny'),
				15))
	}


	def uploadFile() {
		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty paczka 3/Obiekty dodatkowe do testy niezalezne/Test_001/dodaj plik'),
				5))

		//String filePath = '/tmp/katalon_execute/project/source/Akceptacja pisma wychodzacego.txt'
		String filePath = '/tmp/katalon_execute/project/Akceptacja pisma wychodzacego.txt'
		StringSelection ss = new StringSelection(filePath)

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

		Robot robot = new Robot()
		robot.sleep(1000)
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
}
