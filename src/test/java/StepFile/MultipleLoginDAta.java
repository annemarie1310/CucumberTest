package StepFile;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
public class MultipleLoginDAta {

    WebDriver driver;
    @Given("I am on Login page of OrnageHrm")
    public void I_am_on_Login_page_of_OrnageHrm(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @Then("I enter validd {string} and {string}")
    public void i_enter_validd_and(String Username, String password) {
        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(Username);
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
    }
    @Then("CLick on login button")
    public void c_lick_on_login_button() {
        driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();

    }
    @Then("I am navigatedd to home page")
    public void i_am_navigatedd_to_home_page() {
        String ACtdashboardUrl=driver.getCurrentUrl();
        String expecteddashbord="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        Assert.assertEquals(expecteddashbord,ACtdashboardUrl);
//        if (expecteddashbord==ACtdashboardUrl){
//            System.out.println("You have Logged in");
//        }
//        else System.out.println("You have entered invalid Username or password");


        driver.close();
    }
}
