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
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

CustomKeywords.'help_pack.Wyloguj.wyloguj'()

CustomKeywords.'help_pack.Logowanie.zaloguj'('admin', 'gqNiyN/IiIvaUo8G1BKwoQ==')

CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('hsi_pl_login/Menu glowne belka gorna/przyciski glowne na belce gornej/Repozytorium'), 
    15)

'czeka aż załaduje się tabela'
CustomKeywords.'help_pack.wait_for_text.Present'('Pozycje od', 15)

'button Wgraj pliki'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//div[@id=\'obi_pliki_wgraj_plik_button\']/div']), 
    15)

uploadFile( //String filePath = '/tmp/katalon_execute/project/source/Akceptacja pisma wychodzacego.txt'
    //String filePath = '/tmp/katalon_execute/project/Wgrywanie pliku do  repozytorium.txt'
    )

WebUI.delay(1)

'button Wyślij'
CustomKeywords.'help_pack.Wait_and_click.Clickable'(findTestObject('button', [('xpath') : '//button[@id=\'WgrajNowyPlikDoRepozytorium_button_wyslij\']/span']), 
    15)

CustomKeywords.'help_pack.Wyszukaj_w_tabeli_i_kliknij_wyszukany_wiersz_z_polem.set_text'('Wgrywanie pliku do  repozytorium', 
    4)

WebUI.click(findTestObject('button', [('xpath') : '//div[@id=\'obi_topmenu_pliki_actions_usun\']/div']), FailureHandling.OPTIONAL)

WebUI.waitForAlert(5, FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL //String filePath = 'C:\\Users\\Tecra\\Katalon Studio\\SystemObeguDokumentow\\Wgrywanie pliku do  repozytorium.txt'
    )

def uploadFile() {
    String filePath = '/tmp/katalon_execute/project/Wgrywanie pliku do  repozytorium.txt'

    StringSelection ss = new StringSelection(filePath)

    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null)

    Robot robot = new Robot()

    robot.sleep(1000)


    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_V)

    robot.keyRelease(KeyEvent.VK_CONTROL)

    robot.sleep(1000)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)
}

