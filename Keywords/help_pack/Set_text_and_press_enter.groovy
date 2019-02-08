package help_pack

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class Set_text_and_press_enter {
	@Keyword
	def set_text(TestObject to2, String tekst) {


		//WebElement element = WebUiCommonHelper.findWebElement(to2, timeout2)
		//element.click()
		int liczba_prob = 1;
		while(liczba_prob <= 5) {
			try {

				WebUI.waitForElementPresent(to2, 5)
				(new help_pack.wait_for_text().not_Present('Trwa ładowanie', 10))
				(new help_pack.wait_for_text().not_Present('Ładowanie...', 10))
				WebUI.setText(to2,tekst)

				WebUI.sendKeys(to2, Keys.chord(Keys.TAB))


				liczba_prob = 6;
			} catch (Exception e) {

				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				println("blad : "+ e)
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				WebUI.delay(1)
				liczba_prob ++;

				if (liczba_prob == 5) {
					WebUI.takeScreenshot()
					KeywordUtil.markFailedAndStop("przerwano poniewaz: " +e)
				}

			}

		}

		(new help_pack.wait_for_text().not_Present("Proszę czekać...", 15))
		(new help_pack.wait_for_text().not_Present("Proszę czekać ...", 15))
		(new help_pack.wait_for_text().not_Present("Proszę czekać", 15))

	}

	@Keyword
	def na_adminie(TestObject to2, String tekst) {


		int liczba_prob = 1;
		while(liczba_prob <= 5) {
			try {

				WebUI.waitForElementPresent(to2, 5)
				(new help_pack.wait_for_text().not_Present('Trwa ładowanie', 10))
				(new help_pack.wait_for_text().not_Present('Ładowanie...', 10))
				WebUI.setText(to2,tekst)

				WebUI.sendKeys(to2, Keys.chord(Keys.ENTER))

				liczba_prob = 6;
			} catch (Exception e) {

				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				println("blad : "+ e)
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				WebUI.delay(1)
				liczba_prob ++;
				if(liczba_prob == 5) {
					WebUI.takeScreenshot()
					KeywordUtil.markFailedAndStop("przerwano poniewaz: " +e)
				}
			}

		}
		(new help_pack.wait_for_text().not_Present("Proszę czekać...", 15))
		(new help_pack.wait_for_text().not_Present("Proszę czekać ...", 15))
		(new help_pack.wait_for_text().not_Present("Proszę czekać", 15))
	}

}



