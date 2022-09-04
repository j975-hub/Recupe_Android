package MobileStepDefinitions;

import MobileUtils.AppiumUtils;
import MobileUtils.MobileTestContextSetup;
import PageObects.SignInPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class TestCase1 {
    MobileTestContextSetup mobileTestContextSetup;
    public TestCase1(MobileTestContextSetup testContextSetup){
        this.mobileTestContextSetup = testContextSetup;
    }
    String pathName = "TestCase1";
    @Given("User will give the credential to sign in the application")
    public void user_will_give_the_credential_to_sign_in_the_application() throws MalformedURLException, InterruptedException {
        try{
            mobileTestContextSetup.pageObjectManager.signInPage().setEmailId(mobileTestContextSetup.getJsonPath(pathName).get("SignInPage.EmailAddress"));
            mobileTestContextSetup.pageObjectManager.signInPage().setPassword(mobileTestContextSetup.getJsonPath(pathName).get("SignInPage.Password"));
            mobileTestContextSetup.pageObjectManager.signInPage().setSignInButton();
            mobileTestContextSetup.pageObjectManager.signInPage().setAllowPopup();
            mobileTestContextSetup.pageObjectManager.signInPage().setCordinatesAction(291,228);
        }catch (Exception e){
            Assert.fail("Fail to signIn the application" + e);
            e.printStackTrace();
        }
    }
    @And("^User will able to see their name (.+) in the banner page$")
    public void user_will_able_to_see_their_in_the_banner_page(String name) throws Throwable {
        String epectedText = " Hello, "+name+"! We missed you this morning!";
        String actualText = mobileTestContextSetup.pageObjectManager.homePage().getBannerMessage();
//        Assert.assertEquals(epectedText,actualText);
    }
    @And("User will logout the app")
    public void user_will_logout_the_app() {
        mobileTestContextSetup.pageObjectManager.homePage().logout();
    }
}
