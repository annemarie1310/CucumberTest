package StepFile;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Google {
    WebDriver driver;

    // Below scenario 1
    @Given("openn browser")
    public void openn_browser() {
//        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Then("open Google")
    public void open_google() {
        driver.get("https://www.google.com/");    }
    @Then("I should be navigated to Google website")
    public void i_should_be_navigated_to_google_website() {
        String actualurl=driver.getTitle();
        Assert.assertTrue(actualurl.contains("Google"));

        driver.close();
    }


    // Below Scenario 2

    @Given("open browser")
    public void open_browser() {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");

    }
    @Then("I enter search input")
    public void i_enter_search_input() {
        driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("Chris Hemsworth",Keys.ENTER);
        //driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).submit();

    }
    @Then("I should get naviageted to searched item page")
    public void i_should_get_naviageted_to_searched_item_page() {
        String namecheck=driver.findElement(By.xpath("//span[@role=\"heading\"][text()=\"Chris Hemsworth\"]")).getText();

         String actual="Chris Hemsworth";

        Assert.assertEquals(namecheck,actual);

        driver.close();
    }

}
