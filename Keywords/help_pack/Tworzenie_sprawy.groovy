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

import internal.GlobalVariable

public class Tworzenie_sprawy {

	@Keyword
	def tworzenie_sprawy(String nazwa_sprawy) {
		GlobalVariable.Nazwa_sprawy = (nazwa_sprawy + org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(8))

		(new help_pack.Wait_and_click().Clickable(findTestObject('Object Repository/hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'),
				5))

		(new help_pack.Wait_and_click().Clickable(findTestObject('Object Repository/hsi_pl_login/Menu glowne belka gorna/podmenu Sprawy/Sprawy'),15))

		WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Nowa sprawa'))
		(new help_pack.wait_for_text().not_Present('Pobieranie danych...', 15))

		WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Symbol JRWA'),'2600')

		WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/odblokuj edycje'))

		(new help_pack.wait_for_text().Present('Źródła zaopatrzenia', 25))
		(new help_pack.wait_for_text().not_Present('Pobieranie informacji o JRWA...', 10))

		WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button generuj Znak sprawy'))

		WebUI.setText(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/do pola Tytul'),GlobalVariable.Nazwa_sprawy)
		Thread.sleep(500)
		(new help_pack.wait_for_text().not_Present('Trwa generowanie znaku', 10))
		WebUI.click(findTestObject('hsi_pl_login/Obiekty Admin/Obiekty dodatkowe do test_007/button Utworz nowa sprawa'))
	}
}
