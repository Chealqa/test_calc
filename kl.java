public class kl {
    import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

    public class tests {
        AndroidDriver<AndroidElement> driver = null;

        public void initialize() {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Test");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.vbanthia.androidsampleapp");
            //   capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"cal.CalculatorActivity");
            // capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
            try {
                driver = new AndroidDriver<>(new URL("http://127.0.0.0:4723/wd/hub"),capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            }
        }
        public void test1() {
            driver.findElementByid("com.vbanthia.androidsampleapp:id/inputFieldLeft").click();


        }
    }

}
