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

TestData Datahohendy = findTestData('Data Files/Financial/New bike')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++) {
    if (Datahohendy.getValue('Use', baris) == 'Yes') {
        WebUI.switchToDefaultContent()

		// inputan Fee
        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Admin Fee Amount'))

        WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Admin Fee Amount'))

        WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Admin Fee Amount'), Datahohendy.getValue('Admin Fee', baris))

        if (Datahohendy.getValue('Capitalize Admin Fee', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes') 
		{ 
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Capitalize AdminFeeAmt'))
        }
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Notary Amount'))
		
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Notary Amount'))
		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Notary Amount'),Datahohendy.getValue('Notary Amount', baris))
		
		if (Datahohendy.getValue('Capitalize Notary Amount', baris) == 'Ya'&& Datahohendy.getValue('Use', baris) == 'Yes')
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Capitalize NotaryFeeAmt'))
		}
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Additional Admin Fee'))

        WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Additional Admin Fee'))

        WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Additional Admin Fee'),Datahohendy.getValue('Additional Admin Fee', baris))

        if (Datahohendy.getValue('Capitalize Additional Admin Fee', baris) == 'Ya'&& Datahohendy.getValue('Use', baris) == 'Yes') 
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Capitalize ddAminFee'))
        } 
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Deduction Fee'))
		
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Deduction Fee'))
		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Deduction Fee'),Datahohendy.getValue('Deduction Fee', baris))
		
		if (Datahohendy.getValue('Capitalize Deduction Fee', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Capitalize Deduction Fee'))
		}
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Survey Fee'))
		
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Survey Fee'))
		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Survey Fee'),Datahohendy.getValue('Deduction Fee', baris))
		
		if (Datahohendy.getValue('Capitalize Deduction Fee', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Capitalize Survey'))
		}
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		
		if (Datahohendy.getValue('Provision Type', baris) == 'Persen')
		{
			//WebUI.dismissAlert(FailureHandling.OPTIONAL)
			
			//WebUI.switchToDefaultContent()
			
			//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Provision Persen'))
			
			WebUI.delay(2)
			
			WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/input_Provision Percentage'))
			
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/input_Provision Percentage'))
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/input_Provision Percentage'),Datahohendy.getValue('Provision Persentase', baris))
		}
		
		else 
		{
			//WebUI.dismissAlert(FailureHandling.OPTIONAL)
			
			//WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Provision Amount'))
			
			WebUI.delay(2)
			
			WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/input_Provision Amount'))
			
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/input_Provision Amount'))
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/input_Provision Amount'),Datahohendy.getValue('Provision Amount', baris))
		}
		
		if (Datahohendy.getValue('Capitalize Provision', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Capitalize ProvisionFee'))
		}
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		
		if (Datahohendy.getValue('Fiducia', baris) == 'Mandatory')
			{
				//WebUI.dismissAlert(FailureHandling.OPTIONAL)
				
				//WebUI.switchToDefaultContent()
				
				//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
				
				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Fiducia Mandatory'))
				
				WebUI.delay(2)
			}
			
			else
			{
				//WebUI.dismissAlert(FailureHandling.OPTIONAL)
				
				//WebUI.switchToDefaultContent()
				
				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Fiducia Optional'))
				
				WebUI.delay(2)
				
				WebUI.switchToDefaultContent()
				
			}
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Fiducia Fee Amount'))
			
			WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Fiducia Fee Amount'))
			
			WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Fiducia Fee Amount'),Datahohendy.getValue('Fiducia Fee Amount', baris))
			
			if (Datahohendy.getValue('Capitalize Provision', baris) == 'Ya' && Datahohendy.getValue('Use', baris) == 'Yes')
			{
				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Capitalize ProvisionFee'))
			}
			
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
			
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/CalculateFees'))
		
		WebUI.delay(5)
		
		WebUI.dismissAlert(FailureHandling.OPTIONAL)
		
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Rate'), 3)
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Rate'))
		
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Rate'))
		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/Rate'),Datahohendy.getValue('Rate', baris))
		
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/CalculateFinancialData'))
		
		WebUI.delay(5)
		
		//WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/CalculateFinancialData'))
		
		//WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/SaveCont Financial'), 3)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Financial Data/SaveCont Financial'))
		
		WebUI.delay(7)
		
    }
}



