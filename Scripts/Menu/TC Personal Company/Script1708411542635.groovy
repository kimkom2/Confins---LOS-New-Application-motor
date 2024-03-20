import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

TestData Datahohendy = findTestData('Data Files/Data Customer/New Bike')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++) 
	{
    WebUI.switchToDefaultContent()

    if (Datahohendy.getValue('Use', baris) == 'Yes') {
        if (Datahohendy.getValue('type', baris) == 'personal') {
            WebUI.click(findTestObject('Menu/Credit admin/Tab Customer/input ' + Datahohendy.getValue('type', 
                        baris // di sini trick nya, input space di samakan dengan input company / personal 
                        )))

            WebUI.click(findTestObject('Menu/Credit admin/Tab Customer/Search personal'))
			
			WebUI.delay(1)

            WebUI.setText(findTestObject('Menu/Credit admin/Tab Customer/input customer personal'), Datahohendy.getValue(
                    'Customername', baris))
			
			WebUI.delay(1)

            WebUI.click(findTestObject('Menu/Credit admin/Tab Customer/SEARCH customer name personal'))

            WebUI.click(findTestObject('Menu/Credit admin/Tab Customer/Select personal'))

            // start untuk validasi KTP & NPWP yang ada di excel dengan di interface sama.
            ktp = WebUI.getAttribute(findTestObject('Menu/Credit admin/Tab Customer/KTP'), 'value')

            //println(ktp)
            KeywordUtil.logInfo(ktp)

            if (ktp == Datahohendy.getValue('ID Number Personal', baris)) {
                println('BENAR')
            }
            
            npwp = WebUI.getAttribute(findTestObject('Menu/Credit admin/Tab Customer/NPWP'), 'value')

            //println(npwp)
            KeywordUtil.logInfo(npwp //		if (npwp == Datahohendy.getValue('Input NPWP Personal', baris)) {
                //			println('BENAR')
                //		}
                // end untuk validasi KTP & NPWP yang ada di excel dengan di interface sama.
                )
        } else if (Datahohendy.getValue('type', baris) == 'company') {
        }
    }
}

WebUI.click(findTestObject('Menu/Credit admin/Tab Customer/SaveCont'))

