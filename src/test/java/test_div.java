import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.Page_object;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test_div {
    AndroidDriver driver = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();
    public void initialize() {


        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_drom");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.vbanthia.androidsampleapp");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.vbanthia.androidsampleapp.MainActivity");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.0:4723/wd/hub"),capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void div() {
        initialize();
        Page_object calc = new Page_object(driver);
        //assert(calc.isDisplayed());
        calc.num1.click();
        calc.num1.sendKeys("6");
        calc.num2.click();
        calc.num2.sendKeys("3");
        calc.div.click();
        // Так как в приложении поле вывода результата реализовано в виде: 6.00 - 3.00 = 2.00
       // assert(calc.result.getText().equals("6.00 - 3.00 = 2.00"));
        if (calc.result.getText().equals("6.00 - 3.00 = 2.00")){
            System.out.println("Тест пройден");
        }
    }
}

