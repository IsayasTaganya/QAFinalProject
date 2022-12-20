import org.junit.Assert;
import org.junit.Test;

public class AmitTests {
    @Test
    public void LoginTest() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username2Input = "locked_out_user";
        String PasswordInput = "secret_sauce";
        String Expected = "https://www.saucedemo.com/inventory.html";
        String Actual;
        //declare
        Main selenium = new Main();
        //open window
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UsernameSelector).sendKeys(Username2Input);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(LoginSelector).click();
        Actual = selenium.driver.getCurrentUrl();
        Assert.assertEquals(Actual,Expected);
        Thread.sleep(1000);
        selenium.driver.quit();
    }

    @Test
    public void SortOptionTest() throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        String UsernameSelector = "#user-name";//
        String PasswordSelector = "#password";
        String LoginSelector = "#login-button";
        String Username3Input = "problem_user";
        String PasswordInput = "secret_sauce";
        String Expected = "PRICE (LOW TO HIGH)";
        String Actual;
        //declare
        Main selenium = new Main();
        //open window
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UsernameSelector).sendKeys(Username3Input);
        selenium.getElement(PasswordSelector).sendKeys(PasswordInput);
        selenium.getElement(LoginSelector).click();
        selenium.getElement("#header_container > div.header_secondary_container > div.right_component > span > select").click();
        selenium.getElement("#header_container > div.header_secondary_container > div.right_component > span > select > option:nth-child(3)").click();//"PRICE (LOW TO HIGH)"
        Actual = selenium.getElement("#header_container > div.header_secondary_container > div.right_component > span > span").getText();
        Assert.assertEquals(Expected,Actual);
        Thread.sleep(1000);
        selenium.driver.quit();
    }
}
