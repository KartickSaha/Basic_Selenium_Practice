package selenium_practice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTableHandle {
    protected WebDriver driver;

    @Before
    public void setUp(){
        ChromeDriverManager.getInstance().setup();

        driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/sql/sql_join.asp");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();//maximize the window
        driver.manage().deleteAllCookies();//delete cookies
    }

    @Test
    public void tableHandle(){
       WebElement mainTable = driver.findElement(By.xpath("//div[@class='w3-responsive']"));
       List<WebElement> table_row = mainTable.findElements(By.tagName("tr"));
       int totalRow = table_row.size();
        System.out.println("Toatal number of row is "+table_row);
       for(int row=0;row<totalRow;row++){
         List<WebElement> table_column = table_row.get(row).findElements(By.tagName("td"));
        int totalColumn = table_column.size();
        for(int column=0;column<totalColumn;column++){
            String cellText = table_column.get(column).getText();
            System.out.println("Cell text is "+ cellText);
        }
       }

    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
