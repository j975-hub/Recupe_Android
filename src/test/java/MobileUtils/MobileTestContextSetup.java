package MobileUtils;

import MobileBase.BaseClass;
import PageObects.PageObjectManager;
import io.appium.java_client.android.AndroidDriver;
import io.restassured.path.json.JsonPath;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MobileTestContextSetup {
    public BaseClass baseClass;
    public AndroidDriver driver;
    public PageObjectManager pageObjectManager;

    public MobileTestContextSetup() throws MalformedURLException {
         baseClass = new  BaseClass();
         driver = baseClass.appiumConfiguration();
         pageObjectManager = new PageObjectManager(driver);
    }
    public JsonPath getJsonPath(String pathName) throws IOException {
      String path =  new String( Files.readAllBytes(Paths.get(".\\src\\test\\java\\TestData\\"+pathName+".json")) );
      JsonPath jsonpath = new JsonPath(path);
       return jsonpath;
    }
}
