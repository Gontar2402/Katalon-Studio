import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'help_pack.Wyloguj.wyloguj_na_adminie'()

CustomKeywords.'help_pack.Logowanie.zaloguj_na_stronie_admin_php'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/przyciski glowne na belce gornej/Ustawienia'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('admin_php/Menu glowne belka gorna/podmenu Ustawienia/Dodatkowe dni robocze'), 
    15)

'button Dodaj nowy wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'add_admin_ustawienia_dni_robocze_table\']/div/span']), 
    15)

'wpisz do pola dzień odpowiednią datę'
WebUI.setText(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'sys_dni_robocze[dzien]\']']), '2019-01-13')

'button Zapisz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//tr[@id=\'Act_Buttons\']/td[2]/a']), 
    15)

'wyszukiwanie w Rejestr dodatkowych dni roboczych dodanego dnia roboczego'
CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//input[@id=\'gs_sys_dni_robocze[dzien]\']']), 
    '2019-01-13')

'wyszukany wiersz'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('tabela', [('xpath') : '//tr[@id=\'2019-01-13\']/td']), 
    15)

'button Usuń'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//td[@id=\'del_admin_ustawienia_dni_robocze_table\']/div/span']), 
    15)

'button potwierdź usunięcie'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//table[@id=\'DelTbl_admin_ustawienia_dni_robocze_table_2\']/tbody/tr[2]/td/a']), 
    15)

