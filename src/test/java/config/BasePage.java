package config;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;


public class BasePage {

    public static WebDriverWait webDriverWait;
    public static AndroidDriver driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        Path currentDirectoryPath = Paths.get("").toAbsolutePath();
        String currentDirectory = currentDirectoryPath.normalize().toString();
        String apk = currentDirectory + "\\src\\test\\java\\app\\the_fork.apk";
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "12");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("autoGrantPermissions", "true");
        desiredCapabilities.setCapability("noReset", "false");
        desiredCapabilities.setCapability("app", apk);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, desiredCapabilities);
        webDriverWait = new WebDriverWait(driver, 35);
    }

    @AfterClass
    public void afterClass() { driver.quit();}

}
