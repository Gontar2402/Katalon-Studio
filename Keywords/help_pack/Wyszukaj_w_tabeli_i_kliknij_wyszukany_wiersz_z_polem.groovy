package help_pack

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
public class Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem {

	@Keyword
	def set_text(String szukany_tekst, int nr_pola_input) {
		(new help_pack.wait_for_text().Present('Pozycje od', 40))
		int liczba_prob = 1;
		while(liczba_prob <= 5) {
			try {


				WebUI.setText(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/uniwersalne pole input',[('nr_input') : nr_pola_input]),szukany_tekst)

				WebUI.sendKeys(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/uniwersalne pole input',[('nr_input') : nr_pola_input]), Keys.chord(Keys.TAB))
				(new help_pack.wait_for_text().not_Present("Proszę czekać...", 35))
				(new help_pack.wait_for_text().not_Present("Proszę czekać ...", 35))
				(new help_pack.wait_for_text().not_Present("Proszę czekać", 35))


				WebUI.click(findTestObject('hsi_pl_login/Obiekty powtarzalne/Wyszukany wiersz uniwersalny',
						[('wyszukany_tekst') : szukany_tekst]))
				liczba_prob =6
			} catch (Exception e) {

				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				println("blad : "+ e)
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				WebUI.delay(1)
				liczba_prob ++;

				if (liczba_prob == 3) {
					WebUI.takeScreenshot()
					KeywordUtil.markFailedAndStop("przerwano poniewaz: " +e)
				}
			}
		}
	}
}