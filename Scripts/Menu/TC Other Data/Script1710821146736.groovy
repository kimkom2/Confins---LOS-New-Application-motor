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

TestData Datahohendy = findTestData('Data Files/Tab Other data/New Bike Other Data')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes')
	{
		WebUI.switchToDefaultContent()
				
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/Purpose'), Datahohendy.getValue('Purpose', baris))
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/Asset Financed'), Datahohendy.getValue('Asset Financed', baris))
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/Source Of Income'), Datahohendy.getValue('Source Of Income', baris))
		
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/Ticket Number'), Datahohendy.getValue('Ticket Number', baris))
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/MARKETING OFFICER'), Datahohendy.getValue('MARKETING OFFICER', baris))
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/CREDIT OFFICER'), Datahohendy.getValue('CREDIT OFFICER', baris))
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/Debt Sales'), Datahohendy.getValue('Debt Sales Buyer', baris))
		WebUI.delay(1)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/Debt Sales Transaction'), Datahohendy.getValue('Debt Sales Transaction Date', baris))
		WebUI.delay(1)
		WebUI.switchToDefaultContent()
		WebUI.delay(1)
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/SaveCont other data'), 3)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Other Data/SaveCont other data'))
		
	}
}
