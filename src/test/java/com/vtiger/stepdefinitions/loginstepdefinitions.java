package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinitions {
	
	public WebDriver driver;

@Given("user should be on login page")
public void user_should_be_on_login_page() {
	
	driver = new ChromeDriver();
	driver.get("http://localhost:100");
   
}
@When("user enters valid credentails")
public void user_enters_valid_credentails() {
  
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.name("Login")).click();
	
}
@Then("user should be navigate to home page")
public void user_should_be_navigate_to_home_page() {
    driver.findElement(By.linkText("Home123")).isDisplayed();
}
@Then("user can see logout link")
public void user_can_see_logout_link() {
	 driver.findElement(By.linkText("Logout")).isDisplayed();
}


@When("user enters invalid credentails")
public void user_enters_invalid_credentails() {
	driver.findElement(By.name("user_name")).sendKeys("admin12");
	driver.findElement(By.name("user_password")).sendKeys("admin12");
	driver.findElement(By.name("Login")).click();
}

@Then("user should be navigate to login page")
public void user_should_be_navigate_to_login_page() {
	driver.findElement(By.name("Login")).isDisplayed();
}

@Then("user can see error message")
public void user_can_see_error_message() {
	driver.findElement(By.xpath("//*[contains(text(),'You must ')]")).isDisplayed();
}




}
