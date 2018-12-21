package Webdriver_project;

import org.testng.annotations.Test;

import utility.BrowerFactory;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class DataDriven {
	private WebDriver driver;

	@Test
	public void login() {
		readWriteExcel();
	}
	@BeforeClass
	public void beforeClass() {
		driver=BrowerFactory.getdriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}



	public String login(String username,String password)
	{

		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();

		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Find a Flight: Mercury Tours:")) {
			driver.findElement(By.linkText("SIGN-OFF")).click();
			return "VALID USER";
		}else {
			return "INVALID USER";
		}  
	}

	public void readWriteExcel() {

		File file=new File("C:\\selenium browser driver\\login_data.xlsx");
		try {
			InputStream is=new FileInputStream(file);
			XSSFWorkbook xssf=new XSSFWorkbook(is);
			XSSFSheet sheet1=xssf.getSheet("Sheet1");
			for(int i=1;i<=sheet1.getLastRowNum();i++)
			{

				String uname=sheet1.getRow(i).getCell(0).getStringCellValue();
				String password1=sheet1.getRow(i).getCell(1).getStringCellValue();
				String result=login(uname,password1);
				sheet1.getRow(i).createCell(2).setCellValue(result);

			}
			is.close();
			OutputStream os=new FileOutputStream(file);
			xssf.write(os);
			xssf.close();
			os.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	}
