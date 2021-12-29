package com.maveric.vnv.core;

/**
 * UISelector is a class which implements the object class and provides different public method to locate or
 * identify elements with different attribute or property values.
 *
 * @author Hagar Elgabry
 * @Date  28-12-2021
 *
 */

public class UiSelector {

    private String locator = "new UiSelector()";

    //This method search for the locator or inspect element from the code hierarchy on the basis of resourceId present first on the code.

    public UiSelector resourceId(String value){
        locator += ".resourceId(\""+value+"\")";
        System.out.println(locator);
        return this;
    }

    //This method sets the criteria of matching the class name with in the code hierarchy with the name provided as a parameter.

    public UiSelector className(String value){
        locator += ".className(\""+value+"\")";
        System.out.println(locator);
        return this;
    }

    //This method search for the locator or inspect element from the code that matching the class name

    public UiSelector classNameMatches(String regex){
        locator += ".classNameMatches(\""+regex+"\")";
        System.out.println(locator);
        return this;
    }

    //This method search for the locator or inspect element from the code hierarchy on the basis of xPath present on the code.

    public UiSelector xPath(String xPath){
        locator = xPath;
        System.out.println(locator);
        return this;
    }
    // Search on the basis of text visible on the widget of the page.

    public UiSelector text(String value){
        locator += ".text(\""+value+"\")";
        System.out.println(locator);
        return this;
    }

    // Search on the basis of text Contains on the widget of the page.

    public UiSelector textContains(String value){
        locator += ".textContains(\""+value+"\")";
        System.out.println(locator);
        return this;
    }

    // Search the widget on the basis of node index from layout.

    public UiSelector index(int value){
        locator += ".index("+value+")";
        System.out.println(locator);
        return this;
    }

    //This method checks whether the element is clickable.

    public UiSelector clickable(boolean value){
        locator += ".clickable("+value+")";
        System.out.println(locator);
        return this;
    }

   // This method provides the search criteria in the widget to check that is checked

    public UiSelector checked(boolean value){
        locator += ".checked("+value+")";
        System.out.println(locator);
        return this;
    }

    // This method provides the search criteria in the widget to check that is enabled

    public UiSelector enabled(boolean value){
        locator += ".enabled("+value+")";
        System.out.println(locator);
        return this;
    }

   // By providing the attribute value of description of the widget

    public UiSelector description(String value){
        locator += ".description(\""+value+"\")";
        System.out.println(locator);
        return this;
    }

    // By providing the attribute value of content-description of the widget

    public UiSelector descriptionContains(String value){
        locator += ".descriptionContains(\""+value+"\")";
        System.out.println(locator);
        return this;
    }

    public UiSelector descriptionMatches(String regex){
        locator += ".descriptionMatches(\""+regex+"\")";
        System.out.println(locator);
        return this;
    }

   public UiObject makeUiObject(){
        return new UiObject(locator);
    }
}
