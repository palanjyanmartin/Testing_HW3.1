import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.*;
import static org.junit.Assert.*;


public class SelTest {
    // Step 8 of the Homework
    public static WebDriver driver;
    public static String url = "https://www.demoblaze.com";


    //Step 9-10 of the Homework
    @BeforeClass
    public static void initWebDriverMaxRef() {
        System.setProperty("webdriver.chrome.driver", "/Users/martinpalanjyan/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }


    @BeforeClass
    public static void navigateToCart() {
        System.setProperty("webdriver.chrome.driver", "/Users/martinpalanjyan/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.navigate().to("https://www.demoblaze.com/cart.html");
    }


    @BeforeClass
    public static void navigateBack() {
        System.setProperty("webdriver.chrome.driver", "/Users/martinpalanjyan/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.navigate().to("https://www.demoblaze.com/cart.html");
        driver.navigate().back();
    }


    @BeforeClass
    public static void urlOfTheWebsite() {
        System.setProperty("webdriver.chrome.driver", "/Users/martinpalanjyan/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }


    //Step 11-12 of the homework


    @Test
    public void logInButton() {
        //Button
        driver = new ChromeDriver();
        driver.get(url);
        WebElement loginButton = driver.findElement(By.id("login2"));
        loginButton.click();

    }


    @Test
    public void logInData() {
        driver = new ChromeDriver();
        driver.get(url);
        //Button
        WebElement logIn = driver.findElement(By.id("login2"));
        logIn.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(1));
        //Input field
        WebElement userName = driver.findElement(By.id("loginusername"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.sendKeys("palanjyanmartin");
        WebElement password = driver.findElement(By.id("loginpassword"));
        password.sendKeys("helloworld");
        //Button
        WebElement log1 = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        log1.click();
    }


    @Test
    public void SignUpData() {
        driver = new ChromeDriver();
        driver.get(url);
        //Button
        WebElement signUp = driver.findElement(By.id("signin2"));
        signUp.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(1));
        //Input Field
        WebElement userName = driver.findElement(By.id("sign-username"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.sendKeys("palanjyanmartin");
        WebElement password = driver.findElement(By.id("sign-password"));
        password.sendKeys("vjdvfdkjvdfk");
        //Button
        WebElement signU = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
        signU.click();
    }


    @Test
    public void clearData() {
        driver = new ChromeDriver();
        driver.get(url);
        //Button
        WebElement signUp = driver.findElement(By.id("signin2"));
        signUp.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(1));
        //Input Field
        WebElement userName = driver.findElement(By.id("sign-username"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.sendKeys("palanjyanmartin");
        userName.clear();
    }


    @Test
    public void workWithMainName() {
        driver = new ChromeDriver();
        driver.get(url);
        //Text Field
        WebElement getT = driver.findElement(By.id("nava"));
        System.out.println(getT.getText() + " Get the visible");
        System.out.println(getT.getLocation() + " Where on the page is the top left-hand corner of the rendered element?");
        System.out.println(getT.isDisplayed() + " - Is this element displayed or not? This method avoids the problem of having to parse an element's \"style\" attribute.");
        System.out.println(getT.isEnabled() + "  - Is the element currently enabled or not? This will generally return true for everything but disabled input elements.");
        // Assertions
        assertTrue("Element should be displayed", getT.isDisplayed());
        assertTrue("Element should be enabled", getT.isEnabled());
    }


    @Test
    public void similarElements() {
        driver = new ChromeDriver();
        driver.get(url);
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(1));
        //List of elements
        List<WebElement> list = driver.findElements(By.className("list-group-item"));
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(list));
        for (WebElement element : list) {
            System.out.println("Name of the Categories:" + element.getText());
        }
    }

   
}










