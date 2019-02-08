package help_pack
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class Sortowanie_tabeli {

	@Keyword
	def Sortowanie(int od_kolumny_nr, int do_kolumny_nr, int liczba_wierszy_do_sortowania) {

		for (int kolumna_tabeli = od_kolumny_nr; kolumna_tabeli <= do_kolumny_nr ; kolumna_tabeli++) {

			def wartosc_z_komorki = new String[liczba_wierszy_do_sortowania]
			def wartosc_z_komorki2 = new String[liczba_wierszy_do_sortowania]
			int nr_wiersza = 1
			//pierwsze sortowanie
			(new help_pack.Wait_and_click().Clickable(findTestObject('hsi_pl_login/Obiekty powtarzalne/obiekty uniwersalne/tabela uniwersalna tytul sortowanie',
					[('kolumna_tabeli') : kolumna_tabeli]), 5))
			(new help_pack.wait_for_text().not_Present('Proszę czekać', 10))



			for(int liczba_wierszy_do_sorotwania = 1; liczba_wierszy_do_sorotwania<=liczba_wierszy_do_sortowania; liczba_wierszy_do_sorotwania++){
				//pobieranie wartosc z kolumny i zapisywanie do tablicy


				wartosc_z_komorki2[nr_wiersza-1] = WebUI.getText(findTestObject('tabela', [('xpath') : '//tr['+nr_wiersza+']/td['+kolumna_tabeli+']']))

				nr_wiersza++


			}

			def male_znaki_do_sortowania2 = wartosc_z_komorki2.collect{ it.toLowerCase() }



			println(male_znaki_do_sortowania2)
			println(male_znaki_do_sortowania2.sort())


			//sortowanie wartosci w tablicy
			assert male_znaki_do_sortowania2.sort() == male_znaki_do_sortowania2


			
		}
		}


}
