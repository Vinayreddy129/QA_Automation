import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLaunchTest {

    WebDriver driver; // Declare WebDriver instance

    @BeforeMethod
    public void setUp() {
        // Set up the ChromeDriver path (adjust for your operating system)
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        // Initialize the WebDriver
        driver = new ChromeDriver();
        // Maximize browser window
        driver.manage().window().maximize();
    }

    @Test
    public void openHrm() throws InterruptedException {
        // Open a website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        // Optionally, you could verify the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
