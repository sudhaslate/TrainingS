package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunc {
    public static WebDriver driver;
    public void openBrowser()
    {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.get("http://solar.schoolnewgen.com/websolar/login");
        driver.manage().window().maximize();
    }

public void closeBrowser()
{
    driver.close();
}
}
