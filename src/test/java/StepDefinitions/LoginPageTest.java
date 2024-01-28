package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
    public WebDriver driver;
@BeforeMethod
public void Enviornment(){
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");

}

@Given("Navigate to the Click Counter Application")
public void navigate_to_the_click_counter_application() {
    driver=new ChromeDriver();
    driver.navigate().to("https://qaclickcounter.ccbp.tech/");
    driver.manage().window().maximize();
}

    @When("Verify the click on The button Times")
    public void verify_the_click_on_the_button_times() {
        WebElement l1= driver.findElement(By.xpath("//button[@type='button']"));
        for(int i=0;i<5;i++){
            l1.click();
        }
    }

    @Then("Verify the Expected Text content")
    public void verify_the_expected_text_content() {
    WebElement l2= driver.findElement(By.xpath("//span[@class='counter-value']"));
    String str1=l2.getText();
    String str2="5";
        Assert.assertEquals(str1,str2,"Text is not mismatch");
    }

    @Then("Close the Browser")
    public void close_the_browser() {
       driver.quit();
    }
}
