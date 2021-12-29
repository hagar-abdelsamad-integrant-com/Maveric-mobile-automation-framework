**Maveric Mobile Automation framework is a set of guidelines,or rules used to create and design automated test scripts.
They provide a generic automation framework that supports real devices (Ios and Android) devices**

# **Table of Content:**

Getting Started Creating initial project structure with all the packages and classes.

**1 . UI Selectors:** 
             Wrapper for UiSelector to simplify integration with Appium.
**2. UI Object:**
             Wrapper for UI Objects to simplify actions like tap, scroll, type, pinch and wait for element to appear.

**3. Integrating Log4J:**
              For better debugging capabilities, adding logging functionality

**4. Driver Manager:**
              Support class for managing the Android Driver

**5. Application Page Objects:**
              build page objects and map activities of the mobile app.

**6. Test Info class:**
              Metadata class for keeping basic information about the test such as: name, id, test suite, etc.

**7. Test Manager:**
             It will manage all of our test preconditions and what to do when test passes/fails. Will utilize JUnit for this.

**8. Test Cases Class:**
             Will use Page Objects that we have created in order to write some basic UI tests.
             We will navigate through a number of screens and verify that specific elements exist. 
             We will also do one functional test and verify all the elements.

**9. Operationalization Appium Server:**
             Start Appium server programmatically thus having no need to do it manually in the terminal.

**10. Packaging the framework:**
             Will build the jar

**11. Running framework**
             Will run framework from the jar

**12. Parallel Testing:**
              How to run framework in order to run tests in parallel on different devices.

**13. XML or HTML Reports:**
             Creating XML or HTML reports Format.


_**Author:** _Hagar Elgabry_ <BR/>
**TPL Reviwer:** _Maha Amin_<BR/>
**Date:** _29-12-2021_<BR/>_
