package help_pack

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class wait_for_text {
	@Keyword
	def not_Present(String text, int time) {

		int liczba_prob = 1;
		while(liczba_prob <= time) {
			try {

				def result = WebUI.verifyTextNotPresent(text, false, FailureHandling.OPTIONAL)

				if(result == true){
					liczba_prob == time
					liczba_prob ++;
					break
				}
				else {
					WebUI.delay(1)
					liczba_prob ++;
					if (liczba_prob == time) {
						WebUI.takeScreenshot()
						KeywordUtil.markFailedAndStop("nie znaleziono tekstu na stronie")
					}
				}

				//liczba_prob = time;
			} catch (Exception e) {
				//KeywordUtil.markFailed("Fail to click on element")
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				println("blad : "+ e)
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				WebUI.delay(1)
				liczba_prob++;
				if (liczba_prob >= time) {

					KeywordUtil.markFailedAndStop("przerwano poniewaz: " +e)

				}

			}


		}
	}

	@Keyword
	def Present(String text, int time) {

		int liczba_prob = 1;
		while(liczba_prob <= time) {
			try {
				def result = WebUI.verifyTextPresent(text, false, FailureHandling.OPTIONAL)

				if(result == true){
					liczba_prob = time
					liczba_prob ++;
					break
				}
				else {
					WebUI.delay(1)
					liczba_prob ++;
					if (liczba_prob == time) {
						WebUI.takeScreenshot()
						KeywordUtil.markFailedAndStop("nie znaleziono tekstu na stronie")
					}


				}

			}	 catch (Exception e) {
				//KeywordUtil.markFailed("Fail to click on element")
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				println("blad : "+ e)
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				WebUI.delay(1)
				liczba_prob++;
				if (liczba_prob >= time) {

					KeywordUtil.markFailedAndStop("przerwano")

				}
			}

		}
	}
}