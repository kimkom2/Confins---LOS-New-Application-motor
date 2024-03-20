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

        def CEK1 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 1'),FailureHandling.OPTIONAL)

        if (CEK1.contains('Yes')) 
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 1'),FailureHandling.OPTIONAL)
        }
		
		WebUI.delay(2)
		
		def CEK2 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 2'),FailureHandling.OPTIONAL)
		
		if (CEK2.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 2'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK3 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 3'),FailureHandling.OPTIONAL)
		
		if (CEK3.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 3'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK4 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 4'),FailureHandling.OPTIONAL)
		
		if (CEK4.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 4'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK5 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 5'),FailureHandling.OPTIONAL)
		
		if (CEK5.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 5'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)

        def CEK6 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 6'),FailureHandling.OPTIONAL)

        if (CEK6.contains('Yes')) 
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 6'),FailureHandling.OPTIONAL)
        } 
		
		WebUI.delay(2)
		
		def CEK7 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 7'),FailureHandling.OPTIONAL)
		
		if (CEK7.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 7'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK8 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 8'),FailureHandling.OPTIONAL)
		
		if (CEK8.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 8'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK9 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 9'),FailureHandling.OPTIONAL)
		
		if (CEK9.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 9'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK10 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 10'),FailureHandling.OPTIONAL)
		
		if (CEK10.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 10'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK11 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 11'),FailureHandling.OPTIONAL)
		
		if (CEK11.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 11'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK12 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 12'),FailureHandling.OPTIONAL)
		
		if (CEK12.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 12'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK13 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 13'),FailureHandling.OPTIONAL)
		
		if (CEK13.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 13'),FailureHandling.OPTIONAL)
		}
		
		WebUI.delay(2)
		
		def CEK14 = WebUI.getText(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/NO 14'),FailureHandling.OPTIONAL)
		
		if (CEK14.contains('Yes'))
		{
			WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/CEK NO 14'),FailureHandling.OPTIONAL)
		}
		
		WebUI.switchToDefaultContent()
		
		WebUI.scrollToElement(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Save Term Condition'), 2)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Save Term Condition'),FailureHandling.OPTIONAL)
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Menu/Credit admin/Page_New Confins - Main/Submit'),FailureHandling.OPTIONAL)
		

