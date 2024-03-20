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

TestData Datahohendy = findTestData('Data Files/Tab Asset/New Bike')

for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++)
{
	if (Datahohendy.getValue('Use', baris) == 'Yes')
	{
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Asset Registration'))
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Self usage'))
						
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Copy Addres'), 3)
		
		//WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/TaxDate'), Datahohendy.getValue('Tax Date', baris))
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Klik Tax Date'))
		
		WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Copy Addres Asset Regitraion/Alamat ' + Datahohendy.getValue('Alamat Collateral', baris)))
		
		WebUI.switchToDefaultContent()
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Copy Addres'))
		
		if (Datahohendy.getValue('Kondisi asset', baris) == 'Bekas')
		{
			WebUI.switchToDefaultContent()
			
			WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc BPKB'), 3)
			
			def textBPKB= WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc BPKB'))
			if (textBPKB.contains('Yes'))
			{
			println('MASUK')
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Cek BPKB'))
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc No BPKB'), Datahohendy.getValue('NoBPKB', baris))
			}
			
			def textFAKTUR = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc NO FAKTUR'))
			if (textFAKTUR.contains('Yes'))
			{
			println('MASUK')
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Cek NO FAKTUR'))
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc No NO FAKKTUR'), Datahohendy.getValue('NoFAKTUR', baris))
			}
			def textSTNK = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc STNK'))
			if (textSTNK.contains('Yes'))
			{
			println('MASUK')
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Cek STNK'))
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc No STNK'), Datahohendy.getValue('NoFAKTUR', baris))
			}
			def textBLOKIR = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc BLOKIR BPKB'))
			if (textBLOKIR.contains('Yes'))
			{
			println('MASUK')
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Cek BLOKIR BPKB'))
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Doc/Doc No BLOKIR BPKB'), Datahohendy.getValue('BLOKIR', baris))
			}
		}
		
		WebUI.switchToDefaultContent()
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Save Asset Registraion'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/SaveCont Asset'))
		
	}
}
