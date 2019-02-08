package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Global_variable_login
     
    /**
     * <p></p>
     */
    public static Object Global_variable_password
     
    /**
     * <p></p>
     */
    public static Object Url
     
    /**
     * <p></p>
     */
    public static Object Url_admin
     
    /**
     * <p></p>
     */
    public static Object Url_przeladowanie
     
    /**
     * <p></p>
     */
    public static Object losowa_nazwa
     
    /**
     * <p></p>
     */
    public static Object data
     
    /**
     * <p></p>
     */
    public static Object data_dzien_wczesniej
     
    /**
     * <p></p>
     */
    public static Object zmienna_pomocna
     
    /**
     * <p></p>
     */
    public static Object Znak_sprawy
     
    /**
     * <p></p>
     */
    public static Object Nazwa_sprawy
     
    /**
     * <p></p>
     */
    public static Object skrot_PK
     
    /**
     * <p></p>
     */
    public static Object Nazwa_dokumentu_wew
     
    /**
     * <p></p>
     */
    public static Object Url_archiwum
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['Global_variable_login' : 'admin', 'Global_variable_password' : 'NPnhp8lbvIHTcBx1PsaVyg==', 'Url' : findTestData('Adres_strony').getValue(1, 2), 'Url_admin' : findTestData('Adres_strony_admin.php').getValue(1, 2), 'Url_przeladowanie' : findTestData('Adres_strony').getValue(1, 3), 'losowa_nazwa' : null, 'data' : null, 'data_dzien_wczesniej' : null, 'zmienna_pomocna' : null, 'Znak_sprawy' : null, 'Nazwa_sprawy' : '', 'skrot_PK' : '', 'Nazwa_dokumentu_wew' : null, 'Url_archiwum' : findTestData('Adres_strony').getValue(1, 3)])
        allVariables.put('Url', allVariables['default'] + ['Global_variable_login' : 'admin', 'Global_variable_password' : 'NPnhp8lbvIHTcBx1PsaVyg==', 'Url' : null, 'Url_admin' : null, 'losowa_nazwa' : null, 'data' : null, 'data_dzien_wczesniej' : null, 'zmienna_pomocna' : null, 'Znak_sprawy' : null, 'Nazwa_sprawy' : '', 'skrot_PK' : '', 'Nazwa_dokumentu_wew' : null, 'Url_archiwum' : null])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        Global_variable_login = selectedVariables["Global_variable_login"]
        Global_variable_password = selectedVariables["Global_variable_password"]
        Url = selectedVariables["Url"]
        Url_admin = selectedVariables["Url_admin"]
        Url_przeladowanie = selectedVariables["Url_przeladowanie"]
        losowa_nazwa = selectedVariables["losowa_nazwa"]
        data = selectedVariables["data"]
        data_dzien_wczesniej = selectedVariables["data_dzien_wczesniej"]
        zmienna_pomocna = selectedVariables["zmienna_pomocna"]
        Znak_sprawy = selectedVariables["Znak_sprawy"]
        Nazwa_sprawy = selectedVariables["Nazwa_sprawy"]
        skrot_PK = selectedVariables["skrot_PK"]
        Nazwa_dokumentu_wew = selectedVariables["Nazwa_dokumentu_wew"]
        Url_archiwum = selectedVariables["Url_archiwum"]
        
    }
}
