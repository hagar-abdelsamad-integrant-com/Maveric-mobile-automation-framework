package com.maveric.vnv.core;
import com.maveric.vnv.manager.DeviceConfiguration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

/**
 *
 * UIObject is a Wrapper class for UI Objects to simplify actions like scroll,tab
 * or wait element to appear and more
 *
 * @author Hagar Elgabry
 * @Date  28-12-2021
 *
 */
public class UiObject {

    private String locator;

     UiObject(String locator){
        this.locator = locator;
    }
    private boolean isXpath(){
        return !locator.contains("UiSelector");
    }

    public boolean exists(){
        try{
            WebElement element;
            if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
            else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
            return element.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public boolean isChecked(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("checked").equals("true");
    }

    public boolean isCheckable(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("checkable").equals("true");
    }

    public boolean isClickable(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("clickable").equals("true");
    }

    public boolean isEnabled(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("enabled").equals("true");
    }

    public boolean isFocusable(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("focusable").equals("true");
    }

    public boolean isFocused(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("focused").equals("true");
    }

    public boolean isScrollable(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("scrollable").equals("true");
    }

    public boolean isLongClickable(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("longClickable").equals("true");
    }

    public boolean isSelected(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("selected").equals("true");
    }

    public Point getLocation(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getLocation();
    }

    public String getText(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("name");
    }

    public String getResourceId(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("resourceId");
    }

    public String getClassName(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("className");
    }

    public String getContentDesc(){
        WebElement element;
        if(isXpath()) element = DeviceConfiguration.driver.findElementByXPath(locator);
        else element = DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator);
        return element.getAttribute("contentDesc");
    }

    public UiObject clearText(){
        if(isXpath()) DeviceConfiguration.driver.findElementByXPath(locator).clear();
        else  DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator).clear();
        return this;
    }

    public UiObject typeText(String value){
        if(isXpath()) DeviceConfiguration.driver.findElementByXPath(locator).sendKeys(value);
        else  DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator).sendKeys(value);
        return this;
    }

    public UiObject tap(){
        if(isXpath()) DeviceConfiguration.driver.findElementByXPath(locator).click();
        else  DeviceConfiguration.driver.findElementByAndroidUIAutomator(locator).click();
        return this;
    }

}



