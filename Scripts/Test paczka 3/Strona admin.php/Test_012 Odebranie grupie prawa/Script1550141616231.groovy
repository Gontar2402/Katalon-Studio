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

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Grupy'), 
    15)

'button Rozwiń prawa wybranej grupy'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'gview_admin_group_perm_table\']/div/a/span']), 
    15)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_sf_guard_group[name]\']']), 
    'Sekretariat')

'wyszukany wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'Sekretariat']), 15)

'button Edycja uprawnień'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_group_perm_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
    15)

Thread.sleep(400)

CustomKeywords.'help_pack.wait_for_text.not_Present'('Ładowanie...', 15)

CzyZaznaczony = WebUI.verifyElementChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15, FailureHandling.OPTIONAL)

if (CzyZaznaczony == false) {
    'Zaznaczamy opcję'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 
        15)

    WebUI.verifyElementChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15)

    'Odznaczamy opcję'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 
        15)

    WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15)
}
else {
	'Odznaczamy opcję'
	CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']),
		15)

	WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15)
	
	'Zaznaczamy opcję'
	CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']),
		15)

	WebUI.verifyElementChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15)
	'Odznaczamy opcję'
	CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']),
		15)

	WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15)
	
}

'button OK'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
    15)

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('anna.borowska', 'gqNiyN/IiIvaUo8G1BKwoQ==')

SprawdzCzyOdebranoUprawnienia()

def SprawdzCzyOdebranoUprawnienia() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Rejestr dok.wewnętrznych', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Połączone\nPDF', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Składy\nchronologiczne', 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Dekretacja i akceptacja'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Zadekretowane', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Zakończone', 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Sprawy'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Dokumenty', 5)

    

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Zadania', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Maile', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Rejestr spraw\nw komórce', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Struktura', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Transfer\ndanych', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Połączone\nPDF', 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Repozytorium'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Wgraj\nszablony', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Lista\nszablonów', 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Moje wnioski', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Wnioski\nurlopowe', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Archiwalne', 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Rap. i Rej'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Dynamiczne typy', 5)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Archiwum', 5)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Slowniki'), 
        15)

    CustomKeywords.'help_pack.wait_for_text.not_Present'('Sposoby\nrealizacji spr.', 5)
	
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Rodzaje dokumentów  wewnętrznych', 5)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Polecenia dekretacjidok. przy', 5)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Polecenia dekretacji\ndok. wew', 5)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Tytuł dokumentu', 5)
	CustomKeywords.'help_pack.wait_for_text.not_Present'('Powody wycof.ze składu', 5)
}

