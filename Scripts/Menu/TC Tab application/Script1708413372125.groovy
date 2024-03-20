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
	
// Baca semua kolom yang ada di data excel start in here
TestData Datahohendy = findTestData('Data Files/Application/New Bike')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes') 
	{
		
		WebUI.switchToDefaultContent()
		
		number = WebUI.getText(findTestObject('Menu/Credit admin/Tab Application/Application Number'))
		
		println(number)
		
		WebUI.setText(findTestObject('Menu/Credit admin/Tab Application/input Prospect no'), number)
		
		// contoh untuk buat parameter nya di excel tenor.
		WebUI.setText(findTestObject('Menu/Credit admin/Tab Application/input Tenor'), Datahohendy.getValue('Tenor', baris))
		
		// start contoh untuk buat parameter nya di excel Payment Frequency.
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/List Payment Frequency'))
		
		WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Pay Ferquency obj/Pay ' + Datahohendy.getValue('Pay', baris)))
		
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		// End contoh untuk buat parameter nya di excel Payment Frequency.
		WebUI.switchToDefaultContent()
		
		// Buat akalin New bike dan MOP itu beda treatment, susah kalau ga dipakai ini untuk parameter di excelnya.
		Coba = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Object Fixed Float Rate'))

		println(Coba)
		
		if (Coba == 'Fixed Rate' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			println('OKE')
		}
		else
		{
			
			WebUI.click(findTestObject('Menu/Credit admin/Tab Application/List Interest Type'))
			
			//WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),0)
					
			if (Datahohendy.getValue('Interest Type', baris) == 'Float Rate' && Datahohendy.getValue('Use', baris) == 'Yes')
				{
						
					WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),0)
						
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Float Rate'))
					
					WebUI.switchToDefaultContent()
					
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Select folating'))
					
					WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),0)
					
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Flaot periode/Float ' + Datahohendy.getValue('Float Periode', baris)))
					} 
					else
					{
						WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Fixed Rate'))
					}
			}
		
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/List Insallment scheme'))
		
		WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Inst scheme obj/Scheme ' +Datahohendy.getValue('Installment Scheme', baris)))
		
		// end parameter ins scheme
		WebUI.switchToDefaultContent()
		 
		if (Datahohendy.getValue('Installment Type', baris) == 'Advance' && Datahohendy.getValue('Use', baris) == 'Yes')
			{
				WebUI.delay(2)
				 WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Installment Type Advance'))
			}
			else
			{
				WebUI.delay(2)
				 WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Installment Type Arrear'))
			}
	    WebUI.delay(2)
		// marketing officer start
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/List Marketing Officer'))
		
		WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'), 2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/List Mkt Officer/Marketing ' + Datahohendy.getValue('Marketing', baris)))
		
		WebUI.switchToDefaultContent()
		//// marketing officer end
		
		WebUI.scrollToElement(findTestObject('Menu/Credit admin/Tab Application/List Application source'), 2)
		
		WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Application Source/Source '+ Datahohendy.getValue('Application source', baris)))
		
		WebUI.switchToDefaultContent()
		
		if (Datahohendy.getValue('Fiducia Covered', baris) == 'Yes' && Datahohendy.getValue('Use', baris) == 'Yes')
			{
				 WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Fiducia Yes'))
			}
			else
			{
				 WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Fudicia No'))
			}
		if (Datahohendy.getValue('Fiducia Fee', baris) == 'NTF Agreement' && Datahohendy.getValue('Use', baris) == 'Yes')
			{
					 WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/NTF Agreement'))
			}
			else
			{
					 WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/NTF Asset'))
			}
		
		
			
		WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Way of payment/Way '+ Datahohendy.getValue('Way', baris)))
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Notifikasi/Notification '+ Datahohendy.getValue('Notification', baris)))
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Copy address from/Address '+ Datahohendy.getValue('Address', baris)))
		
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Menu/Credit admin/Tab Application/Button Copy Address'))
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Application/List Cust Address Distance'), 2)
		
		WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Application/iframe_Term  Condition_appForm'),2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/Jarak Tempuh/Jarak '+ Datahohendy.getValue('Jarak', baris)))
		
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Application/SaveCont Application data'), 2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Application/SaveCont Application data'))
		
		//WebUI.switchToDefaultContent()
						
	}
}
