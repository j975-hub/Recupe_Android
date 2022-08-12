package PageObects;

import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {
    AndroidDriver driver;
    public PageObjectManager(AndroidDriver driver){
        this.driver = driver;
    }
    public SignInPage signInPage(){
        SignInPage signInPage = new SignInPage(driver);
        return  signInPage;
    }
}
