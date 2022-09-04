package PageObects;

import MobileUtils.AndroidActionsGesture;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import java.io.IOException;

public class SignInPage extends AndroidActionsGesture {

    public SignInPage(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email Address']")
    private WebElement emailId;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement password;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign In']")
    private WebElement signInButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    private WebElement allowPopup;

    public void setEmailId(String text) throws IOException {
        waitAndSendKeys(emailId,text,"emailId");
    }
    public void setPassword(String text) throws IOException {
        waitAndSendKeys(password,text,"password");
    }
    public void setSignInButton() throws IOException {
        waitAndClick(signInButton,"signInButton");
    }
    public void setAllowPopup() throws InterruptedException, IOException {
        waitAndClick(allowPopup,"allowPopup");
        Thread.sleep(5000);
    }
    public void setCordinatesAction(int x, int y){
        setCordinate(x,y);
    }
}
