package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotConcept {

    static WebDriver driver = null;

    public static void main(String[] args) throws IOException {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        takeScreen("google");

        driver.close();
        driver.quit();

    }

    public static void takeScreen(String fileName) throws IOException {
    File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(srcfile,new File("C:/MyDevelopment/Basic_Selenium_Practice/src/test/java/selenium_practice"+fileName+".jpg"));

    }

}
