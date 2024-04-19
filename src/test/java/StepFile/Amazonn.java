package StepFile;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Amazonn {
WebDriver driver;

    @Given("User is on Amazon website")
    public void user_is_on_amazon_website() {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
    }
    @Then("i click on Sell")
    public void i_click_on_sell() {
        driver.findElement(By.xpath("//a[@href=\"/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3\"]")).click();
    }
    @Then("should get navigated to sell page")
    public void should_get_navigated_to_sell_page() {
        String Sell= driver.getTitle();
        System.out.println(Sell);
    }

    @Then("i should click on Best sellers")
    public void i_should_click_on_best_sellers() {
        driver.findElement(By.xpath("//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")).click();
    }
    @Then("i should get navigated to Bestseller's website")
    public void i_should_get_navigated_to_bestseller_s_website() {
        String BestSeller= driver.getTitle();
        System.out.println(BestSeller);

    }

    @Then("i should click on Mobiles")
    public void i_should_click_on_mobiles() {
        driver.findElement(By.xpath("//a[@href=\"/deals?ref_=nav_cs_gb\"]")).click();

    }
    @Then("i should get navigated to Mobiles website")
    public void i_should_get_navigated_to_mobiles_website() {
        String Mobiles= driver.getTitle();
        System.out.println(Mobiles);


    }


}
