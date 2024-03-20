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

TestData Datahohendy = findTestData('Data Files/Product/Product New Bike')

WebUI.click(findTestObject('Menu/Credit admin/Add New Application Motor/Add New'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu/Credit admin/Add New Application Motor/Sreach Product Offering Name'))

WebUI.delay(1)

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
	{
	if (Datahohendy.getValue('Use', baris) == 'Yes')
		{
		
			WebUI.setText(findTestObject('Menu/Credit admin/Add New Application Motor/input_Product Offering Code'), Datahohendy.getValue('Product Code', baris))
						
		}
	}
	
// WebUI.setText(findTestObject('Menu/Credit admin/Add New Application Motor/input_Product Offering Code'), GlobalVariable.Cari)
	WebUI.delay(1)

WebUI.click(findTestObject('Menu/Credit admin/Add New Application Motor/Button SEARCH'))

WebUI.click(findTestObject('Menu/Credit admin/Add New Application Motor/Select Product'))

WebUI.click(findTestObject('Menu/Credit admin/Add New Application Motor/Button Next'))

