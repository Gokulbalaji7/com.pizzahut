package step_defenition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom_class.pizza_testjava_Pom_page1;
import pom_class.pizza_testjava_Pom_page2;
import reusable_file.Reusablecode;

public class pizza_stepdefinition extends Reusablecode{
	
	
	pizza_testjava_Pom_page1 pom;                             // imp
	
	pizza_testjava_Pom_page2 pom2;                            // imp
	
	
	
// page1
	
	
	@Given("user launches the url")
	public void user_launches_the_url() throws InterruptedException {
		getdriver();
		loadurl("https://www.pizzahut.co.in/order/deals/");
		maxiwindow();
		Thread.sleep(10000);
	  }
	
//	@Given("click a current location button")
//	public void click_a_current_location_button() {
//	  }
	
	@Then("click the pizza button")
	public void click_the_pizza_button() {
		pom = new pizza_testjava_Pom_page1();                 // imp
		buttonclick(pom.pizza);
	 }
	
	
	
	@Then("click sizzling shewan chicken button")
	public void click_sizzling_shewan_chicken_button() throws Throwable {
		scrolldownmouse();
		buttonclick(pom.ssc);
    }
	
	@Then("then click san fransico button")
	public void then_click_san_fransico_button() throws Throwable {
		scrolldownmouse();
		buttonclick(pom.sanfrans);
	}
	
	@Then("then click for extra cheese button")
	public void then_click_for_extra_cheese_button() throws Throwable {
		scrolldownmouse();
		buttonclick(pom.cheese1);
		}
	
	@Then("click add to mybasket")
	public void click_add_to_mybasket() {
		buttonclick(pom.addtobasket);
	}
	
	@Then("click checkout button")
	public void click_checkout_button() {
		buttonclick(pom.chkout);
	}
	
	
	
// page 2
	
	
	
	@Then("then fill the details for name")
	public void then_fill_the_details_for_name() throws Throwable {
		
		
		pom2 = new pizza_testjava_Pom_page2();                     // imp
		
		scrolldownmouse();
		sendInput(pom2.name, "gokul");
		
	}
	
	@Then("addmobile no")
	public void addmobile_no() {
		
		sendInput(pom2.phh, "9995437732");
    }
	
	@Then("then add email address")
	public void then_add_email_address() throws Throwable {
		sendInput(pom2.emaill, "rgokul@gmail");
		scrolldownmouse();
	}



	
}
