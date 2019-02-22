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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
NadanieUprawnien()
CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Zastepstwa/Konfiguracja zastepstw'), 
    15)

'Zakładka Potencjalni zastępujący'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//a[contains(text(),\'Potencjalni zastępujący\')]']), 
    15)

CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_zastepstwa_konfiguracja_stanowiska[login]\']']), 
    'anna.borowska')

SprawdzanieNaStanowiskuTest_1()

SprawdzanieNaStanowiskuTest_nazwa()

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('anna.borowska', 'gqNiyN/IiIvaUo8G1BKwoQ==')

SprawdzanieCzyUzytkownikWidziTylkoPodlegleStanowiska()

def SprawdzanieNaStanowiskuTest_1() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_zastepstwa_konfiguracja_stanowiska[stanowisko]\']']), 
        'test_1')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'test_1']), 15)

    'button Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_zastepstwa_dostepni_zastepujacy_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Edycja użytkowników na zastępstwo dla stanowiska', 15)

    'button Odznacz wszystko'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_edycja_uprawnien_ptable_left\']/table/tbody/tr/td[5]/div/span']), 
        15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_last_name\']']), 
        'Alchimowicz')

    CzyNIeZaznaczony = WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//td[7]/input']), 5, FailureHandling.OPTIONAL)

    if (CzyNIeZaznaczony == true) {
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[7]/input']), 15)
    } else {
    }
    
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_last_name\']']), 
        'Bogulak')

    CzyNIeZaznaczony = WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//td[7]/input']), 5, FailureHandling.OPTIONAL)

    if (CzyNIeZaznaczony == true) {
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[7]/input']), 15)
    } else {
    }
    
    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

def SprawdzanieNaStanowiskuTest_nazwa() {
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_obi_zastepstwa_konfiguracja_stanowiska[stanowisko]\']']), 
        'test_nazwa')

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button text', [('text') : 'test_nazwa']), 15)

    'button Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_zastepstwa_dostepni_zastepujacy_ptable_left\']/table/tbody/tr/td[4]/div/span']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Edycja użytkowników na zastępstwo dla stanowiska', 15)

    'button Odznacz wszystko'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'admin_edycja_uprawnien_ptable_left\']/table/tbody/tr/td[5]/div/span']), 
        15)

    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_last_name\']']), 
        'Kraszewska')

    CzyNIeZaznaczony = WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//td[7]/input']), 5, FailureHandling.OPTIONAL)

    if (CzyNIeZaznaczony == true) {
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[7]/input']), 15)
    } else {
    }
    
    CustomKeywords.'help_pack.Set_text_and_press_enter.na_adminie'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_last_name\']']), 
        'Jańczyk')

    CzyNIeZaznaczony = WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//td[7]/input']), 5, FailureHandling.OPTIONAL)

    if (CzyNIeZaznaczony == true) {
        CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[7]/input']), 15)
    } else {
    }
    
    'button OK'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']), 
        15)
}

def SprawdzanieCzyUzytkownikWidziTylkoPodlegleStanowiska() {
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Zastepstwa i wnioski'), 
        15)

    'button Moje wnioski'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_zastepstwa_rejestracja_wnioski_moje_wnioski_button\']/div']), 
        15)

    'button Nowy'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_wniosek_menu_nowy_button\']/div']), 
        15)

    WebUI.waitForAlert(5)

    WebUI.acceptAlert()

    'pole Data końcowa'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_data_koncowa\']']), '2019-02-12')

    'pole Data początkowa'
    WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'wniosek_data_poczatkowa\']']), '2019-02-12')

    'button Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//input[@value=\'Zmień\'])[3]']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 2', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Bogulak', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Alchimowicz', 15)

    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//table[@id=\'tblDostepnizastepujacyIndexGrid\']/tbody/tr/td[2]']), 
        15)

    'button Zmień'
    CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '(//input[@value=\'Zmień\'])[4]']), 
        15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od 1 do 2', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Kraszewska', 15)

    CustomKeywords.'help_pack.wait_for_text.Present'('Jańczyk', 15)
}

def NadanieUprawnien() {
	
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
	} else {
		'Odznaczamy opcję'
		CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']),
			15)
	
		WebUI.verifyElementNotChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15)
	
		'Zaznaczamy opcję'
		CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']),
			15)
	
		WebUI.verifyElementChecked(findTestObject('button', [('xpath') : '//tr[@id=\'-1\']/td[3]/input']), 15)
	}
	
	'button OK'
	CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[3]/div/button/span']),
		15)
	
}