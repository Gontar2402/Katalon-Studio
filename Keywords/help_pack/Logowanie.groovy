package help_pack

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling as FailureHandling
@Keyword
def zaloguj(String username, String password) {


	WebUI.setText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole Nazwa uzytkownika'), username)


	WebUI.setEncryptedText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole haslo'), GlobalVariable.Global_variable_password)

	WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/button zaloguj'))
	//czekaj az zaladuje sie ostatni element na stronie
	WebUI.waitForElementVisible(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/ostatni element na stronie'),25, FailureHandling.STOP_ON_FAILURE )

}

@Keyword
def zaloguj_na_stronie_admin_php(String username, String password) {


	WebUI.setText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole Nazwa uzytkownika na stronie admin_php'), username)


	WebUI.setEncryptedText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole haslo na stronie admin_php'), GlobalVariable.Global_variable_password)

	WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/button zaloguj'))
	//czekaj az zaladuje sie ostatni element na stronie

}

@Keyword
def zaloguj_na_stronie_archiwum(String username, String password) {


	WebUI.setText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole Nazwa uzytkownika na stronie admin_php'), username)


	WebUI.setEncryptedText(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/pole haslo na stronie admin_php'), GlobalVariable.Global_variable_password)

	WebUI.click(findTestObject('hsi_pl_login/Menu glowne belka gorna/logowanie/button zaloguj'))
	//czekaj az zaladuje sie ostatni element na stronie

}

