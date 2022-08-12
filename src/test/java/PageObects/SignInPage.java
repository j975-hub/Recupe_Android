package PageObects;

import MobileUtils.PageUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

public class SignInPage  {

    public SignInPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email Address']")
    private WebElement emailId;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement password;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign In']")
    private WebElement signInButton;

    public void setEmailId(String text){
        emailId.sendKeys(text);
    }
    public void setPassword(String text){
        password.sendKeys(text);
    }
    public void setSignInButton(){
        signInButton.click();
    }
}
