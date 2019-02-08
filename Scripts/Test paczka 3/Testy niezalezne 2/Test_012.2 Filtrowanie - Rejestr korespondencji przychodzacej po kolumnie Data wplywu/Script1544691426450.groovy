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

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/podmenu Kancelaria/Rejestr koresp.przychodzacej'), 
    10)

'czeka aż załaduje się tabela'
CustomKeywords.'help_pack.wait_for_text.Present'('Rejestr korespondencji przychodzącej', 25)

CustomKeywords.'help_pack.Filtruj.pobieranie_danych_do_filtrowania_oraz_filtrowanie'(10, 3)

not_run: filtrowanie_po_data_wplywu()

def filtrowanie_po_data_wplywu() {
    def nr_output = 10

    int nr_wiersza = 2

    for (int i = 1; i < 3; i++) {
        'tabela z ktorej bierzemy wartos w odpowieniej komorce'
        def wartos_z_komorki = WebUI.getText(findTestObject('button', [('xpath') : ('//table[@id=\'tblDokumentyIndexGrid\']/tbody/tr[' + 
                    nr_wiersza) + ']/td[10]']), FailureHandling.CONTINUE_ON_FAILURE)

        new help_pack.Set_text_and_press_enter().set_text(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/uniwersalne pole input', 
                [('nr_input') : nr_output]), wartos_z_komorki)

        new help_pack.wait_for_text().not_Present('Proszę czekać...', 10)

        'tabela z ktorej bierzemy wartos w odpowieniej komorce po wyszukiwaniu'
        def wiersz_1_kolumna_3 = WebUI.getText(findTestObject('button', [('xpath') : '//table[@id=\'tblDokumentyIndexGrid\']/tbody/tr[1]/td[10]']), 
            FailureHandling.CONTINUE_ON_FAILURE)

        assert wiersz_1_kolumna_3 == wartos_z_komorki

        new help_pack.Set_text_and_press_enter().set_text(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/uniwersalne pole input', 
                [('nr_input') : nr_output]), '')

        new help_pack.wait_for_text().not_Present('Proszę czekać...', 10)

        nr_wiersza++
    }
}

