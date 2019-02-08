package help_pack

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class metryka_sprawdz_statna_czynnosc {

	@Keyword
	def szczegoly_metryka_ostatnia_czynnosc1(String ostatnia_czynnosc, String ostatnia_osoba) {

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button szczegoly uniwersalny'),
				5))
		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/zakladka Metryka w szczegolach'),
				5))

		(new help_pack.wait_for_text().Present(ostatnia_czynnosc, 25))

		def porownaj = WebUI.getText(findTestObject('hsi_pl_login/Obiekty Ludwik/Obiekty dodatkowe do test_004/wiersz z tabeli z ostatnia czynnoscia'))

		assert porownaj == ostatnia_czynnosc
		def porownaj2 = WebUI.getText(findTestObject('hsi_pl_login/Obiekty powtarzalne/ostatnia osoba w metryce dokumentu'))

		assert porownaj2 == ostatnia_osoba
		(new help_pack.Wait_and_click().Clickable(findTestObject('button OK uniwersalny'),
				5))
	}
	@Keyword
	def sprawdz_informacje(String ostatnia_czynnosc, String ostatnia_osoba) {

		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/button szczegoly uniwersalny'),
				5))
		(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/zakladka Metryka w szczegolach'),
				5))

		(new help_pack.wait_for_text().Present(ostatnia_czynnosc, 15))
		(new help_pack.wait_for_text().Present(ostatnia_osoba, 15))

		(new help_pack.Wait_and_click().Clickable(findTestObject('button OK uniwersalny'),
				5))
	}
}
