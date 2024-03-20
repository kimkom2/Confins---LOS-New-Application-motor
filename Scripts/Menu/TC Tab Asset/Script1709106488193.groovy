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
TestData Datahohendy = findTestData('Data Files/Tab Asset/New Bike')



for (int baris = 1; baris <= Datahohendy.getRowNumbers(); baris++) {
    if (Datahohendy.getValue('Use', baris) == 'Yes') {
        // Baca semua kolom yang ada di data excel END in here
		
        WebUI.switchToDefaultContent()
	
        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Add Asset'))
		
		WebUI.delay(2)
		
		WebUI.switchToDefaultContent()
		//WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)

		//WebUI.scrollToElement('Object Repository/Menu/Credit admin/Page_New Confins - Main/Search', 0)
		
        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Search'))
		
		WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/input Supplier Branch Name'), Datahohendy.getValue('Supplier Name', baris))
		
		WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/SEARCH Nama supplier'))

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Select Nama Supplier'))
		
		WebUI.delay(2)
		
		WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)

        //WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Sales Person Name'))
		
		//WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Sales Person/Sales ' + Datahohendy.getValue('Sales Person', baris)))
		
		WebUI.delay(2)

        WebUI.switchToDefaultContent()

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Search Asset'))
		
		WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/input Asset Name'), Datahohendy.getValue('Asset Name', baris))
		
		WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/SEARCH Asset Name'))

        WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Select Asset Name'))
		
		WebUI.delay(25)
        
		WebUI.switchToDefaultContent()
				
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/ManufacturingYear'))

        WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/ManufacturingYear'), Datahohendy.getValue('Tahun kendaraan', baris))
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Klik'))
		
		WebUI.delay(30)

		//WebUI.switchToDefaultContent()
		
		if (Datahohendy.getValue('Kondisi asset', baris) == 'Baru' && Datahohendy.getValue('Use', baris) == 'Yes')
		{
			WebUI.switchToDefaultContent()
			
			WebUI.delay(5)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/input Baru'))
		} else
		{
			WebUI.switchToDefaultContent()
			
			WebUI.delay(5)
				
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/input Bekas'))
			
			WebUI.delay(35)
		}
				
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Input Asset Price'), 2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Input Asset Price'))
		
		WebUI.delay(2)
        
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Input Asset Price'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Input Asset Price'), Datahohendy.getValue('Harga kendaraan', baris))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Down Payment'))
		
		WebUI.delay(2)
		
		WebUI.doubleClick(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Down Payment'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Down Payment'), Datahohendy.getValue('DP Kendaraan', baris))
		
		WebUI.delay(2)
		
		WebUI.switchToDefaultContent()
		
		if (Datahohendy.getValue('Kondisi asset', baris) == 'Bekas' && Datahohendy.getValue('Use', baris) == 'Yes')
			{
				WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/NO RANGKA'), Datahohendy.getValue('NO RANGKA', baris))
				WebUI.delay(1)
				WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/NO MESIN'), Datahohendy.getValue('NO MESIN', baris))
				WebUI.delay(1)
				WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/LicensePlateNo'), Datahohendy.getValue('NO RANGKA', baris))
				WebUI.delay(1)
//				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Bpkb City Issuer'))
//				WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/input_City Name'), Datahohendy.getValue('City Name', baris))
//				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/SEARCH City Name'))
//				WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Select City Name'))
				
			}
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Bpkb City Issuer'))
			WebUI.delay(1)
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/input_City Name'), Datahohendy.getValue('City Name', baris))
			WebUI.delay(1)
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/SEARCH City Name'))
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Select City Name'))
			
			WebUI.switchToFrame(findTestObject('Menu/Credit admin/Tab Asset/iframe_Term  Condition_appForm'),0)
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Asset Usesage/Asset ' + Datahohendy.getValue('Asset Use', baris)))
			WebUI.delay(1)
			WebUI.switchToDefaultContent()
			
			WebUI.setText(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/COLOR'), Datahohendy.getValue('WARNA', baris))
			WebUI.delay(1)
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Asset/Save'))
		
    }
}

