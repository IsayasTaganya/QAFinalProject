import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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


