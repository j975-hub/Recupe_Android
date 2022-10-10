package MobileBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    public AndroidDriver driver;
    public AndroidDriver appiumConfiguration() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("RealmeNarzo");
        options.setApp(".\\src\\main\\java\\Resources\\RecupeDev.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;


    }

}
