package pom_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable_file.Reusablecode;

public class pizza_testjava_Pom_page1 extends Reusablecode {
	
	public pizza_testjava_Pom_page1() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[text()='Pizzas'])[2]")
	public WebElement pizza;
	
	@FindBy(xpath = "//div[text()='Schezwan Margherita']")
	public WebElement ssc;
	
	@FindBy(xpath = "(//div[text()='San Francisco Style'])[1]")
	public WebElement sanfrans;
	
	@FindBy(xpath = "//div[text()='Cheese']")
	public WebElement cheese1;
	
	@FindBy(xpath = "//span[text()='Add to my basket']")
	public WebElement addtobasket;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	public WebElement chkout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
