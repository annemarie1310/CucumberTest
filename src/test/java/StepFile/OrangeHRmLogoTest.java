package StepFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class OrangeHRmLogoTest {

    WebDriver driver;
    @Given("I launch browser")
    public void i_launch_browser() {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("I open OrangeHRM website")
    public void i_open_orange_hrm_website() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Then("I Verify that the logo")
    public void i_verify_that_the_logo() {
        boolean status=   driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }
    @Then("Close Browser")
    public void close_browser() {
            driver.quit();
    }


}
