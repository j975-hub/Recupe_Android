package MobileUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class AndroidActionsGesture {
    AndroidDriver driver;
    public AndroidActionsGesture(AndroidDriver driver){
        this.driver=driver;
    }

    public void setCordinate(int x, int y){
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(x,y)).perform();
    }
    public void waitAndClick(WebElement element,String fileName) throws IOException {
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        if(element.isDisplayed() == true){
           // screenShotOfElement(element,fileName);
        }else {
            System.out.println(element+" is not displaying");
        }
        element.click();
    }
    public void waitAndSendKeys(WebElement element,String text, String fileName) throws IOException {
        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        //screenShotOfElement(element,fileName);
    }

    public void screenShotOfElement(WebElement element,String fileName) throws IOException {
       File src = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File(".\\src\\test\\java\\ScreenshotFiles\\"+fileName+".png"));
    }
    public String javaAction(List<WebElement> element){
       int size = element.size();
        String text = "";
       for(int i=0; i<size; i++){
           text = text.concat(element.get(i).getText());
           System.out.println(text);
           if(text.contains("8:00 AM")){
               break;
           }
       }
        System.out.println(text.split("8:00 AM")[0].trim());
        return text;
    }
}
