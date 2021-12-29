package com.maveric.vnv.tests;
import com.maveric.vnv.core.UiSelector;
/**
 * Runner is a class is responsible for execute testing till now
 *
 * @author Hagar Elgabry
 * @Date  29-12-2021
 *
 */
public class Runner {

    public static void main (String [] args){

        new UiSelector().resourceId("Hello H").text("Display").makeUiObject();

    }
}
