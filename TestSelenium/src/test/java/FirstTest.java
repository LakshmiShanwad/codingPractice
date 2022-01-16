import com.google.common.base.Function;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {


    WebDriver driver ;
    String url="https://www.youtube.com/";
    @Test
    public void firstTest()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium");
        //driver.quit();
        driver.navigate().to(url);
        driver.getWindowHandle();
        driver.getWindowHandles();


        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());

        FluentWait wt = new FluentWait(driver);
        wt.pollingEvery(5, TimeUnit.MILLISECONDS).withTimeout(2,TimeUnit.SECONDS)
                .ignoring(ElementNotInteractableException.class);

        Function<WebDriver,WebElement> ft = new Function<WebDriver, WebElement>() {
            @NullableDecl
            @Override
            public WebElement apply(@NullableDecl WebDriver input) {
                WebElement ele =driver.findElement(By.id(""));

                if(ele!=null)
                {
                    System.out.println(" element found ");
                }
                return ele;
            }
        };
        wt.until(ft);


    }
}
