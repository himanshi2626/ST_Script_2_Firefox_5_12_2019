package SetupClass.TestStep;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class pdp_Facebook_Login_Paid_User_9 extends Set {

	WebDriverWait wait = new WebDriverWait(driver,30);
	
	@Given("^user is already on pdp page CD ix$")
	public void user_is_already_on_pdp_page_CD_ix() throws Throwable {
	   
		driver.get("https://www.slideteam.net/complete-powerpoint-decks-presentations/change-management-powerpoint-presentation-slides.html");
		Thread.sleep(1000);
	}

	@Then("^User click on Download button to download the product ix$")
	public void user_click_on_Download_button_to_download_the_product_ix() throws Throwable {
	    
		WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.id("clicking")));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
	}

	@Then("^user is redirected to Login page ix$")
	public void user_is_redirected_to_Login_page_ix() throws Throwable {
		Thread.sleep(2000);
	}

	@Then("^User click on sign in with facebook button ix$")
	public void user_click_on_sign_in_with_facebook_button_ix() throws Throwable {

		driver.findElement(By.xpath("//a[contains(text(),'Sign in with Facebook')]")).click();
		Thread.sleep(2000);
		log.info("It's opening the website URL");
		
		 WebElement fb_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		 Thread.sleep(2000);
		    fb_email.sendKeys("sumit.kumar@slidetech.in");
		    Thread.sleep(2000);
		    WebElement fb_pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
		    Thread.sleep(2000);
		    fb_pass.sendKeys("redhat2090");
		    Thread.sleep(2000);
		    WebElement fb_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.id("loginbutton")));
		    Thread.sleep(2000);
		    fb_login_btn.click();
		    Thread.sleep(2000);
	}

	@Then("^user will be redirected to same page pdpd ix$")
	public void user_will_be_redirected_to_same_page_pdpd_ix() throws Throwable {
	  
	}

	@Then("^user download the product ix$")
	public void user_download_the_product_ix() throws Throwable {
		
		WebElement download_btn_pdp_fp = wait.until(ExpectedConditions.elementToBeClickable(By.id("clicking")));
		Thread.sleep(2000);
		download_btn_pdp_fp.click();
		Thread.sleep(2000);
	    
	}

	@Then("^user logout from website ix$")
	public void user_logout_from_website_ix() throws Throwable {
	   
		Thread.sleep(1000);
		try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
		
	}

	
}
