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
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Kancelaria'), 
    10)

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Przesylki do rejestracji'), 
    10)

'Skrzynka mailowa'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//li[2]/ul/li[2]/div/div']), 
    10)

filtrowanie_Data_wyslania()

def filtrowanie_Data_wyslania() {
    for (int nr_output = 3; nr_output < 4; nr_output++) {
        int nr_wiersza = 3

        for (int i = 1; i < 4; i++) {
            CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 10)

            def wartosc_z_komorki = WebUI.getText(findTestObject('button', [('xpath') : ('//table[@id=\'tblEmailsIndexGrid\']/tbody/tr[' + 
                        nr_wiersza) + ']/td[3]']), FailureHandling.CONTINUE_ON_FAILURE)

            'wpisywanie tekstu do pola input'
            WebUI.setText(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/uniwersalne pole input', 
                    [('nr_input') : '3']), wartosc_z_komorki)

            'petla ktora wciska back space aby byl odpowiendi format'
            for (int j = 1; j <= 6; j++) {
                WebUI.sendKeys(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/uniwersalne pole input', 
                        [('nr_input') : '3']), Keys.chord(Keys.BACK_SPACE))
            }
            
            'wyszukuje'
            WebUI.sendKeys(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/uniwersalne pole input', 
                    [('nr_input') : '3']), Keys.chord(Keys.TAB))

            CustomKeywords.'help_pack.wait_for_text.not_Present'('Proszę czekać...', 10)

            def wiersz_1_kolumna_3 = WebUI.getText(findTestObject('button', [('xpath') : '//table[@id=\'tblEmailsIndexGrid\']/tbody/tr[1]/td[3]']))

            assert wiersz_1_kolumna_3 == wartosc_z_komorki

            CustomKeywords.'help_pack.Set_text_and_press_enter.set_text'(findTestObject('pole tekstowe', [('xpath') : '//th[3]/input']), 
                '')

            nr_wiersza++
        }
    }
}

