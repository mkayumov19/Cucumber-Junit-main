package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
      Creating private constructor so its class' object is not reachable from outside
       */
    private Driver() {
    }

    /*
   Making webdriver private so its not reachable from outside of the class
   Making it static so we can run it before everything else and we can use it in static method
    */
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    /*
   Creating re-usable utility method that will return same 'driver' instance everytime we call it.
    */
    public static WebDriver getDriver(){

        if (driverPool.get() == null){
            synchronized (Driver.class) {

            /*
            We read the browser type from configuration.properties file using .getProperty method we are creating
            in ConfigurationReader class
             */
                String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browser type our switch statement will open specific type of driver
             */
                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                }
            }
        }
        return driverPool.get();
    }

    public static void closeDriver(){
        if (driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
