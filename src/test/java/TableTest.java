import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/css/css_table.asp");
    }
    @Test
    public void testCss(){
        wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));
// QTY Rows in Table "tr", add elements to list and print size:
        System.out.println( wd.findElements(By.cssSelector("#customers tr")).size());
// QTY Rows in Table "th", add elements to list and print size:
        System.out.println( wd.findElements(By.cssSelector("#customers th")).size());
// find locator for the row3
        wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
// find locator for the last column
        wd.findElement(By.cssSelector("#customers td:last-child"));

    }

    @AfterMethod
    public void tearDown() {
  //      wd.quit();
    }
}
