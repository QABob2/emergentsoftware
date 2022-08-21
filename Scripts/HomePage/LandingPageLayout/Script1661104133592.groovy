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

WebUI.openBrowser('https://www.emergentsoftware.net/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('HomePage/HomePageLogo'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/ContactUsLink'), 0)

WebUI.verifyTextPresent('Emergent Software, an award-winning custom software development company in Minneapolis, Minnesota provides high-quality custom software development, website development & design, mobile & web application development, SQL Server DBA services, Azure cloud consulting, Power BI, SharePoint consulting, ongoing maintenance & support and much more.', 
    false)

WebUI.verifyElementPresent(findTestObject('HomePage/HomeServices'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/HomeGreyBox'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/HomePageCarousel'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/HomePageBadges'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/HomePagePosts'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/HomePageContactUsSection'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/HomePageFooterSocials'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/HomePageCopyRight'), 0)

WebUI.closeBrowser()

