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

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    15)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Przesylki do rejestracji'), 
    15)

'button Odwzorowania do rejestracji'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_repo_pokaz_odwzorowania_button\']/div']), 
    15)

CustomKeywords.'help_pack.wait_for_text.Present'('Odwzorowania do rejestracji', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'PIW', false)

CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród ', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Wszystkie', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Skaner', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród ', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Wszystkie', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Ekstranet', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród ', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Wszystkie', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Usł. siec.', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('filtrowanie spośród ', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Wszystkie', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Z dysku', 
    false)

WebUI.selectOptionByLabel(findTestObject('Wybierz opcje', [('xpath') : '//select[@name=\'zalozyl_zrodlo\']']), 'Wszystkie', 
    false)

CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

