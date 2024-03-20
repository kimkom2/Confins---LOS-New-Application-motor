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

TestData Datahohendy = findTestData('Data Files/Tab Life Insurance/New Bike')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes')
	{
		WebUI.switchToDefaultContent()
		
		if (Datahohendy.getValue('Life Insurance', baris) == 'Ya')
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/Is Life'))
			
			WebUI.delay(1)
			
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			//WebUI.switchToDefaultContent()
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/Life Insco/Life ' + Datahohendy.getValue('Perusahaan Life Asu', baris)))
			
			WebUI.switchToDefaultContent()
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/Cover ' + Datahohendy.getValue('CoverBy', baris)))
			
			WebUI.delay(2)
			
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/Payment Method/Payment ' + Datahohendy.getValue('Payment Method', baris)))
			
			if (Datahohendy.getValue('Payment Method', baris) == 'Partial Payment')
			{
				if (Datahohendy.getValue('Cal Type', baris) == 'Amount')
				{
					WebUI.switchToDefaultContent()
					
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/CalculatedBy Amount'))
					
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/AmounttxtInput'))
					
					WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/AmounttxtInput'))
					
					WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/AmounttxtInput'), Datahohendy.getValue('Amt', baris))
				}
				else
				{
					WebUI.switchToDefaultContent()
					
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/CalculatedBy Persentage'))
					
					WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/PercenttxtInput'))
						
					WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/PercenttxtInput'))
						
					WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/PercenttxtInput'), Datahohendy.getValue('Persen', baris))
							
				}
				
			}
			
			WebUI.switchToDefaultContent()

			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/Notes'), Datahohendy.getValue('Notes', baris))
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Life Insurance/SaveCont Life insurance'))
						
		}
		
	}
}
