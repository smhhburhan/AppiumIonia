package appium_tests;

import java.net.URL;
import java.util.List;
//import java.awt.List;
import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.springframework.util.Assert;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.remote.MobileCapabilitytype;

//import androidx.test.uiautomator.UiDevice;

/**
 * Instrumented test, which will execute on an Android device for IONIA app.
 *
 * semih burhan sst
 */

public class ioniaTest {
	
	static AppiumDriver<MobileElement> adriver;
	//static UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
	
	public static void main(String[] args) {

		try {
			openioniaTest();
		
	}catch(Exception exp) {
		System.out.println(exp.getCause());
		System.out.println(exp.getMessage());
		exp.printStackTrace();
	}
	}
	


	public static void openioniaTest() throws Exception {
		
		DesiredCapabilities dcap = new DesiredCapabilities();
		
		dcap.setCapability("deviceName", "Venus Z40"); //check your device name
		dcap.setCapability("udid", "150139371912170804"); //give your device ud id
		dcap.setCapability("platformName", "Android");
		dcap.setCapability("platformVersion", "10"); // check your android version
		
		dcap.setCapability("appPackage", "com.ionia.vestel.android"); //this code invented for IONIA which developed by vestel
		dcap.setCapability("appActivity", ".features.splash.SplashActivity");
		
		dcap.setCapability("noReset", "true");
        //dcap.setCapability("skipServerInstallation", true);
        //dcap.setCapability("clearSystemFiles", false);
        //dcap.setCapability("ignoreHiddenApiPolicyError", true);
        dcap.setCapability("newCommandTimeout","300000");//Set the timeout period of 5 minutes

		
		
		URL appium_url = new URL("http://127.0.0.1:4723/wd/hub");
		
		adriver = new AppiumDriver<MobileElement>(appium_url,dcap);
		
		Thread.sleep(6000);
		System.out.println("Application is started....");
		
		/*
		device.wakeUp();
	    Thread.sleep(250);
	    //device.swipe(500, 1800, 500, 700, 1);
	        	while (true) {
	            Thread.sleep(250);
	            device.swipe(900, 100, 160, 150, 2);
	            Thread.sleep(250);
	            }
	    */
		
		MobileElement el1 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/skip_onboarding");
		el1.click();
		Thread.sleep(2000);
		MobileElement el2 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/positive_button");
		el2.click();
		Thread.sleep(2000);
		MobileElement el3 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/add_device_card_container");
		el3.click();
		Thread.sleep(2000);
		MobileElement el4 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/continue_button");
		el4.click();
		Thread.sleep(2000);
		MobileElement el5 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/continue_button");
		el5.click();
		Thread.sleep(3000);
		MobileElement el6 = (MobileElement) adriver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
		el6.click();
		Thread.sleep(5000);
		System.out.println("Application is searching for adding new device....");
		Thread.sleep(1800);
		
		
		//adriver.swipe(531,1346,1033,1346,20);
		
		
		
		/*
		MobileElement element = (MobileElement) adriver.findElementByClassName("SomeClassName");
		String elText = element.getText();
		Thread.sleep(3000);
		*/
		
		//MobileElement el7 = (MobileElement) adriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[contains(@text,'48:EB:62:C8:6F:9A')]");
		//el7.click();
		//Thread.sleep(2500);
		MobileElement el7 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/mac");
		el7.click();
		Thread.sleep(1500);
		System.out.println("Congrats....");
		Thread.sleep(1500);
		/*MobileElement el8 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/searching_device_text_view");
		el8.click();
		Thread.sleep(3000);
		MobileElement el9 = (MobileElement) adriver.findElementById("com.android.settings:id/text");
		el9.sendKeys("123456");
		Thread.sleep(2000);
		System.out.println("Application is connected&paired....");
		MobileElement el10 = (MobileElement) adriver.findElementById("android:id/button1");
		el10.click();
		Thread.sleep(4000);*/
		MobileElement el11 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/ok_button");
		el11.click();
		Thread.sleep(3000);
		MobileElement el12 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/homeFragment");
		el12.click();
		Thread.sleep(3000);
		
		/*(new TouchAction(adriver))
		  .press({x: 647, y: 1237});
		  .moveTo({x: 427: y: 1239});
		  .release()
		  .perform();
		  
		(new TouchAction(adriver))
		  .press({x: 615, y: 1206})
		  .moveTo({x: 443: y: 1206})
		  .release()
		  .perform()
		  
		(new TouchAction(adriver))
		  .press({x: 655, y: 1239})
		  .moveTo({x: 420: y: 1219})
		  .release()
		  .perform()*/
		  
		  
		  
		  
		MobileElement el13 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/detailText");
		el13.click();
		Thread.sleep(3000);
		MobileElement el14 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/detailText");
		el14.click();
		Thread.sleep(3000);
		MobileElement el15 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/addDeviceFragment");
		el15.click();
		Thread.sleep(3000);
		MobileElement el16 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/settingsFragment");
		el16.click();
		Thread.sleep(3000);
		/*MobileElement els1 = (MobileElement) adriver.findElementsByXPath("\t\n/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
		Thread.sleep(3000);*/
		MobileElement el17 = (MobileElement) adriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
		el17.click();
		Thread.sleep(3000);
		MobileElement el18 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/update_device_button");
		el18.click();
		System.out.println("to be continued....");
		Thread.sleep(60000);
		MobileElement el19 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/updating_percentage");
		el19.click();
		System.out.println("to be continued_2....");
		Thread.sleep(180000);
		MobileElement el20 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/updating_percentage");
		el20.click();
		System.out.println("to be continued_3....");
		Thread.sleep(600000);
		MobileElement el21 = (MobileElement) adriver.findElementById("com.ionia.vestel.android:id/updating_percentage");
		el21.click();
		System.out.println("to be continued_4....");
		Thread.sleep(900000);
		System.out.println("to be continued_5....");
		
		
		/*
		MobileElement el18 = (MobileElement) driver.findElementById("com.ionia.vestel.android:id/homeFragment");
		el18.click();
		(new TouchAction(driver))
  			.press({x: 749, y: 1209})
  			.moveTo({x: 372: y: 1196})
  			.release()
  			.perform()
  
		(new TouchAction(driver))
  			.press({x: 782, y: 1184})
  			.moveTo({x: 331: y: 1166})
  			.release()
  			.perform()
  
		(new TouchAction(driver))
  			.press({x: 756, y: 1199})
  			.moveTo({x: 321: y: 1201})
  			.release()
  			.perform()
		MobileElement el19 = (MobileElement) driver.findElementById("com.ionia.vestel.android:id/bottomSheetView");
		el19.click();
		MobileElement el20 = (MobileElement) driver.findElementById("com.ionia.vestel.android:id/detailTopTitle");
		el20.click();
		MobileElement el21 = (MobileElement) driver.findElementById("com.ionia.vestel.android:id/settingsFragment");
		el21.click();
		*/
		
		adriver.quit();
		
	}
		
}
