import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumStart {
    WebDriver wd;

    @BeforeTest
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void test(){
        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));

        wd.findElement(By.xpath("//a"));
/////////////////////
        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
           wd.findElement(By.xpath("//*[@id='root']"));


        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));
           wd.findElement(By.xpath("//*[@class='container']"));

        wd.findElement(By.linkText("HOME"));
            wd.findElement(By.xpath("//a[text()='HOME']"));
            wd.findElement(By.xpath("//a[.='HOME']"));

        wd.findElement(By.partialLinkText("OM"));


       wd.findElement(By.cssSelector("[href='/login']")); // == this
                wd.findElement(By.xpath("//a[@href='/login']"));
        wd.findElement(By.cssSelector("[href^='/log']")); //^start with text
                 wd.findElement(By.xpath("//a[starts-with(@href,'/log')]"));
        wd.findElements(By.cssSelector("[href*='/og']"));// *contains text
                wd.findElement(By.xpath("//a[contains(@href,'og')]"));
        wd.findElements(By.cssSelector("[href$='/gin']")); //$= end of text

        // HW Add in project StartSelenium locator "About"

        //BY ATTRIBUTE
        wd.findElement(By.cssSelector("[href='/about']"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElements(By.partialLinkText("BOU"));
        wd.findElements(By.cssSelector("a"));
        wd.findElements(By.cssSelector("a"));

        //By TAG  - input button nav div
        wd.findElements(By.tagName("div"));

        //ALL ELEMENTS By class
        wd.findElements(By.cssSelector(".navbar-component_nav__1X_4m"));


        wd.get("https://www.w3schools.com/html/html_tables.asp");
        //by ID
        wd.findElement(By.cssSelector("#sidenav"));

        //by CLASS - A LOT OF ELEMENTS - LONG TIME!
        //wd.findElements(By.cssSelector(".w3-sidebar w3-collapse"));

        //TYPE SELECTOR - A LOT OF ELEMENTS
        wd.get("https://www.w3schools.com/html/html_forms.asp");
        wd.findElements(By.cssSelector("input"));

        //By TAG - input button nav div
        wd.findElements(By.tagName("nav"));

    }

    @AfterTest
    public void postcondition(){
        wd.quit();

    }
}
