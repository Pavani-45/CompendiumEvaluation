package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactForm {

    WebDriver driver;
    public ContactForm(WebDriver driver){
        PageFactory.initElements(driver,this);



    }
    
@FindBy(xpath = "//div[@id='cssmenu']/ul/li[2]/a[text()='Contact']")
    WebElement contactbutton;
    @FindBy(xpath="//input[@name='name']")
    WebElement nametextfield;
    @FindBy(xpath = "//input[@name='email']")
    WebElement email;
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement message;
    @FindBy(xpath = "//div[@class='CheckBox']")
    WebElement checkbox;
    @FindBy(xpath = "//div[@class='buttonIcon']")
            WebElement button;
    @FindBy(xpath = "//div[@class='Success']")
    WebElement verify;


    public void formDetais(){
        contactbutton.click();
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[1]")));
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[1]")));
    }
    public void details() throws InterruptedException {

        Thread.sleep(1000);
        nametextfield.sendKeys("pavani");
        email.sendKeys("masanammanjula@gmail.com");
        message.sendKeys("i want to register");
        checkbox.click();
        button.click();
    }
        public boolean verifySubmittedForm() throws InterruptedException {
           Thread.sleep(1000);
            return verify.isDisplayed();
        }
//        System.out.println(verify.isDisplayed());



}
