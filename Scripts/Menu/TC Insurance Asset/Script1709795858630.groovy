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

TestData Datahohendy = findTestData('Data Files/Tab Insurance/New Bike')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes')
	{
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Edit INS'))
		
		WebUI.delay(2)
		
		if (Datahohendy.getValue('INSCO', baris) == 'Company' && Datahohendy.getValue('Use', baris) == 'Yes')
		{	
				
			WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Ins By/INS ' + Datahohendy.getValue('INSCO', baris)))
			
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/INSCO/Ins ' + Datahohendy.getValue('Perusahaan Asu', baris)))
			
			WebUI.switchToDefaultContent()
			
			WebUI.delay(1)
			
			//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/PAID BY ' + Datahohendy.getValue('PaidBY', baris)))
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Periode Asuransi/Period ' + Datahohendy.getValue('Periode', baris)))
			
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Rate Type list/Rate ' + Datahohendy.getValue('Rate Type', baris)))
			
			if ((Datahohendy.getValue('Periode', baris) == 'Over Tenor'&& Datahohendy.getValue('Use', baris) == 'Yes') || (Datahohendy.getValue('Periode', baris) == 'Partial'&& Datahohendy.getValue('Use', baris) == 'Yes')) 
			{	
				
				WebUI.switchToDefaultContent()
				
				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Length'))
				
				WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Length'))
				
				WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Length'), Datahohendy.getValue('Insurance Length', baris))
			}
			
			WebUI.switchToDefaultContent()
			
			WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coveragetest'), 2)
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.delay(2)
					
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage/Cov ' + Datahohendy.getValue('Coverage', baris)))
			
			WebUI.delay(7)
			
			WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Next'))
			
			WebUI.delay(22)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Calculate Insco'))
			
			WebUI.delay(20)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Save Ins Company'))
		}
		
		if (Datahohendy.getValue('INSCO', baris) == 'Customer' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Ins By/INS ' + Datahohendy.getValue('INSCO', baris)))
			
			WebUI.delay(5)
			
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insco Branch Name'), Datahohendy.getValue('Insco Branch', baris))
			
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Policy Name'), Datahohendy.getValue('Policy Name', baris))
						
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Start Date'), Datahohendy.getValue('StartDate', baris))
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Klik'))
			
			WebUI.delay(2)
			
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Policy Number'), Datahohendy.getValue('Policy Number', baris))
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage Amountt'))
			
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage Amountt'))
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage Amountt'), Datahohendy.getValue('Coverage Amount', baris))

			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/End Date'), Datahohendy.getValue('Enddate', baris))
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Klik'))
			
			WebUI.delay(2)
			
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Notes'), Datahohendy.getValue('Insurance Notes', baris))
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Save'))		
		}	
		
		if (Datahohendy.getValue('INSCO', baris) == 'Customer Company' && Datahohendy.getValue('Use', baris) == 'Yes')
			{
					
			WebUI.dismissAlert(FailureHandling.OPTIONAL)
				
			WebUI.switchToDefaultContent()	
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Ins By/INS ' + Datahohendy.getValue('INSCO', baris)))
			
			WebUI.dismissAlert(FailureHandling.OPTIONAL)
			
			WebUI.delay(4)
				
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/INSCO/Ins ' + Datahohendy.getValue('Perusahaan Asu', baris)))
				
			WebUI.switchToDefaultContent()
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/PAID BY ' + Datahohendy.getValue('PaidBY', baris)))
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Periode Asuransi/Period ' + Datahohendy.getValue('Periode', baris)))
				
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Rate Type list/Rate ' + Datahohendy.getValue('Rate Type', baris)))
				
			if ((Datahohendy.getValue('Periode', baris) == 'Over Tenor'&& Datahohendy.getValue('Use', baris) == 'Yes') || (Datahohendy.getValue('Periode', baris) == 'Partial'&& Datahohendy.getValue('Use', baris) == 'Yes'))
			{
					
				WebUI.switchToDefaultContent()
					
				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Length'))
					
				WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Length'))
					
				WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Length'), Datahohendy.getValue('Insurance Length', baris))
			}
				
			WebUI.switchToDefaultContent()
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Ins By/INS ' + Datahohendy.getValue('INSCO', baris)))
				
			WebUI.delay(5)
				
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insco Branch Name'), Datahohendy.getValue('Insco Branch', baris))
				
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Policy Name'), Datahohendy.getValue('Policy Name', baris))
							
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Start Date'), Datahohendy.getValue('StartDate', baris))
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Klik'))
				
			WebUI.delay(2)
				
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Policy Number'), Datahohendy.getValue('Policy Number', baris))
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage Amountt'))
				
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage Amountt'))
				
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage Amountt'), Datahohendy.getValue('Coverage Amount', baris))
			
			WebUI.delay(1)
	
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/End Date'), Datahohendy.getValue('Enddate', baris))
			
			WebUI.delay(1)
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Klik'))
				
			WebUI.delay(2)
				
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Insurance Notes'), Datahohendy.getValue('Insurance Notes', baris))
			
			WebUI.switchToDefaultContent()
			
			WebUI.delay(1)
			
			WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coveragetest'), 2)
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.delay(2)
					
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Coverage/Cov ' + Datahohendy.getValue('Coverage', baris)))
			
			WebUI.delay(7)
			
			WebUI.switchToDefaultContent()
			
			WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Next'), 2)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Next'))
			
			WebUI.delay(22)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Calculate Insco'))
			
			WebUI.delay(20)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Save Ins Company'))
		}
		
		if (Datahohendy.getValue('INSCO', baris) == 'Off System' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			WebUI.switchToDefaultContent()
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Ins By/INS ' + Datahohendy.getValue('INSCO', baris)))
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Save'))
		}
				
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Next Ins All'), 2)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/Next Ins All'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Insurance Asset/SaveCont Ins'))
	}
}
