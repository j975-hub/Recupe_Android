package PageObects;

import MobileUtils.AndroidActionsGesture;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends AndroidActionsGesture {

    public HomePage(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

   @AndroidFindBy(className = "android.widget.TextView")
   private List<WebElement> name;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Logout']")
    private WebElement logoutButton;

    public String getBannerMessage(){
      String text=javaAction(name);
      return text;
    }
    public void logout(){
        setCordinate(441,52);
        logoutButton.click();
        logoutButton.click();
    }
}
