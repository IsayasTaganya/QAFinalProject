import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.nio.channels.FileLock;
import java.nio.file.Files;

public class Main {
    WebDriver driver;

    public Main() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\Desktop\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public WebElement getElement(String selector){
        WebElement element = this.driver.findElement(By.cssSelector(selector));
        return element;
    }

}


