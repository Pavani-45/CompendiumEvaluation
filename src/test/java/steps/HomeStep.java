package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactForm;

public class HomeStep {
    WebDriver driver;
    ContactForm contactform;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(" https://compendiumdev.co.uk/");
        driver.manage().window().maximize();
        contactform = new ContactForm(driver);


    }

    //    @After
//    public void killsession(){
//       driver.quit();
//    }
    @Given("open the url")
    public void open_the_url() {
        {
            System.out.println("url is opened");

        }
    }


        @Then("click on the contact")
        public void click_on_the_contact () {
            contactform.formDetais();
            System.out.println("clicked on contact button");
        }
        @Then("Enter the details")
        public void enter_the_details () throws InterruptedException {
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[1]")));
            contactform.details();
        }

        @Then("submit on Login button")
        public void submit_on_login_button () throws InterruptedException {
            Assert.assertTrue(contactform.verifySubmittedForm());
            System.out.println("click on login button");


        }
        @Then("close the application")
        public void close_the_application () {
            System.out.println("close the application");


        }


    }

