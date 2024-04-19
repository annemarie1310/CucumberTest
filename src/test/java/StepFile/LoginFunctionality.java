package StepFile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class LoginFunctionality {

    WebDriver driver;

    @Given("I Launch BBrowser")
    public void i_launch_b_browser() {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    }
    @Then("I Open Orangehrm webssite Login page")
    public void i_open_orangehrm_webssite_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Then("I enter Valid {string} and {string}")
    public void i_enter_and(String Username, String password) {
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(Username);
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);

    }
    @Then("Click on login")
    public void click_on_login() {
        driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
    }
    @Then("I am navigated to home page")
    public void i_am_navigated_to_home_page() {
        String Actualdashbord=driver.getCurrentUrl();
        String expectedboardUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        Assert.assertEquals("You have logged in",expectedboardUrl,Actualdashbord);

        // below assert will check if there is word dashboard in the currentUrl.
       // Assert.assertTrue(Actualdashbord.contains("dashboard"));

        driver.quit();

    }

}
