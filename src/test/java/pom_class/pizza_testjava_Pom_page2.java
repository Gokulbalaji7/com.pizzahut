package pom_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable_file.Reusablecode;

public class pizza_testjava_Pom_page2 extends Reusablecode{

	public pizza_testjava_Pom_page2 () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "name")
	public WebElement name;
	
	@FindBy(name = "phone")
	public WebElement phh;
	
	@FindBy(name = "email")
	public WebElement emaill;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
