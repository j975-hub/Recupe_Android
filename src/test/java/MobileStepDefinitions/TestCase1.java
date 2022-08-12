package MobileStepDefinitions;

import MobileUtils.MobileTestContextSetup;
import PageObects.SignInPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class TestCase1 {
    MobileTestContextSetup mobileTestContextSetup;
    public TestCase1(MobileTestContextSetup testContextSetup){
        this.mobileTestContextSetup = testContextSetup;

    }

    @Given("User will give the credential to sign in the application")
    public void user_will_give_the_credential_to_sign_in_the_application() throws MalformedURLException, InterruptedException {

//        testContextSetup.driver.findElement(By.xpath("")).sendKeys("jhon@123.com");
//        testContextSetup.driver.findElement(By.xpath("")).sendKeys("12345");
//        testContextSetup.driver.findElement(By.xpath("")).click();

        mobileTestContextSetup.pageObjectManager.signInPage().setEmailId("jhon@123.com");
        mobileTestContextSetup.pageObjectManager.signInPage().setPassword("12345");
        mobileTestContextSetup.pageObjectManager.signInPage().setSignInButton();

        mobileTestContextSetup.driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']")).click();
       // testContextSetup.driver.findElement(By.xpath("//android.widget.Button[@text='NO THANKS']")).click();
        Thread.sleep(3000);
       TouchAction touchAction = new TouchAction(mobileTestContextSetup.driver);
        touchAction.tap(PointOption.point(291,228)).perform();
    }
}
