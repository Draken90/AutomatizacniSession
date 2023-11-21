package resultsPage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.util.Random
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import internal.GlobalVariable

public class ResultsPageTestStep {
	
	def getNumberOfProducts() {
		
		List addButtonsList
		addButtonsList = WebUI.findWebElements(findTestObject('Object Repository/Results/Product/buttonAddToShoppingCartUni'),2)
		GlobalVariable.NOP = addButtonsList.size()
		
		println(GlobalVariable.NOP)
		return GlobalVariable.NOP
		
	}


	def clickOnAddToShoppingCart(NumberOfProducts) {
		Random random = new Random()
		GlobalVariable.Random = random.nextInt(NumberOfProducts)
		
		println(GlobalVariable.Random)
		
		if (GlobalVariable.Random == 0) {
		GlobalVariable.Random = 1
			}
		
			WebUI.click(findTestObject('Object Repository/Results/Product/buttonAddToShoppingCart'))
	}

	@Keyword
	def addToShoppingCart() {
		clickOnAddToShoppingCart(getNumberOfProducts())
	}
}
