package automationFramework;

import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

import pageObjects.*;

import utility.*;

import appModules.*;

public class UDF_TC 
{
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

	@BeforeMethod
	public void beforeMethod() throws Exception 
	{
		DOMConfigurator.configure("log4j.xml");
		sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(this.toString());
		Log.startTestCase(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Hoja1");
		//iTestCaseRow = Utils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
		driver = Utils.openBrowser(iTestCaseRow);
	}

	@Test
	public void main() throws Exception
	{
		SignIn_Action.Execute(driver);
		System.out.println("Login Successfully, now it is the time to Log Off buddy.");
		Home_Page.lnk_LogOut(driver).click();
		Log.info("Click action is performed on Log Out link");
	}

	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();
	}
}