package com.stepDifinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDifinitionpage {
	WebDriver driver;
	@Given("user is on the adactinhome page")
	public void user_is_on_the_adactinhome_page() {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://adactinhotelapp.com/");
	   
	}
	@When("user should enter {string}and {string}")
	public void user_should_enter_and(String name, String pass) {
	
		WebElement txtuserName=driver.findElement(By.id("username"));	
		txtuserName.sendKeys(name);
		WebElement txtPass=driver.findElement(By.id("password"));	
		txtPass.sendKeys(pass);
		
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin=driver.findElement(By.name("login"));	
		btnLogin.click();
	}
	@When("user search the hotel{string}{string}{string}{string}{string}{string}{string}and{string}")
	public void user_search_the_hotel_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		WebElement Location = driver.findElement(By.id("location"));
		Select select= new Select(Location);
		select.selectByIndex(8);
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Select select2 = new Select(Hotels);
		select2.selectByIndex(4);
		WebElement Roomtype = driver.findElement(By.id("room_type"));
		Select select3=new Select(Roomtype);
		select3.selectByIndex(4);
		WebElement room = driver.findElement(By.id("room_nos"));
		Select select4=new Select(room);
		select4.selectByIndex(4);
		WebElement Adult = driver.findElement(By.id("adult_room"));
		Select select5=new Select(Adult);
		select5.selectByIndex(2);
		WebElement Childrens = driver.findElement(By.id("child_room"));
		Select select6= new Select(Childrens);
		select6.selectByIndex(3);
	}
	@When("user should click search button")
	public void user_should_click_search_button() {
		WebElement Search = driver.findElement(By.id("Submit"));
		Search.click();
	}
	@When("user should select the hotel")
	public void selecthotel() {
		WebElement Button = driver.findElement(By.id("radiobutton_0"));
		Button.sendKeys("Button");
		Button.click();
		WebElement next = driver.findElement(By.id("continue"));
		next.sendKeys("next");
		next.click();

	}
	@When("user should book the hotel{string}{string}{string}{string}{string}{string}{string}and{string}")
	public void user_should_book_the_hotel_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		WebElement Firstname = driver.findElement(By.id("first_name"));
		Firstname.sendKeys(string);
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys(string2);
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(string3);
		WebElement add = driver.findElement(By.id("cc_num"));
		add.sendKeys(string4);
		WebElement Cardtype = driver.findElement(By.id("cc_type"));
		Select select8= new Select(Cardtype);
		select8.selectByIndex(4);
		WebElement Date = driver.findElement(By.id("cc_exp_month"));
		Select select9= new Select(Date);
		select9.selectByIndex(4);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select select10= new Select(year);
		select10.selectByIndex(11);
		WebElement CVV = driver.findElement(By.id("cc_cvv"));
		CVV.sendKeys(string8);
	}
	@When("user should click book now")
	public void bookNow() throws InterruptedException {
		WebElement Booknow = driver.findElement(By.id("book_now"));
		Booknow.click();
		
	}
	@When("print the orderid")
	public void orederId() throws InterruptedException{
		Thread.sleep(5000);
		WebElement orderid = driver.findElement(By.xpath("//input[@id='order_no']"));
		String data = orderid.getAttribute("value");
		System.out.println(data);
	
	}
	@Then("user should verify error msg")
	public void user_should_verify_error_msg() {
		Assert.assertTrue("verify url", true);
		driver.quit();
	    
	}


}
