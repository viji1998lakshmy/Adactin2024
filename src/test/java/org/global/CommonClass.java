package org.global;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClass {
	
	public static WebDriver driver;
	public File file;
	public Workbook workbook;
	public Cell cell;
	public Row row;
	public Sheet sheet;
	public Select s;
	public static JavascriptExecutor javascriptExecutor;
	public Alert alert;
	
	public void getDriver(String browser) {
		
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
	

		default:
			System.out.println("Invalid Driver");
		}	
	}
	
	public void windowMx() {
		driver.manage().window().maximize();
	}

	public void geturl(String website) {
		driver.get(website);
	}
	
	public String getcurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		
		return currentUrl;
	}
	
	public String readExcel(int rownum,int cellnum) {
		
		String value=null;
		try {
			
			 file=new File("H:\\Eclipse Workspace\\Adactin\\Database\\HotelBooking.xlsx");
			
			 FileInputStream input=new FileInputStream(file);
			
			 workbook=new XSSFWorkbook(input);
			
			sheet = workbook.getSheet("DATA");
			
			 row = sheet.getRow(rownum);
			
			 cell = row.getCell(cellnum);
			
			CellType cellType = cell.getCellType();
			
			switch (cellType) {
			case STRING:
				
				 value = cell.getStringCellValue();
				break;
				
			case NUMERIC:
				
				if(DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateformat =new SimpleDateFormat("dd/MM/yyyy");
					value= dateformat.format(date);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
					value = valueOf.toString();
				}

			default:
				break;
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return value;
	}
	
	public void writeExcel(int rownum,int columnnum,String write) {
		try {
			cell = sheet.getRow(rownum).createCell(columnnum);
			
			cell.setCellValue(write);
			
			FileOutputStream out=new FileOutputStream(file);
			
			workbook.write(out);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void writeExcelNewRow(int rownum,int columnnum,String write) {
		try {
			cell = sheet.createRow(rownum).createCell(columnnum);
			
			cell.setCellValue(write);
			
			FileOutputStream out=new FileOutputStream(file);
			
			workbook.write(out);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void load(){
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void sendkeys(WebElement element,String user) {
		element.sendKeys(user);
	}
	
	public void clickbutton(WebElement element) {
		element.click();
	}
	
	public void clearText(WebElement element) {
		element.clear();
	}
	
	public void closeWindow() {
		driver.close();
	}
	
	public void screenshot(String filename) {
		try {
			TakesScreenshot shot=(TakesScreenshot)driver;
			File source=shot.getScreenshotAs(OutputType.FILE);
			File destination=new File("H:\\Eclipse Workspace\\Adactin\\Screenshot\\"+filename+".png");
			
			FileUtils.copyFile(source, destination);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void selectbyIndex(WebElement element, int i) {
		s=new Select(element);
		s.selectByIndex(i);
	}

	public void selectbyValue(WebElement element, String type) {
		s=new Select(element);
		s.selectByValue(type);
	}

	public void selectbyVisibleText(WebElement element,String place) {
		s=new Select(element);
		s.selectByVisibleText(place);
		
	}
	
	public void clickJS(WebElement element) {
		 javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].click()", element);
	}
	
	public void sendKeysJS(WebElement element,String value) {
		javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].setAttribute('value','"+value+"')", element);
	}
	
	public Object getAttributeJS(WebElement element) {
		javascriptExecutor=(JavascriptExecutor)driver;
		Object executeScript = javascriptExecutor.executeScript("arguments[0].getAttribute('value')", element);
		return executeScript;
	}
	
	public String getAttributeJava(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	public void scroll(WebElement element,String scrollType) {
		
		javascriptExecutor=(JavascriptExecutor)driver;
		switch (scrollType) {
		case "Down":
			javascriptExecutor=(JavascriptExecutor)driver;
			javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
			break;
			
		case "Up":
			javascriptExecutor=(JavascriptExecutor)driver;
			javascriptExecutor.executeScript("arguments[0].scrollIntoView(false)", element);
			break;

		default:
			break;
		}	
		
	}
	
//	public void alert(String alertType) {
//		Alert alert =driver.switchTo().alert();
//		switch (alertType) {
//		case "OK":
//			alert.accept();
//			break;
//		case "Cancel":
//			alert.dismiss();
//			break;
//
//		default:
//			break;
//		}
//	}
	
	
	public void alertOK() {
		 alert=driver.switchTo().alert();
		 alert.accept();
	}
//	
//	public void alertCANCEL() {
//		alert=driver.switchTo().alert();
//		alert.dismiss();
//	}
//	
//	public void alertSendText(String text) {
//		alert=driver.switchTo().alert();
//		alert.sendKeys(text);
//	}
}

