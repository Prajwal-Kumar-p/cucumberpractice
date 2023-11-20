package def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef {
	public static String link="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	@Given("You should be in login page")
	public void you_should_be_in_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(link);
	}

	@And("pass the username")
	public void pass_the_username() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@And("pass the password")
	public void pass_the_password() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
	}

	@And("hit the enter button")
	public void hit_the_enter_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("I should see titel as {string}")
	public void i_should_see_titel_as(String string) throws InterruptedException {
		Thread.sleep(5000);
		String t2=driver.getTitle();
		System.out.println(t2);
	}
}
