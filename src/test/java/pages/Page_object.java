package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Page_object {
 AndroidDriver driver = null;

    public Page_object(){

    }
    public Page_object(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/inputFieldLeft")
    public AndroidElement num1;
    // num1 - левое поле ввода, num2 - правое
    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/inputFieldRight")
    public AndroidElement num2;
    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/additionButton")
    public AndroidElement add;
    // "+"
    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/subtractButton")
    public AndroidElement sub;
    // "-"
    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/multiplicationButton")
    public AndroidElement mult;
    // "*"
    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/divisionButton")
    public AndroidElement div;
    // "/"
    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/resetButton")
    public AndroidElement reset;
    // Очистить поля ввода
    @AndroidFindBy(id = "com.vbanthia.androidsampleapp:id/resultTextView")
    public AndroidElement result;
    // Поле с результатом

    // Проверим, что приложение запущено с помощью наличия левого поля ввода калькулятора.
   // public boolean isDisplayed() {
       // return true;
    }























