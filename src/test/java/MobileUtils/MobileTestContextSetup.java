package MobileUtils;

import MobileBase.BaseClass;
import PageObects.PageObjectManager;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class MobileTestContextSetup {
    public BaseClass baseClass;
    public AndroidDriver driver;
    public PageObjectManager pageObjectManager;

    public MobileTestContextSetup() throws MalformedURLException {
         baseClass = new  BaseClass();
         driver = baseClass.appiumConfiguration();
         pageObjectManager = new PageObjectManager(driver);
    }
}
