import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.StringSelection as StringSelection

import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
class Pomoc_w_test_suite {
	/**
	przed każdym uruchomieniem testu sprawdzamy czy jest otwarta przeglądarka jeżeli nie to ją otwiera
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		def url = WebUI.getUrl(FailureHandling.OPTIONAL)
		
		if (url == null) {
		    CustomKeywords.'help_pack.Otworz_przegladarke.Otworz'()
		}
	}

	/**
	po wykonaniu test suite zamyka wczesniej używaną przeglądatke aby nie crashowała sie przeglądarka
	 */
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		WebUI.closeBrowser(FailureHandling.OPTIONAL) 
		
		
	
		
		
	}
	
	@BeforeTestSuite
	def ReadAndWriteUrl(TestSuiteContext testSuiteContext) {
		File file
		File file2
		File file3
		if(GlobalVariable.Url == null)	{
			
			file = new File("url.txt");
			GlobalVariable.Url = file.text	
	
		}
		else {
			file = new File("url.txt");
			file.write GlobalVariable.Url

		}
		
		
		if(GlobalVariable.Url_admin == null)	{
					
			file2 = new File("url2.txt");
			GlobalVariable.Url_admin = file2.text
		}
		else {	
			file2 = new File("url2.txt");
			file2.write GlobalVariable.Url_admin
		}
		
		
		if(GlobalVariable.Url_archiwum == null)	{
			
		file3 = new File("url3.txt");
		GlobalVariable.Url_archiwum = file3.text
		}
		else {
			file3 = new File("url3.txt");
			file3.write GlobalVariable.Url_archiwum
		}
			
	   
	}
	

}