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

TestData Datahohendy = findTestData('Data Files/Tab Commision/New Bike')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes')
	{
		WebUI.switchToDefaultContent()
		
		if (Datahohendy.getValue('Comiision Supplier', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			
			//println('Masuk')
			
			WebUI.dismissAlert(FailureHandling.OPTIONAL)
			
			WebUI.switchToDefaultContent()
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Refund'))
			
			WebUI.delay(1)
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Refund'))
			
			WebUI.delay(1)
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Refund'),Datahohendy.getValue('REFUND SUPPLIER', baris))
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Incentivet'))
			
			WebUI.delay(1)
			
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Incentivet'))
			
			WebUI.delay(1)
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Incentivet'),Datahohendy.getValue('INCENTIVE', baris))
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/SalesExp'))
			
			WebUI.delay(1)
			
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/SalesExp'))
			
			WebUI.delay(1)
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/SalesExp'),Datahohendy.getValue('SALES EXPENSE', baris))
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Oth Commision'))
			
			WebUI.delay(1)
			
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Oth Commision'))
			
			WebUI.delay(1)
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Oth Commision'),Datahohendy.getValue('OTHER COMMISSION', baris))

		}
		else
		{
			//println('Delete')
			
			//WebUI.switchToDefaultContent()
			
			//WebUI.dismissAlert(FailureHandling.OPTIONAL)
					
			//WebUI.delay(1)
			
			//WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier Commision'), 3)
			
			//WebUI.delay(1)
			
			//WebUI.switchToDefaultContent()
			//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			//WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier Commision'))
			
			//WebUI.delay(1)
			
			WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier Commision'))
			
			WebUI.waitForAlert(10)
			
			//WebUI.delay(2)
			
			WebUI.acceptAlert(FailureHandling.OPTIONAL)
		}
		
		WebUI.switchToDefaultContent()
		
		if (Datahohendy.getValue('Comiision Supplier Employee', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			
			println('Masuk')
		}
		else
		{
			println('Delete')
			
			WebUI.switchToDefaultContent()
			
			WebUI.dismissAlert(FailureHandling.OPTIONAL)
					
			WebUI.delay(1)
			
			//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			//WebUI.focus(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier branch employee'))
			
			WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier branch employee'), 3)
			
			WebUI.delay(1)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier branch employee'))
		
			WebUI.delay(1)
			
			WebUI.waitForAlert(10)
			
			WebUI.delay(1)
			
			WebUI.acceptAlert(FailureHandling.OPTIONAL)
			

			
//			if (Datahohendy.getValue('Comiision Supplier', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
//			{
//				WebUI.switchToDefaultContent()	
//				
//				//WebUI.switchToFrame(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/iframe_Term  Condition_appForm'),0)
//				
//				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Del Supplier branch employee'))
//				
//				WebUI.delay(1)
//				
//				WebUI.waitForAlert(10)
//				
//				WebUI.delay(1)
//				
//				WebUI.acceptAlert(FailureHandling.OPTIONAL)	
//			}
			
		WebUI.delay(2)
			
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		WebUI.delay(2)
		}
		
		WebUI.switchToDefaultContent()
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/Calculate Commision'))
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Commision data/SaveCont Commision'))
	
	}
}
