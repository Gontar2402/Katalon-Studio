package help_pack

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords





public class Wait_and_click {
	@Keyword
	def Clickable(TestObject to2, int max_liczba_prob) {



		int liczba_prob = 0;

		while(liczba_prob < max_liczba_prob) {
			try {


				WebElement element = WebUiBuiltInKeywords.findWebElement(to2);
				KeywordUtil.logInfo("Clicking element")
				element.click()


				liczba_prob = max_liczba_prob;
			} catch (Exception e) {
				//KeywordUtil.markFailed("Fail to click on element")
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				println("blad : "+ e)
				println("########################## nie udana proba nr : " + liczba_prob +" ###########################################")
				WebUI.delay(1)
				liczba_prob ++;
				if (liczba_prob == max_liczba_prob) {
					WebUI.takeScreenshot()

					KeywordUtil.markFailedAndStop("przerwano poniewaz: " +e)
				}
			}

		}
	}
}
