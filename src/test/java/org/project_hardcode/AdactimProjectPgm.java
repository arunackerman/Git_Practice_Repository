 package org.project_hardcode;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AdactimProjectPgm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");//Enter into the website
		driver.manage().window().maximize();
		WebElement username  = driver.findElement(By.xpath("//input[@type=\"text\"]")); 
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		username.sendKeys("arunkumarmanivannan");
		password.sendKeys("Arun@123");
		driver.findElement(By.xpath("//input[@type=\"Submit\"]")).click(); //login 
		WebElement location = driver.findElement(By.xpath("//select[@name=\"location\"]"));
		Select select = new Select(location);
		select.selectByVisibleText("New York");
		WebElement hotel = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
		select = new Select(hotel);
		select.selectByIndex(2);
		WebElement roomType = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
		select = new Select(roomType);
		select.selectByValue("Super Deluxe");
		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		select = new Select(noOfRooms);
		select.selectByVisibleText("1 - One");
		WebElement checkIndate = driver.findElement(By.xpath("//input[@name=\"datepick_in\"]"));
		checkIndate.clear();
		checkIndate.sendKeys("05/12/2023"); 
		WebElement checkOutDate = driver.findElement(By.xpath("//input[@name=\"datepick_out\"]"));
		checkOutDate.clear();
		checkOutDate.sendKeys("07/12/2023");
		WebElement adultsPerRoom = driver.findElement(By.xpath("//select[@id=\"adult_room\"]"));
		select = new Select(adultsPerRoom);
		select.selectByVisibleText("2 - Two");
		WebElement childPerRoom = driver.findElement(By.xpath("//select[contains(@name,\"child_room\")]"));
		select = new Select(childPerRoom);
		select.selectByValue("0");
		WebElement search = driver.findElement(By.xpath("//input[@id=\"Submit\" and @value=\"Search\"]"));
		search.click();
		WebElement optionSelect = driver.findElement(By.xpath("(//input[@type=\"radio\" or @value=\"0\"])[1]"));
		boolean isOptionSelected = optionSelect.isSelected();
		if(isOptionSelected == false) {optionSelect.click();} 
		driver.findElement(By.xpath("//td//input[@type=\"submit\"]")).click(); //clicking the search option
		WebElement firstName = driver.findElement(By.xpath("//input[@name=\"first_name\"]"));
		firstName.sendKeys("Arun Kumar");
		WebElement lastName = driver.findElement(By.xpath("//input[@name=\"last_name\"]"));
		lastName.sendKeys("Manivannan");
		WebElement billingAddress = driver.findElement(By.xpath("//textarea[@name=\"address\"]"));
		billingAddress.sendKeys("xyz street, Erode-638001");
		WebElement creditCardNumber = driver.findElement(By.xpath("//input[@name=\"cc_num\"]"));
		creditCardNumber.sendKeys("1234567891011121");
		WebElement cardType = driver.findElement(By.xpath("//select[contains(@name,\"cc_type\")]"));
		select = new Select(cardType);
		select.selectByValue("VISA");
		WebElement expiryDate = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
		select = new Select(expiryDate);
		select.selectByValue("5");
		WebElement expiryYear = driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
		select = new Select(expiryYear);
		select.selectByVisibleText("2026");
		WebElement ccvNumber = driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"cc_cvv\"]"));
		ccvNumber.sendKeys("345");
		driver.findElement(By.xpath("//input[@value=\"Book Now\"]")).click(); // clicking option booknow
		try {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement orderId = driver.findElement(By.xpath("//td//input[@name=\"order_no\"]"));
		String orderIdNumber = orderId.getAttribute("value");
		WebElement orderNumber = driver.findElement(By.xpath("//input[@name=\"order_no\"]"));
		String valueOfName = orderNumber.getAttribute("name");
		String getCssValue = orderNumber.getCssValue(orderIdNumber);
		System.out.println("The css value of " + getCssValue);
		System.out.println("The attribute value of 'name' is  " + valueOfName);
		System.out.println("Your booking order number is " + orderIdNumber);
		} catch(NoSuchElementException e) {e.printStackTrace();}

	}

}
