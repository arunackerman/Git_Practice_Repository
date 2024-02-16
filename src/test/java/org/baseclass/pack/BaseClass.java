package org.baseclass.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.adactim_locaters.pack.SearchHotelLocaters;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	protected static WebDriver driver;
	static Actions ac;
	static TakesScreenshot ts;
	static JavascriptExecutor js;
	static Select s;
	static Alert alert;
	static WebElement element;

	public static WebDriver browserlaunch() {
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		return driver;
	}
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("The current page title is " + title);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}

	public static WebElement findElementById(String idValue) {
		element = driver.findElement(By.id(idValue));
		return element;

	}

	public static WebElement findElementByName(String nameValue) {
		element = driver.findElement(By.name(nameValue));
		return element;

	}

	public static WebElement findElementByXpath(String text) {
		element = driver.findElement(By.xpath(text));
		return element;

	}
	
	public static WebElement findElementByCssSelector(String cssSelectorValue) {
		element = driver.findElement(By.cssSelector(cssSelectorValue));
		return element;

	}

	public static WebElement findElementByLinkText(String linkTextValue) {
		element = driver.findElement(By.linkText(linkTextValue));
		return element;
	}

	public static WebElement findElementByPartialLinkText(String partialLinkTextValue) {
		driver.findElement(By.partialLinkText(partialLinkTextValue));
		return element;

	}

	public static String getAttribute(String id) {
		WebElement textData = driver.findElement(By.id(id));
		return textData.getAttribute("value");

	}
	
	public static String getAttribute(WebElement element, String attribute) {
		String attribute_value = element.getAttribute(attribute);
		return attribute_value;
	}

	public static WebElement click(WebElement element) {
		element.click();
		return element;

	}

	public static WebElement sendKeys(String data) {
		element.sendKeys(data);
		return element;
	}
	public static WebElement findElementBy(By by) {
		return driver.findElement(by);
		
	}
	
	/*public static WebElement findElementByXpath() {
		return driver.findElement((By) new SearchHotelLocaters().getLocation());
	}*/
	
	public static void typedata(WebElement element, String data) {
		element.sendKeys(data);	
	}

	public static void selectText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	
	}

	public static void selectIndex(WebElement element,int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
		
	}
	public static void scroll() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public static void movetoElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void implicitlyWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	} 

	public static File takesScreenshot(String filePath) {
		ts = (TakesScreenshot) driver;
		File webPageFile = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(filePath);
		try {
			FileHandler.copy(webPageFile, file);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return webPageFile;
	}

	public static String readProperty(String key) {
		String value=null;
		try {
			FileReader r = new FileReader("C:\\Users\\hello\\eclipse-workspace\\JUnitProject\\src\\test\\resources\\JUnitTestData\\Credentials.properties");
			Properties prop = new Properties();
			prop.load(r);
			value = prop.getProperty(key);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return value;

	}

	public static String excelRead(String sheetName, int r, int c) {
		String value = null;
		try {
			String filePath = "C:\\Users\\hello\\eclipse-workspace\\JUnitProject\\src\\test\\resources\\JUnitTestData\\sendKeysData.xlsx";
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(r);
			Cell cell = row.getCell(c);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();

			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date cellDateValue = cell.getDateCellValue();
					SimpleDateFormat sc = new SimpleDateFormat("dd-MM-YYYY");
					value = sc.format(cellDateValue);

				} else {
					double numValue = cell.getNumericCellValue();
					long l = (long) numValue;
					value = String.valueOf(l);
					return value;
				}
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return value;

	}

	public static void excelWrite(String sheetName, int r, int c, String value) {

		try {
			String filePath = "C:\\Users\\hello\\eclipse-workspace\\JUnitProject\\src\\test\\resources\\JUnitTestData\\sendKeysData.xlsx";
			File file = new File(filePath);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet createSheet = wb.createSheet(sheetName);
			Row createRow = createSheet.createRow(r);
			Cell createCell = createRow.createCell(c);
			createCell.setCellValue(value);

			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();

		}

		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void close() {
		driver.close();
	}

	public static void main(String[] args) {

	}

}
