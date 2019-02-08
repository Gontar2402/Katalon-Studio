package help_pack

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

@Keyword
def wyloguj() {

	WebUI.navigateToUrl(GlobalVariable.Url)
}
@Keyword
def wyloguj_na_adminie() {

	WebUI.navigateToUrl(GlobalVariable.Url_admin)
	//WebUI.click(findTestObject('button', [('xpath') : '//div[@id=\'mainBody\']/div/a']), FailureHandling.OPTIONAL)

	//WebUI.click(findTestObject('button', [('xpath') : '//div[@id=\'mainBody\']/div/a']), FailureHandling.OPTIONAL)
}

@Keyword
def wyloguj_archiwum() {

	WebUI.navigateToUrl(GlobalVariable.Url_archiwum)

}