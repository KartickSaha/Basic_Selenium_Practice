package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BarCodeHandle {
    protected WebDriver driver;

    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
        driver.navigate().to("https://www.costco.com");
        //String getString = driver.getCurrentUrl();
        //System.out.println("Result for current URL is :"  + getString);

        //To navigate to an URL and It will not wait till the whole page gets loaded

        //driver.get("https://www.costco.com");
        //To open an URL and it will wait till the whole page gets loaded

        // driver.navigate().refresh();
        //To refresh the URL




        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();//maximize the window
        driver.manage().deleteAllCookies();//delete cookies
    }



}
