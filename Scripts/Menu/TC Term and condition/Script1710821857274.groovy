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

//TestData Datahohendy = findTestData('Data Files/Tab Asset/New Bike')


        WebUI.switchToDefaultContent()

        def CEK1 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 1'),FailureHandling.OPTIONAL)

        if (CEK1.contains('Yes')) 
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 1'),FailureHandling.OPTIONAL)
        }
		
		WebUI.delay(3)
		
		def CEK2 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 2'),FailureHandling.OPTIONAL)
		
		if (CEK2.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 2'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK3 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 3'),FailureHandling.OPTIONAL)
		
		if (CEK3.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 3'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK4 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 4'),FailureHandling.OPTIONAL)
		
		if (CEK4.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 4'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK5 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 5'),FailureHandling.OPTIONAL)
		
		if (CEK5.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 5'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)

        def CEK6 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 6'),FailureHandling.OPTIONAL)

        if (CEK6.contains('Yes')) 
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 6'),FailureHandling.OPTIONAL)
        } 
		
		WebUI.delay(3)
		
		def CEK7 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 7'),FailureHandling.OPTIONAL)
		
		if (CEK7.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 7'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK8 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 8'),FailureHandling.OPTIONAL)
		
		if (CEK8.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 8'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK9 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 9'),FailureHandling.OPTIONAL)
		
		if (CEK9.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 9'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK10 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 10'),FailureHandling.OPTIONAL)
		
		if (CEK10.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 10'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK11 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 11'),FailureHandling.OPTIONAL)
		
		if (CEK11.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 11'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK12 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 12'),FailureHandling.OPTIONAL)
		
		if (CEK12.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 12'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK13 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 13'),FailureHandling.OPTIONAL)
		
		if (CEK13.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 13'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK14 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/NO 14'),FailureHandling.OPTIONAL)
		
		if (CEK14.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/CEK NO 14'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK15 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 15'),FailureHandling.OPTIONAL)
		
		if (CEK15.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 15'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK16 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 16'),FailureHandling.OPTIONAL)
		
		if (CEK16.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 16'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK17 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 17'),FailureHandling.OPTIONAL)
		
		if (CEK17.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 17'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK18 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 18'),FailureHandling.OPTIONAL)
		
		if (CEK18.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 18'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK19 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 19'),FailureHandling.OPTIONAL)
		
		if (CEK19.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 19'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK20 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 20'),FailureHandling.OPTIONAL)
		
		if (CEK20.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 20'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK21 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 21'),FailureHandling.OPTIONAL)
		
		if (CEK21.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 21'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK22 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 22'),FailureHandling.OPTIONAL)
		
		if (CEK22.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 22'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK23 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 23'),FailureHandling.OPTIONAL)
		
		if (CEK23.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 23'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK24 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 24'),FailureHandling.OPTIONAL)
		
		if (CEK24.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 24'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK25 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 25'),FailureHandling.OPTIONAL)
		
		if (CEK25.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 25'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK26 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 26'),FailureHandling.OPTIONAL)
		
		if (CEK26.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 26'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK27 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 27'),FailureHandling.OPTIONAL)
		
		if (CEK27.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 27'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK28 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 28'),FailureHandling.OPTIONAL)
		
		if (CEK28.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 28'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK29 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 29'),FailureHandling.OPTIONAL)
		
		if (CEK29.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 29'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK30 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 30'),FailureHandling.OPTIONAL)
		
		if (CEK30.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 30'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK31 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 31'),FailureHandling.OPTIONAL)
		
		if (CEK31.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 31'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK32 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 32'),FailureHandling.OPTIONAL)
		
		if (CEK32.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 32'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK33 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 33'),FailureHandling.OPTIONAL)
		
		if (CEK33.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 33'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK34 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 34'),FailureHandling.OPTIONAL)
		
		if (CEK34.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 34'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK35 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 35'),FailureHandling.OPTIONAL)
		
		if (CEK35.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 35'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK36 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 36'),FailureHandling.OPTIONAL)
		
		if (CEK36.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 36'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(3)
		
		def CEK37 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/NO 37'),FailureHandling.OPTIONAL)
		
		if (CEK37.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Page_New Confins - Main/CEK NO 37'),FailureHandling.OPTIONAL)
		}
		
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Save Term Condition'), 2)
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Save Term Condition'),FailureHandling.OPTIONAL)
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Tab Term and condition/Submit'),FailureHandling.OPTIONAL)
		

